package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class i {

    @SerializedName("video_preview_play_info")
    private a a;

    @SerializedName("drive_id")
    private String b;

    @SerializedName("file_id")
    private String c;

    public static class a {

        @SerializedName("quick_video_list")
        private List<b> a;

        @SerializedName("live_transcoding_subtitle_task_list")
        private List<b> b;

        @SerializedName("live_transcoding_task_list")
        private List<b> c;

        public final List<b> a() {
            List<b> list = this.a;
            if (list != null && !list.isEmpty()) {
                return list;
            }
            List<b> list2 = this.c;
            return list2 == null ? Collections.emptyList() : list2;
        }
    }

    public static class b {

        @SerializedName("template_id")
        private String a;

        @SerializedName("language")
        private String b;

        @SerializedName("status")
        private String c;

        @SerializedName("url")
        private String d;

        public final String a() {
            return TextUtils.isEmpty(this.a) ? "" : this.a;
        }

        public final String b() {
            return TextUtils.isEmpty(this.d) ? "" : this.d;
        }
    }

    public final a a() {
        a aVar = this.a;
        return aVar == null ? new a() : aVar;
    }
}
