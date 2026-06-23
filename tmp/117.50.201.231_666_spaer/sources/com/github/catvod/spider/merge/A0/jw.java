package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class jw extends l {
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[PHI: r8
      0x005d: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v3 java.lang.String) binds: [B:13:0x005b, B:29:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String y(java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            com.github.catvod.spider.merge.A0.ko.f(r0, r13)
            java.lang.String r0 = "|"
            boolean r1 = com.github.catvod.spider.merge.A0.wf.ac(r0)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = "\r\n"
            java.lang.String r2 = "\n"
            java.lang.String r3 = "\r"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            com.github.catvod.spider.merge.A0.acr r1 = com.github.catvod.spider.merge.A0.dc.l(r13, r1)
            com.github.catvod.spider.merge.A0.lv r2 = new com.github.catvod.spider.merge.A0.lv
            r3 = 1
            r2.<init>(r3, r13)
            com.github.catvod.spider.merge.A0.acr r3 = new com.github.catvod.spider.merge.A0.acr
            r3.<init>(r1, r2)
            java.util.List r1 = com.github.catvod.spider.merge.A0.wt.a(r3)
            int r13 = r13.length()
            r1.size()
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r5 = 0
        L42:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto La4
            java.lang.Object r6 = r1.next()
            int r7 = r5 + 1
            if (r5 < 0) goto L9c
            java.lang.String r6 = (java.lang.String) r6
            r8 = 0
            if (r5 == 0) goto L57
            if (r5 != r2) goto L5f
        L57:
            boolean r5 = com.github.catvod.spider.merge.A0.wf.ac(r6)
            if (r5 == 0) goto L5f
        L5d:
            r6 = r8
            goto L95
        L5f:
            int r5 = r6.length()
            r9 = 0
        L64:
            r10 = -1
            if (r9 >= r5) goto L7a
            char r11 = r6.charAt(r9)
            boolean r12 = java.lang.Character.isWhitespace(r11)
            if (r12 != 0) goto L77
            boolean r11 = java.lang.Character.isSpaceChar(r11)
            if (r11 == 0) goto L7b
        L77:
            int r9 = r9 + 1
            goto L64
        L7a:
            r9 = -1
        L7b:
            if (r9 != r10) goto L7e
            goto L92
        L7e:
            boolean r5 = com.github.catvod.spider.merge.A0.wf.ag(r9, r6, r0, r4)
            if (r5 == 0) goto L92
            int r5 = r0.length()
            int r5 = r5 + r9
            java.lang.String r8 = r6.substring(r5)
            java.lang.String r5 = "substring(...)"
            com.github.catvod.spider.merge.A0.ko.e(r5, r8)
        L92:
            if (r8 == 0) goto L95
            goto L5d
        L95:
            if (r6 == 0) goto L9a
            r3.add(r6)
        L9a:
            r5 = r7
            goto L42
        L9c:
            java.lang.ArithmeticException r13 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened."
            r13.<init>(r0)
            throw r13
        La4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            java.lang.String r8 = "..."
            r9 = 0
            java.lang.String r5 = "\n"
            java.lang.String r7 = ""
            r4 = r0
            r6 = r7
            com.github.catvod.spider.merge.A0.sw.a(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "toString(...)"
            com.github.catvod.spider.merge.A0.ko.e(r0, r13)
            return r13
        Lbf:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.jw.y(java.lang.String):java.lang.String");
    }
}
