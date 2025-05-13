package com.github.catvod.bean.mqitv;

public class User {

    private String id;
    private String mac;

    public User(String id, String mac) {
        this.id = id;
        this.mac = mac;
    }

    public String getId() {
        return id;
    }

    public String getMac() {
        return mac;
    }
}
