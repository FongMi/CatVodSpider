package com.github.catvod.bean.mqitv;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Data {

    @SerializedName("data")
    private List<Data> data;
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("playing")
    private String playing;
    @SerializedName("port")
    private String port;
    @SerializedName("stat")
    private Stat stat;

    public static Data objectFrom(String str) {
        return new Gson().fromJson(str, Data.class);
    }

    public List<Data> getData() {
        return data == null ? Collections.emptyList() : data;
    }

    public String getId() {
        return id == null ? "" : id;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public String getPort() {
        return port == null ? "" : port;
    }

    public String getPlaying() {
        return playing == null ? "" : playing;
    }

    public Stat getStat() {
        return stat == null ? new Stat() : stat;
    }
}
