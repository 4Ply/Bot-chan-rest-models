package com.netply.botchan.web.model;

public class Reply {
    private int originalMessageID;
    private String message;


    public Reply() {

    }

    public Reply(int originalMessageID, String message) {
        this.originalMessageID = originalMessageID;
        this.message = message;
    }

    public int getOriginalMessageID() {
        return originalMessageID;
    }

    public void setOriginalMessageID(int originalMessageID) {
        this.originalMessageID = originalMessageID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "originalMessageID=" + originalMessageID +
                ", message='" + message + '\'' +
                '}';
    }
}
