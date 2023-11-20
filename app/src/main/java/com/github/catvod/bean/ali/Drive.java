package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Drive {

    @SerializedName("default_drive_id")
    private String defaultDriveId;
    @SerializedName("resource_drive_id")
    private String resourceDriveId;

    public static Drive objectFrom(String str) {
        Drive item = new Gson().fromJson(str, Drive.class);
        return item == null ? new Drive() : item;
    }

    private String getDefaultDriveId() {
        return TextUtils.isEmpty(defaultDriveId) ? "" : defaultDriveId;
    }

    private String getResourceDriveId() {
        return TextUtils.isEmpty(resourceDriveId) ? "" : resourceDriveId;
    }

    public String getDriveId() {
        return getResourceDriveId().isEmpty() ? getDefaultDriveId() : getResourceDriveId();
    }
}
