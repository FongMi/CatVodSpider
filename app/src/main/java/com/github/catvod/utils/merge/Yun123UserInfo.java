package com.github.catvod.utils.merge;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * 123 盘用户信息（持久化到本地存储）
 */
public class Yun123UserInfo {

    @SerializedName("token")
    private String token;

    @SerializedName("refresh_token_expire_time")
    private String tokenExpiryTime;

    @SerializedName("passport")
    private String username;

    @SerializedName("password")
    private String password;

    // ==================== Getter ====================

    /** 返回 token 过期时间（秒级时间戳字符串） */
    public String b() {
        return tokenExpiryTime != null ? tokenExpiryTime : "0";
    }

    /** 返回 Authorization token */
    public String c() {
        return token != null ? token : "";
    }

    /** 返回用户名 */
    public String d() {
        return username;
    }

    /** 返回密码 */
    public String e() {
        return password;
    }

    // ==================== Setter ====================

    /** 持久化到本地存储 */
    public void f() {
        try {
            LocalStorage.save("p123_user", new Gson().toJson(this));
        } catch (Exception ignored) {
        }
    }

    /** 设置 token 过期时间 */
    public void g(String expiryTime) {
        this.tokenExpiryTime = expiryTime;
    }

    /** 设置 token */
    public void h(String token) {
        this.token = token;
    }

    /** 设置用户名 */
    public void i(String username) {
        this.username = username;
    }

    /** 设置密码 */
    public void j(String password) {
        this.password = password;
    }
}
