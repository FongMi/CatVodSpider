package com.github.catvod.bean.xc;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class Config {

    @SerializedName("name")
    private String name;
    @SerializedName("pass")
    private String pass;
    @SerializedName("vod")
    private boolean vod;
    @SerializedName("formats")
    private List<String> formats;

    private String url;

    public static Config objectFrom(String str) {
        Config item = new Gson().fromJson(str, Config.class);
        return item == null ? new Config() : item;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public boolean isVod() {
        return vod;
    }

    public List<String> getFormats() {
        return formats == null ? Arrays.asList("ts") : formats;
    }
}
