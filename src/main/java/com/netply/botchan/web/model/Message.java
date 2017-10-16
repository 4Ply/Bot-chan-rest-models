package com.netply.botchan.web.model;

public class Message {
    private int id;
    private String message;
    private String sender;
    private boolean isDirect;


    public Message() {

    }

    public Message(String message, String sender, boolean isDirect) {
        this.message = message;
        this.sender = sender;
        this.isDirect = isDirect;
    }

    public Message(int id, String message, String sender, boolean isDirect) {
        this.id = id;
        this.message = message;
        this.sender = sender;
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
                ", isDirect=" + isDirect +
                '}';
    }
}
