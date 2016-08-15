package com.netply.botchan.web.model;

public class Reply {
    private String id;
    private String target;
    private String platform;
    private String message;


    public Reply() {

    }

    public Reply(String platform, String target, String message) {
        this.platform = platform;
        this.message = message;
        this.target = target;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getPlatform() {
        return platform;
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

        if (message != null ? !message.equals(reply.message) : reply.message != null) return false;
        return target != null ? target.equals(reply.target) : reply.target == null;
    }

    @Override
    public int hashCode() {
        int result = message != null ? message.hashCode() : 0;
        result = 31 * result + (target != null ? target.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "message='" + message + '\'' +
                ", target='" + target + '\'' +
                '}';
    }
}