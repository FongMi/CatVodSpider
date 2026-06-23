package com.github.catvod.spider.merge.A0;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class by extends ed {
    public final rp a;

    public by(ad adVar, qh qhVar) {
        super(adVar, null, qhVar);
        this.a = new rp();
        String[] strArr = act.a;
        String[] strArr2 = ws.a;
        nf.h(ws.l(", ", Arrays.asList(strArr)));
    }

    @Override // com.github.catvod.spider.merge.A0.ed, com.github.catvod.spider.merge.A0.fw
    /* JADX INFO: renamed from: b */
    public final fw clone() {
        return (by) super.b();
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final void c(fw fwVar) {
        super.c(fwVar);
        this.a.remove(fwVar);
    }

    @Override // com.github.catvod.spider.merge.A0.ed, com.github.catvod.spider.merge.A0.fw
    public final Object clone() {
        return (by) super.b();
    }

    @Override // com.github.catvod.spider.merge.A0.ed
    /* JADX INFO: renamed from: d */
    public final ed b() {
        return (by) super.b();
    }
}
