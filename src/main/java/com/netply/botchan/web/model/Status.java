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
}
