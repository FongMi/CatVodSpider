package com.github.catvod.spider.merge.FM.U;

import com.github.catvod.spider.merge.FM.x.InterfaceC0427E;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class o extends com.github.catvod.spider.merge.FM.x.y {
    public InterfaceC0427E g;

    public o(com.github.catvod.spider.merge.FM.x.y yVar, int i) {
        super(yVar, i);
    }

    @Override // com.github.catvod.spider.merge.FM.x.C0426D, com.github.catvod.spider.merge.FM.B.b
    public final <T> T b(com.github.catvod.spider.merge.FM.B.d<? extends T> dVar) {
        return dVar instanceof E ? (T) ((E) dVar).i(this) : dVar.g(this);
    }

    @Override // com.github.catvod.spider.merge.FM.x.C0426D
    public final int e() {
        return 20;
    }

    @Override // com.github.catvod.spider.merge.FM.x.y
    public final void h(com.github.catvod.spider.merge.FM.B.c cVar) {
        if (cVar instanceof InterfaceC0294b) {
            ((InterfaceC0294b) cVar).p();
        }
    }

    @Override // com.github.catvod.spider.merge.FM.x.y
    public final void i(com.github.catvod.spider.merge.FM.B.c cVar) {
        if (cVar instanceof InterfaceC0294b) {
            ((InterfaceC0294b) cVar).r();
        }
    }

    public final o m() {
        return (o) j(o.class);
    }
}
