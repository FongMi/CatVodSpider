package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Download {

    @SerializedName("url")
    private String url;
    @SerializedName("file_id")
    private String fileId;
    @SerializedName("expiration")
    private String expiration;

    public static Download objectFrom(String str) {
        return new Gson().fromJson(str, Download.class);
    }

    public String getUrl() {
        return TextUtils.isEmpty(url) ? "" : url;
    }

    public String getFileId() {
        return TextUtils.isEmpty(fileId) ? "" : fileId;
    }

    public String getExpiration() {
        return TextUtils.isEmpty(expiration) ? "" : expiration;
    }
}
