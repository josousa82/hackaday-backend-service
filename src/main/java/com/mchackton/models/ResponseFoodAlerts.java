package com.mchackton.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.models
 **/
@Getter
public class ResponseFoodAlerts {
    public List<ItemAlert> items = new ArrayList<ItemAlert>();

}
