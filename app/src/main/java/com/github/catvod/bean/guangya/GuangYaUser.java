package com.github.catvod.bean.guangya;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * GuangYa (guangyapan.com) cloud drive user authentication state.
 * Persisted to local storage as JSON.
 * Replaces obfuscated class: com.github.catvod.spider.merge.P.pkg.a
 *
 * API client usage (GuangYaPanApi):
 *   Gson.fromJson(json, GuangYaUser.class)   - deserialize from saved JSON
 *   new GuangYaUser()                          - default constructor
 *   getAccessToken()                           - Bearer token string  (was: b())
 *   setAccessToken(value)                      - set access token     (was: e(String))
 *   getRefreshToken()                          - refresh token        (was: c())
 *   setRefreshToken(value)                     - set refresh token    (was: f(String))
 *   save()                                     - persist to storage   (was: d())
 */
public final class GuangYaUser {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("refresh_token")
    private String refreshToken;

    public GuangYaUser() {
    }

    // ==================== Access Token ====================

    /**
     * Returns the access token string (e.g. "Bearer eyJ...").
     * Used as the Authorization header value.
     * Replaces: obfuscated method b()
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the access token.
     * Replaces: obfuscated method e(String)
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    // ==================== Refresh Token ====================

    /**
     * Returns the refresh token string.
     * Used to obtain new access tokens when expired.
     * Replaces: obfuscated method c()
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Sets the refresh token.
     * Replaces: obfuscated method f(String)
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    // ==================== Obfuscated Aliases ====================

    /** Alias for getAccessToken(). */
    public String b() { return getAccessToken(); }

    /** Alias for getRefreshToken(). */
    public String c() { return getRefreshToken(); }

    /** Alias for save(). */
    public void d() { save(); }

    /** Alias for setAccessToken(). */
    public void e(String value) { setAccessToken(value); }

    /** Alias for setRefreshToken(). */
    public void f(String value) { setRefreshToken(value); }

    // ==================== Persistence ====================

    /**
     * Persist this user object to local storage as JSON.
     * Replaces: obfuscated method d()
     */
    public void save() {
        com.github.catvod.utils.merge.LocalStorage.saveJson("guangya_user", this);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
