package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1018x extends EnumC0969B {
    C1018x() {
        super("InBody", 6, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a1, code lost:
    
        if (r44.f("body") != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x09b5, code lost:
    
        if (r44.K(r2).c("type").equalsIgnoreCase("hidden") == false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x0d57, code lost:
    
        if (com.github.catvod.spider.merge.b1.C0906c.c(r1, com.github.catvod.spider.merge.d1.C0968A.o) != false) goto L550;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0be8 A[PHI: r0 r13
      0x0be8: PHI (r0v26 java.lang.String) = (r0v20 java.lang.String), (r0v27 java.lang.String) binds: [B:632:0x0be6, B:606:0x0b62] A[DONT_GENERATE, DONT_INLINE]
      0x0be8: PHI (r13v14 com.github.catvod.spider.merge.d1.N) = (r13v10 com.github.catvod.spider.merge.d1.N), (r13v15 com.github.catvod.spider.merge.d1.N) binds: [B:632:0x0be6, B:606:0x0b62] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:722:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.github.catvod.spider.merge.c1.m] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.github.catvod.spider.merge.c1.m, com.github.catvod.spider.merge.c1.s] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.github.catvod.spider.merge.c1.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r44v0, types: [com.github.catvod.spider.merge.d1.b, com.github.catvod.spider.merge.d1.j1] */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.github.catvod.spider.merge.c1.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.github.catvod.spider.merge.c1.m] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean d(com.github.catvod.spider.merge.d1.P r43, com.github.catvod.spider.merge.d1.C0975b r44) {
        /*
            Method dump skipped, instruction units count: 3850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d1.C1018x.d(com.github.catvod.spider.merge.d1.P, com.github.catvod.spider.merge.d1.b):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean e(com.github.catvod.spider.merge.d1.P r7, com.github.catvod.spider.merge.d1.C0975b r8) {
        /*
            r6 = this;
            r7.getClass()
            com.github.catvod.spider.merge.d1.M r7 = (com.github.catvod.spider.merge.d1.M) r7
            java.lang.String r7 = r7.e
            java.util.ArrayList<com.github.catvod.spider.merge.c1.m> r0 = r8.e
            com.github.catvod.spider.merge.c1.m r1 = r8.y(r7)
            r2 = 0
            if (r1 != 0) goto L14
            r8.r(r6)
            return r2
        L14:
            int r1 = r0.size()
            r3 = 1
            int r1 = r1 - r3
        L1a:
            if (r1 < 0) goto L49
            java.lang.Object r4 = r0.get(r1)
            com.github.catvod.spider.merge.c1.m r4 = (com.github.catvod.spider.merge.c1.m) r4
            java.lang.String r5 = r4.f0()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L3c
            r8.u(r7)
            boolean r0 = r8.b(r7)
            if (r0 != 0) goto L38
            r8.r(r6)
        L38:
            r8.a0(r7)
            goto L49
        L3c:
            boolean r4 = r8.R(r4)
            if (r4 == 0) goto L46
            r8.r(r6)
            return r2
        L46:
            int r1 = r1 + (-1)
            goto L1a
        L49:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d1.C1018x.e(com.github.catvod.spider.merge.d1.P, com.github.catvod.spider.merge.d1.b):boolean");
    }
}
