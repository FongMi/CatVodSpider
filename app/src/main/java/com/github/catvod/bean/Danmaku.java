package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class Danmaku {

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;

    private Danmaku() {
    }

    public static Danmaku create() {
        return new Danmaku();
    }

    public Danmaku name(String name) {
        this.name = name;
        return this;
    }

    public Danmaku url(String url) {
        this.url = url;
        return this;
    }
}
