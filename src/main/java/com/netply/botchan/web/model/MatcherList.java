package com.netply.botchan.web.model;

import java.util.ArrayList;

public class MatcherList {
    private String platform;
    private ArrayList<String> matchers;


    public MatcherList() {

    }

    public MatcherList(String platform, ArrayList<String> matchers) {
        this.platform = platform;
        this.matchers = matchers;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ArrayList<String> getMatchers() {
        return matchers;
    }

    public void setMatchers(ArrayList<String> matchers) {
        this.matchers = matchers;
    }

    @Override
    public String toString() {
        return "MatcherList{" +
                "platform='" + platform + '\'' +
                ", matchers=" + matchers +
                '}';
    }
}
