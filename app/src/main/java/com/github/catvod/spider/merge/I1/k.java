package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.m1.AbstractC1315g;
import com.github.catvod.spider.merge.p1.C1369f;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k extends AbstractC1315g<i, j> {
    public k(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1315g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void d(j jVar) {
        try {
            c(a(jVar));
        } catch (C1369f unused) {
        } catch (Exception e) {
            b(e);
        }
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1309a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final i a(j jVar) throws C1369f {
        if (jVar.l()) {
            throw new C1369f("Found ad");
        }
        i iVar = new i(g(), jVar.f(), jVar.getName(), jVar.k());
        try {
            iVar.g(jVar.h());
        } catch (Exception e) {
            b(e);
        }
        try {
            iVar.i(jVar.c());
        } catch (Exception e2) {
            b(e2);
        }
        try {
            iVar.h(jVar.m());
        } catch (Exception e3) {
            b(e3);
        }
        try {
            jVar.r();
        } catch (com.github.catvod.spider.merge.p1.i e4) {
            b(e4);
        }
        try {
            iVar.l(jVar.g());
        } catch (Exception e5) {
            b(e5);
        }
        try {
            iVar.f(jVar.s());
        } catch (Exception e6) {
            b(e6);
        }
        try {
            iVar.j(jVar.a());
        } catch (Exception e7) {
            b(e7);
        }
        try {
            jVar.o();
        } catch (Exception e8) {
            b(e8);
        }
        try {
            iVar.k(jVar.b());
        } catch (Exception e9) {
            b(e9);
        }
        try {
            jVar.q();
        } catch (Exception e10) {
            b(e10);
        }
        try {
            jVar.j();
        } catch (Exception e11) {
            b(e11);
        }
        try {
            jVar.i();
        } catch (Exception e12) {
            b(e12);
        }
        return iVar;
    }
}
