package com.github.catvod.utils.merge;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class Yun189Data {

    @SerializedName("resultExplain")
    public Object resultExplain;

    @SerializedName("pcaID")
    public String pcaId;

    @SerializedName("nodNum")
    public int nodeNum;

    @SerializedName("folderList")
    public List<Yun189Folder> folderList;

    @SerializedName("fileList")
    public List<Yun189File> fileList;

    @SerializedName("tagName")
    public Object tagName;

    @SerializedName("tagID")
    public Object tagId;

    @SerializedName("tagType")
    public int tagType;

    @SerializedName("isCreator")
    public String isCreator;

    @SerializedName("lkName")
    public String linkName;

    @SerializedName("ctTime")
    public String createTime;

    @SerializedName("dlTimes")
    public int dlTimes;

    @SerializedName("desc")
    public String description;

    @SerializedName("creator")
    public String creator;

    @SerializedName("owner")
    public String owner;

    @SerializedName("brwTimes")
    public int browseTimes;

    @SerializedName("svTimes")
    public int saveTimes;

    @SerializedName("homeURL")
    public Object homeUrl;

    @SerializedName("openCount")
    public String openCount;

    @SerializedName("subLinkType")
    public int subLinkType;

    @SerializedName("expireTime")
    public Object expireTime;

    @SerializedName("isUnlimitedTimes")
    public int isUnlimitedTimes;

    @SerializedName("nikeName")
    public Object nickName;

    @SerializedName("password")
    public Object password;

    @SerializedName("caLength")
    public String cacheLength;

    @SerializedName("coLength")
    public String contentLength;

    @SerializedName("nextPageCursor")
    public Object nextPageCursor;

    @SerializedName("belongsPlatform")
    public Object belongsPlatform;
}
