package com.earthquakeDemo.model.earthquake;

import java.util.List;

public class EarthQuakeModel {
    private String type;
    private MetadataModel metadata;
    private List<FeatureModel> features;
    private List<Float> bbox;

    public EarthQuakeModel() {
    }

    public EarthQuakeModel(String type, MetadataModel metadata, List<FeatureModel> features, List<Float> bbox) {
        this.type = type;
        this.metadata = metadata;
        this.features = features;
        this.bbox = bbox;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MetadataModel getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataModel metadata) {
        this.metadata = metadata;
    }

    public List<FeatureModel> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeatureModel> features) {
        this.features = features;
    }

    public List<Float> getBbox() {
        return bbox;
    }

    public void setBbox(List<Float> bbox) {
        this.bbox = bbox;
    }
}
