package com.github.catvod.spider.merge.FM.g;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.L.P;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.g.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0348d {

    @SerializedName("mid")
    private String a;

    @SerializedName("name")
    private String b;

    public final String a() {
        Object[] objArr = new Object[3];
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        objArr[0] = P.a(new byte[]{51, -34, -88, -97, -123}, new byte[]{28, -91, -40, -8, -8, -113, 51, 58}, sb);
        objArr[1] = TextUtils.isEmpty(this.b) ? "" : this.b;
        objArr[2] = TextUtils.isEmpty(this.b) ? "" : this.b;
        return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", objArr);
    }
}
