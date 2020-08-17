package com.mchackton.configurations;

import com.mchackton.models.ItemAlert;
import com.mchackton.models.ResponseFoodAlerts;

import java.util.List;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.configurations
 **/
public interface FoodAlertClient {
    ResponseFoodAlerts getResponse();
}
