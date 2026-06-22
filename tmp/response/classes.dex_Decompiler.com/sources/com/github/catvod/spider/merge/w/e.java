package com.github.catvod.spider.merge.W;

import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class e {
    private C0074g a;
    private boolean b = false;
    private e c;

    private e(m mVar) {
        C0074g c0074g = new C0074g();
        this.a = c0074g;
        c0074g.add(mVar);
    }

    private e(C0074g c0074g) {
        C0074g c0074g2 = new C0074g();
        this.a = c0074g2;
        c0074g2.addAll(c0074g);
    }

    public static e b(m mVar) {
        return new e(mVar);
    }

    public static e c(C0074g c0074g) {
        return new e(c0074g);
    }

    public static e d(e eVar) {
        e eVar2 = new e(eVar.a);
        eVar2.c = eVar;
        return eVar2;
    }

    public final C0074g a() {
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

    public final void i(C0074g c0074g) {
        this.a = c0074g;
    }

    public final e j(e eVar) {
        this.c = eVar;
        return this;
    }

    public final m k() {
        if (this.a.size() == 1) {
            return this.a.e();
        }
        StringBuilder sbC = C0133t.c(oZP.d("161A0533093B014F142E02211017036105265502183309750107162F4C3A1B0A57240079010003200075484F"));
        sbC.append(this.a.size());
        throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
    }
}
