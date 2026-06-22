package com.github.catvod.spider.merge.Wb;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e {
    private C0724g a;
    private boolean b = false;
    private e c;

    private e(C0724g c0724g) {
        C0724g c0724g2 = new C0724g();
        this.a = c0724g2;
        c0724g2.addAll(c0724g);
    }

    private e(m mVar) {
        C0724g c0724g = new C0724g();
        this.a = c0724g;
        c0724g.add(mVar);
    }

    public static e b(m mVar) {
        return new e(mVar);
    }

    public static e c(C0724g c0724g) {
        return new e(c0724g);
    }

    public static e d(e eVar) {
        e eVar2 = new e(eVar.a);
        eVar2.c = eVar;
        return eVar2;
    }

    public final C0724g a() {
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

    public final void i(C0724g c0724g) {
        this.a = c0724g;
    }

    public final e j(e eVar) {
        this.c = eVar;
        return this;
    }

    public final m k() {
        if (this.a.size() == 1) {
            return this.a.e();
        }
        StringBuilder sbB = C0925t.b(ZrJ.d("1A36393F2D2B0D63282226311C3B3F6D2136592E243F2D650D2B2A23682A17266B2824690D2C3F2C24654463"));
        sbB.append(this.a.size());
        throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
    }
}
