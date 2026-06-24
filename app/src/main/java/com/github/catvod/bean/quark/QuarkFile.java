package com.github.catvod.bean.quark;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a file or folder from the Quark/UC cloud drive share API.
 * Replaces obfuscated class: com.github.catvod.spider.merge.S.pkg.a
 *
 * API JSON keys are preserved exactly via @SerializedName.
 * Getter methods use meaningful names matching API client usage patterns:
 *   d() → getFileId(),  e() → getChildren(),  k() → getFileType(),
 *   f() → getFileName(), c() → getSha1(),     b() → getDisplayName(),
 *   a() → getShareFidToken(), h() → getFidToken()
 */
public class QuarkFile {

    @SerializedName("fid")
    private String fileId;

    @SerializedName("share_id")
    private String shareId;

    @SerializedName("file_name")
    private String fileName;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("file_type")
    private String fileType;

    @SerializedName("obj_category")
    private String objCategory;

    @SerializedName("size")
    private long size;

    @SerializedName("sha1")
    private String sha1;

    @SerializedName("share_fid_token")
    private String shareFidToken;

    @SerializedName("fid_token")
    private String fidToken;

    @SerializedName("dir")
    private boolean dir;

    @SerializedName("file")
    private boolean file;

    @SerializedName("list")
    private List<QuarkFile> children;

    /** Parent folder name, set programmatically (not from JSON). */
    private String parentName;

    public QuarkFile() {
        this.children = new ArrayList<>();
    }

    public QuarkFile(String fileId) {
        this();
        this.fileId = fileId;
    }

    /**
     * Deserialize a QuarkFile from a JSON string (supports nested "list").
     * Replaces: merge.S.pkg.a.l(String)
     */
    public static QuarkFile fromJson(String json) {
        return new Gson().fromJson(json, QuarkFile.class);
    }

    // ==================== Getters ====================

    /**
     * Returns the file/folder ID (JSON key: "fid").
     * Used in API as pdir_fid, fid_list, etc.
     * Replaces: obfuscated method d()
     */
    public String getFileId() {
        return fileId;
    }

    /** Returns the share ID this file belongs to (JSON key: "share_id"). */
    public String getShareId() {
        return shareId;
    }

    /**
     * Returns the file name (JSON key: "file_name").
     * Used for display and subtitle matching.
     * Replaces: obfuscated method f()
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Returns the display name (JSON key: "display_name").
     * Shown as episode name in play URL.
     * Replaces: obfuscated method b()
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Returns the file type string, e.g. "folder" (JSON key: "file_type").
     * Replaces: obfuscated method k()
     */
    public String getFileType() {
        return fileType;
    }

    /** Returns the object category, e.g. "video" (JSON key: "obj_category"). */
    public String getObjCategory() {
        return objCategory;
    }

    /** Returns the file size in bytes (JSON key: "size"). */
    public long getSize() {
        return size;
    }

    /**
     * Returns the SHA1 hash of the file (JSON key: "sha1").
     * Used for subtitle identification and content matching.
     * Replaces: obfuscated method c()
     */
    public String getSha1() {
        return sha1;
    }

    /**
     * Returns the share fid token (JSON key: "share_fid_token").
     * Used in play URL construction.
     * Replaces: obfuscated method a()
     */
    public String getShareFidToken() {
        return shareFidToken;
    }

    /**
     * Returns the fid token for save/download operations (JSON key: "fid_token").
     * Cached in the fidTokenCache map for share page saves.
     * Replaces: obfuscated method h()
     */
    public String getFidToken() {
        return fidToken;
    }

    /** Returns true if this item is a directory (JSON key: "dir"). */
    public boolean isDir() {
        return dir;
    }

    /** Returns true if this item is a file (JSON key: "file"). */
    public boolean isFile() {
        return file;
    }

    /**
     * Returns child items from a directory listing (JSON key: "list").
     * Returns empty list if null.
     * Replaces: obfuscated method e()
     */
    public List<QuarkFile> getChildren() {
        List<QuarkFile> list = this.children;
        return list == null ? Collections.emptyList() : list;
    }

    /** Returns the parent folder name (set programmatically, not from JSON). */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the parent folder name.
     * Replaces: obfuscated method m(String)
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
