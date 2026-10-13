package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Filter {

    @SerializedName("key")
    private String key;
    @SerializedName("name")
    private String name;
    @SerializedName("init")
    private String init;
    @SerializedName("value")
    private List<Value> value;

    private Filter() {
    }

    public static Filter create() {
        return new Filter();
    }

    public Filter key(String key) {
        this.key = key;
        return this;
    }

    public Filter name(String name) {
        this.name = name;
        return this;
    }

    public Filter value(List<Value> value) {
        this.value = value;
        return this;
    }

    public Filter init(String init) {
        this.init = init;
        return this;
    }
}
