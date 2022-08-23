package com.github.catvod.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
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
    private Integer parse;
    @SerializedName("url")
    private String url;

    public static Result get() {
        return new Result();
    }

    public static String get(List<Class> classes, List<Vod> list) {
        return new Result(classes, list).toString();
    }

    public static String get(List<Class> classes, LinkedHashMap<String, List<Filter>> filters) {
        return new Result(classes, filters).toString();
    }

    public static String get(List<Class> classes, LinkedHashMap<String, List<Filter>> filters, List<Vod> list) {
        return new Result(classes, filters, list).toString();
    }

    public static String get(List<Vod> list) {
        return new Result(list).toString();
    }

    public static String get(Vod vod) {
        return new Result(vod).toString();
    }

    public Result() {
    }

    public Result(List<Vod> list) {
        this.list = list;
    }

    public Result(List<Class> classes, List<Vod> list) {
        this.classes = classes;
        this.list = list;
    }

    public Result(List<Class> classes, LinkedHashMap<String, List<Filter>> filters) {
        this.classes = classes;
        this.filters = filters;
    }

    public Result(List<Class> classes, LinkedHashMap<String, List<Filter>> filters, List<Vod> list) {
        this.classes = classes;
        this.filters = filters;
        this.list = list;
    }

    public Result(Vod vod) {
        this.list = Arrays.asList(vod);
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public void setList(List<Vod> list) {
        this.list = list;
    }

    public List<Vod> getList() {
        return list == null ? Collections.emptyList() : list;
    }

    public void setFilters(JSONObject object) {
        Type listType = new TypeToken<LinkedHashMap<String, List<Filter>>>() {
        }.getType();
        this.filters = new Gson().fromJson(object.toString(), listType);
    }

    public Result header(HashMap<String, String> header) {
        this.header = new Gson().toJson(header);
        return this;
    }

    public Result parse() {
        this.parse = 1;
        return this;
    }

    public Result parse(int parse) {
        this.parse = parse;
        return this;
    }

    public Result url(String url) {
        this.url = url;
        return this;
    }

    @NotNull
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
