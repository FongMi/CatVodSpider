package com.github.catvod.spider.merge.V;

import com.github.catvod.spider.merge.y.InterfaceC0250E;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.V.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0096d extends com.github.catvod.spider.merge.y.y {
    public InterfaceC0250E g;

    public C0096d(com.github.catvod.spider.merge.y.y yVar, int i) {
        super(yVar, i);
    }

    @Override // com.github.catvod.spider.merge.y.C0249D, com.github.catvod.spider.merge.C.b
    public final <T> T b(com.github.catvod.spider.merge.C.d<? extends T> dVar) {
        return dVar instanceof E ? (T) ((E) dVar).k(this) : dVar.l(this);
    }

    @Override // com.github.catvod.spider.merge.y.C0249D
    public final int e() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.y.y
    public final void h(com.github.catvod.spider.merge.C.c cVar) {
        if (cVar instanceof InterfaceC0094b) {
            ((InterfaceC0094b) cVar).w();
        }
    }

    @Override // com.github.catvod.spider.merge.y.y
    public final void i(com.github.catvod.spider.merge.C.c cVar) {
        if (cVar instanceof InterfaceC0094b) {
            ((InterfaceC0094b) cVar).H();
        }
    }
}
