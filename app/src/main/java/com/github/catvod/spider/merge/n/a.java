package com.github.catvod.spider.merge.N;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class a implements p, com.github.catvod.spider.merge.W.a {
    public Object a;
    public final Object b;
    public Object c;

    public a(com.github.catvod.spider.merge.L.l lVar, e eVar, o oVar) {
        this.a = lVar;
        this.c = eVar;
        this.b = oVar;
    }

    @Override // com.github.catvod.spider.merge.N.p
    public void b(com.github.catvod.spider.merge.L.q qVar, int i) {
        if (qVar instanceof com.github.catvod.spider.merge.L.l) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) qVar;
            if (((o) this.b).a((com.github.catvod.spider.merge.L.l) this.a, lVar)) {
                ((e) this.c).add(lVar);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.W.a
    public void c(String str, Exception exc) {
        com.github.catvod.spider.merge.X.a aVar = new com.github.catvod.spider.merge.X.a();
        System.currentTimeMillis();
        aVar.a = (com.github.catvod.spider.merge.Y.c) this.c;
        Thread.currentThread().getName();
        ((Queue) this.b).add(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.github.catvod.spider.merge.L.l d(com.github.catvod.spider.merge.L.l r8, com.github.catvod.spider.merge.L.l r9) {
        /*
            r7 = this;
            r7.a = r8
            r8 = 0
            r7.c = r8
            r8 = 0
            r0 = r9
            r1 = 0
        L8:
            if (r0 == 0) goto L6e
            boolean r2 = r0 instanceof com.github.catvod.spider.merge.L.l
            r3 = 1
            r4 = 5
            if (r2 == 0) goto L25
            r2 = r0
            com.github.catvod.spider.merge.L.l r2 = (com.github.catvod.spider.merge.L.l) r2
            java.lang.Object r5 = r7.b
            com.github.catvod.spider.merge.N.o r5 = (com.github.catvod.spider.merge.N.o) r5
            java.lang.Object r6 = r7.a
            com.github.catvod.spider.merge.L.l r6 = (com.github.catvod.spider.merge.L.l) r6
            boolean r5 = r5.a(r6, r2)
            if (r5 == 0) goto L25
            r7.c = r2
            r2 = 5
            goto L26
        L25:
            r2 = 1
        L26:
            if (r2 != r4) goto L29
            goto L6e
        L29:
            if (r2 != r3) goto L3e
            int r4 = r0.f()
            if (r4 <= 0) goto L3e
            java.util.List r0 = r0.j()
            java.lang.Object r0 = r0.get(r8)
            com.github.catvod.spider.merge.L.q r0 = (com.github.catvod.spider.merge.L.q) r0
            int r1 = r1 + 1
            goto L8
        L3e:
            com.github.catvod.spider.merge.L.q r4 = r0.n()
            r5 = 4
            r6 = 2
            if (r4 != 0) goto L5a
            if (r1 > 0) goto L49
            goto L5a
        L49:
            if (r2 == r3) goto L4d
            if (r2 != r6) goto L4e
        L4d:
            r2 = 1
        L4e:
            com.github.catvod.spider.merge.L.q r4 = r0.a
            int r1 = r1 + (-1)
            if (r2 != r5) goto L57
            r0.u()
        L57:
            r0 = r4
            r2 = 1
            goto L3e
        L5a:
            if (r2 == r3) goto L60
            if (r2 != r6) goto L5f
            goto L60
        L5f:
            r3 = r2
        L60:
            if (r0 != r9) goto L63
            goto L6e
        L63:
            com.github.catvod.spider.merge.L.q r2 = r0.n()
            if (r3 != r5) goto L6c
            r0.u()
        L6c:
            r0 = r2
            goto L8
        L6e:
            java.lang.Object r8 = r7.c
            com.github.catvod.spider.merge.L.l r8 = (com.github.catvod.spider.merge.L.l) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N.a.d(com.github.catvod.spider.merge.L.l, com.github.catvod.spider.merge.L.l):com.github.catvod.spider.merge.L.l");
    }

    @Override // com.github.catvod.spider.merge.W.a
    public String getName() {
        return (String) this.a;
    }

    public a(o oVar) {
        this.a = null;
        this.c = null;
        this.b = oVar;
    }

    public a(com.github.catvod.spider.merge.Y.c cVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.c = cVar;
        this.a = cVar.a;
        this.b = linkedBlockingQueue;
    }

    @Override // com.github.catvod.spider.merge.N.p
    public void a(com.github.catvod.spider.merge.L.q qVar, int i) {
    }
}
