package com.github.catvod.spider.merge.M;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class B {
    public static final com.github.catvod.spider.merge.M.C0054m a;
    public static final com.github.catvod.spider.merge.M.C0065s b;
    public static final com.github.catvod.spider.merge.M.C0067t c;
    public static final com.github.catvod.spider.merge.M.C0069u d;
    public static final com.github.catvod.spider.merge.M.C0071v e;
    public static final com.github.catvod.spider.merge.M.C0073w f;
    public static final com.github.catvod.spider.merge.M.C0075x g;
    public static final com.github.catvod.spider.merge.M.C0077y h;
    public static final com.github.catvod.spider.merge.M.C0079z i;
    public static final C0034c j;
    public static final C0036d k;
    public static final C0038e l;
    public static final C0040f m;
    public static final C0042g n;
    public static final C0044h o;
    public static final C0046i p;
    public static final C0048j q;
    public static final C0050k r;
    public static final C0052l s;
    public static final C0056n t;
    public static final C0058o u;
    public static final C0060p v;
    public static final C0062q w;
    public static final String x;
    public static final /* synthetic */ B[] y;

    static {
        C0054m c0054m = new C0054m();
        a = c0054m;
        C0065s c0065s = new C0065s();
        b = c0065s;
        C0067t c0067t = new C0067t();
        c = c0067t;
        C0069u c0069u = new C0069u();
        d = c0069u;
        C0071v c0071v = new C0071v();
        e = c0071v;
        C0073w c0073w = new C0073w();
        f = c0073w;
        C0075x c0075x = new C0075x();
        g = c0075x;
        C0077y c0077y = new C0077y();
        h = c0077y;
        C0079z c0079z = new C0079z();
        i = c0079z;
        C0034c c0034c = new C0034c();
        j = c0034c;
        C0036d c0036d = new C0036d();
        k = c0036d;
        C0038e c0038e = new C0038e();
        l = c0038e;
        C0040f c0040f = new C0040f();
        m = c0040f;
        C0042g c0042g = new C0042g();
        n = c0042g;
        C0044h c0044h = new C0044h();
        o = c0044h;
        C0046i c0046i = new C0046i();
        p = c0046i;
        C0048j c0048j = new C0048j();
        q = c0048j;
        C0050k c0050k = new C0050k();
        r = c0050k;
        C0052l c0052l = new C0052l();
        s = c0052l;
        C0056n c0056n = new C0056n();
        t = c0056n;
        C0058o c0058o = new C0058o();
        u = c0058o;
        C0060p c0060p = new C0060p();
        v = c0060p;
        C0062q c0062q = new C0062q();
        w = c0062q;
        y = new B[]{c0054m, c0065s, c0067t, c0069u, c0071v, c0073w, c0075x, c0077y, c0079z, c0034c, c0036d, c0038e, c0040f, c0042g, c0044h, c0046i, c0048j, c0050k, c0052l, c0056n, c0058o, c0060p, c0062q, new B() { // from class: com.github.catvod.spider.merge.M.r
            @Override // com.github.catvod.spider.merge.M.B
            public final boolean c(N n2, C0032b c0032b) {
                return true;
            }
        }};
        x = String.valueOf((char) 0);
    }

    public B(String str, int i2) {
    }

    public static boolean a(N n2) {
        if (n2.a == 5) {
            return com.github.catvod.bean.b.d(((G) n2).b);
        }
        return false;
    }

    public static void b(L l2, C0032b c0032b) {
        c0032b.c.o(g1.e);
        c0032b.m = c0032b.l;
        c0032b.l = h;
        c0032b.r(l2);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) y.clone();
    }

    public abstract boolean c(N n2, C0032b c0032b);
}
