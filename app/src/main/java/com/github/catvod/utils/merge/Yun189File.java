package com.github.catvod.utils.merge;
import com.github.catvod.utils.PanStringUtils;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public final class Yun189File {

    @SerializedName("id")
    public String fileId;

    @SerializedName("name")
    public String fileName;

    @SerializedName("coType")
    public int fileType;

    @SerializedName("coSuffix")
    public String suffix;

    @SerializedName("size")
    public long fileSize;

    @SerializedName("udTime")
    public String updateTime;

    @SerializedName("thumbnailURL")
    public String thumbnailUrl;

    @SerializedName("bthumbnailURL")
    public String bthumbnailUrl;

    @SerializedName("presentURL")
    public String presentUrl;

    @SerializedName("presentLURL")
    public String presentLUrl;

    @SerializedName("presentHURL")
    public String presentHUrl;

    @SerializedName("safestate")
    public int safeState;

    @SerializedName("auditResult")
    public int auditResult;

    @SerializedName("flvState")
    public Object flvState;

    @SerializedName("dlTimes")
    public int dlTimes;

    @SerializedName("path")
    public String path;

    @SerializedName("cdnDownLoadUrl")
    public Object cdnDownloadUrl;

    @SerializedName("ifCdn")
    public Object ifCdn;

    @SerializedName("extInfo")
    public Yun189Wrapper extInfo;

    @SerializedName("illegalType")
    public Object illegalType;

    @SerializedName("illegalResult")
    public Object illegalResult;

    /** 返回清理后的文件名 */
    public final String mediaId() {
        return PanStringUtils.cleanFilename(this.fileName);
    }

    /** 返回带大小标签的显示名称，如 "[1.2G] movie.mkv" */
    public final String displayName() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(PanStringUtils.formatFileSize(this.fileSize));
        sb.append("]");
        return TextUtils.join(" ", Arrays.asList(
                PanStringUtils.extractEpisodeNumber(mediaId()),
                sb.toString(), mediaId(), "")).trim();
    }
}
