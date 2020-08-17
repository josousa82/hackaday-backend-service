package com.mchackton.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.models
 **/
@Getter
@Setter
@EqualsAndHashCode
public class ResponseFoodAlerts {
    public ArrayList items = new ArrayList<ItemAlert>();

}
