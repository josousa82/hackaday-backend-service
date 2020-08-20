package com.mchackton.dtos.rest_dtos;

import com.fasterxml.jackson.annotation.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.mchackton.dtos.rest_dtos
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "meta",
        "items"
})
@NoArgsConstructor
public class FoodAlertsDTO implements Serializable
{

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5451865076866730786L;

    /**
     *
     * @param meta
     * @param items
     */
    public FoodAlertsDTO(Meta meta, List<Item> items) {
        super();
        this.meta = meta;
        this.items = items;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public FoodAlertsDTO withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public FoodAlertsDTO withItems(List<Item> items) {
        this.items = items;
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

    public FoodAlertsDTO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
