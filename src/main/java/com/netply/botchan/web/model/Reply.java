package com.netply.botchan.web.model;

public class Reply {
    private String id;
    private String target;
    private String message;


    public Reply() {

    }

    public Reply(String target, String message) {
        this.message = message;
        this.target = target;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reply reply = (Reply) o;

        if (id != null ? !id.equals(reply.id) : reply.id != null) return false;
        if (target != null ? !target.equals(reply.target) : reply.target != null) return false;
        return message != null ? message.equals(reply.message) : reply.message == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id='" + id + '\'' +
                ", target='" + target + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
