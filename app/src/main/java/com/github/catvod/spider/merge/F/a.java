package com.github.catvod.spider.merge.F;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class a {
    public static volatile b d = b.p;
    public final StringBuffer a;
    public final Object b;
    public final b c;

    public a(Object obj) {
        b bVar = d;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.a = stringBuffer;
        this.c = bVar;
        this.b = obj;
        if (obj == null) {
            bVar.getClass();
            return;
        }
        if (bVar.b) {
            b.i(obj);
            stringBuffer.append(obj.getClass().getName());
        }
        if (bVar.c) {
            b.i(obj);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        stringBuffer.append(bVar.d);
        if (bVar.g) {
            stringBuffer.append(bVar.h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r11 = this;
            r0 = 1
            com.github.catvod.spider.merge.F.b r1 = r11.c
            java.lang.StringBuffer r2 = r11.a
            java.lang.Object r3 = r11.b
            if (r3 != 0) goto L10
            java.lang.String r0 = r1.k
            r2.append(r0)
            goto L8c
        L10:
            java.lang.String r7 = r1.h
            int r4 = com.github.catvod.spider.merge.E.c.a
            r5 = 0
            if (r2 == 0) goto L71
            if (r7 != 0) goto L1a
            goto L71
        L1a:
            int r4 = r7.length()
            int r6 = r2.length()
            if (r4 <= r6) goto L25
            goto L74
        L25:
            int r4 = r2.length()
            int r6 = r7.length()
            int r6 = r4 - r6
            int r9 = r7.length()
            boolean r4 = r2 instanceof java.lang.String
            r8 = 0
            if (r4 == 0) goto L44
            boolean r4 = r7 instanceof java.lang.String
            if (r4 == 0) goto L44
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = r4.regionMatches(r5, r6, r7, r8, r9)
            goto L6f
        L44:
            int r4 = r2.length()
            int r4 = r4 - r6
            int r5 = r7.length()
            r10 = 0
            if (r6 < 0) goto L6e
            if (r9 >= 0) goto L53
            goto L6e
        L53:
            if (r4 < r9) goto L6e
            if (r5 >= r9) goto L58
            goto L6e
        L58:
            int r4 = r9 + (-1)
            if (r9 <= 0) goto L6f
            int r5 = r6 + 1
            char r6 = r2.charAt(r6)
            int r9 = r8 + 1
            char r8 = r7.charAt(r8)
            if (r6 != r8) goto L6e
            r6 = r5
            r8 = r9
            r9 = r4
            goto L58
        L6e:
            r0 = 0
        L6f:
            r5 = r0
            goto L74
        L71:
            if (r2 != r7) goto L6e
            goto L6f
        L74:
            if (r5 == 0) goto L84
            int r0 = r2.length()
            java.lang.String r4 = r1.h
            int r4 = r4.length()
            int r0 = r0 - r4
            r2.setLength(r0)
        L84:
            java.lang.String r0 = r1.e
            r2.append(r0)
            com.github.catvod.spider.merge.F.b.j(r3)
        L8c:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F.a.toString():java.lang.String");
    }
}
