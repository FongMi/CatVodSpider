package com.github.catvod.spider.merge.V;

import com.github.catvod.spider.merge.y.InterfaceC0250E;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class o extends com.github.catvod.spider.merge.y.y {
    public InterfaceC0250E g;

    public o(com.github.catvod.spider.merge.y.y yVar, int i) {
        super(yVar, i);
    }

    @Override // com.github.catvod.spider.merge.y.C0249D, com.github.catvod.spider.merge.C.b
    public final <T> T b(com.github.catvod.spider.merge.C.d<? extends T> dVar) {
        return dVar instanceof E ? (T) ((E) dVar).p(this) : dVar.l(this);
    }

    @Override // com.github.catvod.spider.merge.y.C0249D
    public final int e() {
        return 20;
    }

    @Override // com.github.catvod.spider.merge.y.y
    public final void h(com.github.catvod.spider.merge.C.c cVar) {
        if (cVar instanceof InterfaceC0094b) {
            ((InterfaceC0094b) cVar).q();
        }
    }

    @Override // com.github.catvod.spider.merge.y.y
    public final void i(com.github.catvod.spider.merge.C.c cVar) {
        if (cVar instanceof InterfaceC0094b) {
            ((InterfaceC0094b) cVar).s();
        }
    }

    public final o m() {
        return (o) j(o.class);
    }
}
