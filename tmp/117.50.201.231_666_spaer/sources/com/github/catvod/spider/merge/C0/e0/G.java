package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class G extends AbstractC0192t {
    public G(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.C0.e0.AbstractC0192t
    protected final int b(com.github.catvod.spider.merge.C0.c0.l lVar) {
        int i = 0;
        if (lVar.f0() == null) {
            return 0;
        }
        C0180g c0180gR = lVar.f0().R();
        int iU = lVar.U();
        while (true) {
            int i2 = i;
            if (iU >= c0180gR.size()) {
                return i2;
            }
            i = c0180gR.get(iU).m0().equals(lVar.m0()) ? i2 + 1 : i2;
            iU++;
        }
    }

    @Override // com.github.catvod.spider.merge.C0.e0.AbstractC0192t
    protected final String c() {
        return "nth-last-of-type";
    }
}
