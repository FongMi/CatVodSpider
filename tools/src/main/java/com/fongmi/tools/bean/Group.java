package com.fongmi.tools.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Group {

    @SerializedName("channel")
    private List<Channel> channel;
    @SerializedName("logo")
    private String logo;
    @SerializedName("name")
    private String name;
    @SerializedName("pass")
    private String pass;

    public static Group create(String name) {
        return new Group(name);
    }

    public Group(String name) {
        this.name = name;
        if (!name.contains("_")) return;
        setName(name.split("_")[0]);
        setPass(name.split("_")[1]);
    }

    public List<Channel> getChannel() {
        return channel = channel == null ? new ArrayList<>() : channel;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Channel find(Channel channel) {
        int index = getChannel().indexOf(channel);
        if (index != -1) return getChannel().get(index);
        getChannel().add(channel);
        return channel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Group)) return false;
        Group it = (Group) obj;
        return getName().equals(it.getName()) && getChannel().size() == it.getChannel().size();
    }
}
