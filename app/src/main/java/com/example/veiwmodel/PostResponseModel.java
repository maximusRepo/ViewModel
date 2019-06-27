package com.example.veiwmodel;

import com.google.gson.annotations.SerializedName;

public class PostResponseModel  {
    @SerializedName("active")
    String active;

    @SerializedName("iden")
    String iden;

    @SerializedName("created")
    String created;

    @SerializedName("modified")
    String modified;

    @SerializedName("type")
    String type;

    @SerializedName("dismissed")
    String dismissed;

    @SerializedName("direction")
    String direction;

    @SerializedName("sender_iden")
    String sender_iden;

    @SerializedName("sender_email")
    String sender_email;

    @SerializedName("sender_email_normalized")
    String sender_email_normalized;

    @SerializedName("sender_name")
    String sender_name;

    @SerializedName("receiver_iden")
    String receiver_iden;

    @SerializedName("receiver_email")
    String receiver_email;

    @SerializedName("receiver_email_normalized")
    String receiver_email_normalized;

    @SerializedName("title")
    String title;

    @SerializedName("body")
    String body;

    public PostResponseModel(String active, String iden, String created, String modified, String type, String dismissed, String direction, String sender_iden, String sender_email, String sender_email_normalized, String sender_name, String receiver_iden, String receiver_email, String receiver_email_normalized, String title, String body) {
        this.active = active;
        this.iden = iden;
        this.created = created;
        this.modified = modified;
        this.type = type;
        this.dismissed = dismissed;
        this.direction = direction;
        this.sender_iden = sender_iden;
        this.sender_email = sender_email;
        this.sender_email_normalized = sender_email_normalized;
        this.sender_name = sender_name;
        this.receiver_iden = receiver_iden;
        this.receiver_email = receiver_email;
        this.receiver_email_normalized = receiver_email_normalized;
        this.title = title;
        this.body = body;
    }


    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDismissed() {
        return dismissed;
    }

    public void setDismissed(String dismissed) {
        this.dismissed = dismissed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSender_iden() {
        return sender_iden;
    }

    public void setSender_iden(String sender_iden) {
        this.sender_iden = sender_iden;
    }

    public String getSender_email() {
        return sender_email;
    }

    public void setSender_email(String sender_email) {
        this.sender_email = sender_email;
    }

    public String getSender_email_normalized() {
        return sender_email_normalized;
    }

    public void setSender_email_normalized(String sender_email_normalized) {
        this.sender_email_normalized = sender_email_normalized;
    }

    public String getSender_name() {
        return sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    public String getReceiver_iden() {
        return receiver_iden;
    }

    public void setReceiver_iden(String receiver_iden) {
        this.receiver_iden = receiver_iden;
    }

    public String getReceiver_email() {
        return receiver_email;
    }

    public void setReceiver_email(String receiver_email) {
        this.receiver_email = receiver_email;
    }

    public String getReceiver_email_normalized() {
        return receiver_email_normalized;
    }

    public void setReceiver_email_normalized(String receiver_email_normalized) {
        this.receiver_email_normalized = receiver_email_normalized;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
