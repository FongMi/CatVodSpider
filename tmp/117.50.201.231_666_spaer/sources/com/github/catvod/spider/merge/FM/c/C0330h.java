package com.github.catvod.spider.merge.FM.c;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.c.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0330h {

    @SerializedName("url")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("lang")
    private String c;

    @SerializedName("format")
    private String d;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.FM.c.C0330h a(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 96897(0x17a81, float:1.35782E-40)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 114177(0x1be01, float:1.59996E-40)
            if (r0 == r1) goto L20
            r1 = 117110(0x1c976, float:1.64106E-40)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "vtt"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L34
            r7 = 0
            goto L35
        L20:
            java.lang.String r0 = "ssa"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L34
            r7 = 2
            goto L35
        L2a:
            java.lang.String r0 = "ass"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L34
            r7 = 1
            goto L35
        L34:
            r7 = -1
        L35:
            if (r7 == 0) goto L45
            if (r7 == r3) goto L40
            if (r7 == r2) goto L40
            java.lang.String r7 = "application/x-subrip"
            r6.d = r7
            return r6
        L40:
            java.lang.String r7 = "text/x-ssa"
            r6.d = r7
            return r6
        L45:
            java.lang.String r7 = "text/vtt"
            r6.d = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.c.C0330h.a(java.lang.String):com.github.catvod.spider.merge.FM.c.h");
    }

    public final C0330h b(String str) {
        this.c = str;
        return this;
    }

    public final C0330h c(String str) {
        this.b = str;
        return this;
    }

    public final C0330h d(String str) {
        this.a = str;
        return this;
    }
}
