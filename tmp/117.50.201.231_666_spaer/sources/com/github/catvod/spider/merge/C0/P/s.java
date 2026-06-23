package com.github.catvod.spider.merge.C0.P;

import com.github.catvod.spider.merge.C0.S.h;
import com.github.catvod.spider.merge.C0.S.i;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class s extends B<Integer, com.github.catvod.spider.merge.C0.Q.B> implements F {
    public InterfaceC0122d d;
    protected com.github.catvod.spider.merge.C0.S.l<F, InterfaceC0122d> e;
    public D g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    protected E<?> f = l.a;
    public int h = -1;
    public final h n = new h();
    public int o = 0;

    public s(InterfaceC0122d interfaceC0122d) {
        this.d = interfaceC0122d;
        this.e = new com.github.catvod.spider.merge.C0.S.l<>(this, interfaceC0122d);
    }

    public final int a() {
        return ((com.github.catvod.spider.merge.C0.Q.B) this.b).g();
    }

    public final InterfaceC0122d b() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [com.github.catvod.spider.merge.C0.P.E<?>, com.github.catvod.spider.merge.C0.P.l] */
    public final D c() {
        int i;
        int i2;
        InterfaceC0122d interfaceC0122d = this.d;
        if (interfaceC0122d == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        interfaceC0122d.g();
        while (true) {
            try {
                if (this.k) {
                    l();
                    break;
                }
                this.g = null;
                this.l = 0;
                this.h = this.d.i();
                this.j = ((com.github.catvod.spider.merge.C0.Q.B) this.b).g();
                this.i = ((com.github.catvod.spider.merge.C0.Q.B) this.b).h();
                do {
                    this.m = 0;
                    try {
                        i = ((com.github.catvod.spider.merge.C0.Q.B) this.b).i(this.d, this.o);
                    } catch (t e) {
                        m(e);
                        if (this.d.f(1) != -1) {
                            ((com.github.catvod.spider.merge.C0.Q.B) this.b).e(this.d);
                        }
                        i = -3;
                    }
                    if (this.d.f(1) == -1) {
                        this.k = true;
                    }
                    if (this.m == 0) {
                        this.m = i;
                    }
                    i2 = this.m;
                    if (i2 != -3) {
                    }
                } while (i2 == -2);
                if (this.g == null) {
                    this.g = this.f.a(this.e, i2, null, this.l, this.h, this.d.i() - 1, this.i, this.j);
                }
            } finally {
                this.d.a();
            }
        }
        return this.g;
    }

    public final int d() {
        return ((com.github.catvod.spider.merge.C0.Q.B) this.b).h();
    }

    public final E<? extends D> e() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.github.catvod.spider.merge.C0.P.E<?>, com.github.catvod.spider.merge.C0.P.l] */
    public final D l() {
        D dA = this.f.a(this.e, -1, null, 0, this.d.i(), this.d.i() - 1, ((com.github.catvod.spider.merge.C0.Q.B) this.b).h(), ((com.github.catvod.spider.merge.C0.Q.B) this.b).g());
        this.g = dA;
        return dA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(t tVar) {
        InterfaceC0122d interfaceC0122d = this.d;
        String strH = interfaceC0122d.h(i.b(this.h, interfaceC0122d.i()));
        StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("token recognition error at: '");
        StringBuilder sb = new StringBuilder();
        for (char c : strH.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = "<EOF>";
            } else if (c == 13) {
                strValueOf = "\\r";
            } else if (c == 9) {
                strValueOf = "\\t";
            } else if (c == 10) {
                strValueOf = "\\n";
            }
            sb.append(strValueOf);
        }
        sbB.append(sb.toString());
        sbB.append("'");
        ((y) g()).a(this, null, this.i, this.j, sbB.toString(), tVar);
    }
}
