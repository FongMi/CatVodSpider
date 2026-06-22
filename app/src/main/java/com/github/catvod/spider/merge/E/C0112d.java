package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.T;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0112d {

    @SerializedName("mid")
    private String a;

    @SerializedName("name")
    private String b;

    public final String a() {
        String strH = T.h(new StringBuilder(), TextUtils.isEmpty(this.a) ? "" : this.a, "/{pg}");
        String str = TextUtils.isEmpty(this.b) ? "" : this.b;
        String str2 = TextUtils.isEmpty(this.b) ? "" : this.b;
        StringBuilder sb = new StringBuilder("[a=cr:{\"id\":\"");
        sb.append(strH);
        sb.append("\",\"name\":\"");
        sb.append(str);
        sb.append("\"}/]");
        return T.h(sb, str2, "[/a]");
    }
}
