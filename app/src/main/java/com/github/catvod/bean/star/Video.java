package com.github.catvod.bean.star;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("purl")
    private String purl;
    @SerializedName("eporder")
    private int eporder;

    public String getPurl() {
        return TextUtils.isEmpty(purl) ? "" : purl;
    }

    public int getEporder() {
        return eporder;
    }
}
