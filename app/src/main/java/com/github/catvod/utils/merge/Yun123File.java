package com.github.catvod.utils.merge;
import com.github.catvod.utils.PanStringUtils;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

/**
 * 123 盘文件/文件夹项
 */
public final class Yun123File implements Comparable<Yun123File> {

    @SerializedName("InfoList")
    private List<Yun123File> children;

    @SerializedName("shareKey")
    private String shareKey;

    @SerializedName("FileId")
    private Long fileId;

    @SerializedName("FileName")
    private String fileName;

    @SerializedName("pdir_fid")
    private String parentDirFid;

    @SerializedName("Type")
    private int type;

    @SerializedName("S3KeyFlag")
    private String s3KeyFlag;

    @SerializedName("Category")
    private String category;

    @SerializedName("Size")
    private String size;

    @SerializedName("Etag")
    private String etag;

    @SerializedName(alternate = {"big_thumbnail"}, value = "thumb")
    private String thumbnail;

    /** 返回带大小标签的显示名称，如 "[1.2G] movie.mkv" */
    public final String display() {
        String sizeLabel = "";
        if (Long.parseLong(this.size) != 0) {
            sizeLabel = "[" + PanStringUtils.formatFileSize(Double.parseDouble(this.size)) + "]";
        }
        String dirLabel = TextUtils.isEmpty(this.parentDirFid) ? ""
                : "[" + this.parentDirFid + "]";
        return TextUtils.join(" ", java.util.Arrays.asList(
                PanStringUtils.extractEpisodeNumber(name()),
                sizeLabel, dirLabel, name())).trim();
    }

    /** 返回 Etag */
    public final String etag() {
        return this.etag;
    }

    /** 返回文件 ID */
    public final Long fileId() {
        return this.fileId;
    }

    @Override
    public final int compareTo(Yun123File other) {
        return sortKey().compareTo(other.sortKey());
    }

    /** 返回子文件列表 */
    public final List<Yun123File> children() {
        List<Yun123File> list = this.children;
        return list == null ? Collections.emptyList() : list;
    }

    /** 返回清理后的文件名 */
    public final String name() {
        return TextUtils.isEmpty(this.fileName) ? ""
                : PanStringUtils.cleanFilename(this.fileName);
    }

    /** 返回 S3KeyFlag */
    public final String s3KeyFlag() {
        return this.s3KeyFlag;
    }

    /** 返回文件大小（字符串） */
    public final String size() {
        return String.valueOf(this.size);
    }

    /** 返回排序用的 key */
    public final String sortKey() {
        return PanStringUtils.extractEpisodeNumber(name());
    }

    /** 返回类型："folder" 或 "file" */
    public final String type() {
        return this.type == 1 ? "folder" : "file";
    }
}
