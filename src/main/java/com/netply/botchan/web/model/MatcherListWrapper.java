package com.netply.botchan.web.model;

import java.util.ArrayList;

public class MatcherListWrapper {
    private ArrayList<String> matchers;


    public MatcherListWrapper() {

    }

    public MatcherListWrapper(ArrayList<String> matchers) {
        this.matchers = matchers;
    }

    public ArrayList<String> getMatchers() {
        return matchers;
    }

    public void setMatchers(ArrayList<String> matchers) {
        this.matchers = matchers;
    }

    @Override
    public String toString() {
        return "MatcherListWrapper{" +
                "matchers=" + matchers +
                '}';
    }
}
