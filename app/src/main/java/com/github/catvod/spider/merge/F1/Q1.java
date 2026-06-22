package com.github.catvod.spider.merge.f1;

import java.math.BigInteger;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Q1 implements Iterable<Q1> {
    private static final Q1 h = new Q1(-1);
    protected int b;
    protected Q1 c;
    protected Q1 d;
    protected Q1 e;
    protected int f;
    protected P1 g;

    public Q1(int i) {
        this.f = -1;
        this.b = i;
    }

    public Q1(int i, int i2) {
        this.b = i;
        this.f = i2;
    }

    public Q1(int i, Q1 q1) {
        this.f = -1;
        this.b = i;
        this.e = q1;
        this.d = q1;
        q1.c = null;
    }

    public Q1(int i, Q1 q1, int i2) {
        this(i, q1);
        this.f = i2;
    }

    public Q1(int i, Q1 q1, Q1 q12) {
        this.f = -1;
        this.b = i;
        this.d = q1;
        this.e = q12;
        q1.c = q12;
        q12.c = null;
    }

    public Q1(int i, Q1 q1, Q1 q12, Q1 q13) {
        this.f = -1;
        this.b = i;
        this.d = q1;
        this.e = q13;
        q1.c = q12;
        q12.c = q13;
        q13.c = null;
    }

    public static Q1 A(double d) {
        com.github.catvod.spider.merge.h1.M m = new com.github.catvod.spider.merge.h1.M();
        m.e0(d);
        return m;
    }

    public static Q1 B(int i, String str) {
        com.github.catvod.spider.merge.h1.K k = new com.github.catvod.spider.merge.h1.K();
        k.f0(str);
        k.b = i;
        return k;
    }

    public static Q1 C(String str) {
        return B(41, str);
    }

    public static Q1 D() {
        return new Q1(135);
    }

    private int j() {
        int i = this.b;
        if (i == 4) {
            return this.d != null ? 4 : 2;
        }
        if (i != 50) {
            if (i == 73) {
                return 8;
            }
            int iJ = 1;
            if (i == 133 || i == 145) {
                Q1 q1 = this.d;
                if (q1 == null) {
                    return 1;
                }
                int i2 = q1.b;
                if (i2 == 7) {
                    Q1 q12 = q1.c;
                    Q1 q13 = ((com.github.catvod.spider.merge.h1.E) q1).o;
                    int iJ2 = q12.j();
                    return q13 != null ? q13.j() | iJ2 : iJ2 | 1;
                }
                if (i2 == 84 || i2 == 118) {
                    return 0;
                }
                if (i2 == 134) {
                    return q1.p(18, 0) | q1.c.j();
                }
                while ((iJ & 1) != 0 && q1 != null) {
                    iJ = (iJ & (-2)) | q1.j();
                    q1 = q1.c;
                }
                return iJ;
            }
            if (i == 169) {
                return 8;
            }
            if (i == 124) {
                ((com.github.catvod.spider.merge.h1.E) this).g0().E(18, 1);
                return 0;
            }
            if (i != 125) {
                switch (i) {
                    case 135:
                        Q1 q14 = this.c;
                        if (q14 != null) {
                            return q14.j();
                        }
                        return 1;
                    case 136:
                        Q1 q15 = this.d;
                        while (true) {
                            Q1 q16 = q15.c;
                            if (q16 == this.e) {
                                if (q15.b != 6) {
                                    return 1;
                                }
                                int iJ3 = ((com.github.catvod.spider.merge.h1.E) q15).o.c.j();
                                if (q15.d.b == 45) {
                                    iJ3 &= -2;
                                }
                                return p(18, 0) | iJ3;
                            }
                            q15 = q16;
                        }
                        break;
                    case 137:
                        Q1 q17 = this.d;
                        if (q17 != null) {
                            return q17.j();
                        }
                        return 1;
                    default:
                        return 1;
                }
            }
        }
        return 0;
    }

    private P1 k(int i) {
        P1 p1Z = z(i);
        if (p1Z != null) {
            return p1Z;
        }
        P1 p1 = new P1();
        p1.b = i;
        p1.a = this.g;
        this.g = p1;
        return p1;
    }

    private P1 z(int i) {
        P1 p1 = this.g;
        while (p1 != null && i != p1.b) {
            p1 = p1.a;
        }
        return p1;
    }

    public final void E(int i, int i2) {
        k(i).c = i2;
    }

    public final void F(int i, Object obj) {
        if (obj == null) {
            H(i);
        } else {
            k(i).d = obj;
        }
    }

    public final void G(Q1 q1) {
        Q1 q1M = m(q1);
        if (q1M == null) {
            this.d = this.d.c;
        } else {
            q1M.c = q1.c;
        }
        if (q1 == this.e) {
            this.e = q1M;
        }
        q1.c = null;
    }

    public final void H(int i) {
        P1 p1 = this.g;
        if (p1 != null) {
            P1 p12 = null;
            while (p1.b != i) {
                P1 p13 = p1.a;
                if (p13 == null) {
                    return;
                }
                p12 = p1;
                p1 = p13;
            }
            P1 p14 = p1.a;
            if (p12 == null) {
                this.g = p14;
            } else {
                p12.a = p14;
            }
        }
    }

    public final void I(Q1 q1, Q1 q12) {
        q12.c = q1.c;
        if (q1 == this.d) {
            this.d = q12;
        } else {
            m(q1).c = q12;
        }
        if (q1 == this.e) {
            this.e = q12;
        }
        q1.c = null;
    }

    public final void J(double d) {
        ((com.github.catvod.spider.merge.h1.M) this).e0(d);
    }

    public final void K() {
        F(24, null);
    }

    public final void L(int i) {
        this.f = i;
    }

    public void M(com.github.catvod.spider.merge.h1.U u) {
        if (this instanceof com.github.catvod.spider.merge.h1.K) {
            ((com.github.catvod.spider.merge.h1.K) this).M(u);
        } else {
            C1162n0.c();
            throw null;
        }
    }

    public Q1 N(int i) {
        this.b = i;
        return this;
    }

    public final void d(Q1 q1, Q1 q12) {
        if (q1.c != null) {
            throw new RuntimeException("newChild had siblings in addChildAfter");
        }
        q1.c = q12.c;
        q12.c = q1;
        if (this.e == q12) {
            this.e = q1;
        }
    }

    public final void e(Q1 q1) {
        q1.c = null;
        Q1 q12 = this.e;
        if (q12 == null) {
            this.e = q1;
            this.d = q1;
        } else {
            q12.c = q1;
            this.e = q1;
        }
    }

    public final void g(Q1 q1) {
        q1.c = this.d;
        this.d = q1;
        if (this.e == null) {
            this.e = q1;
        }
    }

    public final void h(Q1 q1) {
        Q1 q12 = this.e;
        if (q12 != null) {
            q12.c = q1;
        }
        q1.getClass();
        Q1 q13 = q1;
        while (true) {
            Q1 q14 = q13.c;
            if (q14 == null) {
                break;
            } else {
                q13 = q14;
            }
        }
        this.e = q13;
        if (this.d == null) {
            this.d = q1;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Q1> iterator() {
        return new O1(this);
    }

    public BigInteger l() {
        throw new UnsupportedOperationException("Can only be called when Token.BIGINT");
    }

    public final Q1 m(Q1 q1) {
        Q1 q12 = this.d;
        if (q1 == q12) {
            return null;
        }
        while (true) {
            Q1 q13 = q12.c;
            if (q13 == q1) {
                return q12;
            }
            if (q13 == null) {
                throw new RuntimeException("node is not a child");
            }
            q12 = q13;
        }
    }

    public final double n() {
        return ((com.github.catvod.spider.merge.h1.M) this).d0();
    }

    public final int o(int i) {
        P1 p1Z = z(i);
        if (p1Z != null) {
            return p1Z.c;
        }
        C1162n0.c();
        throw null;
    }

    public final int p(int i, int i2) {
        P1 p1Z = z(i);
        return p1Z == null ? i2 : p1Z.c;
    }

    public int q() {
        return this.f;
    }

    public final Object s(int i) {
        P1 p1Z = z(i);
        if (p1Z == null) {
            return null;
        }
        return p1Z.d;
    }

    public com.github.catvod.spider.merge.h1.U t() {
        return ((com.github.catvod.spider.merge.h1.K) this).t();
    }

    public final String toString() {
        return String.valueOf(this.b);
    }

    public final String u() {
        return ((com.github.catvod.spider.merge.h1.K) this).d0();
    }

    public final int v() {
        return this.b;
    }

    public final boolean w() {
        return this.d != null;
    }

    public final boolean x() {
        int iJ = j();
        return (iJ & 4) == 0 || (iJ & 11) == 0;
    }
}
