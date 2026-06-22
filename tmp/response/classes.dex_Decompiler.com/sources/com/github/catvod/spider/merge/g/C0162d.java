package com.github.catvod.spider.merge.g;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0162d {

    @SerializedName("mid")
    private String a;

    @SerializedName("name")
    private String b;

    public final String a() {
        String strA = C0098a.a(new byte[]{26, 100, 15, -103, 81, -63, -39, -75, 40, 97, 16, -64, 1, -34, -47, -75, 109, 39, 92, -101, 78, -98, -128, -83, 99, 32, 65, -40, 94, -44, -1, -78, 50, 94, 29, -101, 126}, new byte[]{65, 5, 50, -6, 35, -5, -94, -105});
        Object[] objArr = new Object[3];
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        objArr[0] = C0133t.b(new byte[]{-113, -46, 45, 72, -48}, new byte[]{-96, -87, 93, 47, -83, 60, 46, 84}, sb);
        objArr[1] = TextUtils.isEmpty(this.b) ? "" : this.b;
        objArr[2] = TextUtils.isEmpty(this.b) ? "" : this.b;
        return String.format(strA, objArr);
    }
}
