package com.github.catvod.bean.ali;

import android.text.TextUtils;

public class Auth {

    private String refreshToken;
    private String refreshTokenOpen;
    private String accessToken;
    private String accessTokenOpen;
    private String shareToken;
    private String signature;
    private String deviceId;
    private String shareId;
    private String userId;
    private String driveId;

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

    public String getShareToken() {
        return TextUtils.isEmpty(shareToken) ? "" : shareToken;
    }

    public void setShareToken(String shareToken) {
        this.shareToken = shareToken;
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

    public String getShareId() {
        return TextUtils.isEmpty(shareId) ? "" : shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
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
}
