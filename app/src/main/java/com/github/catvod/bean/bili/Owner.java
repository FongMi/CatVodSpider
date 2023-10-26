package com.github.catvod.bean.bili;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class Owner {

    @SerializedName("mid")
    private String mid;
    @SerializedName("name")
    private String name;

    public String getMid() {
        return TextUtils.isEmpty(mid) ? "" : mid;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getFormat() {
        return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", getMid() + "/{pg}", getName(), getName());
    }
}
