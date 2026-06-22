package com.github.catvod.spider.merge.c;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class j {

    @SerializedName("live_transcoding_task_list")
    private List<k> a;

    @SerializedName("live_transcoding_subtitle_task_list")
    private List<k> b;

    public final List a() {
        List<k> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final List b() {
        List<k> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }
}
