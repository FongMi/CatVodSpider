package com.github.catvod.bean.alist;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Config {

    @SerializedName("name")
    private String name;
    @SerializedName("server")
    private String server;
    @SerializedName("password")
    private String password;
    @SerializedName("version")
    private int version;

    public static List<Config> arrayFrom(String str) {
        Type listType = new TypeToken<ArrayList<Config>>() {}.getType();
        return new Gson().fromJson(str, listType);
    }

    public Config(String name) {
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
        return getServer() + "/api/public/search";
    }

    public String searchApi(String param) {
        return getServer() + "/search?box=" + param + "&url=";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Config)) return false;
        Config it = (Config) obj;
        return getName().equals(it.getName());
    }
}
