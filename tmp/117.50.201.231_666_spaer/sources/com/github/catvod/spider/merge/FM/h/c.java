package com.github.catvod.spider.merge.FM.h;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c {

    @SerializedName("name")
    private String a;

    @SerializedName("url")
    private final String b;

    @SerializedName("icon")
    private String c;

    @SerializedName("copy")
    private String d;

    @SerializedName("version")
    private String e;

    public c(String str) {
        this.b = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.FM.c.C0332j c() {
        /*
            r11 = this;
            com.github.catvod.spider.merge.FM.c.j r7 = new com.github.catvod.spider.merge.FM.c.j
            java.lang.String r0 = r11.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto Le
            r2 = r1
            goto L11
        Le:
            java.lang.String r0 = r11.a
            r2 = r0
        L11:
            java.lang.String r0 = r11.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1b
            r3 = r1
            goto L1e
        L1b:
            java.lang.String r0 = r11.c
            r3 = r0
        L1e:
            java.lang.String r0 = r11.e
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto L2a
            java.lang.String r0 = com.github.catvod.spider.Init.v
        L28:
            r4 = r0
            goto L49
        L2a:
            java.lang.String r0 = r11.e
            java.lang.String r9 = "version"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L48
            java.lang.String r0 = "https://ghfast.top/https://raw.githubusercontent.com/IY-CPU/IY/main/version.txt"
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r0 = com.github.catvod.spider.merge.k.C0575b.l(r0, r8)
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto L48
            java.lang.String r0 = com.github.catvod.spider.Init.v
            goto L28
        L48:
            r4 = r0
        L49:
            java.lang.String r0 = r11.e
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto L52
            goto L83
        L52:
            java.lang.String r0 = r11.e
            java.lang.String r8 = "Fongmi"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L83
            java.lang.String r0 = "https://wget.la/https://raw.githubusercontent.com/FongMi/Release/fongmi/apk/mobile.json"
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r0 = com.github.catvod.spider.merge.k.C0575b.l(r0, r8)
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L83
            java.lang.String r8 = "\"name\"\\s*:\\s*\"([^\"]+)\""
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
            java.util.regex.Matcher r8 = r8.matcher(r0)
            boolean r9 = r8.find()
            if (r9 == 0) goto L83
            r0 = 1
            java.lang.String r0 = r8.group(r0)
            r4 = r0
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            com.github.catvod.spider.merge.FM.c.i r5 = com.github.catvod.spider.merge.FM.c.C0331i.a(r0)
            java.lang.String r6 = r11.b()
            java.lang.String r1 = ""
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.h.c.c():com.github.catvod.spider.merge.FM.c.j");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return b().equals(((c) obj).b());
        }
        return false;
    }
}
