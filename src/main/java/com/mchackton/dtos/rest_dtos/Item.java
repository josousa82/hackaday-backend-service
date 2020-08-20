package com.mchackton.dtos.rest_dtos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
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
        "alertURL",
        "created",
        "modified",
        "notation",
        "problem",
        "productDetails",
        "reportingBusiness",
        "shortTitle",
        "status",
        "title",
        "type"
})
@NoArgsConstructor
public class Item implements Serializable
{

    @JsonProperty("@id")
    private String id;
    @JsonProperty("alertURL")
    private String alertURL;
    @JsonProperty("created")
    private String created;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("notation")
    private String notation;
    @JsonProperty("problem")
    private List<Problem> problem = null;
    @JsonProperty("productDetails")
    private List<ProductDetail> productDetails = null;
    @JsonProperty("reportingBusiness")
    private ReportingBusiness reportingBusiness;
    @JsonProperty("shortTitle")
    private String shortTitle;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("title")
    private String title;
    @JsonProperty("type")
    private List<String> type = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5166853120530104650L;

    /**
     *
     * @param problem
     * @param created
     * @param notation
     * @param modified
     * @param id
     * @param alertURL
     * @param reportingBusiness
     * @param shortTitle
     * @param productDetails
     * @param title
     * @param type
     * @param status
     */
    public Item(String id, String alertURL, String created, String modified, String notation, List<Problem> problem, List<ProductDetail> productDetails, ReportingBusiness reportingBusiness, String shortTitle, Status status, String title, List<String> type) {
        super();
        this.id = id;
        this.alertURL = alertURL;
        this.created = created;
        this.modified = modified;
        this.notation = notation;
        this.problem = problem;
        this.productDetails = productDetails;
        this.reportingBusiness = reportingBusiness;
        this.shortTitle = shortTitle;
        this.status = status;
        this.title = title;
        this.type = type;
    }

    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    public Item withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("alertURL")
    public String getAlertURL() {
        return alertURL;
    }

    @JsonProperty("alertURL")
    public void setAlertURL(String alertURL) {
        this.alertURL = alertURL;
    }

    public Item withAlertURL(String alertURL) {
        this.alertURL = alertURL;
        return this;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    public Item withCreated(String created) {
        this.created = created;
        return this;
    }

    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    public Item withModified(String modified) {
        this.modified = modified;
        return this;
    }

    @JsonProperty("notation")
    public String getNotation() {
        return notation;
    }

    @JsonProperty("notation")
    public void setNotation(String notation) {
        this.notation = notation;
    }

    public Item withNotation(String notation) {
        this.notation = notation;
        return this;
    }

    @JsonProperty("problem")
    public List<Problem> getProblem() {
        return problem;
    }

    @JsonProperty("problem")
    public void setProblem(List<Problem> problem) {
        this.problem = problem;
    }

    public Item withProblem(List<Problem> problem) {
        this.problem = problem;
        return this;
    }

    @JsonProperty("productDetails")
    public List<ProductDetail> getProductDetails() {
        return productDetails;
    }

    @JsonProperty("productDetails")
    public void setProductDetails(List<ProductDetail> productDetails) {
        this.productDetails = productDetails;
    }

    public Item withProductDetails(List<ProductDetail> productDetails) {
        this.productDetails = productDetails;
        return this;
    }

    @JsonProperty("reportingBusiness")
    public ReportingBusiness getReportingBusiness() {
        return reportingBusiness;
    }

    @JsonProperty("reportingBusiness")
    public void setReportingBusiness(ReportingBusiness reportingBusiness) {
        this.reportingBusiness = reportingBusiness;
    }

    public Item withReportingBusiness(ReportingBusiness reportingBusiness) {
        this.reportingBusiness = reportingBusiness;
        return this;
    }

    @JsonProperty("shortTitle")
    public String getShortTitle() {
        return shortTitle;
    }

    @JsonProperty("shortTitle")
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public Item withShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
        return this;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public Item withStatus(Status status) {
        this.status = status;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Item withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("type")
    public List<String> getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(List<String> type) {
        this.type = type;
    }

    public Item withType(List<String> type) {
        this.type = type;
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

    public Item withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
