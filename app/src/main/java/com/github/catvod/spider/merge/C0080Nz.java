package com.github.catvod.spider.merge;

import java.io.StringReader;

/* renamed from: com.github.catvod.spider.merge.Nz */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0080Nz {

    /* renamed from: QU */
    private C0068Jt f471QU;

    /* renamed from: q */
    private AbstractC0128lc f472q;

    /* renamed from: xC */
    private C0104Yh f473xC = C0104Yh.m478xC();

    public C0080Nz(AbstractC0128lc abstractC0128lc) {
        this.f472q = abstractC0128lc;
        this.f471QU = abstractC0128lc.mo409xC();
    }

    /* renamed from: QU */
    public static C0082OO m310QU(String str, String str2) {
        C0084Ot c0084Ot = new C0084Ot();
        return c0084Ot.m677u(new StringReader(str), str2, new C0080Nz(c0084Ot));
    }

    /* renamed from: xC */
    public static C0080Nz m311xC() {
        return new C0080Nz(new C0084Ot());
    }

    /* renamed from: UJ */
    public C0068Jt m312UJ() {
        return this.f471QU;
    }

    /* renamed from: q */
    public C0104Yh m313q() {
        return this.f473xC;
    }
}
