package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class em extends ed {
    public ut a;
    public xa al;
    public int am;

    public em() {
        this("http://www.w3.org/1999/xhtml", "");
    }

    public em(String str, String str2) {
        super(ad.m("#root", str, vz.a), str2, null);
        ut utVar = new ut();
        utVar.a = ff.base;
        utVar.b = abz.a;
        utVar.c = true;
        utVar.d = 1;
        utVar.e = 30;
        utVar.f = 1;
        this.a = utVar;
        this.am = 1;
        this.al = new xa(new zl());
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final String an() {
        return ae();
    }

    @Override // com.github.catvod.spider.merge.A0.ed, com.github.catvod.spider.merge.A0.fw
    /* JADX INFO: renamed from: b */
    public final fw clone() {
        em emVar = (em) super.b();
        emVar.a = this.a.clone();
        return emVar;
    }

    @Override // com.github.catvod.spider.merge.A0.ed, com.github.catvod.spider.merge.A0.fw
    public final Object clone() {
        em emVar = (em) super.b();
        emVar.a = this.a.clone();
        return emVar;
    }

    @Override // com.github.catvod.spider.merge.A0.ed
    /* JADX INFO: renamed from: d */
    public final ed b() {
        em emVar = (em) super.b();
        emVar.a = this.a.clone();
        return emVar;
    }

    @Override // com.github.catvod.spider.merge.A0.ed, com.github.catvod.spider.merge.A0.fw
    public final String s() {
        return "#document";
    }
}
