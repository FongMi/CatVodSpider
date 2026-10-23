package com.github.catvod.bean.webdav;

import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Vod;
import com.github.catvod.utils.VodUtil;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;

import java.lang.reflect.Type;
import java.util.List;

public class Drive {

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

    private transient Sardine webdav;

    private Drive() {
    }

    public static Drive create() {
        return new Drive();
    }

    public static List<Drive> arrayFrom(String str) {
        Type listType = TypeToken.getParameterized(List.class, Drive.class).getType();
        return new Gson().fromJson(str, listType);
    }

    public Drive name(String name) {
        this.name = name;
        return this;
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
        return path == null ? Uri.parse(getServer()).getPath() : path;
    }

    public Drive path(String path) {
        this.path = TextUtils.isEmpty(path) ? "" : path;
        return this;
    }

    public String getHost() {
        return Uri.parse(getServer()).buildUpon().path(null).query(null).fragment(null).build().toString();
    }

    public String getUrl(String path) {
        return Uri.parse(getHost()).buildUpon().path(path).build().toString();
    }

    public Sardine getWebdav() {
        if (webdav == null) init();
        return webdav;
    }

    public Class toType() {
        return Class.create().id(getName()).name(getName()).flag("1");
    }

    private void init() {
        webdav = new OkHttpSardine();
        webdav.setCredentials(getUser(), getPass());
    }

    public Vod vod(DavResource item, String vodPic) {
        return Vod.create().id(getName() + item.getPath()).name(item.getName()).pic(vodPic).remarks(VodUtil.getSize(item.getContentLength())).tag(item.isDirectory() ? "folder" : "file");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Drive)) return false;
        Drive it = (Drive) obj;
        return getName().equals(it.getName());
    }
}
