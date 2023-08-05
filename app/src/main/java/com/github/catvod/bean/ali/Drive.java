package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.github.catvod.ali.API;
import com.github.catvod.utils.FileUtil;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Drive {

    @SerializedName("default_drive_id")
    private String driveId;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("backup_drive_id")
    private String backupDriveId;
    @SerializedName("resource_drive_id")
    private String resourceDriveId;
    @SerializedName("sbox_drive_id")
    private String sboxDriveId;

    public static Drive objectFrom(String str) {
        Drive item = new Gson().fromJson(str, Drive.class);
        return item == null ? new Drive() : item;
    }

    public String getDriveId() {
        return TextUtils.isEmpty(driveId) ? "" : driveId;
    }

    public String getUserId() {
        return TextUtils.isEmpty(userId) ? "" : userId;
    }

    public String getBackupDriveId() {
        return TextUtils.isEmpty(backupDriveId) ? "" : backupDriveId;
    }

    public String getResourceDriveId() {
        return TextUtils.isEmpty(resourceDriveId) ? "" : resourceDriveId;
    }

    public String getSboxDriveId() {
        return TextUtils.isEmpty(sboxDriveId) ? "" : sboxDriveId;
    }

    public Drive clean() {
        this.driveId = "";
        this.resourceDriveId = "";
        return this;
    }

    public Drive save() {
        FileUtil.write(API.get().getDriveCache(), toString());
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
