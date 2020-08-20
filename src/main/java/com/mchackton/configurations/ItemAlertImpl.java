package com.mchackton.configurations;

import com.mchackton.dtos.rest_dtos.FoodAlertsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.stream.Collectors;


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

    public FoodAlertsDTO getResponse() {
        ResponseEntity<FoodAlertsDTO> response = restTemplate.getForEntity(ROOT_API_FOOD, FoodAlertsDTO.class);
         Objects.requireNonNull(response.getBody()).getItems().stream()
         .map(item -> item.toString())
         .forEach(System.out::println);
        return response.getBody();
    }
}
