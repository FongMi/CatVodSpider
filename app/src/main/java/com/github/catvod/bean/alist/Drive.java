package com.github.catvod.bean.alist;

import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Image;
import com.github.catvod.utils.Util;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drive {

    @SerializedName("drives")
    private List<Drive> drives;
    @SerializedName("params")
    private List<Param> params;
    @SerializedName("login")
    private Login login;
    @SerializedName("vodPic")
    private String vodPic;
    @SerializedName("name")
    private String name;
    @SerializedName("server")
    private String server;
    @SerializedName("version")
    private int version;
    @SerializedName("path")
    private String path;
    @SerializedName("token")
    private String token;
    @SerializedName("search")
    private Boolean search;
    @SerializedName("hidden")
    private Boolean hidden;

    public static Drive objectFrom(String str) {
        return new Gson().fromJson(str, Drive.class);
    }

    public List<Drive> getDrives() {
        return drives == null ? new ArrayList<>() : drives;
    }

    public List<Param> getParams() {
        return params == null ? new ArrayList<>() : params;
    }

    public Login getLogin() {
        return login;
    }

    public Drive(String name) {
        this.name = name;
    }

    public String getVodPic() {
        return TextUtils.isEmpty(vodPic) ? Image.FOLDER : vodPic;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getServer() {
        return TextUtils.isEmpty(server) ? "" : server;
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

    public String getToken() {
        return TextUtils.isEmpty(token) ? "" : token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean search() {
        return search == null || search;
    }

    public Boolean hidden() {
        return hidden != null && hidden;
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

    public String loginApi() {
        return getHost() + "/api/auth/login";
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

    public String searchApi(String param) {
        return getHost() + "/search?box=" + param + "&url=&type=video";
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

    public HashMap<String, String> getHeader() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        if (!getToken().isEmpty()) headers.put("Authorization", token);
        return headers;
    }

    public String findPass(String path) {
        for (Param param : getParams()) if (path.startsWith(param.getPath())) return param.getPass();
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Drive)) return false;
        Drive it = (Drive) obj;
        return getName().equals(it.getName());
    }
}
