package com.mchackton.dtos.rest_dtos;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.mchackton.dtos.rest_dtos
 **/
import java.io.Serializable;
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
        "publisher",
        "licence",
        "documentation",
        "version",
        "comment",
        "hasFormat",
        "limit"
})
@NoArgsConstructor
public class Meta implements Serializable
{

    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("licence")
    private String licence;
    @JsonProperty("documentation")
    private String documentation;
    @JsonProperty("version")
    private String version;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("hasFormat")
    private List<String> hasFormat = null;
    @JsonProperty("limit")
    private Integer limit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8441298532536170717L;


    /**
     *
     * @param licence
     * @param hasFormat
     * @param documentation
     * @param limit
     * @param publisher
     * @param comment
     * @param version
     */
    public Meta(String publisher, String licence, String documentation, String version, String comment, List<String> hasFormat, Integer limit) {
        super();
        this.publisher = publisher;
        this.licence = licence;
        this.documentation = documentation;
        this.version = version;
        this.comment = comment;
        this.hasFormat = hasFormat;
        this.limit = limit;
    }

    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Meta withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    @JsonProperty("licence")
    public String getLicence() {
        return licence;
    }

    @JsonProperty("licence")
    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Meta withLicence(String licence) {
        this.licence = licence;
        return this;
    }

    @JsonProperty("documentation")
    public String getDocumentation() {
        return documentation;
    }

    @JsonProperty("documentation")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public Meta withDocumentation(String documentation) {
        this.documentation = documentation;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public Meta withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Meta withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @JsonProperty("hasFormat")
    public List<String> getHasFormat() {
        return hasFormat;
    }

    @JsonProperty("hasFormat")
    public void setHasFormat(List<String> hasFormat) {
        this.hasFormat = hasFormat;
    }

    public Meta withHasFormat(List<String> hasFormat) {
        this.hasFormat = hasFormat;
        return this;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Meta withLimit(Integer limit) {
        this.limit = limit;
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

    public Meta withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}

