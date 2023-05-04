package com.github.catvod.net;

import android.text.TextUtils;

public class OkResult {

    private final int code;
    private final String body;

    public OkResult() {
        this.code = 500;
        this.body = "";
    }

    public OkResult(int code, String body) {
        this.code = code;
        this.body = body;
    }

    public int getCode() {
        return code;
    }

    public String getBody() {
        return TextUtils.isEmpty(body) ? "" : body;
    }
}
