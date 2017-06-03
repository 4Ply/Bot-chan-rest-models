package com.netply.botchan.web.model;

public class Message {
    private String id;
    private String message;
    private String sender;
    private boolean isDirect = false;


    public Message() {

    }

    public Message(String id, String message) {
        this(id, message, null);
    }

    public Message(String id, String message, String sender) {
        this(id, message, sender, false);
    }

    public Message(String id, String message, String sender, boolean isDirect) {
        this.id = id;
        this.message = message;
        this.sender = sender;
        this.isDirect = isDirect;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setDirect(boolean direct) {
        isDirect = direct;
    }

    public boolean isDirect() {
        return isDirect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message) o;

        if (isDirect != message1.isDirect) return false;
        if (id != null ? !id.equals(message1.id) : message1.id != null) return false;
        if (message != null ? !message.equals(message1.message) : message1.message != null) return false;
        return sender != null ? sender.equals(message1.sender) : message1.sender == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (sender != null ? sender.hashCode() : 0);
        result = 31 * result + (isDirect ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", sender='" + sender + '\'' +
                ", isDirect=" + isDirect +
                '}';
    }
}
