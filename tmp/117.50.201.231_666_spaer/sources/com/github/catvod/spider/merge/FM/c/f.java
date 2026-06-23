package com.github.catvod.spider.merge.FM.C;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class f extends com.github.catvod.spider.merge.FM.F.b {
    private static final String b = String.valueOf('\"');
    private static final char[] c = {',', '\"', '\r', '\n'};

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    @Override // com.github.catvod.spider.merge.FM.F.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.CharSequence r13, int r14, java.io.Writer r15) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 != 0) goto L9c
            r14 = 0
            char r0 = r13.charAt(r14)
            r1 = 34
            if (r0 != r1) goto L8c
            int r0 = r13.length()
            r2 = 1
            int r0 = r0 - r2
            char r0 = r13.charAt(r0)
            if (r0 == r1) goto L19
            goto L8c
        L19:
            int r0 = r13.length()
            int r0 = r0 - r2
            java.lang.CharSequence r0 = r13.subSequence(r2, r0)
            java.lang.String r0 = r0.toString()
            char[] r1 = com.github.catvod.spider.merge.FM.C.f.c
            boolean r3 = com.github.catvod.spider.merge.FM.C.h.c(r0)
            if (r3 != 0) goto L73
            if (r1 != 0) goto L32
            r3 = 0
            goto L36
        L32:
            int r3 = java.lang.reflect.Array.getLength(r1)
        L36:
            if (r3 != 0) goto L3a
            r3 = 1
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r3 == 0) goto L3e
            goto L73
        L3e:
            int r3 = r0.length()
            int r4 = r1.length
            int r5 = r3 + (-1)
            int r6 = r4 + (-1)
            r7 = 0
        L48:
            if (r7 >= r3) goto L73
            char r8 = r0.charAt(r7)
            r9 = 0
        L4f:
            if (r9 >= r4) goto L70
            char r10 = r1[r9]
            if (r10 != r8) goto L6d
            boolean r10 = java.lang.Character.isHighSurrogate(r8)
            if (r10 == 0) goto L74
            if (r9 != r6) goto L5e
            goto L74
        L5e:
            if (r7 >= r5) goto L6d
            int r10 = r9 + 1
            char r10 = r1[r10]
            int r11 = r7 + 1
            char r11 = r0.charAt(r11)
            if (r10 != r11) goto L6d
            goto L74
        L6d:
            int r9 = r9 + 1
            goto L4f
        L70:
            int r7 = r7 + 1
            goto L48
        L73:
            r2 = 0
        L74:
            if (r2 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.github.catvod.spider.merge.FM.C.f.b
            r1.append(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = com.github.catvod.spider.merge.FM.C.h.h(r0, r1, r2)
            goto L90
        L8c:
            java.lang.String r0 = r13.toString()
        L90:
            r15.write(r0)
            int r15 = r13.length()
            int r13 = java.lang.Character.codePointCount(r13, r14, r15)
            return r13
        L9c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "CsvUnescaper should never reach the [1] index"
            r13.<init>(r14)
            goto La5
        La4:
            throw r13
        La5:
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.C.f.a(java.lang.CharSequence, int, java.io.Writer):int");
    }
}
