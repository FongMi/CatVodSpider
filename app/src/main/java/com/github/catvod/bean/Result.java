package com.github.catvod.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.List;

public class Result {

    @SerializedName("class")
    private List<Class> classes;
    @SerializedName("list")
    private List<Vod> list;
    @SerializedName("filters")
    private JSONObject filters;
    @SerializedName("parse")
    private String parse;
    @SerializedName("url")
    private String url;
    @SerializedName("ua")
    private String ua;

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public void setList(List<Vod> list) {
        this.list = list;
    }

    public void setFilters(JSONObject filters) {
        this.filters = filters;
    }

    public void setParse(String parse) {
        this.parse = parse;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    @NotNull
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
