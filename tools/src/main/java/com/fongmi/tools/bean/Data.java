package com.fongmi.tools.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Data {

    @SerializedName("tvid")
    private String tvid;
    @SerializedName("epgid")
    private String epgid;
    @SerializedName("name")
    private String name;
    @SerializedName("status")
    private String status;
    @SerializedName("note")
    private String note;
    @SerializedName("logo")
    private String logo;

    public static Data objectFrom(String str) {
        return new Gson().fromJson(str, Data.class);
    }

    public static List<Data> arrayFrom(String str) {
        Type listType = new TypeToken<ArrayList<Data>>() {
        }.getType();
        return new Gson().fromJson(str, listType);
    }

    public String getTvid() {
        return tvid;
    }

    public void setTvid(String tvid) {
        this.tvid = tvid;
    }

    public String getEpgid() {
        return epgid;
    }

    public void setEpgid(String epgid) {
        this.epgid = epgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
