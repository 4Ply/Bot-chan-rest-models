package com.netply.botchan.web.model;

import java.util.ArrayList;

public class MatcherList {
    private Integer id;
    private ArrayList<String> matchers;


    public MatcherList() {

    }

    public MatcherList(Integer id, ArrayList<String> matchers) {
        this.id = id;
        this.matchers = matchers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMatchers(ArrayList<String> matchers) {
        this.matchers = matchers;
    }

    public ArrayList<String> getMatchers() {
        return matchers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatcherList that = (MatcherList) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return matchers != null ? matchers.equals(that.matchers) : that.matchers == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (matchers != null ? matchers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MatcherList{" +
                "id=" + id +
                ", matchers=" + matchers +
                '}';
    }
}
