package com.example.veiwmodel;

import com.google.gson.annotations.SerializedName;

public class RequestModel {
    @SerializedName("body")
    String body;

    @SerializedName("title")
    String title;

    @SerializedName("type")
    String type;

    public RequestModel(String body, String title, String type) {
        this.body = body;
        this.title = title;
        this.type = type;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
