package com.mchackton.restcalls;

import com.mchackton.configurations.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.restcalls
 **/
@Service
public class RestServiceFoodAPI {


    public void apiCall() {
        var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //FoodAlertClient client = applicationContext.getBean(FoodAlertClient.class);
    }
}
