package com.github.catvod.bean.ali;

import android.text.TextUtils;

public class Item {

    private String id;
    private String name;

    public Item(String id) {
        this.id = id;
    }

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName(String fileName) {
        return TextUtils.isEmpty(name) ? fileName : "[" + name + "] " + fileName;
    }
}
