package com.mchackton.dtos.rest_dtos;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.mchackton.dtos.rest_dtos
 **/
import java.io.Serializable;
import java.util.HashMap;
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
        "commonName"
})
@NoArgsConstructor
public class ReportingBusiness implements Serializable
{

    @JsonProperty("commonName")
    private String commonName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 506898890544525419L;

    /**
     *
     * @param commonName
     */
    public ReportingBusiness(String commonName) {
        super();
        this.commonName = commonName;
    }

    @JsonProperty("commonName")
    public String getCommonName() {
        return commonName;
    }

    @JsonProperty("commonName")
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public ReportingBusiness withCommonName(String commonName) {
        this.commonName = commonName;
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

    public ReportingBusiness withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
