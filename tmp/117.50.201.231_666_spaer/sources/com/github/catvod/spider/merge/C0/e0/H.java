package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class H extends AbstractC0192t {
    public H(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.C0.e0.AbstractC0192t
    protected final int b(com.github.catvod.spider.merge.C0.c0.l lVar) {
        if (lVar.f0() == null) {
            return 0;
        }
        int i = 0;
        for (com.github.catvod.spider.merge.C0.c0.l lVar2 : lVar.f0().R()) {
            if (lVar2.m0().equals(lVar.m0())) {
                i++;
            }
            if (lVar2 == lVar) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.AbstractC0192t
    protected final String c() {
        return "nth-of-type";
    }
}
