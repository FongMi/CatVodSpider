package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class Style {

    @SerializedName("type")
    private String type;
    @SerializedName("ratio")
    private float ratio;

    public Style(String type) {
        this.type = type;
    }

    public Style(String type, float ratio) {
        this(type);
        this.ratio = ratio;
    }
}
