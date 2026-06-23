package com.github.catvod.spider.merge.FM.V;

import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.M.C0274g;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e {
    private C0274g a;
    private boolean b = false;
    private e c;

    private e(m mVar) {
        C0274g c0274g = new C0274g();
        this.a = c0274g;
        c0274g.add(mVar);
    }

    private e(C0274g c0274g) {
        C0274g c0274g2 = new C0274g();
        this.a = c0274g2;
        c0274g2.addAll(c0274g);
    }

    public static e b(m mVar) {
        return new e(mVar);
    }

    public static e c(C0274g c0274g) {
        return new e(c0274g);
    }

    public static e d(e eVar) {
        e eVar2 = new e(eVar.a);
        eVar2.c = eVar;
        return eVar2;
    }

    public final C0274g a() {
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

    public final void i(C0274g c0274g) {
        this.a = c0274g;
    }

    public final e j(e eVar) {
        this.c = eVar;
        return this;
    }

    public final m k() {
        if (this.a.size() == 1) {
            return this.a.e();
        }
        StringBuilder sbB = P.b("current context is more than one el,total = ");
        sbB.append(this.a.size());
        throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
    }
}
