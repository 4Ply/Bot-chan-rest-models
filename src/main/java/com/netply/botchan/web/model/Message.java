package com.netply.botchan.web.model;

public class Message {
    private int id;
    private String message;
    private String sender;
    private String platform;
    private boolean isDirect = false;


    public Message() {

    }

    public Message(String message, String sender, String platform, boolean isDirect) {
        this.message = message;
        this.sender = sender;
        this.platform = platform;
        this.isDirect = isDirect;
    }

    public Message(int id, String message, String sender, String platform, boolean isDirect) {
        this.id = id;
        this.message = message;
        this.sender = sender;
        this.platform = platform;
        this.isDirect = isDirect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isDirect() {
        return isDirect;
    }

    public void setDirect(boolean direct) {
        isDirect = direct;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", sender='" + sender + '\'' +
                ", platform='" + platform + '\'' +
                ", isDirect=" + isDirect +
                '}';
    }
}
