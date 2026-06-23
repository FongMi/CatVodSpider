package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class mn extends sd {
    public static final String a = String.valueOf('\"');
    public static final char[] b = {',', '\"', '\r', '\n'};

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    @Override // com.github.catvod.spider.merge.A0.sd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(java.lang.String r12, int r13, java.io.StringWriter r14) throws java.io.IOException {
        /*
            r11 = this;
            if (r13 != 0) goto La6
            r13 = 0
            char r0 = r12.charAt(r13)
            r1 = 34
            if (r0 != r1) goto L96
            int r0 = r12.length()
            r2 = 1
            int r0 = r0 - r2
            char r0 = r12.charAt(r0)
            if (r0 == r1) goto L19
            goto L96
        L19:
            int r0 = r12.length()
            int r0 = r0 - r2
            java.lang.CharSequence r0 = r12.subSequence(r2, r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.github.catvod.spider.merge.A0.fx.d(r0)
            if (r1 != 0) goto L86
            char[] r1 = com.github.catvod.spider.merge.A0.mn.b
            if (r1 != 0) goto L32
            r2 = 0
            goto L36
        L32:
            int r2 = java.lang.reflect.Array.getLength(r1)
        L36:
            if (r2 != 0) goto L39
            goto L86
        L39:
            int r2 = r0.length()
            int r3 = r1.length
            int r4 = r2 + (-1)
            int r5 = r3 + (-1)
            r6 = 0
        L43:
            if (r6 >= r2) goto L86
            char r7 = r0.charAt(r6)
            r8 = 0
        L4a:
            if (r8 >= r3) goto L83
            char r9 = r1[r8]
            if (r9 != r7) goto L80
            boolean r9 = java.lang.Character.isHighSurrogate(r7)
            if (r9 == 0) goto L67
            if (r8 != r5) goto L59
            goto L67
        L59:
            if (r6 >= r4) goto L80
            int r9 = r8 + 1
            char r9 = r1[r9]
            int r10 = r6 + 1
            char r10 = r0.charAt(r10)
            if (r9 != r10) goto L80
        L67:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.github.catvod.spider.merge.A0.mn.a
            r1.append(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = com.github.catvod.spider.merge.A0.fx.g(r0, r1, r2)
            r14.write(r0)
            goto L8d
        L80:
            int r8 = r8 + 1
            goto L4a
        L83:
            int r6 = r6 + 1
            goto L43
        L86:
            java.lang.String r0 = r12.toString()
            r14.write(r0)
        L8d:
            int r14 = r12.length()
            int r12 = java.lang.Character.codePointCount(r12, r13, r14)
            return r12
        L96:
            java.lang.String r0 = r12.toString()
            r14.write(r0)
            int r14 = r12.length()
            int r12 = java.lang.Character.codePointCount(r12, r13, r14)
            return r12
        La6:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "CsvUnescaper should never reach the [1] index"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.mn.c(java.lang.String, int, java.io.StringWriter):int");
    }
}
