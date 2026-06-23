package com.github.catvod.spider.merge.FM.e;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f implements Comparator<c> {
    private final String a;
    private final String b;

    public f(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static void a(String str, String str2, List<c> list) {
        Collections.sort(list, new f(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(com.github.catvod.spider.merge.FM.e.c r10, com.github.catvod.spider.merge.FM.e.c r11) {
        /*
            r9 = this;
            com.github.catvod.spider.merge.FM.e.c r10 = (com.github.catvod.spider.merge.FM.e.c) r10
            com.github.catvod.spider.merge.FM.e.c r11 = (com.github.catvod.spider.merge.FM.e.c) r11
            java.lang.String r0 = r9.b
            java.lang.String r1 = "asc"
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = r9.a
            int r3 = r1.hashCode()
            r4 = 3076014(0x2eefae, float:4.310414E-39)
            r6 = -1
            r7 = 1
            r8 = 2
            if (r3 == r4) goto L39
            r4 = 3373707(0x337a8b, float:4.72757E-39)
            if (r3 == r4) goto L2f
            r4 = 3530753(0x35e001, float:4.947639E-39)
            if (r3 == r4) goto L25
            goto L43
        L25:
            java.lang.String r2 = "size"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L43
            r1 = 1
            goto L44
        L2f:
            java.lang.String r2 = "name"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L43
            r1 = 0
            goto L44
        L39:
            java.lang.String r2 = "date"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L43
            r1 = 2
            goto L44
        L43:
            r1 = -1
        L44:
            if (r1 == 0) goto L7e
            if (r1 == r7) goto L68
            if (r1 == r8) goto L4b
            goto L9a
        L4b:
            if (r0 == 0) goto L5a
            java.util.Date r10 = r10.b()
            java.util.Date r11 = r11.b()
            int r10 = r10.compareTo(r11)
            goto L66
        L5a:
            java.util.Date r11 = r11.b()
            java.util.Date r10 = r10.b()
            int r10 = r11.compareTo(r10)
        L66:
            r6 = r10
            goto L9a
        L68:
            if (r0 == 0) goto L73
            long r0 = r10.e()
            long r10 = r11.e()
            goto L7b
        L73:
            long r0 = r11.e()
            long r10 = r10.e()
        L7b:
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            goto L9a
        L7e:
            if (r0 == 0) goto L8d
            java.lang.String r10 = r10.c()
            java.lang.String r11 = r11.c()
            int r10 = r10.compareTo(r11)
            goto L66
        L8d:
            java.lang.String r11 = r11.c()
            java.lang.String r10 = r10.c()
            int r10 = r11.compareTo(r10)
            goto L66
        L9a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.e.f.compare(java.lang.Object, java.lang.Object):int");
    }
}
