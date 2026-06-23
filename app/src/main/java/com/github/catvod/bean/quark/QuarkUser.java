package com.github.catvod.bean.quark;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * Quark cloud drive user information and authentication state.
 * Persisted to local storage as JSON.
 * Replaces obfuscated class: com.github.catvod.spider.merge.S.e
 *
 * API client usage (QuarkDriveApi):
 *   QuarkUser.fromJson(json)      - deserialize from saved JSON (was: e.h())
 *   new QuarkUser(cookie)         - construct with cookie (was: e(String))
 *   getCount().intValue()         - token count as int  (was: c())
 *   getCookie()                   - cookie string       (was: d())
 *   setCookie(value)              - update cookie        (was: j(String))
 *   getDriveId()                  - cached drive ID      (was: e())
 *   setDriveId(value)             - set drive ID         (was: k(String))
 *   getCacheTime()                - drive cache time     (was: f())
 *   setCacheTime(value)           - set cache time       (was: l(long))
 *   getMemberType()               - member type string   (was: g())
 *   setMemberType(value)          - set member type      (was: m(String))
 *   save()                        - persist to storage   (was: i())
 */
public class QuarkUser {

    @SerializedName("cookie")
    private String cookie;

    private String token;

    private String driveId;

    private long cacheTime;

    private String memberType;

    public QuarkUser() {
    }

    public QuarkUser(String cookie) {
        this.cookie = cookie;
    }

    /**
     * Deserialize a QuarkUser from a JSON string.
     * Replaces: merge.S.e.h(String)
     */
    public static QuarkUser fromJson(String json) {
        return new Gson().fromJson(json, QuarkUser.class);
    }

    // ==================== Cookie ====================

    /**
     * Returns the cookie string, or empty string if null.
     * Used as HTTP Cookie header value.
     * Replaces: obfuscated method d()
     */
    public String getCookie() {
        return cookie == null ? "" : cookie;
    }

    /**
     * Sets the cookie string.
     * Replaces: obfuscated method j(String)
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    // ==================== Token Count ====================

    /**
     * Returns the token count (member level Integer).
     * Used as: getCount() != null ? getCount().intValue() : 0
     * Replaces: obfuscated method c()
     */
    public Integer getCount() {
        return token != null && !token.isEmpty() ? Integer.valueOf(token) : null;
    }

    // ==================== Drive ID ====================

    /**
     * Returns the cached drive ID (pdir_fid).
     * Replaces: obfuscated method e()
     */
    public String getDriveId() {
        return driveId;
    }

    /**
     * Sets the drive ID.
     * Replaces: obfuscated method k(String)
     */
    public void setDriveId(String driveId) {
        this.driveId = driveId;
    }

    // ==================== Cache Time ====================

    /**
     * Returns the drive cache timestamp (seconds since epoch).
     * Replaces: obfuscated method f()
     */
    public long getCacheTime() {
        return cacheTime;
    }

    /**
     * Sets the drive cache timestamp.
     * Replaces: obfuscated method l(long)
     */
    public void setCacheTime(long cacheTime) {
        this.cacheTime = cacheTime;
    }

    // ==================== Member Type ====================

    /**
     * Returns the member type string (e.g. "NORMAL", "SUPER").
     * Replaces: obfuscated method g()
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * Sets the member type.
     * Replaces: obfuscated method m(String)
     */
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    // ==================== Persistence ====================

    /**
     * Persist this user object to local storage as JSON.
     * Replaces: obfuscated method i()
     */
    public void save() {
        com.github.catvod.utils.merge.LocalStorage.saveJson("quark_user", this);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
