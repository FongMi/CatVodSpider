package com.github.catvod.bean.star;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class Person {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }
}
