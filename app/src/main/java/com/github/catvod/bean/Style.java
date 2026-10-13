package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class Style {

    @SerializedName("type")
    private String type;
    @SerializedName("ratio")
    private float ratio;

    private Style() {
    }

    public static Style create() {
        return new Style();
    }

    public Style type(String type) {
        this.type = type;
        return this;
    }

    public Style ratio(float ratio) {
        this.ratio = ratio;
        return this;
    }
}
