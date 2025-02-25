package com.github.catvod.bean.live;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {

    @SerializedName("channel")
    private List<Channel> channel;
    @SerializedName("name")
    private String name;

    public static List<Group> arrayFrom(String str) {
        Type listType = new TypeToken<List<Group>>() {}.getType();
        List<Group> items = new Gson().fromJson(str, listType);
        return items == null ? Collections.emptyList() : items;
    }

    public static Group find(List<Group> items, Group item) {
        for (Group group : items) if (group.getName().equals(item.getName())) return group;
        items.add(item);
        return item;
    }

    public static Group create(String name) {
        return new Group(name);
    }

    public Group(String name) {
        this.name = name;
        if (name.contains("_")) setName(name.split("_")[0]);
    }

    public List<Channel> getChannel() {
        return channel = channel == null ? new ArrayList<>() : channel;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
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
