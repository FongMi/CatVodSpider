package com.github.catvod.bean.ali;

import com.github.catvod.api.AliYun;
import com.github.catvod.spider.Init;
import com.github.catvod.utils.Path;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Cache {

    @SerializedName("user")
    private User user;
    @SerializedName("oauth")
    private OAuth oauth;
    @SerializedName("drive")
    private Drive drive;

    public static Cache objectFrom(String str) {
        Cache item = new Gson().fromJson(str, Cache.class);
        return item == null ? new Cache() : item;
    }

    public User getUser() {
        return user == null ? new User() : user;
    }

    public void setUser(User user) {
        this.user = user;
        this.save();
    }

    public OAuth getOAuth() {
        return oauth == null ? new OAuth() : oauth;
    }

    public void setOAuth(OAuth oauth) {
        this.oauth = oauth;
        this.save();
    }

    public Drive getDrive() {
        return drive == null ? new Drive() : drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
        this.save();
    }

    public void save() {
        Init.execute(() -> Path.write(AliYun.get().getCache(), toString()));
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
