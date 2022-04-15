package com.earthquakeDemo.model.earthquake;

import java.util.List;

public class GeometryModel {
    private String type;
    private List<Float> coordinates;

    public GeometryModel() {
    }

    public GeometryModel(String type, List<Float> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Float> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Float> coordinates) {
        this.coordinates = coordinates;
    }
}