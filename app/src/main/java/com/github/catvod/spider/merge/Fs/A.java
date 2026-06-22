package com.github.catvod.spider.merge.Fs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class A {
    private static final /* synthetic */ A[] A;
    public static final C0655m c;
    public static final r d;
    public static final C0666s e;
    public static final C0668t f;
    public static final C0670u g;
    public static final C0672v h;
    public static final C0674w i;
    public static final C0676x j;
    public static final C0678y k;
    public static final C0635c l;
    public static final C0637d m;
    public static final C0639e n;
    public static final C0641f o;
    public static final C0643g p;
    public static final C0645h q;
    public static final C0647i r;
    public static final C0649j s;
    public static final C0651k t;
    public static final C0653l u;
    public static final C0657n v;
    public static final C0659o w;
    public static final C0661p x;
    public static final C0663q y;
    private static final String z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.github.catvod.spider.merge.Fs.q] */
    static {
        C0655m c0655m = new C0655m();
        c = c0655m;
        r rVar = new r();
        d = rVar;
        C0666s c0666s = new C0666s();
        e = c0666s;
        C0668t c0668t = new C0668t();
        f = c0668t;
        C0670u c0670u = new C0670u();
        g = c0670u;
        C0672v c0672v = new C0672v();
        h = c0672v;
        C0674w c0674w = new C0674w();
        i = c0674w;
        C0676x c0676x = new C0676x();
        j = c0676x;
        C0678y c0678y = new C0678y();
        k = c0678y;
        C0635c c0635c = new C0635c();
        l = c0635c;
        C0637d c0637d = new C0637d();
        m = c0637d;
        C0639e c0639e = new C0639e();
        n = c0639e;
        C0641f c0641f = new C0641f();
        o = c0641f;
        C0643g c0643g = new C0643g();
        p = c0643g;
        C0645h c0645h = new C0645h();
        q = c0645h;
        C0647i c0647i = new C0647i();
        r = c0647i;
        C0649j c0649j = new C0649j();
        s = c0649j;
        C0651k c0651k = new C0651k();
        t = c0651k;
        C0653l c0653l = new C0653l();
        u = c0653l;
        C0657n c0657n = new C0657n();
        v = c0657n;
        C0659o c0659o = new C0659o();
        w = c0659o;
        C0661p c0661p = new C0661p();
        x = c0661p;
        ?? r22 = new A() { // from class: com.github.catvod.spider.merge.Fs.q
            @Override // com.github.catvod.spider.merge.Fs.A
            final boolean d(O o2, C0633b c0633b) {
                return true;
            }
        };
        y = r22;
        A = new A[]{c0655m, rVar, c0666s, c0668t, c0670u, c0672v, c0674w, c0676x, c0678y, c0635c, c0637d, c0639e, c0641f, c0643g, c0645h, c0647i, c0649j, c0651k, c0653l, c0657n, c0659o, c0661p, r22};
        z = String.valueOf((char) 0);
    }

    A(String str, int i2, C0655m c0655m) {
    }

    static boolean a(O o2) {
        if (o2.a()) {
            return com.github.catvod.spider.merge.Dw.e.c(((H) o2).j());
        }
        return false;
    }

    static void b(M m2, C0633b c0633b) {
        c0633b.c.u(h1.g);
        c0633b.P();
        c0633b.j0(j);
        c0633b.D(m2);
    }

    static /* synthetic */ String c() {
        return z;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) A.clone();
    }

    abstract boolean d(O o2, C0633b c0633b);
}
