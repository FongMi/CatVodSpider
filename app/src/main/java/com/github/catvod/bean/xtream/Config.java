package com.github.catvod.bean.xtream;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

import okhttp3.HttpUrl;

public class Config {

    @SerializedName("vod")
    private boolean vod;
    @SerializedName("live")
    private boolean live;
    @SerializedName("formats")
    private List<String> formats;

    private HttpUrl url;
    private String name;
    private String pass;

    public static Config objectFrom(String str) {
        Config item = new Gson().fromJson(str, Config.class);
        return item == null ? new Config() : item;
    }

    public boolean isVod() {
        return vod;
    }

    public boolean isLive() {
        return live;
    }

    public void setUrl(String url) {
        this.url = HttpUrl.parse(url);
        setName(this.url.queryParameter("username"));
        setPass(this.url.queryParameter("password"));
    }

    public HttpUrl getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<String> getFormats() {
        return formats == null ? Arrays.asList("ts") : formats;
    }
}
