package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0166w extends A {
    C0166w() {
        super("InBody", 6, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0291, code lost:
    
        r18.b0(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0b89, code lost:
    
        if (com.github.catvod.spider.merge.C0.b0.b.b(r5, com.github.catvod.spider.merge.C0.d0.C0172z.q) != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015a, code lost:
    
        if (r18.d("body") != false) goto L88;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.github.catvod.spider.merge.C0.d0.b, com.github.catvod.spider.merge.C0.d0.i1] */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v112, types: [com.github.catvod.spider.merge.C0.c0.l] */
    /* JADX WARN: Type inference failed for: r2v129, types: [com.github.catvod.spider.merge.C0.c0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v152 */
    /* JADX WARN: Type inference failed for: r2v153 */
    /* JADX WARN: Type inference failed for: r3v207 */
    /* JADX WARN: Type inference failed for: r3v208, types: [com.github.catvod.spider.merge.C0.c0.l] */
    /* JADX WARN: Type inference failed for: r3v218 */
    /* JADX WARN: Type inference failed for: r3v221, types: [com.github.catvod.spider.merge.C0.c0.l] */
    /* JADX WARN: Type inference failed for: r3v241 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.github.catvod.spider.merge.C0.c0.l, com.github.catvod.spider.merge.C0.c0.r] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r6v20, types: [com.github.catvod.spider.merge.C0.c0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.github.catvod.spider.merge.C0.d0.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean d(com.github.catvod.spider.merge.C0.d0.O r17, com.github.catvod.spider.merge.C0.d0.C0125b r18) {
        /*
            Method dump skipped, instruction units count: 3282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.d0.C0166w.d(com.github.catvod.spider.merge.C0.d0.O, com.github.catvod.spider.merge.C0.d0.b):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean e(com.github.catvod.spider.merge.C0.d0.O r6, com.github.catvod.spider.merge.C0.d0.C0125b r7) {
        /*
            r5 = this;
            r6.getClass()
            com.github.catvod.spider.merge.C0.d0.L r6 = (com.github.catvod.spider.merge.C0.d0.L) r6
            java.lang.String r2 = r6.c
            java.util.ArrayList<com.github.catvod.spider.merge.C0.c0.l> r3 = r7.e
            int r0 = r3.size()
            int r0 = r0 + (-1)
            r1 = r0
        L10:
            if (r1 < 0) goto L39
            java.lang.Object r0 = r3.get(r1)
            com.github.catvod.spider.merge.C0.c0.l r0 = (com.github.catvod.spider.merge.C0.c0.l) r0
            java.lang.String r4 = r0.d0()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L3b
            r7.q(r2)
            com.github.catvod.spider.merge.C0.c0.l r0 = r7.a()
            java.lang.String r0 = r0.d0()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L36
            r7.n(r5)
        L36:
            r7.V(r2)
        L39:
            r0 = 1
        L3a:
            return r0
        L3b:
            boolean r0 = r7.O(r0)
            if (r0 == 0) goto L46
            r7.n(r5)
            r0 = 0
            goto L3a
        L46:
            int r0 = r1 + (-1)
            r1 = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.d0.C0166w.e(com.github.catvod.spider.merge.C0.d0.O, com.github.catvod.spider.merge.C0.d0.b):boolean");
    }
}
