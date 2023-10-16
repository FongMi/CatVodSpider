package com.github.catvod.bean.jianpian;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Resp {

    @SerializedName("data")
    private List<Data> data;

    public static Resp objectFrom(String str) {
        return new Gson().fromJson(str, Resp.class);
    }

    public List<Data> getData() {
        return data == null ? Collections.emptyList() : data;
    }
}
