package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class F extends AbstractC0192t {
    public F(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.C0.e0.AbstractC0192t
    protected final int b(com.github.catvod.spider.merge.C0.c0.l lVar) {
        if (lVar.f0() == null) {
            return 0;
        }
        return lVar.f0().R().size() - lVar.U();
    }

    @Override // com.github.catvod.spider.merge.C0.e0.AbstractC0192t
    protected final String c() {
        return "nth-last-child";
    }
}
