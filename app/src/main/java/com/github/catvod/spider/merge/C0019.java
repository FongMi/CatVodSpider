package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ŕ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0019 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private C0455 f171;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private boolean f172 = false;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private C0019 f173;

    private C0019(C0455 c0455) {
        C0455 c04552 = new C0455();
        this.f171 = c04552;
        c04552.addAll(c0455);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static C0019 m217(C0011 c0011) {
        return new C0019(c0011);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static C0019 m218(C0455 c0455) {
        return new C0019(c0455);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static C0019 m219(C0019 c0019) {
        return new C0019(c0019.m220()).m226(c0019);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0455 m220() {
        return this.f171;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public C0019 m221() {
        return this.f173;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public boolean m222() {
        return this.f172;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public void m223() {
        this.f172 = false;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    void m224() {
        this.f172 = true;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public void m225(C0455 c0455) {
        this.f171 = c0455;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public C0019 m226(C0019 c0019) {
        this.f173 = c0019;
        return this;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public C0011 m227() {
        if (this.f171.size() == 1) {
            return this.f171.m1688();
        }
        throw new C0249(SOY.d("1927230411190E7232191A031F2A25561D045A3F3E0411570E3A3018541814377113185B0E3D251718574772") + this.f171.size());
    }

    private C0019(C0011 c0011) {
        C0455 c0455 = new C0455();
        this.f171 = c0455;
        c0455.add(c0011);
    }
}
