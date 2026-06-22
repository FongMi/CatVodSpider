package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.m1.EnumC1316h;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.F1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0628d implements Serializable {
    private static final C0628d[] v;
    private final EnumC1316h b;
    public final int c;
    public final int d;

    @Deprecated
    public int e;
    private int f;

    @Deprecated
    public String g;

    @Deprecated
    public int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private String p;
    private String q;
    private String r;
    private String s;
    private int t;
    private Locale u;

    static {
        EnumC1316h enumC1316h = EnumC1316h.v3GPP;
        EnumC1316h enumC1316h2 = EnumC1316h.MPEG_4;
        EnumC1316h enumC1316h3 = EnumC1316h.WEBM;
        EnumC1316h enumC1316h4 = EnumC1316h.WEBMA;
        EnumC1316h enumC1316h5 = EnumC1316h.M4A;
        EnumC1316h enumC1316h6 = EnumC1316h.WEBMA_OPUS;
        v = new C0628d[]{new C0628d(17, 2, enumC1316h, "144p"), new C0628d(36, 2, enumC1316h, "240p"), new C0628d(18, 2, enumC1316h2, "360p"), new C0628d(34, 2, enumC1316h2, "360p"), new C0628d(35, 2, enumC1316h2, "480p"), new C0628d(59, 2, enumC1316h2, "480p"), new C0628d(78, 2, enumC1316h2, "480p"), new C0628d(22, 2, enumC1316h2, "720p"), new C0628d(37, 2, enumC1316h2, "1080p"), new C0628d(38, 2, enumC1316h2, "1080p"), new C0628d(43, 2, enumC1316h3, "360p"), new C0628d(44, 2, enumC1316h3, "480p"), new C0628d(45, 2, enumC1316h3, "720p"), new C0628d(46, 2, enumC1316h3, "1080p"), new C0628d(171, enumC1316h4, 128), new C0628d(172, enumC1316h4, 256), new C0628d(599, enumC1316h5, 32), new C0628d(139, enumC1316h5, 48), new C0628d(140, enumC1316h5, 128), new C0628d(141, enumC1316h5, 256), new C0628d(600, enumC1316h6, 35), new C0628d(249, enumC1316h6, 50), new C0628d(250, enumC1316h6, 70), new C0628d(251, enumC1316h6, 160), new C0628d(160, 3, enumC1316h2, "144p"), new C0628d(394, 3, enumC1316h2, "144p"), new C0628d(133, 3, enumC1316h2, "240p"), new C0628d(395, 3, enumC1316h2, "240p"), new C0628d(134, 3, enumC1316h2, "360p"), new C0628d(396, 3, enumC1316h2, "360p"), new C0628d(135, 3, enumC1316h2, "480p"), new C0628d(212, 3, enumC1316h2, "480p"), new C0628d(397, 3, enumC1316h2, "480p"), new C0628d(136, 3, enumC1316h2, "720p"), new C0628d(398, 3, enumC1316h2, "720p"), new C0628d(298, enumC1316h2, "720p60"), new C0628d(137, 3, enumC1316h2, "1080p"), new C0628d(399, 3, enumC1316h2, "1080p"), new C0628d(299, enumC1316h2, "1080p60"), new C0628d(400, 3, enumC1316h2, "1440p"), new C0628d(266, 3, enumC1316h2, "2160p"), new C0628d(401, 3, enumC1316h2, "2160p"), new C0628d(278, 3, enumC1316h3, "144p"), new C0628d(242, 3, enumC1316h3, "240p"), new C0628d(243, 3, enumC1316h3, "360p"), new C0628d(244, 3, enumC1316h3, "480p"), new C0628d(245, 3, enumC1316h3, "480p"), new C0628d(246, 3, enumC1316h3, "480p"), new C0628d(247, 3, enumC1316h3, "720p"), new C0628d(248, 3, enumC1316h3, "1080p"), new C0628d(271, 3, enumC1316h3, "1440p"), new C0628d(272, 3, enumC1316h3, "2160p"), new C0628d(302, enumC1316h3, "720p60"), new C0628d(303, enumC1316h3, "1080p60"), new C0628d(308, enumC1316h3, "1440p60"), new C0628d(313, 3, enumC1316h3, "2160p"), new C0628d(315, enumC1316h3, "2160p60")};
    }

    public C0628d(int i, int i2, EnumC1316h enumC1316h, String str) {
        this.e = -1;
        this.f = -1;
        this.c = i;
        this.d = i2;
        this.b = enumC1316h;
        this.g = str;
        this.h = 30;
    }

    public C0628d(int i, EnumC1316h enumC1316h, int i2) {
        this.f = -1;
        this.h = -1;
        this.c = i;
        this.d = 1;
        this.b = enumC1316h;
        this.e = i2;
    }

    public C0628d(int i, EnumC1316h enumC1316h, String str) {
        this.e = -1;
        this.f = -1;
        this.c = i;
        this.d = 3;
        this.b = enumC1316h;
        this.g = str;
        this.h = 60;
    }

    public C0628d(C0628d c0628d) {
        this.e = -1;
        this.f = -1;
        this.h = -1;
        this.b = c0628d.b;
        this.c = c0628d.c;
        this.d = c0628d.d;
        this.e = c0628d.e;
        this.f = c0628d.f;
        this.g = c0628d.g;
        this.h = c0628d.h;
        this.i = c0628d.i;
        this.j = c0628d.j;
        this.k = c0628d.k;
        this.l = c0628d.l;
        this.m = c0628d.m;
        this.n = c0628d.n;
        this.o = c0628d.o;
        this.p = c0628d.p;
        this.q = c0628d.q;
        this.r = c0628d.r;
        this.s = c0628d.s;
        this.t = c0628d.t;
        this.u = c0628d.u;
    }

    public static C0628d l(int i) throws com.github.catvod.spider.merge.p1.i {
        C0628d[] c0628dArr = v;
        for (int i2 = 0; i2 < 57; i2++) {
            C0628d c0628d = c0628dArr[i2];
            if (i == c0628d.c) {
                return new C0628d(c0628d);
            }
        }
        throw new com.github.catvod.spider.merge.p1.i("itag " + i + " is not supported");
    }

    public final void A(String str) {
        this.p = str;
    }

    public final void B(int i) {
        if (i <= 0) {
            i = -1;
        }
        this.f = i;
    }

    public final void C(int i) {
        this.j = i;
    }

    public final Locale a() {
        return this.u;
    }

    public final String b() {
        return this.r;
    }

    public final String c() {
        return this.s;
    }

    public final int d() {
        return this.t;
    }

    public final int e() {
        return this.i;
    }

    public final String f() {
        return this.q;
    }

    public final int g() {
        return this.k;
    }

    public final int h() {
        return this.o;
    }

    public final int i() {
        return this.n;
    }

    public final int j() {
        return this.m;
    }

    public final int k() {
        return this.l;
    }

    public final EnumC1316h m() {
        return this.b;
    }

    public final int n() {
        return this.f;
    }

    public final int o() {
        return this.j;
    }

    public final void p(Locale locale) {
        this.u = locale;
    }

    public final void q(String str) {
        this.r = str;
    }

    public final void r(String str) {
        this.s = str;
    }

    public final void s(int i) {
        this.t = i;
    }

    public final void t(int i) {
        this.i = i;
    }

    public final void u(String str) {
        this.q = str;
    }

    public final void v(int i) {
        this.k = i;
    }

    public final void w(int i) {
        this.o = i;
    }

    public final void x(int i) {
        this.n = i;
    }

    public final void y(int i) {
        this.m = i;
    }

    public final void z(int i) {
        this.l = i;
    }
}
