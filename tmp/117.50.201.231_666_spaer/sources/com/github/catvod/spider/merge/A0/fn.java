package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum fn extends le {
    public fn() {
        super("Text", 7);
    }

    @Override // com.github.catvod.spider.merge.A0.le
    public final boolean a(uz uzVar, zl zlVar) {
        if (uzVar.i()) {
            zlVar.bc((im) uzVar);
            return true;
        }
        if (uzVar.l()) {
            zlVar.as(this);
            zlVar.bm();
            zlVar.v = zlVar.w;
            return zlVar.bp(uzVar);
        }
        if (!uzVar.m()) {
            return true;
        }
        zlVar.bm();
        zlVar.v = zlVar.w;
        return true;
    }
}
