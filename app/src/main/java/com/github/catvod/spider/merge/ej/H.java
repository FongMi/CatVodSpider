package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class H extends AbstractC1073t {
    public H(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.ej.AbstractC1073t
    protected final int b(com.github.catvod.spider.merge.Em.l lVar) {
        int i = 0;
        if (lVar.f0() == null) {
            return 0;
        }
        for (com.github.catvod.spider.merge.Em.l lVar2 : lVar.f0().R()) {
            if (lVar2.m0().equals(lVar.m0())) {
                i++;
            }
            if (lVar2 == lVar) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.ej.AbstractC1073t
    protected final String c() {
        return "nth-of-type";
    }
}
