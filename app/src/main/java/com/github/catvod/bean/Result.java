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

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public void setList(List<Vod> list) {
        this.list = list;
    }

    public void setFilters(JSONObject filters) {
        this.filters = filters;
    }

    @NotNull
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
