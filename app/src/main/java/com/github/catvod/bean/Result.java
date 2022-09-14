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
    @SerializedName("url")
    private String url;
    @SerializedName("parse")
    private int parse;
    @SerializedName("jx")
    private int jx;

    public static String string(List<Class> classes, List<Vod> list, LinkedHashMap<String, List<Filter>> filters) {
        return Result.get().classes(classes).vod(list).filters(filters).string();
    }

    public static String string(List<Class> classes, List<Vod> list, JSONObject filters) {
        return Result.get().classes(classes).vod(list).filters(filters).string();
    }

    public static String string(List<Class> classes, JSONObject filters) {
        return Result.get().classes(classes).filters(filters).string();
    }

    public static String string(List<Class> classes, List<Vod> list) {
        return Result.get().classes(classes).vod(list).string();
    }

    public static String string(List<Vod> list) {
        return Result.get().vod(list).string();
    }

    public static String string(Vod item) {
        return Result.get().vod(item).string();
    }

    public static Result get() {
        return new Result();
    }

    public Result classes(List<Class> classes) {
        this.classes = classes;
        return this;
    }

    public Result vod(List<Vod> list) {
        this.list = list;
        return this;
    }

    public Result vod(Vod item) {
        this.list = Arrays.asList(item);
        return this;
    }

    public Result filters(LinkedHashMap<String, List<Filter>> filters) {
        this.filters = filters;
        return this;
    }

    public Result filters(JSONObject object) {
        if (object == null) return this;
        Type listType = new TypeToken<LinkedHashMap<String, List<Filter>>>() {}.getType();
        this.filters = new Gson().fromJson(object.toString(), listType);
        return this;
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

    public Result jx() {
        this.jx = 1;
        return this;
    }

    public Result url(String url) {
        this.url = url;
        return this;
    }

    public List<Vod> getList() {
        return list == null ? Collections.emptyList() : list;
    }

    public String string() {
        return toString();
    }

    @NotNull
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
