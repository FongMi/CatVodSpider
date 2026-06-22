package com.github.catvod.spider.merge.s1;

import com.github.catvod.spider.merge.m1.AbstractC1315g;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c extends AbstractC1315g<a, b> {
    public c(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1309a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final a a(b bVar) {
        a aVar = new a(g(), bVar.f(), bVar.getName());
        try {
            bVar.c();
        } catch (Exception e) {
            b(e);
        }
        try {
            bVar.a();
        } catch (Exception e2) {
            b(e2);
        }
        try {
            bVar.b();
        } catch (Exception e3) {
            b(e3);
        }
        try {
            aVar.f(bVar.s());
        } catch (Exception e4) {
            b(e4);
        }
        try {
            bVar.d();
        } catch (Exception e5) {
            b(e5);
        }
        try {
            bVar.getDescription();
        } catch (Exception e6) {
            b(e6);
        }
        try {
            bVar.n();
        } catch (Exception e7) {
            b(e7);
        }
        return aVar;
    }
}
