package com.github.catvod.spider.merge.d;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0151j {

    @SerializedName("live_transcoding_task_list")
    private List<k> a;

    @SerializedName("live_transcoding_subtitle_task_list")
    private List<k> b;

    public final List<k> a() {
        List<k> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final List<k> b() {
        List<k> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }
}
