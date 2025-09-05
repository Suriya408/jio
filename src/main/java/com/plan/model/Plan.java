package com.plan.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plans")
public class Plan {

    private String planId;
    private String description;
    private double price;
    private String validity;
    private String data;

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}