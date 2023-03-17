package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.github.catvod.utils.Prefers;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Auth {

    @SerializedName("refreshToken")
    private String refreshToken;
    @SerializedName("refreshTokenOpen")
    private String refreshTokenOpen;
    @SerializedName("accessToken")
    private String accessToken;
    @SerializedName("accessTokenOpen")
    private String accessTokenOpen;
    @SerializedName("userId")
    private String userId;
    @SerializedName("driveId")
    private String driveId;

    public static Auth objectFrom(String str) {
        Auth item = new Gson().fromJson(str, Auth.class);
        return item == null ? new Auth() : item;
    }

    public String getRefreshToken() {
        return TextUtils.isEmpty(refreshToken) ? "" : refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshTokenOpen() {
        return TextUtils.isEmpty(refreshTokenOpen) ? "" : refreshTokenOpen;
    }

    public void setRefreshTokenOpen(String refreshTokenOpen) {
        this.refreshTokenOpen = refreshTokenOpen;
    }

    public String getAccessToken() {
        return TextUtils.isEmpty(accessToken) ? "" : accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessTokenOpen() {
        return TextUtils.isEmpty(accessTokenOpen) ? "" : accessTokenOpen;
    }

    public void setAccessTokenOpen(String accessTokenOpen) {
        this.accessTokenOpen = accessTokenOpen;
    }

    public String getDriveId() {
        return TextUtils.isEmpty(driveId) ? "" : driveId;
    }

    public void setDriveId(String driveId) {
        this.driveId = driveId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isEmpty() {
        return getAccessToken().isEmpty();
    }

    public void clean() {
        setRefreshTokenOpen("");
        setAccessTokenOpen("");
        setRefreshToken("");
        setAccessToken("");
    }

    public void save() {
        Prefers.put("aliyundrive", new Gson().toJson(this));
    }
}
