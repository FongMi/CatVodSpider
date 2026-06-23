package com.github.catvod.spider.merge.FM.d;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.d.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0341i {

    @SerializedName("live_transcoding_task_list")
    private List<j> a;

    @SerializedName("live_transcoding_subtitle_task_list")
    private List<j> b;

    public final List<j> a() {
        List<j> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final List<j> b() {
        List<j> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }
}
