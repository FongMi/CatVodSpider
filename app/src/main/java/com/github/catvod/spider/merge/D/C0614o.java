package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0614o implements X, com.github.catvod.spider.merge.C.w {
    public static final C0614o a = new C0614o();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    @Override // com.github.catvod.spider.merge.C.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T c(com.github.catvod.spider.merge.B.b r5, java.lang.reflect.Type r6, java.lang.Object r7) {
        /*
            r4 = this;
            com.github.catvod.spider.merge.B.d r0 = r5.g
            int r1 = r0.p()     // Catch: java.lang.Exception -> L4c
            r2 = 6
            r3 = 16
            if (r1 != r2) goto Lf
            r0.o(r3)     // Catch: java.lang.Exception -> L4c
            goto L2b
        Lf:
            int r1 = r0.p()     // Catch: java.lang.Exception -> L4c
            r2 = 7
            if (r1 != r2) goto L1a
            r0.o(r3)     // Catch: java.lang.Exception -> L4c
            goto L2e
        L1a:
            int r1 = r0.p()     // Catch: java.lang.Exception -> L4c
            r2 = 2
            if (r1 != r2) goto L31
            int r5 = r0.c()     // Catch: java.lang.Exception -> L4c
            r0.o(r3)     // Catch: java.lang.Exception -> L4c
            r0 = 1
            if (r5 != r0) goto L2e
        L2b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L4c
            goto L3d
        L2e:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L4c
            goto L3d
        L31:
            r0 = 0
            java.lang.Object r5 = r5.o(r0)     // Catch: java.lang.Exception -> L4c
            if (r5 != 0) goto L39
            return r0
        L39:
            java.lang.Boolean r5 = com.github.catvod.spider.merge.H.A.i(r5)     // Catch: java.lang.Exception -> L4c
        L3d:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r7 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r6 != r7) goto L4b
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            boolean r5 = r5.booleanValue()
            r6.<init>(r5)
            return r6
        L4b:
            return r5
        L4c:
            r5 = move-exception
            com.github.catvod.spider.merge.y.d r6 = new com.github.catvod.spider.merge.y.d
            java.lang.String r0 = "parseBoolean error, field : "
            java.lang.String r7 = com.github.catvod.spider.merge.A.c.d(r0, r7)
            r6.<init>(r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.C0614o.c(com.github.catvod.spider.merge.B.b, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            h0Var.u(i0.WriteNullBooleanAsFalse);
        } else {
            h0Var.write(bool.booleanValue() ? "true" : "false");
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 6;
    }
}
