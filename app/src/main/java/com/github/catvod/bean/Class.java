package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class Class {

    @SerializedName("type_id")
    private String typeId;
    @SerializedName("type_name")
    private String typeName;

    public Class(String typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
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
