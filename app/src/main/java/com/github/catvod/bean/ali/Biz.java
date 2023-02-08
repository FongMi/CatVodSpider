package com.github.catvod.bean.ali;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Biz {

    @SerializedName("pds_login_result")
    private Biz pdsLoginResult;
    @SerializedName("role")
    private String role;
    @SerializedName("isFirstLogin")
    private Boolean isFirstLogin;
    @SerializedName("needLink")
    private Boolean needLink;
    @SerializedName("loginType")
    private String loginType;
    @SerializedName("nickName")
    private String nickName;
    @SerializedName("needRpVerify")
    private Boolean needRpVerify;
    @SerializedName("avatar")
    private String avatar;
    @SerializedName("accessToken")
    private String accessToken;
    @SerializedName("userName")
    private String userName;
    @SerializedName("userId")
    private String userId;
    @SerializedName("defaultDriveId")
    private String defaultDriveId;
    @SerializedName("existLink")
    private List<?> existLink;
    @SerializedName("expiresIn")
    private Integer expiresIn;
    @SerializedName("expireTime")
    private String expireTime;
    @SerializedName("requestId")
    private String requestId;
    @SerializedName("dataPinSetup")
    private Boolean dataPinSetup;
    @SerializedName("state")
    private String state;
    @SerializedName("tokenType")
    private String tokenType;
    @SerializedName("dataPinSaved")
    private Boolean dataPinSaved;
    @SerializedName("refreshToken")
    private String refreshToken;
    @SerializedName("status")
    private String status;

    public static Biz objectFrom(String str) {
        return new Gson().fromJson(str, Biz.class);
    }

    public Biz getPdsLoginResult() {
        return pdsLoginResult;
    }

    public String getRefreshToken() {
        return refreshToken;
    }
}
