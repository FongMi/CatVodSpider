package com.github.catvod.utils.merge;
import com.github.catvod.utils.PanStringUtils;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 115 网盘文件/文件夹
 */
public final class Yun115File implements Comparable<Yun115File> {

    @SerializedName("list")
    private List<Yun115File> children;

    @SerializedName("is_owner")
    private int isOwner;

    @SerializedName("fid")
    private String fileId;

    @SerializedName("n")
    private String fileName;

    @SerializedName("cid")
    private String categoryId;

    @SerializedName("fc")
    private int fileCount;

    @SerializedName("format_type")
    private String formatType;

    @SerializedName("ico")
    private String icon;

    @SerializedName("s")
    private double size;

    @SerializedName("sha")
    private String sha;

    @SerializedName(alternate = {"big_thumbnail"}, value = "thumb")
    private String thumbnail;

    public Yun115File(String id) {
        this.fileId = id;
        this.categoryId = id;
    }

    /** 返回 "fileId_sha" 格式的唯一标识 */
    public final String id() {
        if (TextUtils.isEmpty(this.fileId)) return "";
        return this.fileId + "_" + (TextUtils.isEmpty(this.sha) ? "" : this.sha);
    }

    /** 返回带大小和扩展名的显示名称，如 "[1.2G] movie.mkv" */
    public final String display() {
        return TextUtils.join(" ", Arrays.asList(
                PanStringUtils.extractEpisodeNumber(name()),
                sizeLabel(), categoryId(), name())).trim();
    }

    /** 返回文件扩展名（小写），无扩展名返回空串 */
    public final String extension() {
        if (!this.fileName.contains(".")) return "";
        return this.fileName.substring(this.fileName.lastIndexOf(".") + 1).toLowerCase();
    }

    @Override
    public final int compareTo(Yun115File other) {
        return sortKey().compareTo(other.sortKey());
    }

    /** 返回 fileId，为空返回空串 */
    public final String fileId() {
        return TextUtils.isEmpty(this.fileId) ? "" : this.fileId;
    }

    /** 返回子文件/文件夹列表，为 null 返回空列表 */
    public final List<Yun115File> children() {
        List<Yun115File> list = this.children;
        return list == null ? Collections.emptyList() : list;
    }

    /** 返回清理后的文件名（去除路径前缀） */
    public final String name() {
        return TextUtils.isEmpty(this.fileName) ? ""
                : PanStringUtils.cleanFilename(this.fileName);
    }

    /** 返回 categoryId（目录 ID） */
    public final String categoryId() {
        return TextUtils.isEmpty(this.categoryId) ? "" : this.categoryId;
    }

    /** 返回 SHA 哈希值 */
    public final String sha() {
        return this.sha;
    }

    /** 返回文件大小 */
    public final double size() {
        return this.size;
    }

    /** 返回格式化的大小标签，如 "[1.2G]"，大小为 0 返回空串 */
    public final String sizeLabel() {
        if (this.size == 0.0d) return "";
        return "[" + PanStringUtils.formatFileSize(this.size) + "]";
    }

    /** 返回排序用的 key（文件名拼音） */
    public final String sortKey() {
        return PanStringUtils.extractEpisodeNumber(name());
    }

    /** 返回缩略图 URL */
    public final String thumbnail() {
        return this.thumbnail;
    }

    /** 返回类型："folder" 或 "file" */
    public final String type() {
        return this.fileCount == 0 ? "folder" : "file";
    }

    /** Returns the format type string (e.g. mime type), or null if unknown. Obfuscated alias: j() */
    public final String j() {
        return this.formatType;
    }

    /** Returns the format type string. */
    public final String getFormatType() {
        return this.formatType;
    }

    /** 设置 categoryId（链式调用） */
    public final Yun115File n(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
}
