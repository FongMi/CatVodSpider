package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.github.catvod.bean.Sub;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Preview {

    @SerializedName("video_preview_play_info")
    private Info videoPreviewPlayInfo;
    @SerializedName("drive_id")
    private String driveId;
    @SerializedName("file_id")
    private String fileId;

    public static Preview objectFrom(String str) {
        return new Gson().fromJson(str, Preview.class);
    }

    public Info getVideoPreviewPlayInfo() {
        return videoPreviewPlayInfo == null ? new Info() : videoPreviewPlayInfo;
    }

    public String getDriveId() {
        return TextUtils.isEmpty(driveId) ? "" : driveId;
    }

    public String getFileId() {
        return TextUtils.isEmpty(fileId) ? "" : fileId;
    }

    public static class Info {

        @SerializedName("live_transcoding_task_list")
        private List<LiveTranscodingTask> liveTranscodingTaskList;
        @SerializedName("live_transcoding_subtitle_task_list")
        private List<LiveTranscodingTask> liveTranscodingSubtitleTaskList;

        public List<LiveTranscodingTask> getLiveTranscodingTaskList() {
            return liveTranscodingTaskList == null ? Collections.emptyList() : liveTranscodingTaskList;
        }

        public List<LiveTranscodingTask> getLiveTranscodingSubtitleTaskList() {
            return liveTranscodingSubtitleTaskList == null ? Collections.emptyList() : liveTranscodingSubtitleTaskList;
        }
    }

    public static class LiveTranscodingTask {

        @SerializedName("template_id")
        private String templateId;
        @SerializedName("language")
        private String language;
        @SerializedName("status")
        private String status;
        @SerializedName("url")
        private String url;

        public String getTemplateId() {
            return TextUtils.isEmpty(templateId) ? "" : templateId;
        }

        public String getLanguage() {
            return TextUtils.isEmpty(language) ? "" : language;
        }

        public String getStatus() {
            return TextUtils.isEmpty(status) ? "" : status;
        }

        public String getUrl() {
            return TextUtils.isEmpty(url) ? "" : url;
        }

        public Sub getSub() {
            return Sub.create().url(getUrl()).name(getLanguage()).lang(getLanguage()).ext("vtt");
        }
    }
}
