package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("n")
    private String n;
    @SerializedName("v")
    private String v;

    public Value(String n, String v) {
        this.n = n;
        this.v = v;
    }
}
