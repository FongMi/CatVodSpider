package com.github.catvod.bean.upyun;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Data {

    @SerializedName("result")
    private Data result;
    @SerializedName("items")
    private List<Item> items;

    public static Data objectFrom(String str) {
        return new Gson().fromJson(str, Data.class);
    }

    public Data getResult() {
        return result == null ? new Data() : result;
    }

    public List<Item> getItems() {
        return items == null ? Collections.emptyList() : items;
    }
}
