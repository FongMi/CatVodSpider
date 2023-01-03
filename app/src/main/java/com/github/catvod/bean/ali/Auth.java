package com.github.catvod.bean.ali;

import android.text.TextUtils;
import android.widget.ImageView;

public class Auth {

    private String refreshToken;
    private String accessToken;
    private String shareToken;
    private String shareId;
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

    public String getShareToken() {
        return TextUtils.isEmpty(shareToken) ? "" : shareToken;
    }

    public void setShareToken(String shareToken) {
        this.shareToken = shareToken;
    }

    public String getShareId() {
        return TextUtils.isEmpty(shareId) ? "" : shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public ImageView getView() {
        return view;
    }

    public void setView(ImageView view) {
        this.view = view;
    }

    public boolean isEmpty() {
        return getRefreshToken().isEmpty() || getAccessToken().isEmpty();
    }

    public void clean() {
        setRefreshToken("");
        setAccessToken("");
        setShareId("");
    }
}
