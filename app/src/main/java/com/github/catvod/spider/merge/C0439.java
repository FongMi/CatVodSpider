package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ૹ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0439 extends C0406 {

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private final C0445 f1073;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private final boolean f1074;

    public C0439(AbstractC0419 abstractC0419, int i, AbstractC0552 abstractC0552) {
        super(abstractC0419, i, abstractC0552, AbstractC0561.f1249);
        this.f1074 = false;
        this.f1073 = null;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static boolean m1637(C0439 c0439, AbstractC0419 abstractC0419) {
        return c0439.f1074 || ((abstractC0419 instanceof AbstractC0429) && ((AbstractC0429) abstractC0419).f1059);
    }

    @Override // com.github.catvod.spider.merge.C0406
    public int hashCode() {
        return C0120.m406(C0120.m411(C0120.m410(C0120.m411(C0120.m411(C0120.m410(C0120.m410(C0120.m409(7), this.f1004.f1042), this.f1005), this.f1006), this.f1008), this.f1074 ? 1 : 0), this.f1073), 6);
    }

    @Override // com.github.catvod.spider.merge.C0406
    /* JADX INFO: renamed from: Ϳ */
    public boolean mo1551(C0406 c0406) {
        if (this == c0406) {
            return true;
        }
        if (!(c0406 instanceof C0439)) {
            return false;
        }
        C0439 c0439 = (C0439) c0406;
        if (this.f1074 == c0439.f1074 && C0121.f308.mo412(this.f1073, c0439.f1073)) {
            return super.mo1551(c0406);
        }
        return false;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public final C0445 m1638() {
        return this.f1073;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public final boolean m1639() {
        return this.f1074;
    }

    public C0439(C0439 c0439, AbstractC0419 abstractC0419) {
        super(c0439, abstractC0419, c0439.f1006, c0439.f1008);
        this.f1073 = c0439.f1073;
        this.f1074 = m1637(c0439, abstractC0419);
    }

    public C0439(C0439 c0439, AbstractC0419 abstractC0419, C0445 c0445) {
        super(c0439, abstractC0419, c0439.f1006, c0439.f1008);
        this.f1073 = c0445;
        this.f1074 = m1637(c0439, abstractC0419);
    }

    public C0439(C0439 c0439, AbstractC0419 abstractC0419, AbstractC0552 abstractC0552) {
        super(c0439, abstractC0419, abstractC0552, c0439.f1008);
        this.f1073 = c0439.f1073;
        this.f1074 = m1637(c0439, abstractC0419);
    }
}
