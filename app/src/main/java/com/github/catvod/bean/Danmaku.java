package com.github.catvod.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Danmaku {

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;

    public static List<Danmaku> arrayFrom(String str) {
        Type listType = new TypeToken<List<Danmaku>>() {}.getType();
        return new Gson().fromJson(str, listType);
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
