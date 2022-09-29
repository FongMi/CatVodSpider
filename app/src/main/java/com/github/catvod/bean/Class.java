package com.github.catvod.bean;

import com.github.catvod.utils.Trans;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Class {

    @SerializedName("type_id")
    private String typeId;
    @SerializedName("type_name")
    private String typeName;
    @SerializedName("type_flag")
    private String typeFlag;

    public static List<Class> arrayFrom(String str) {
        Type listType = new TypeToken<List<Class>>() {}.getType();
        List<Class> items = new Gson().fromJson(str, listType);
        for (Class item : items) item.typeName = Trans.get(item.typeName);
        return items;
    }

    public Class(String typeId) {
        this(typeId, typeId);
    }

    public Class(String typeId, String typeName) {
        this(typeId, typeName, "");
    }

    public Class(String typeId, String typeName, String typeFlag) {
        this.typeId = typeId;
        this.typeName = Trans.get(typeName);
        this.typeFlag = typeFlag;
    }

    public String getTypeId() {
        return typeId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Class)) return false;
        Class it = (Class) obj;
        return getTypeId().equals(it.getTypeId());
    }
}
