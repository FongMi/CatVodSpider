package com.github.catvod.bean.star;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Group {

    @SerializedName("name")
    private String name;
    @SerializedName("videos")
    private List<Video> videos;

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public List<Video> getVideos() {
        return videos == null ? Collections.emptyList() : videos;
    }
}
