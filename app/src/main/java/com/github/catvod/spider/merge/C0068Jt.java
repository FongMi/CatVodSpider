package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.Jt */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0068Jt {

    /* renamed from: q */
    public static final C0068Jt f429q = new C0068Jt(false, false);

    /* renamed from: xC */
    public static final C0068Jt f430xC = new C0068Jt(true, true);

    /* renamed from: QU */
    private final boolean f431QU;

    /* renamed from: UJ */
    private final boolean f432UJ;

    public C0068Jt(boolean z, boolean z2) {
        this.f431QU = z;
        this.f432UJ = z2;
    }

    /* renamed from: QU */
    public String m230QU(String str) {
        String strTrim = str.trim();
        return !this.f431QU ? C0139qf.m699q(strTrim) : strTrim;
    }

    /* renamed from: UJ */
    public boolean m231UJ() {
        return this.f432UJ;
    }

    /* renamed from: q */
    public String m232q(String str) {
        String strTrim = str.trim();
        return !this.f432UJ ? C0139qf.m699q(strTrim) : strTrim;
    }

    /* renamed from: u */
    public boolean m233u() {
        return this.f431QU;
    }

    /* renamed from: xC */
    C0094Tz m234xC(C0094Tz c0094Tz) {
        if (c0094Tz != null && !this.f432UJ) {
            c0094Tz.m462p();
        }
        return c0094Tz;
    }
}
