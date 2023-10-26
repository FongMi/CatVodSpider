package com.github.catvod.bean.bili;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class Owner {

    @SerializedName("mid")
    private int mid;
    @SerializedName("name")
    private String name;

    public int getMid() {
        return mid;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getFormat() {
        return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", getMid() + "/{pg}", getName(), getName());
    }
}
