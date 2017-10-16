package com.netply.botchan.web.model;

public class FromUserMessage {
    private int id;
    private String message;
    private int platformID;
    private boolean direct;


    public FromUserMessage() {

    }

    public FromUserMessage(String message, int platformID, boolean direct) {
        this.message = message;
        this.platformID = platformID;
        this.direct = direct;
    }

    public FromUserMessage(int id, String message, int platformID, boolean direct) {
        this.id = id;
        this.message = message;
        this.platformID = platformID;
        this.direct = direct;
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

    public int getPlatformID() {
        return platformID;
    }

    public void setPlatformID(int platformID) {
        this.platformID = platformID;
    }

    public boolean isDirect() {
        return direct;
    }

    public void setDirect(boolean direct) {
        this.direct = direct;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", platformID=" + platformID +
                ", direct=" + direct +
                '}';
    }
}
