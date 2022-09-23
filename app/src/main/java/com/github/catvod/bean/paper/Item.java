package com.github.catvod.bean.paper;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {

    @SerializedName("data")
    private List<Data> data;

    public static Item objectFrom(String str) {
        return new Gson().fromJson(str, Item.class);
    }

    public List<Data> getData() {
        return data;
    }
}
