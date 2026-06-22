package com.github.catvod.spider.merge.n1;

import com.github.catvod.spider.merge.m1.AbstractC1315g;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1352c extends AbstractC1315g<C1350a, InterfaceC1351b> {
    public C1352c(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1309a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C1350a a(InterfaceC1351b interfaceC1351b) {
        C1350a c1350a = new C1350a(g(), interfaceC1351b.f(), interfaceC1351b.getName());
        try {
            interfaceC1351b.p();
        } catch (Exception e) {
            b(e);
        }
        try {
            interfaceC1351b.d();
        } catch (Exception e2) {
            b(e2);
        }
        try {
            c1350a.f(interfaceC1351b.s());
        } catch (Exception e3) {
            b(e3);
        }
        try {
            interfaceC1351b.getDescription();
        } catch (Exception e4) {
            b(e4);
        }
        try {
            interfaceC1351b.e();
        } catch (Exception e5) {
            b(e5);
        }
        return c1350a;
    }
}
