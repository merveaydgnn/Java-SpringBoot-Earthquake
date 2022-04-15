package com.earthquakeDemo.model;

import java.time.Instant;

public class ConsoleResponseModel {
    private String country;
    private String place;
    private float magnitude;
    private Instant dateTime;

    public ConsoleResponseModel(String country, String place, float magnitude, Instant dateTime) {
        this.country = country;
        this.place = place;
        this.magnitude = magnitude;
        this.dateTime = dateTime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }
}
