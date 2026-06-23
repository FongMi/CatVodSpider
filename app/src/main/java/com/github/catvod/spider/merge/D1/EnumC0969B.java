package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class EnumC0969B {
    private static final /* synthetic */ EnumC0969B[] A;
    public static final C0997m b;
    public static final C1008s c;
    public static final C1010t d;
    public static final C1012u e;
    public static final C1014v f;
    public static final C1016w g;
    public static final C1018x h;
    public static final C1020y i;
    public static final C1022z j;
    public static final C0977c k;
    public static final C0979d l;
    public static final C0981e m;
    public static final C0983f n;
    public static final C0985g o;
    public static final C0987h p;
    public static final C0989i q;
    public static final C0991j r;
    public static final C0993k s;
    public static final C0995l t;
    public static final C0999n u;
    public static final C1001o v;
    public static final C1003p w;
    public static final C1005q x;
    public static final r y;
    private static final String z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.github.catvod.spider.merge.d1.r] */
    static {
        C0997m c0997m = new C0997m();
        b = c0997m;
        C1008s c1008s = new C1008s();
        c = c1008s;
        C1010t c1010t = new C1010t();
        d = c1010t;
        C1012u c1012u = new C1012u();
        e = c1012u;
        C1014v c1014v = new C1014v();
        f = c1014v;
        C1016w c1016w = new C1016w();
        g = c1016w;
        C1018x c1018x = new C1018x();
        h = c1018x;
        C1020y c1020y = new C1020y();
        i = c1020y;
        C1022z c1022z = new C1022z();
        j = c1022z;
        C0977c c0977c = new C0977c();
        k = c0977c;
        C0979d c0979d = new C0979d();
        l = c0979d;
        C0981e c0981e = new C0981e();
        m = c0981e;
        C0983f c0983f = new C0983f();
        n = c0983f;
        C0985g c0985g = new C0985g();
        o = c0985g;
        C0987h c0987h = new C0987h();
        p = c0987h;
        C0989i c0989i = new C0989i();
        q = c0989i;
        C0991j c0991j = new C0991j();
        r = c0991j;
        C0993k c0993k = new C0993k();
        s = c0993k;
        C0995l c0995l = new C0995l();
        t = c0995l;
        C0999n c0999n = new C0999n();
        u = c0999n;
        C1001o c1001o = new C1001o();
        v = c1001o;
        C1003p c1003p = new C1003p();
        w = c1003p;
        C1005q c1005q = new C1005q();
        x = c1005q;
        Object r23 = new EnumC0969B() { // from class: com.github.catvod.spider.merge.d1.r
            @Override // com.github.catvod.spider.merge.d1.EnumC0969B
            final boolean d(P p2, C0975b c0975b) {
                return true;
            }
        };
        y = r23;
        A = new EnumC0969B[]{c0997m, c1008s, c1010t, c1012u, c1014v, c1016w, c1018x, c1020y, c1022z, c0977c, c0979d, c0981e, c0983f, c0985g, c0987h, c0989i, c0991j, c0993k, c0995l, c0999n, c1001o, c1003p, c1005q, r23};
        z = String.valueOf((char) 0);
    }

    EnumC0969B(String str, int i2, C0997m c0997m) {
    }

    static boolean a(P p2) {
        if (p2.b()) {
            return C0906c.d(((I) p2).l());
        }
        return false;
    }

    static void b(N n2, C0975b c0975b) {
        c0975b.c.v(i1.f);
        c0975b.S();
        c0975b.s0(i);
        c0975b.H(n2);
    }

    public static EnumC0969B valueOf(String str) {
        return (EnumC0969B) Enum.valueOf(EnumC0969B.class, str);
    }

    public static EnumC0969B[] values() {
        return (EnumC0969B[]) A.clone();
    }

    abstract boolean d(P p2, C0975b c0975b);
}
