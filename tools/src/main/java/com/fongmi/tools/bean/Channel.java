package com.fongmi.tools.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Channel {

    @SerializedName("urls")
    private List<String> urls;
    @SerializedName("number")
    private String number;
    @SerializedName("logo")
    private String logo;
    @SerializedName("epg")
    private String epg;
    @SerializedName("name")
    private String name;
    @SerializedName("ua")
    private String ua;

    public static Channel create() {
        return new Channel();
    }

    public List<String> getUrls() {
        return urls = urls == null ? new ArrayList<>() : urls;
    }

    public String getNumber() {
        return number == null ? "" : number;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public Channel number(String number) {
        this.number = number;
        return this;
    }

    public Channel logo(String logo) {
        this.logo = logo;
        return this;
    }

    public Channel epg(String epg) {
        this.epg = epg;
        return this;
    }

    public Channel name(String name) {
        this.name = name;
        return this;
    }

    public Channel ua(String ua) {
        this.ua = ua;
        return this;
    }

    public void addUrls(String... urls) {
        getUrls().addAll(new ArrayList<>(Arrays.asList(urls)));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Channel)) return false;
        Channel it = (Channel) obj;
        return getName().equals(it.getName()) || (!getNumber().isEmpty() && getNumber().equals(it.getNumber()));
    }

    public static class Sorter implements Comparator<Channel> {

        @Override
        public int compare(Channel c1, Channel c2) {
            return Integer.compare(Integer.parseInt(c1.getNumber()), Integer.parseInt(c2.getNumber()));
        }
    }
}
