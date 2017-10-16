package com.netply.botchan.web.model;

public class Message {
    private int id;
    private String message;
    private String sender;
    private boolean direct;


    public Message() {

    }

    public Message(String message, String sender, boolean direct) {
        this.message = message;
        this.sender = sender;
        this.direct = direct;
    }

    public Message(int id, String message, String sender, boolean direct) {
        this.id = id;
        this.message = message;
        this.sender = sender;
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

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
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
                ", sender='" + sender + '\'' +
                ", direct=" + direct +
                '}';
    }
}
