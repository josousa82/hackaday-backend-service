package com.mchackton.configurations;

import com.mchackton.models.ItemAlert;
import com.mchackton.models.ResponseFoodAlerts;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.configurations
 **/
@Service
public class ItemAlertImpl {

    private RestTemplate restTemplate;
    private final String ROOT_API_FOOD = "https://data.food.gov.uk/food-alerts/id?type=AA&_limit=10";


    public ItemAlertImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseFoodAlerts getResponse() {
        ResponseEntity<ResponseFoodAlerts> response = restTemplate.getForEntity(ROOT_API_FOOD, ResponseFoodAlerts.class);
        return response.getBody();
    }
}
