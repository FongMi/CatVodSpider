package com.github.catvod.bean.live;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Channel {

    @SerializedName("urls")
    private List<String> urls;
    @SerializedName("tvgName")
    private String tvgName;
    @SerializedName("number")
    private String number;
    @SerializedName("logo")
    private String logo;
    @SerializedName("name")
    private String name;
    @SerializedName("epg")
    private String epg;
    @SerializedName("ua")
    private String ua;
    @SerializedName("referer")
    private String referer;

    public static Channel objectFrom(JsonElement element) {
        return new Gson().fromJson(element, Channel.class);
    }

    public static Channel create(String name) {
        return new Channel(name);
    }

    public Channel(String name) {
        this.name = name;
    }

    public String getNumber() {
        return TextUtils.isEmpty(number) ? "" : number;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public List<String> getUrls() {
        return urls = urls == null ? new ArrayList<>() : urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public void setTvgName(String tvgName) {
        this.tvgName = tvgName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEpg(String epg) {
        this.epg = epg;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public void setNumber(int number) {
        setNumber(String.format(Locale.getDefault(), "%03d", number));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Channel)) return false;
        Channel it = (Channel) obj;
        return getName().equals(it.getName()) || (!getNumber().isEmpty() && getNumber().equals(it.getNumber()));
    }
}
