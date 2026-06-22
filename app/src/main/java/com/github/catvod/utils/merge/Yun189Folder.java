package com.github.catvod.utils.merge;

import com.google.gson.annotations.SerializedName;

public final class Yun189Folder {

    @SerializedName("id")
    public String folderId;

    @SerializedName("name")
    public String folderName;

    @SerializedName("ctTime")
    public String createTime;

    @SerializedName("udTime")
    public String updateTime;

    @SerializedName("dlTimes")
    public int dlTimes;

    @SerializedName("path")
    public String path;

    @SerializedName("illegalType")
    public Object illegalType;

    @SerializedName("illegalResult")
    public Object illegalResult;
}
