package com.github.catvod.bean.alist;

import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.net.OkHttp;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drive {

    @SerializedName("drives")
    private List<Drive> drives;
    @SerializedName("vodPic")
    private String vodPic;
    @SerializedName("name")
    private String name;
    @SerializedName("server")
    private String server;
    @SerializedName("password")
    private String password;
    @SerializedName("version")
    private int version;
    @SerializedName("path")
    private String path;

    public static Drive objectFrom(String str) {
        return new Gson().fromJson(str, Drive.class);
    }

    public List<Drive> getDrives() {
        return drives == null ? new ArrayList<>() : drives;
    }

    public Drive(String name) {
        this.name = name;
    }

    public String getVodPic() {
        return TextUtils.isEmpty(vodPic) ? "https://s1.ax1x.com/2023/04/03/pp4F4bT.png" : vodPic;
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

    public String getPath() {
        return TextUtils.isEmpty(path) ? "" : path;
    }

    public void setPath(String path) {
        this.path = TextUtils.isEmpty(path) ? "" : path;
    }

    public boolean isNew() {
        return getVersion() == 3;
    }

    public Class toType() {
        return new Class(getName(), getName(), "1");
    }

    public String getHost() {
        return getServer().replace(getPath(), "");
    }

    public String settingsApi() {
        return getHost() + "/api/public/settings";
    }

    public String listApi() {
        return getHost() + (isNew() ? "/api/fs/list" : "/api/public/path");
    }

    public String getApi() {
        return getHost() + (isNew() ? "/api/fs/get" : "/api/public/path");
    }

    public String searchApi() {
        return getHost() + (isNew() ? "/api/fs/search" : "/api/public/search");
    }

    public Drive check() {
        if (path == null) setPath(Uri.parse(getServer()).getPath());
        if (version == 0) setVersion(OkHttp.string(settingsApi()).contains("v2.") ? 2 : 3);
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
