package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.github.catvod.api.AliYun;
import com.github.catvod.utils.FileUtil;
import com.github.catvod.utils.Path;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class OAuth {

    @SerializedName("token_type")
    private String tokenType;
    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("refresh_token")
    private String refreshToken;

    public static OAuth objectFrom(String str) {
        OAuth item = new Gson().fromJson(str, OAuth.class);
        return item == null ? new OAuth() : item;
    }

    public String getTokenType() {
        return TextUtils.isEmpty(tokenType) ? "" : tokenType;
    }

    public String getAccessToken() {
        return TextUtils.isEmpty(accessToken) ? "" : accessToken;
    }

    public String getRefreshToken() {
        return TextUtils.isEmpty(refreshToken) ? "" : refreshToken;
    }

    public String getAuthorization() {
        return getTokenType() + " " + getAccessToken();
    }

    public OAuth clean() {
        this.refreshToken = "";
        this.accessToken = "";
        return this;
    }

    public OAuth save() {
        Path.write(AliYun.get().getOAuthCache(), toString());
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
