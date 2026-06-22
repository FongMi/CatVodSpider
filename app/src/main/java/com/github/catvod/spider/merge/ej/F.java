package com.github.catvod.spider.merge.ej;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class F extends AbstractC1073t {
    public F(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.ej.AbstractC1073t
    protected final int b(com.github.catvod.spider.merge.Em.l lVar) {
        if (lVar.f0() == null) {
            return 0;
        }
        return lVar.f0().R().size() - lVar.U();
    }

    @Override // com.github.catvod.spider.merge.ej.AbstractC1073t
    protected final String c() {
        return "nth-last-child";
    }
}
