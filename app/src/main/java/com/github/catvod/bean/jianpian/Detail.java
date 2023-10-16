package com.github.catvod.bean.jianpian;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("data")
    private Data data;

    public static Detail objectFrom(String str) {
        return new Gson().fromJson(str, Detail.class);
    }

    public Data getData() {
        return data == null ? new Data() : data;
    }
}
