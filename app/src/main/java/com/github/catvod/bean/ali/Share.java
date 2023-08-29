package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Share {

    @SerializedName("share_id")
    private String shareId;
    @SerializedName("share_token")
    private String shareToken;
    @SerializedName("expire_time")
    private String expireTime;
    @SerializedName("expires_in")
    private int expiresIn;

    @SerializedName("creator_id")
    private String creatorId;
    @SerializedName("creator_name")
    private String creatorName;
    @SerializedName("creator_phone")
    private String creatorPhone;
    @SerializedName("expiration")
    private String expiration;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("vip")
    private String vip;
    @SerializedName("avatar")
    private String avatar;
    @SerializedName("share_name")
    private String shareName;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("share_title")
    private String shareTitle;
    @SerializedName("has_pwd")
    private boolean hasPwd;
    @SerializedName("file_infos")
    private List<Item> fileInfos;

    private long time;

    public static Share objectFrom(String str) {
        return new Gson().fromJson(str, Share.class);
    }

    public String getShareId() {
        return TextUtils.isEmpty(shareId) ? "" : shareId;
    }

    public String getShareToken() {
        return TextUtils.isEmpty(shareToken) ? "" : shareToken;
    }

    public String getExpireTime() {
        return TextUtils.isEmpty(expireTime) ? "" : expireTime;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public String getCreatorId() {
        return TextUtils.isEmpty(creatorId) ? "" : creatorId;
    }

    public String getCreatorName() {
        return TextUtils.isEmpty(creatorName) ? "" : creatorName;
    }

    public String getCreatorPhone() {
        return TextUtils.isEmpty(creatorPhone) ? "" : creatorPhone;
    }

    public String getExpiration() {
        return TextUtils.isEmpty(expiration) ? "" : expiration;
    }

    public String getUpdatedAt() {
        return TextUtils.isEmpty(updatedAt) ? "" : updatedAt;
    }

    public String getVip() {
        return TextUtils.isEmpty(vip) ? "" : vip;
    }

    public String getAvatar() {
        return TextUtils.isEmpty(avatar) ? "" : avatar;
    }

    public String getShareName() {
        return TextUtils.isEmpty(shareName) ? "" : shareName;
    }

    public String getDisplayName() {
        return TextUtils.isEmpty(displayName) ? "" : displayName;
    }

    public String getShareTitle() {
        return TextUtils.isEmpty(shareTitle) ? "" : shareTitle;
    }

    public boolean isHasPwd() {
        return hasPwd;
    }

    public List<Item> getFileInfos() {
        return fileInfos == null ? Collections.emptyList() : fileInfos;
    }

    public Share setTime() {
        this.time = System.currentTimeMillis() + 60 * 60 * 1000;
        return this;
    }

    public Share setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    public boolean alive(String shareId) {
        return getShareId().equals(shareId) && System.currentTimeMillis() <= time;
    }
}
