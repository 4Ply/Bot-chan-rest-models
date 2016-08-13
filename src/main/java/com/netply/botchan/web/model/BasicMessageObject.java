package com.netply.botchan.web.model;

public class BasicMessageObject {
    private long id;
    private String message;


    public BasicMessageObject() {
    }

    public BasicMessageObject(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasicMessageObject basicMessageObject = (BasicMessageObject) o;

        if (id != basicMessageObject.id) return false;
        if (message != null ? !message.equals(basicMessageObject.message) : basicMessageObject.message != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BasicMessageObject{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
