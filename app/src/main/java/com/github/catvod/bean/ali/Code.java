package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Code {

    @SerializedName("redirectUri")
    private String redirectUri;

    public static Code objectFrom(String str) {
        return new Gson().fromJson(str, Code.class);
    }

    public String getRedirectUri() {
        return TextUtils.isEmpty(redirectUri) ? "" : redirectUri;
    }

    public String getCode() {
        return getRedirectUri().split("code=")[1];
    }
}
