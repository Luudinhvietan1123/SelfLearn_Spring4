package com.example.SelfLearn_Spring4;

public abstract class DatabaseConnector {
    private String url;

    public abstract void connect();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
