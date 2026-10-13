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

    public Filter(String key, String name, List<Value> value) {
        this.key = key;
        this.name = name;
        this.value = value;
    }

    public Filter setInit(String init) {
        this.init = init;
        return this;
    }
}
