package com.mchackton.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.models
 **/
@Getter
@Setter
@EqualsAndHashCode
public class ItemAlert {
        private String shortTitle;
        private String date;
        private List reportingBusiness = new ArrayList<ReportingBusiness>();

        public ItemAlert() {
        }
}
