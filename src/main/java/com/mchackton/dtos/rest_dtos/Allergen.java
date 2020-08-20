package com.mchackton.dtos.rest_dtos;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.mchackton.dtos.rest_dtos
 **/

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@id",
        "label"
})
@NoArgsConstructor
public class Allergen implements Serializable
{

    @JsonProperty("@id")
    private String id;
    @JsonProperty("label")
    private String label;
    private final static long serialVersionUID = -3003182621030877178L;

    /**
     *
     * @param id
     * @param label
     */
    public Allergen(String id, String label) {
        super();
        this.id = id;
        this.label = label;
    }

    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    public Allergen withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Allergen withLabel(String label) {
        this.label = label;
        return this;
    }

}