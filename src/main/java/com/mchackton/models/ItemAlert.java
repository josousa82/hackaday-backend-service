package com.mchackton.models;

import lombok.Getter;
import lombok.ToString;
/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.models
 **/
@Getter
@ToString
public class ItemAlert {
        public String shortTitle;
        public String created;
        public ReportingBusiness reportingBusiness;

        public ItemAlert() {
        }
}
