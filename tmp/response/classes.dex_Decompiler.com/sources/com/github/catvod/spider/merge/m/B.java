package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
abstract class B {
    public static final C0041m a;
    public static final C0052s b;
    public static final C0054t c;
    public static final C0056u d;
    public static final C0058v e;
    public static final C0060w f;
    public static final C0062x g;
    public static final C0064y h;
    public static final C0066z i;
    public static final C0021c j;
    public static final C0023d k;
    public static final C0025e l;
    public static final C0027f m;
    public static final C0029g n;
    public static final C0031h o;
    public static final C0033i p;
    public static final C0035j q;
    public static final C0037k r;
    public static final C0039l s;
    public static final C0043n t;
    public static final C0045o u;
    public static final C0047p v;
    public static final C0049q w;
    public static final r x;
    private static final String y;
    private static final /* synthetic */ B[] z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.github.catvod.spider.merge.M.r] */
    static {
        C0041m c0041m = new C0041m();
        a = c0041m;
        C0052s c0052s = new C0052s();
        b = c0052s;
        C0054t c0054t = new C0054t();
        c = c0054t;
        C0056u c0056u = new C0056u();
        d = c0056u;
        C0058v c0058v = new C0058v();
        e = c0058v;
        C0060w c0060w = new C0060w();
        f = c0060w;
        C0062x c0062x = new C0062x();
        g = c0062x;
        C0064y c0064y = new C0064y();
        h = c0064y;
        C0066z c0066z = new C0066z();
        i = c0066z;
        C0021c c0021c = new C0021c();
        j = c0021c;
        C0023d c0023d = new C0023d();
        k = c0023d;
        C0025e c0025e = new C0025e();
        l = c0025e;
        C0027f c0027f = new C0027f();
        m = c0027f;
        C0029g c0029g = new C0029g();
        n = c0029g;
        C0031h c0031h = new C0031h();
        o = c0031h;
        C0033i c0033i = new C0033i();
        p = c0033i;
        C0035j c0035j = new C0035j();
        q = c0035j;
        C0037k c0037k = new C0037k();
        r = c0037k;
        C0039l c0039l = new C0039l();
        s = c0039l;
        C0043n c0043n = new C0043n();
        t = c0043n;
        C0045o c0045o = new C0045o();
        u = c0045o;
        C0047p c0047p = new C0047p();
        v = c0047p;
        C0049q c0049q = new C0049q();
        w = c0049q;
        ?? r23 = new B() { // from class: com.github.catvod.spider.merge.M.r
            {
                oZP.d("3300052405321B2C182F18301B1B");
            }

            @Override // com.github.catvod.spider.merge.M.B
            final boolean d(Q q2, C0019b c0019b) {
                return true;
            }
        };
        x = r23;
        z = new B[]{c0041m, c0052s, c0054t, c0056u, c0058v, c0060w, c0062x, c0064y, c0066z, c0021c, c0023d, c0025e, c0027f, c0029g, c0031h, c0033i, c0035j, c0037k, c0039l, c0043n, c0045o, c0047p, c0049q, r23};
        y = String.valueOf((char) 0);
    }

    B(String str, int i2, C0041m c0041m) {
    }

    static boolean a(Q q2) {
        if (q2.b()) {
            return com.github.catvod.spider.merge.K.b.d(((I) q2).l());
        }
        return false;
    }

    static void b(N n2, C0019b c0019b) {
        c0019b.c.v(j1.e);
        c0019b.U();
        c0019b.u0(h);
        c0019b.J(n2);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) z.clone();
    }

    abstract boolean d(Q q2, C0019b c0019b);
}
