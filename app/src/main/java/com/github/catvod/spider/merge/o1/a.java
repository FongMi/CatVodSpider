package com.github.catvod.spider.merge.O1;

import java.util.Queue;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements com.github.catvod.spider.merge.N1.b {
    String b;
    com.github.catvod.spider.merge.P1.c c;
    Queue<c> d;

    public a(com.github.catvod.spider.merge.P1.c cVar, Queue<c> queue) {
        this.c = cVar;
        this.b = cVar.getName();
        this.d = queue;
    }

    private void g(Object[] objArr) {
        c cVar = new c();
        System.currentTimeMillis();
        cVar.a = this.c;
        Thread.currentThread().getName();
        cVar.b = objArr;
        this.d.add(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h(int r2, java.lang.String r3, java.lang.Object[] r4) {
        /*
            r1 = this;
            int r2 = r4.length
            if (r2 != 0) goto L4
            goto L10
        L4:
            int r2 = r4.length
            int r2 = r2 + (-1)
            r2 = r4[r2]
            boolean r3 = r2 instanceof java.lang.Throwable
            if (r3 == 0) goto L10
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L2d
            int r2 = r4.length
            if (r2 == 0) goto L25
            int r2 = r4.length
            int r2 = r2 + (-1)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            if (r2 <= 0) goto L21
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r3, r0, r2)
        L21:
            r1.g(r3)
            goto L30
        L25:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "non-sensical empty or null argument array"
            r2.<init>(r3)
            throw r2
        L2d:
            r1.g(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.O1.a.h(int, java.lang.String, java.lang.Object[]):void");
    }

    private void i(int i, String str, Object obj) {
        g(new Object[]{obj});
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void a(String str, Object obj) {
        i(1, str, obj);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void b(String str, Object obj) {
        i(2, str, obj);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void c(String str, Object obj, Object obj2) {
        if (!(obj2 instanceof Throwable)) {
            g(new Object[]{obj, obj2});
        } else {
            g(new Object[]{obj});
        }
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void d(String str, Object... objArr) {
        h(1, str, objArr);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void e(String str, Object obj) {
        i(5, str, obj);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void f(Object... objArr) {
        h(3, "Obtained uk: {}, shareid: {} from root of surl {}", objArr);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final String getName() {
        return this.b;
    }
}
