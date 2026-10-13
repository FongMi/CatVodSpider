package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("n")
    private String n;
    @SerializedName("v")
    private String v;

    private Value() {
    }

    public static Value create() {
        return new Value();
    }

    public Value n(String n) {
        this.n = n;
        return this;
    }

    public Value v(String v) {
        this.v = v;
        return this;
    }
}
