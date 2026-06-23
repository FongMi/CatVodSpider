package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.a.C0529a;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e {
    private com.github.catvod.spider.merge.I.c a;
    private boolean b = false;
    private e c;

    private e(i iVar) {
        com.github.catvod.spider.merge.I.c cVar = new com.github.catvod.spider.merge.I.c();
        this.a = cVar;
        cVar.add(iVar);
    }

    private e(com.github.catvod.spider.merge.I.c cVar) {
        com.github.catvod.spider.merge.I.c cVar2 = new com.github.catvod.spider.merge.I.c();
        this.a = cVar2;
        cVar2.addAll(cVar);
    }

    public static e b(i iVar) {
        return new e(iVar);
    }

    public static e c(com.github.catvod.spider.merge.I.c cVar) {
        return new e(cVar);
    }

    public static e d(e eVar) {
        e eVar2 = new e(eVar.a);
        eVar2.c = eVar;
        return eVar2;
    }

    public final com.github.catvod.spider.merge.I.c a() {
        return this.a;
    }

    public final e e() {
        return this.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final void g() {
        this.b = false;
    }

    final void h() {
        this.b = true;
    }

    public final void i(com.github.catvod.spider.merge.I.c cVar) {
        this.a = cVar;
    }

    public final e j(e eVar) {
        this.c = eVar;
        return this;
    }

    public final i k() {
        if (this.a.size() == 1) {
            return this.a.b();
        }
        StringBuilder sbA = C0529a.a("current context is more than one el,total = ");
        sbA.append(this.a.size());
        throw new com.github.catvod.spider.merge.P.e(sbA.toString());
    }
}
