package com.netply.botchan.web.model;

public class Node {
    private String name;
    private boolean isEnabled;


    public Node() {
    }

    public Node(String name, boolean isEnabled) {
        this.name = name;
        this.isEnabled = isEnabled;
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
