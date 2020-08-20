package com.mchackton.controllers;

import com.mchackton.configurations.ItemAlertImpl;
import com.mchackton.services.MailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.controllers
 **/
@RestController
@RequestMapping(value = "/api")
public class EmailTriggerController {

    private final ItemAlertImpl itemAlert;
    private final MailService mailService;

    public EmailTriggerController(ItemAlertImpl itemAlert, MailService mailService) {
        this.itemAlert = itemAlert;
        this.mailService = mailService;
    }

    @GetMapping("/sendEmail")
    public ResponseEntity apiMethod(@RequestParam String email) throws IOException {
        mailService.triggerEmail(email, itemAlert.getResponse());
        return ResponseEntity.ok().build();
    }
}