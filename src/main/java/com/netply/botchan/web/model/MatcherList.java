package com.netply.botchan.web.model;

import java.util.ArrayList;

public class MatcherList {
    private Integer id;
    private ArrayList<String> messageMatchers;


    public MatcherList() {

    }

    public MatcherList(Integer id, ArrayList<String> messageMatchers) {
        this.id = id;
        this.messageMatchers = messageMatchers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMessageMatchers(ArrayList<String> messageMatchers) {
        this.messageMatchers = messageMatchers;
    }

    public ArrayList<String> getMessageMatchers() {
        return messageMatchers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatcherList that = (MatcherList) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return messageMatchers != null ? messageMatchers.equals(that.messageMatchers) : that.messageMatchers == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (messageMatchers != null ? messageMatchers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MatcherList{" +
                "id=" + id +
                ", messageMatchers=" + messageMatchers +
                '}';
    }
}
