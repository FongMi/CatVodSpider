package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޔ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0306 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0304 f825;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public C0301 f826;

    public C0306(C0304 c0304, C0301 c0301) {
        this.f825 = c0304;
        this.f826 = c0301;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0309 m1182() {
        return m1183(false);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public C0309 m1183(boolean z) {
        C0309 c0309M1188 = C0308.m1188(this.f825.f820, this.f826.m1171());
        c0309M1188.m1193(C0308.m1188(this.f825.f821, this.f826.m1171()).m1190());
        if (z) {
            c0309M1188.m1192(0, new byte[]{0, 4});
        }
        return c0309M1188;
    }
}
