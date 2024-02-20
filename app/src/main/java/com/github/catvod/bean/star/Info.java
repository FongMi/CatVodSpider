package com.github.catvod.bean.star;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Info {

    @SerializedName("videosGroup")
    private List<Group> videosGroup;
    @SerializedName("actor")
    private List<Person> actor;
    @SerializedName("country")
    private String country;
    @SerializedName("desc")
    private String desc;
    @SerializedName("director")
    private List<Person> director;
    @SerializedName("name")
    private String name;
    @SerializedName("picurl")
    private String picurl;
    @SerializedName("time")
    private String time;
    @SerializedName("countStr")
    private String countStr;

    public static Info objectFrom(String str) {
        return new Gson().fromJson(str, Info.class);
    }

    public List<Group> getVideosGroup() {
        return videosGroup == null ? Collections.emptyList() : videosGroup;
    }

    public List<Person> getActor() {
        return actor == null ? Collections.emptyList() : actor;
    }

    public String getCountry() {
        return TextUtils.isEmpty(country) ? "" : country;
    }

    public String getDesc() {
        return TextUtils.isEmpty(desc) ? "" : desc;
    }

    public List<Person> getDirector() {
        return director == null ? Collections.emptyList() : director;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getPicurl() {
        return TextUtils.isEmpty(picurl) ? "" : picurl;
    }

    public String getTime() {
        return TextUtils.isEmpty(time) ? "" : time;
    }

    public String getCountStr() {
        return TextUtils.isEmpty(countStr) ? "" : countStr;
    }
}
