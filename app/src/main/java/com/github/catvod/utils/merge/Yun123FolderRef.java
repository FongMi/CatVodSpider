package com.github.catvod.utils.merge;

/**
 * 123 盘文件夹引用（用于递归遍历文件目录）
 */
public class Yun123FolderRef {
    public final String shareKey;
    public final long folderId;

    public Yun123FolderRef(String shareKey, long folderId) {
        this.shareKey = shareKey;
        this.folderId = folderId;
    }
}
