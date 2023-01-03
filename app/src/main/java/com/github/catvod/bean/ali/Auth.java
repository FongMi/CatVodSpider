package com.github.catvod.bean.ali;

import android.text.TextUtils;
import android.widget.ImageView;

public class Auth {

    private String refreshToken;
    private String accessToken;
    private long expiresTime;
    private ImageView view;

    public Auth(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return TextUtils.isEmpty(refreshToken) ? "" : refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return TextUtils.isEmpty(accessToken) ? "" : accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public long getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(long expiresTime) {
        this.expiresTime = expiresTime;
    }

    public ImageView getView() {
        return view;
    }

    public void setView(ImageView view) {
        this.view = view;
    }

    public boolean needRefresh() {
        return System.currentTimeMillis() > getExpiresTime();
    }

    public boolean isEmpty() {
        return getRefreshToken().isEmpty() || getAccessToken().isEmpty();
    }

    public void clean() {
        setRefreshToken("");
        setAccessToken("");
        setExpiresTime(0);
    }
}
