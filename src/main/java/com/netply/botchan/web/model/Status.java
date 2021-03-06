package com.netply.botchan.web.model;

public class Status {
    private String key;
    private String value;


    public Status() {
    }

    public Status(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Status status = (Status) o;

        if (key != null ? !key.equals(status.key) : status.key != null) return false;
        return value != null ? value.equals(status.value) : status.value == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Status{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
