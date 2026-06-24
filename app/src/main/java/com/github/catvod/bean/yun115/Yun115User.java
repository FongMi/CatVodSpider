package com.github.catvod.bean.yun115;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * 115 cloud drive user information and authentication state.
 * Persisted to local storage as JSON.
 * Replaces obfuscated class: com.github.catvod.spider.merge.b0.c
 *
 * API client usage (Yun115Api):
 *   Gson.fromJson(json, Yun115User.class)  - deserialize from saved JSON
 *   new Yun115User()                        - default constructor
 *   getCookie()                             - cookie string       (was: b())
 *   setCookie(value)                        - update cookie        (was: d(String))
 *   persist()                               - persist to storage   (was: c())
 *   password                                - public field for cache key (was: b)
 */
public final class Yun115User {

    @SerializedName("cookie")
    private String cookie;

    /** Cache password / access key. Accessed directly as a public field. */
    public String password = "";

    /** Obfuscated alias field for password (was: b). */
    public String b = "";

    public Yun115User() {
    }

    // ==================== Cookie ====================

    /**
     * Returns the cookie string, or empty string if null.
     * Used as HTTP Cookie header value.
     * Replaces: obfuscated method b()
     */
    public String getCookie() {
        return TextUtils.isEmpty(this.cookie) ? "" : this.cookie;
    }

    /**
     * Sets the cookie string and clears the internal state.
     * Replaces: obfuscated method d(String)
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    // ==================== Persistence ====================

    /**
     * Persist this user object to local storage as JSON.
     * Replaces: obfuscated method c()
     */
    public Yun115User persist() {
        com.github.catvod.utils.merge.LocalStorage.saveJson("115_user", this);
        return this;
    }

    // ==================== Obfuscated Aliases ====================

    /** Alias for getCookie(). */
    public String b() { return getCookie(); }

    /** Alias for persist(). */
    public Yun115User c() { return persist(); }

    /** Alias for setCookie(). */
    public void d(String cookie) { setCookie(cookie); }

    // ==================== Utility ====================

    /**
     * Clear the cookie and return this object for chaining.
     * Replaces: obfuscated method a()
     */
    public Yun115User clearCookie() {
        this.cookie = "";
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
