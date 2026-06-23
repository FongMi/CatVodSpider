package com.github.catvod.bean.uc;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * UC Browser cloud drive user information and authentication state.
 * Persisted to local storage as JSON.
 * Replaces obfuscated class: com.github.catvod.spider.merge.T.b
 *
 * API client usage (UcDriveApi):
 *   UcUser.fromJson(json)         - deserialize from saved JSON (was: b.i())
 *   new UcUser(cookie)            - construct with cookie       (was: b(String))
 *   getCookie()                   - cookie string               (was: c())
 *   setCookie(value)              - update cookie                (was: k(String))
 *   save()                        - persist to storage           (was: j())
 *   getToken()                    - refresh token / link         (was: g())
 *   setToken(value)               - set refresh token            (was: o(String))
 *   getDriveId()                  - cached drive ID              (was: d())
 *   setDriveId(value)             - set drive ID                 (was: l(String))
 *   getCacheTime()                - drive cache time             (was: e())
 *   setCacheTime(value)           - set cache time               (was: m(long))
 *   getMemberType()               - member type Integer          (was: f())
 *   setMemberType(value)          - set member type              (was: n(String))
 *   getUt()                       - UT authentication value      (was: h())
 *   setUt(value)                  - set UT value                 (was: p(String))
 */
public class UcUser {

    @SerializedName("cookie")
    private String cookie;

    private String token;

    private String driveId;

    private long cacheTime;

    private String memberType;

    private String ut;

    public UcUser() {
    }

    public UcUser(String cookie) {
        this.cookie = cookie;
    }

    /**
     * Deserialize a UcUser from a JSON string.
     * Replaces: merge.T.b.i(String)
     */
    public static UcUser fromJson(String json) {
        return new Gson().fromJson(json, UcUser.class);
    }

    // ==================== Cookie ====================

    /**
     * Returns the cookie string, or empty string if null.
     * Used as HTTP Cookie header value.
     * Replaces: obfuscated method c()
     */
    public String getCookie() {
        return cookie == null ? "" : cookie;
    }

    /**
     * Sets the cookie string.
     * Replaces: obfuscated method k(String)
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    // ==================== Token ====================

    /**
     * Returns the refresh token / link token.
     * Used for UC proxy API calls (download, preview).
     * Replaces: obfuscated method g()
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the refresh token.
     * Replaces: obfuscated method o(String)
     */
    public void setToken(String token) {
        this.token = token;
    }

    // ==================== Drive ID ====================

    /**
     * Returns the cached drive ID (pdir_fid).
     * Replaces: obfuscated method d()
     */
    public String getDriveId() {
        return driveId;
    }

    /**
     * Sets the drive ID.
     * Replaces: obfuscated method l(String)
     */
    public void setDriveId(String driveId) {
        this.driveId = driveId;
    }

    // ==================== Cache Time ====================

    /**
     * Returns the drive cache timestamp (seconds since epoch).
     * Replaces: obfuscated method e()
     */
    public long getCacheTime() {
        return cacheTime;
    }

    /**
     * Sets the drive cache timestamp.
     * Replaces: obfuscated method m(long)
     */
    public void setCacheTime(long cacheTime) {
        this.cacheTime = cacheTime;
    }

    // ==================== Member Type ====================

    /**
     * Returns the member type Integer (used as getMemberType().intValue()).
     * Replaces: obfuscated method f()
     */
    public Integer getMemberType() {
        return memberType != null && !memberType.isEmpty() ? Integer.valueOf(memberType) : null;
    }

    /**
     * Sets the member type.
     * Replaces: obfuscated method n(String)
     */
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    // ==================== UT ====================

    /**
     * Returns the UT authentication value.
     * Used in download URL construction.
     * Replaces: obfuscated method h()
     */
    public String getUt() {
        return ut;
    }

    /**
     * Sets the UT value.
     * Replaces: obfuscated method p(String)
     */
    public void setUt(String ut) {
        this.ut = ut;
    }

    // ==================== Persistence ====================

    /**
     * Persist this user object to local storage as JSON.
     * Replaces: obfuscated method j()
     */
    public void save() {
        com.github.catvod.utils.merge.LocalStorage.saveJson("uc_user", this);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
