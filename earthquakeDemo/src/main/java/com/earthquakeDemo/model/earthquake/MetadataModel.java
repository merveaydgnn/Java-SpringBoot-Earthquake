package com.earthquakeDemo.model.earthquake;

public class MetadataModel {
    private long generated;
    private String url;
    private String title;
    private int status;
    private String api;
    private long count;

    public MetadataModel() {
    }

    public MetadataModel(long generated, String url, String title, int status, String api, long count) {
        this.generated = generated;
        this.url = url;
        this.title = title;
        this.status = status;
        this.api = api;
        this.count = count;
    }

    public long getGenerated() {
        return generated;
    }

    public void setGenerated(long generated) {
        this.generated = generated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
