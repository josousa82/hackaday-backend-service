package com.mchackton.services;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.mchackton.models.ResponseFoodAlerts;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.IOException;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.services
 **/
@Service
public class MailService {

    public void triggerEmail(String email, ResponseFoodAlerts foodAlerts) throws IOException {

        var mailSender = new JavaMailSenderImpl();
        mailSender.setHost("localhost");
        mailSender.setPort(1025);

        var mailProperties = mailSender.getJavaMailProperties();
        mailProperties.put("mail.transport.protocol", "smtp");

        Handlebars handlebars = new Handlebars();
        Template template = handlebars.compile("email/allergy");

        String messageBody = null;
        try {
            messageBody = template.apply(foodAlerts);
            MimeMessage message = mailSender.createMimeMessage();
            var mimeMessageHelper = new MimeMessageHelper(message);
            mimeMessageHelper.setTo(email);
            mimeMessageHelper.setSubject("Allergies update");
            mimeMessageHelper.setFrom("allergies@hackday.com");
            mimeMessageHelper.setText(messageBody, true);
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
