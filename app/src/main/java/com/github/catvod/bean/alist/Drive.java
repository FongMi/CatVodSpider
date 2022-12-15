package com.github.catvod.bean.alist;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.net.OkHttpUtil;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drive {

    @SerializedName("drives")
    private List<Drive> drives;
    @SerializedName("name")
    private String name;
    @SerializedName("server")
    private String server;
    @SerializedName("password")
    private String password;
    @SerializedName("version")
    private int version;

    public static Drive objectFrom(String str) {
        return new Gson().fromJson(str, Drive.class);
    }

    public List<Drive> getDrives() {
        return drives == null ? new ArrayList<>() : drives;
    }

    public Drive(String name) {
        this.name = name;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getServer() {
        return TextUtils.isEmpty(server) ? "" : server;
    }

    public String getPassword() {
        return TextUtils.isEmpty(password) ? "" : password;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isNew() {
        return getVersion() == 3;
    }

    public Class toType() {
        return new Class(getName(), getName(), "1");
    }

    public String settingsApi() {
        return getServer() + "/api/public/settings";
    }

    public String listApi() {
        return getServer() + (isNew() ? "/api/fs/list" : "/api/public/path");
    }

    public String getApi() {
        return getServer() + (isNew() ? "/api/fs/get" : "/api/public/path");
    }

    public String searchApi() {
        return getServer() + (isNew() ? "/api/fs/search" : "/api/public/search");
    }

    public Drive check() {
        if (getVersion() == 0) setVersion(OkHttpUtil.string(settingsApi()).contains("v2.") ? 2 : 3);
        return this;
    }

    public String params(String keyword) {
        if (isNew()) {
            Map<String, Object> params = new HashMap<>();
            params.put("keywords", keyword);
            params.put("page", 1);
            params.put("parent", "/");
            params.put("per_page", 100);
            return new Gson().toJson(params);
        } else {
            Map<String, Object> params = new HashMap<>();
            params.put("keyword", keyword);
            params.put("path", "/");
            return new Gson().toJson(params);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Drive)) return false;
        Drive it = (Drive) obj;
        return getName().equals(it.getName());
    }
}
