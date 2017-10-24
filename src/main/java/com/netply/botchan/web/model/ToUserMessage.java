package com.netply.botchan.web.model;

public class ToUserMessage {
    private int id;
    private String target;
    private String message;
    private String originatingPlatform;
    private String coreMessage;


    public ToUserMessage() {

    }

    public ToUserMessage(int id, String target, String message) {
        this.id = id;
        this.target = target;
        this.message = message;
    }

    public ToUserMessage(int id, String target, String message, String originatingPlatform, String coreMessage) {
        this.id = id;
        this.target = target;
        this.message = message;
        this.originatingPlatform = originatingPlatform;
        this.coreMessage = coreMessage;
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

    public String getOriginatingPlatform() {
        return originatingPlatform;
    }

    public String getCoreMessage() {
        return coreMessage;
    }

    @Override
    public String toString() {
        return "ToUserMessage{" +
                "id=" + id +
                ", target='" + target + '\'' +
                ", message='" + message + '\'' +
                ", originatingPlatform='" + originatingPlatform + '\'' +
                ", coreMessage='" + coreMessage + '\'' +
                '}';
    }
}
