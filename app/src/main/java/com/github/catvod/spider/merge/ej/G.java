package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class G extends AbstractC1073t {
    public G(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.ej.AbstractC1073t
    protected final int b(com.github.catvod.spider.merge.Em.l lVar) {
        int i = 0;
        if (lVar.f0() == null) {
            return 0;
        }
        C1061g c1061gR = lVar.f0().R();
        for (int iU = lVar.U(); iU < c1061gR.size(); iU++) {
            if (c1061gR.get(iU).m0().equals(lVar.m0())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.ej.AbstractC1073t
    protected final String c() {
        return "nth-last-of-type";
    }
}
