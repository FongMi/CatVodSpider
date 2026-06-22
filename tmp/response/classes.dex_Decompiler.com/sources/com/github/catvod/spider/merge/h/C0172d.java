package com.github.catvod.spider.merge.h;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0172d {

    @SerializedName(alternate = {"name"}, value = "title")
    private String a;

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String c(boolean z) {
        if (!z) {
            return b();
        }
        String strA = C0098a.a(new byte[]{-70, -11, 24, 68, 100, 25, -22, -17, -120, -16, 7, 29, 52, 6, -30, -17, -51, -74, 75, 70, 123, 70, -77, -9, -61, -79, 86, 5, 107, 12, -52, -24, -110, -49, 10, 70, 75}, new byte[]{-31, -108, 37, 39, 22, 35, -111, -51});
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        return String.format(strA, C0133t.b(new byte[]{32, -89, 38, -127, 51}, new byte[]{15, -36, 86, -26, 78, 36, -29, -71}, sb), b(), b());
    }
}
