package com.mchackton.dtos.rest_dtos;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.mchackton.dtos.rest_dtos
 **/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@id",
        "allergen",
        "riskStatement"
})
@NoArgsConstructor
public class Problem implements Serializable
{

    @JsonProperty("@id")
    private String id;
    @JsonProperty("allergen")
    private List<Allergen> allergen = new ArrayList<>();
    @JsonProperty("riskStatement")
    private String riskStatement;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = -7589846767637280360L;

    /**
     *
     * @param allergen
     * @param id
     * @param riskStatement
     */
    public Problem(String id, List<Allergen> allergen, String riskStatement) {
        super();
        this.id = id;
        this.allergen = allergen;
        this.riskStatement = riskStatement;
    }

    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    public Problem withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("allergen")
    public List<Allergen> getAllergen() {
        return allergen;
    }

    @JsonProperty("allergen")
    public void setAllergen(List<Allergen> allergen) {
        this.allergen = allergen;
    }

    public Problem withAllergen(List<Allergen> allergen) {
        this.allergen = allergen;
        return this;
    }

    @JsonProperty("riskStatement")
    public String getRiskStatement() {
        return riskStatement;
    }

    @JsonProperty("riskStatement")
    public void setRiskStatement(String riskStatement) {
        this.riskStatement = riskStatement;
    }

    public Problem withRiskStatement(String riskStatement) {
        this.riskStatement = riskStatement;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Problem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
