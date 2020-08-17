package com.mchackton.hackatonproject;

import com.mchackton.configurations.AppConfig;
import com.mchackton.configurations.FoodAlertClient;
import com.mchackton.models.ItemAlert;
import com.mchackton.models.ResponseFoodAlerts;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.hackatonproject
 **/
public class Main {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        FoodAlertClient client = applicationContext.getBean(FoodAlertClient.class);

        System.out.println("Getting food alerts list");

        for (ResponseFoodAlerts item: client.getResponse()) {
            System.out.println("item = " + item);
        }
    }
}
