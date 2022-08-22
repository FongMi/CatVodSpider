package com.github.catvod.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class Result {

    @SerializedName("class")
    private List<Class> classes;
    @SerializedName("list")
    private List<Vod> list;
    @SerializedName("filters")
    private LinkedHashMap<String, List<Filter>> filters;
    @SerializedName("header")
    private String header;
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

    public List<Vod> getList() {
        return list == null ? Collections.emptyList() : list;
    }

    public void setFilters(LinkedHashMap<String, List<Filter>> filters) {
        this.filters = filters;
    }

    public void setFilters(JSONObject object) {
        Type listType = new TypeToken<LinkedHashMap<String, List<Filter>>>() {}.getType();
        this.filters = new Gson().fromJson(object.toString(), listType);
    }

    public void setHeader(String header) {
        this.header = header;
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
