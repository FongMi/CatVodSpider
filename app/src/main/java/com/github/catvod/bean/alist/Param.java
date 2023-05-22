package com.github.catvod.bean.alist;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class Param {

    @SerializedName("path")
    private String path;
    @SerializedName("pass")
    private String pass;

    public String getPath() {
        return TextUtils.isEmpty(path) ? "" : path;
    }

    public String getPass() {
        return TextUtils.isEmpty(pass) ? "" : pass;
    }
}
