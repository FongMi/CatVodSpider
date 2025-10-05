package com.github.catvod.bean.jianpian;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Search {

    @SerializedName("data")
    private List<Search> data;
    @SerializedName("id")
    private String id;
    @SerializedName(value = "thumbnail", alternate = "path")
    private String thumbnail;
    @SerializedName("title")
    private String title;
    @SerializedName("mask")
    private String mask;

    public static Search objectFrom(String str) {
        return new Gson().fromJson(str, Search.class);
    }

    public String getId() {
        return TextUtils.isEmpty(id) ? "" : id;
    }

    public String getThumbnail(String imgDomain) {
        return TextUtils.isEmpty(thumbnail) ? "" : "http://" + imgDomain + thumbnail;
    }

    public String getTitle() {
        return TextUtils.isEmpty(title) ? "" : title;
    }

    public String getMask() {
        return TextUtils.isEmpty(mask) ? "" : mask;
    }

    public Vod vod(String imgDomain) {
        return new Vod(getId(), getTitle(), getThumbnail(imgDomain), getMask());
    }

    public List<Search> getData() {
        return data == null ? Collections.emptyList() : data;
    }
}
