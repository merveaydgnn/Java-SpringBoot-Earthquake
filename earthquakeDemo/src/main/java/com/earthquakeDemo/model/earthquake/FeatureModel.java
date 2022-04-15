package com.earthquakeDemo.model.earthquake;

public class FeatureModel {
    private String type;
    private PropertiesModel properties;
    private GeometryModel geometry;
    private String id;

    public FeatureModel() {
    }

    public FeatureModel(String type, PropertiesModel properties, GeometryModel geometry, String id) {
        this.type = type;
        this.properties = properties;
        this.geometry = geometry;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PropertiesModel getProperties() {
        return properties;
    }

    public void setProperties(PropertiesModel properties) {
        this.properties = properties;
    }

    public GeometryModel getGeometry() {
        return geometry;
    }

    public void setGeometry(GeometryModel geometry) {
        this.geometry = geometry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
