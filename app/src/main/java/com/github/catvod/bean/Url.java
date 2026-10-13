package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Url {

    @SerializedName("values")
    private List<Value> values;
    @SerializedName("position")
    private Integer position;

    private Url() {
    }

    public static Url create() {
        return new Url();
    }

    public Url values(List<Value> values) {
        this.values = values;
        return this;
    }

    public Url position(int position) {
        this.position = position;
        return this;
    }
}
