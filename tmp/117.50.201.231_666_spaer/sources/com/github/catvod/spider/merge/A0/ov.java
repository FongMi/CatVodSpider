package com.github.catvod.spider.merge.A0;

import java.util.Comparator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ov implements Comparator {
    public final String a;
    public final String b;

    public ov(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = -1
            com.github.catvod.spider.merge.A0.cg r5 = (com.github.catvod.spider.merge.A0.cg) r5
            com.github.catvod.spider.merge.A0.cg r6 = (com.github.catvod.spider.merge.A0.cg) r6
            java.lang.String r1 = r4.b
            java.lang.String r2 = "asc"
            boolean r1 = r1.equals(r2)
            java.lang.String r2 = r4.a
            r2.getClass()
            int r3 = r2.hashCode()
            switch(r3) {
                case 3076014: goto L31;
                case 3373707: goto L26;
                case 3530753: goto L1b;
                default: goto L19;
            }
        L19:
            r2 = -1
            goto L3b
        L1b:
            java.lang.String r3 = "size"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            goto L19
        L24:
            r2 = 2
            goto L3b
        L26:
            java.lang.String r3 = "name"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2f
            goto L19
        L2f:
            r2 = 1
            goto L3b
        L31:
            java.lang.String r3 = "date"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            goto L19
        L3a:
            r2 = 0
        L3b:
            switch(r2) {
                case 0: goto L74;
                case 1: goto L58;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L90
        L3f:
            if (r1 == 0) goto L4f
            long r0 = r5.d()
            long r5 = r6.d()
        L49:
            int r5 = java.lang.Long.compare(r0, r5)
        L4d:
            r0 = r5
            goto L90
        L4f:
            long r0 = r6.d()
            long r5 = r5.d()
            goto L49
        L58:
            if (r1 == 0) goto L67
            java.lang.String r5 = r5.c()
            java.lang.String r6 = r6.c()
            int r5 = r5.compareTo(r6)
            goto L4d
        L67:
            java.lang.String r6 = r6.c()
            java.lang.String r5 = r5.c()
            int r5 = r6.compareTo(r5)
            goto L4d
        L74:
            if (r1 == 0) goto L83
            java.util.Date r5 = r5.b()
            java.util.Date r6 = r6.b()
            int r5 = r5.compareTo(r6)
            goto L4d
        L83:
            java.util.Date r6 = r6.b()
            java.util.Date r5 = r5.b()
            int r5 = r6.compareTo(r5)
            goto L4d
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.ov.compare(java.lang.Object, java.lang.Object):int");
    }
}
