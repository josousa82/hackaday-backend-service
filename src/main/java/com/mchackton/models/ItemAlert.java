package com.mchackton.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

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
