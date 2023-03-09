package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.github.catvod.utils.Prefers;
import com.google.gson.Gson;

public class Auth {

    private String refreshToken;
    private String refreshTokenOpen;
    private String accessToken;
    private String accessTokenOpen;
    private String signature;
    private String deviceId;
    private String userId;
    private String driveId;

    public static Auth objectFrom(String str) {
        if (TextUtils.isEmpty(str)) return new Auth();
        return new Gson().fromJson(str, Auth.class);
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

    public String getSignature() {
        return TextUtils.isEmpty(signature) ? "" : signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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
