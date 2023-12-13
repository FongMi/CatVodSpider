package com.github.catvod.bean.webdav;

import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Vod;
import com.github.catvod.utils.Util;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;

import java.util.ArrayList;
import java.util.List;

public class Drive {

    @SerializedName("drives")
    private List<Drive> drives;
    @SerializedName("name")
    private String name;
    @SerializedName("server")
    private String server;
    @SerializedName("user")
    private String user;
    @SerializedName("pass")
    private String pass;
    @SerializedName("path")
    private String path;
    @SerializedName("webdav")
    private Sardine webdav;

    public static Drive objectFrom(String str) {
        return new Gson().fromJson(str, Drive.class);
    }

    public Drive(String name) {
        this.name = name;
    }

    public List<Drive> getDrives() {
        return drives == null ? new ArrayList<>() : drives;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getServer() {
        return TextUtils.isEmpty(server) ? "" : server;
    }

    public String getUser() {
        return TextUtils.isEmpty(user) ? "" : user;
    }

    public String getPass() {
        return TextUtils.isEmpty(pass) ? "" : pass;
    }

    public String getPath() {
        return TextUtils.isEmpty(path) ? "" : path;
    }

    public void setPath(String path) {
        this.path = TextUtils.isEmpty(path) ? "" : path;
    }

    public String getHost() {
        return getServer().replace(getPath(), "");
    }

    public Sardine getWebdav() {
        if (webdav == null) init();
        return webdav;
    }

    public Class toType() {
        return new Class(getName(), getName(), "1");
    }

    private void init() {
        webdav = new OkHttpSardine();
        webdav.setCredentials(getUser(), getPass());
        setPath(Uri.parse(getServer()).getPath());
    }

    public Vod vod(DavResource item, String vodPic) {
        return new Vod(getName() + item.getPath(), item.getName(), vodPic, Util.getSize(item.getContentLength()), item.isDirectory());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Drive)) return false;
        Drive it = (Drive) obj;
        return getName().equals(it.getName());
    }
}
