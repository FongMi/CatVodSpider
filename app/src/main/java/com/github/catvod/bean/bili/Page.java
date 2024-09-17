package com.github.catvod.bean.bili;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class Page {

    @SerializedName("cid")
    private String cid;
    @SerializedName("part")
    private String part;

    public String getCid() {
        return TextUtils.isEmpty(cid) ? "" : cid;
    }

    public String getPart() {
        return TextUtils.isEmpty(part) ? "" : part.replace("#", "");
    }
}
