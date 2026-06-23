package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class B {
    public static final C0862m a;
    public static final C0873s b;
    public static final C0875t c;
    public static final C0877u d;
    public static final C0879v e;
    public static final C0881w f;
    public static final C0883x g;
    public static final C0885y h;
    public static final C0887z i;
    public static final C0842c j;
    public static final C0844d k;
    public static final C0846e l;
    public static final C0848f m;
    public static final C0850g n;
    public static final C0852h o;
    public static final C0854i p;
    public static final C0856j q;
    public static final C0858k r;
    public static final C0860l s;
    public static final C0864n t;
    public static final C0866o u;
    public static final C0868p v;
    public static final C0870q w;
    public static final r x;
    private static final String y;
    private static final /* synthetic */ B[] z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.github.catvod.spider.merge.Mp.r] */
    static {
        C0862m c0862m = new C0862m();
        a = c0862m;
        C0873s c0873s = new C0873s();
        b = c0873s;
        C0875t c0875t = new C0875t();
        c = c0875t;
        C0877u c0877u = new C0877u();
        d = c0877u;
        C0879v c0879v = new C0879v();
        e = c0879v;
        C0881w c0881w = new C0881w();
        f = c0881w;
        C0883x c0883x = new C0883x();
        g = c0883x;
        C0885y c0885y = new C0885y();
        h = c0885y;
        C0887z c0887z = new C0887z();
        i = c0887z;
        C0842c c0842c = new C0842c();
        j = c0842c;
        C0844d c0844d = new C0844d();
        k = c0844d;
        C0846e c0846e = new C0846e();
        l = c0846e;
        C0848f c0848f = new C0848f();
        m = c0848f;
        C0850g c0850g = new C0850g();
        n = c0850g;
        C0852h c0852h = new C0852h();
        o = c0852h;
        C0854i c0854i = new C0854i();
        p = c0854i;
        C0856j c0856j = new C0856j();
        q = c0856j;
        C0858k c0858k = new C0858k();
        r = c0858k;
        C0860l c0860l = new C0860l();
        s = c0860l;
        C0864n c0864n = new C0864n();
        t = c0864n;
        C0866o c0866o = new C0866o();
        u = c0866o;
        C0868p c0868p = new C0868p();
        v = c0868p;
        C0870q c0870q = new C0870q();
        w = c0870q;
        Object r23 = new B() { // from class: com.github.catvod.spider.merge.Mp.r
            {
                ZrJ.d("3F2C39282122170024233C201737");
            }

            @Override // com.github.catvod.spider.merge.Mp.B
            final boolean d(Q q2, C0840b c0840b) {
                return true;
            }
        };
        x = r23;
        z = new B[]{c0862m, c0873s, c0875t, c0877u, c0879v, c0881w, c0883x, c0885y, c0887z, c0842c, c0844d, c0846e, c0848f, c0850g, c0852h, c0854i, c0856j, c0858k, c0860l, c0864n, c0866o, c0868p, c0870q, r23};
        y = String.valueOf((char) 0);
    }

    B(String str, int i2, C0862m c0862m) {
    }

    static boolean a(Q q2) {
        if (q2.b()) {
            return com.github.catvod.spider.merge.XU.n.d(((I) q2).l());
        }
        return false;
    }

    static void b(N n2, C0840b c0840b) {
        c0840b.c.v(j1.e);
        c0840b.U();
        c0840b.u0(h);
        c0840b.J(n2);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) z.clone();
    }

    abstract boolean d(Q q2, C0840b c0840b);
}
