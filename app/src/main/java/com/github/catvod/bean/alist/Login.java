package com.github.catvod.bean.alist;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;

    public String getUsername() {
        return TextUtils.isEmpty(username) ? "" : username;
    }

    public String getPassword() {
        return TextUtils.isEmpty(password) ? "" : password;
    }
}
