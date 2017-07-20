package com.netply.botchan.web.model;

public class ToUserMessage {
    private int id;
    private String target;
    private String message;


    public ToUserMessage() {

    }

    public ToUserMessage(int id, String target, String message) {
        this.id = id;
        this.target = target;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ToUserMessage{" +
                "id=" + id +
                ", target='" + target + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
