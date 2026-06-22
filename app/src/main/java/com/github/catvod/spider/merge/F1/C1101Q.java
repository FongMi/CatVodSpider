package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.h1.AbstractC1239f;
import com.github.catvod.spider.merge.h1.C1231A;
import com.github.catvod.spider.merge.h1.C1233C;
import com.github.catvod.spider.merge.h1.C1234a;
import com.github.catvod.spider.merge.h1.C1235b;
import com.github.catvod.spider.merge.h1.C1236c;
import com.github.catvod.spider.merge.h1.C1237d;
import com.github.catvod.spider.merge.h1.C1240g;
import com.github.catvod.spider.merge.h1.C1241h;
import com.github.catvod.spider.merge.h1.C1242i;
import com.github.catvod.spider.merge.h1.C1243j;
import com.github.catvod.spider.merge.h1.C1244k;
import com.github.catvod.spider.merge.h1.C1246m;
import com.github.catvod.spider.merge.h1.C1247n;
import com.github.catvod.spider.merge.h1.C1249p;
import com.github.catvod.spider.merge.h1.C1250q;
import com.github.catvod.spider.merge.h1.C1253u;
import com.github.catvod.spider.merge.h1.C1254v;
import com.github.catvod.spider.merge.h1.C1255w;
import com.github.catvod.spider.merge.h1.C1256x;
import com.github.catvod.spider.merge.h1.C1257y;
import com.github.catvod.spider.merge.h1.C1258z;
import com.github.catvod.spider.merge.h1.InterfaceC1248o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1101Q {
    private Y1 a;
    private C1197z b = new C1197z();

    public C1101Q(C1173r c1173r, InterfaceC1094J interfaceC1094J) {
        this.a = new Y1(c1173r, interfaceC1094J);
    }

    private Q1 A(com.github.catvod.spider.merge.h1.I i) {
        this.a.B0(i);
        try {
            this.b.h(157);
            this.b.h(90);
            com.github.catvod.spider.merge.h1.h0 h0VarZ0 = i.z0();
            G(h0VarZ0);
            this.b.h(91);
            i.e(h0VarZ0);
            boolean z = i.b == 162;
            if (i.y0() != null) {
                if (z) {
                    this.b.c(" ");
                } else {
                    this.b.b(88);
                }
                i.e(t(i.y0()));
                if (!z) {
                    this.b.b(89);
                }
            }
            return i;
        } finally {
            this.a.y0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd A[PHI: r10
      0x00dd: PHI (r10v3 int) = (r10v0 int), (r10v2 int) binds: [B:45:0x00db, B:49:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.f1.Q1 B(com.github.catvod.spider.merge.h1.N r18) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1101Q.B(com.github.catvod.spider.merge.h1.N):com.github.catvod.spider.merge.f1.Q1");
    }

    private Q1 C(com.github.catvod.spider.merge.h1.P p) {
        AbstractC1239f abstractC1239fD0 = p.d0();
        this.b.h(90);
        int i = 1;
        while (abstractC1239fD0 instanceof com.github.catvod.spider.merge.h1.P) {
            this.b.h(90);
            i++;
            abstractC1239fD0 = ((com.github.catvod.spider.merge.h1.P) abstractC1239fD0).d0();
        }
        Q1 q1T = t(abstractC1239fD0);
        for (int i2 = 0; i2 < i; i2++) {
            this.b.h(91);
        }
        q1T.F(19, Boolean.TRUE);
        return q1T;
    }

    private Q1 E(com.github.catvod.spider.merge.h1.f0 f0Var) {
        int i = f0Var.b;
        if (i != 76) {
            this.b.h(i);
            return j(i, t(f0Var.d0()));
        }
        this.b.h(120);
        this.b.c(" xml");
        this.b.c(" namespace");
        this.b.h(93);
        return j(76, t(f0Var.d0()));
    }

    private Q1 F(com.github.catvod.spider.merge.h1.g0 g0Var) {
        int i = g0Var.b;
        if (g0Var.f0()) {
            this.b.h(i);
        }
        Q1 q1T = t(g0Var.d0());
        if (g0Var.e0()) {
            this.b.h(i);
        }
        boolean zE0 = g0Var.e0();
        Q1 q1S = s(q1T);
        int i2 = q1S.b;
        if (i2 != 33 && i2 != 36 && i2 != 39 && i2 != 68) {
            C1162n0.c();
            throw null;
        }
        Q1 q1 = new Q1(i, q1S);
        int i3 = i == 111 ? 1 : 0;
        if (zE0) {
            i3 |= 2;
        }
        q1.E(13, i3);
        return q1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.f1.Q1 G(com.github.catvod.spider.merge.h1.h0 r9) {
        /*
            r8 = this;
            java.util.List r0 = r9.e0()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        Lf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r0.next()
            com.github.catvod.spider.merge.h1.i0 r3 = (com.github.catvod.spider.merge.h1.i0) r3
            com.github.catvod.spider.merge.h1.f r4 = r3.e0()
            com.github.catvod.spider.merge.h1.f r5 = r3.d0()
            boolean r6 = r3.a()
            if (r6 == 0) goto L2d
            r8.m(r4)
            goto L31
        L2d:
            com.github.catvod.spider.merge.f1.Q1 r4 = r8.t(r4)
        L31:
            r6 = 0
            if (r5 == 0) goto L3f
            com.github.catvod.spider.merge.f1.z r6 = r8.b
            r7 = 93
            r6.h(r7)
            com.github.catvod.spider.merge.f1.Q1 r6 = r8.t(r5)
        L3f:
            boolean r3 = r3.a()
            if (r3 == 0) goto L54
            if (r6 != 0) goto L48
            goto L59
        L48:
            com.github.catvod.spider.merge.f1.Y1 r3 = r8.a
            int r5 = r9.b
            com.github.catvod.spider.merge.f1.Q1 r3 = r3.E(r5, r4, r6)
            r9.e(r3)
            goto L5c
        L54:
            if (r6 == 0) goto L59
            r4.e(r6)
        L59:
            r9.e(r4)
        L5c:
            int r3 = r2 + 1
            int r4 = r1 + (-1)
            if (r2 >= r4) goto L69
            com.github.catvod.spider.merge.f1.z r2 = r8.b
            r4 = 92
            r2.h(r4)
        L69:
            r2 = r3
            goto Lf
        L6b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1101Q.G(com.github.catvod.spider.merge.h1.h0):com.github.catvod.spider.merge.f1.Q1");
    }

    private Q1 H(com.github.catvod.spider.merge.h1.h0 h0Var) {
        this.b.h(h0Var.b);
        G(h0Var);
        AbstractC1239f abstractC1239fT = h0Var.T();
        if (!(abstractC1239fT instanceof com.github.catvod.spider.merge.h1.J) && !(abstractC1239fT instanceof com.github.catvod.spider.merge.h1.I)) {
            this.b.b(85);
        }
        return h0Var;
    }

    private Q1 I(com.github.catvod.spider.merge.h1.p0 p0Var) {
        Q1 q1C;
        Q1 q1 = new Q1(30, p0Var.q());
        ArrayList<com.github.catvod.spider.merge.h1.o0> arrayList = (ArrayList) p0Var.e0();
        q1.e(this.a.G(((com.github.catvod.spider.merge.h1.t0) arrayList.get(0)).d0().trim().startsWith("<>") ? "XMLList" : "XML"));
        Q1 q1C2 = null;
        for (com.github.catvod.spider.merge.h1.o0 o0Var : arrayList) {
            if (o0Var instanceof com.github.catvod.spider.merge.h1.t0) {
                String strD0 = ((com.github.catvod.spider.merge.h1.t0) o0Var).d0();
                this.b.c(strD0);
                if (q1C2 == null) {
                    q1C2 = Q1.C(strD0);
                } else {
                    q1C = Q1.C(strD0);
                }
            } else {
                com.github.catvod.spider.merge.h1.n0 n0Var = (com.github.catvod.spider.merge.h1.n0) o0Var;
                boolean zE0 = n0Var.e0();
                this.b.h(88);
                Q1 q1C3 = n0Var.d0() instanceof com.github.catvod.spider.merge.h1.r ? Q1.C("") : t(n0Var.d0());
                this.b.h(89);
                q1C = zE0 ? c(21, c(21, Q1.C("\""), j(77, q1C3)), Q1.C("\"")) : j(78, q1C3);
            }
            q1C2 = c(21, q1C2, q1C);
        }
        q1.e(q1C2);
        return q1;
    }

    private Q1 J(com.github.catvod.spider.merge.h1.q0 q0Var) {
        C1197z c1197z;
        com.github.catvod.spider.merge.h1.s0 s0VarI0 = q0Var.i0();
        Q1 q1T = t(q0Var.d0());
        int i = s0VarI0.e0() ? 2 : 0;
        int i2 = 147;
        if (q0Var.b == 147) {
            i |= 4;
            c1197z = this.b;
        } else {
            c1197z = this.b;
            i2 = 112;
        }
        c1197z.h(i2);
        return K(q1T, s0VarI0, i);
    }

    private Q1 K(Q1 q1, com.github.catvod.spider.merge.h1.s0 s0Var, int i) {
        if ((i & 2) != 0) {
            this.b.h(151);
        }
        com.github.catvod.spider.merge.h1.K kD0 = s0Var.d0();
        String strD0 = kD0 != null ? kD0.d0() : null;
        if (strD0 != null) {
            this.b.c(strD0);
            this.b.h(148);
        }
        if (s0Var instanceof com.github.catvod.spider.merge.h1.r0) {
            String strD02 = ((com.github.catvod.spider.merge.h1.r0) s0Var).h0().d0();
            this.b.c(strD02);
            return i(q1, strD0, strD02, i);
        }
        this.b.h(86);
        Q1 q1T = t(((com.github.catvod.spider.merge.h1.m0) s0Var).h0());
        this.b.h(87);
        if (strD0 != null || i != 0) {
            return h(q1, strD0, q1T, i);
        }
        if (q1 != null) {
            return new Q1(36, q1, q1T);
        }
        C1162n0.c();
        throw null;
    }

    private Q1 L(com.github.catvod.spider.merge.h1.s0 s0Var) {
        return K(null, s0Var, s0Var.e0() ? 2 : 0);
    }

    private Q1 a(C1234a c1234a, String str) throws Throwable {
        String strU;
        this.b.h(86);
        int iQ = c1234a.q();
        Q1 q1T = t(c1234a.A0());
        ArrayList arrayList = (ArrayList) c1234a.z0();
        int size = arrayList.size();
        Q1[] q1Arr = new Q1[size];
        Q1[] q1Arr2 = new Q1[size];
        int i = 0;
        Q1 q1C = q1T;
        for (int i2 = 0; i2 < size; i2++) {
            C1235b c1235b = (C1235b) arrayList.get(i2);
            this.b.c(" ");
            this.b.h(123);
            if (c1235b.C0()) {
                this.b.c("each ");
            }
            this.b.h(90);
            AbstractC1239f abstractC1239fB0 = c1235b.B0();
            if (abstractC1239fB0.b == 39) {
                strU = abstractC1239fB0.u();
                this.b.c(strU);
            } else {
                m(abstractC1239fB0);
                String strK0 = this.a.p.K0();
                this.a.N(90, strK0, false);
                q1C = c(92, b(93, abstractC1239fB0, this.a.G(strK0)), q1C);
                strU = strK0;
            }
            Q1 q1G = this.a.G(strU);
            this.a.N(157, strU, false);
            q1Arr[i2] = q1G;
            if (c1235b.D0()) {
                this.b.c("of ");
            } else {
                this.b.h(52);
            }
            q1Arr2[i2] = t(c1235b.A0());
            this.b.h(91);
        }
        Q1 q1D = d(38, i(this.a.G(str), null, "push", 0));
        Q1 q1 = new Q1(137, q1D, iQ);
        if (c1234a.y0() != null) {
            this.b.c(" ");
            this.b.h(116);
            this.b.h(90);
            q1 = f(t(c1234a.y0()), q1, null, iQ);
            this.b.h(91);
        }
        Q1 q1E = q1;
        int i3 = size - 1;
        int i4 = 0;
        while (i3 >= 0) {
            try {
                C1235b c1235b2 = (C1235b) arrayList.get(i3);
                com.github.catvod.spider.merge.h1.U uK = this.a.K(136, c1235b2.q());
                this.a.B0(uK);
                int i5 = i4 + 1;
                try {
                    q1E = e(157, uK, q1Arr[i3], q1Arr2[i3], q1E, c1235b2.C0(), c1235b2.D0());
                    i3--;
                    i4 = i5;
                } catch (Throwable th) {
                    th = th;
                    i4 = i5;
                    while (i < i4) {
                        this.a.y0();
                        i++;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        while (i < i4) {
            this.a.y0();
            i++;
        }
        this.b.h(87);
        q1D.e(q1C);
        return q1E;
    }

    private Q1 b(int i, Q1 q1, Q1 q12) {
        int i2;
        Q1 q1S = s(q1);
        if (q1S == null) {
            int i3 = q1.b;
            if (i3 != 66 && i3 != 67) {
                this.a.E0("msg.bad.assign.left", null);
                throw null;
            }
            if (i == 93) {
                return this.a.E(-1, q1, q12);
            }
            this.a.E0("msg.bad.destruct.op", null);
            throw null;
        }
        switch (i) {
            case 93:
                return this.a.M0(q1S, q12);
            case 94:
                i2 = 9;
                break;
            case 95:
                i2 = 10;
                break;
            case 96:
                i2 = 11;
                break;
            case 97:
                i2 = 18;
                break;
            case 98:
                i2 = 19;
                break;
            case 99:
                i2 = 20;
                break;
            case 100:
                i2 = 21;
                break;
            case 101:
                i2 = 22;
                break;
            case 102:
                i2 = 23;
                break;
            case 103:
                i2 = 24;
                break;
            case 104:
                i2 = 25;
                break;
            case 105:
                i2 = 75;
                break;
            default:
                C1162n0.c();
                throw null;
        }
        int i4 = q1S.b;
        if (i4 == 33 || i4 == 36) {
            return new Q1(i4 == 33 ? 143 : 144, q1S.d, q1S.e, new Q1(i2, new Q1(142), q12));
        }
        if (i4 == 39) {
            return new Q1(8, Q1.B(49, q1S.u()), new Q1(i2, q1S, q12));
        }
        if (i4 != 68) {
            C1162n0.c();
            throw null;
        }
        Q1 q13 = q1S.d;
        Y1 y1 = this.a;
        y1.getClass();
        if ((q13.p(16, 0) & 4) == 0) {
            return new Q1(146, q13, new Q1(i2, new Q1(142), q12));
        }
        y1.E0("msg.bad.assign.left", null);
        throw null;
    }

    private static Q1 c(int i, Q1 q1, Q1 q12) {
        String strG0;
        if (i == 108) {
            int iQ = q(q1);
            if (iQ == 1) {
                return q1;
            }
            if (iQ == -1) {
                return q12;
            }
        } else if (i != 109) {
            switch (i) {
                case 21:
                    int i2 = q1.b;
                    if (i2 == 41) {
                        int i3 = q12.b;
                        if (i3 == 41) {
                            strG0 = q12.u();
                        } else if (i3 == 40) {
                            strG0 = C1157l2.G0(q12.n(), 10);
                        }
                        String strConcat = q1.u().concat(strG0);
                        if (strConcat != null) {
                            ((com.github.catvod.spider.merge.h1.K) q1).f0(strConcat);
                            return q1;
                        }
                        C1162n0.c();
                        throw null;
                    }
                    if (i2 == 40) {
                        int i4 = q12.b;
                        if (i4 == 40) {
                            q1.J(q12.n() + q1.n());
                            return q1;
                        }
                        if (i4 == 41) {
                            String strConcat2 = C1157l2.G0(q1.n(), 10).concat(q12.u());
                            if (strConcat2 != null) {
                                ((com.github.catvod.spider.merge.h1.K) q12).f0(strConcat2);
                                return q12;
                            }
                            C1162n0.c();
                            throw null;
                        }
                    }
                    break;
                case 22:
                    if (q1.b == 40) {
                        double dN = q1.n();
                        if (q12.b == 40) {
                            q1.J(dN - q12.n());
                            return q1;
                        }
                        if (dN == 0.0d) {
                            return new Q1(29, q12);
                        }
                    } else if (q12.b == 40 && q12.n() == 0.0d) {
                        return new Q1(28, q1);
                    }
                case 23:
                    if (q1.b == 40) {
                        double dN2 = q1.n();
                        if (q12.b == 40) {
                            q1.J(q12.n() * dN2);
                            return q1;
                        }
                        if (dN2 == 1.0d) {
                            return new Q1(28, q12);
                        }
                    } else if (q12.b == 40 && q12.n() == 1.0d) {
                        return new Q1(28, q1);
                    }
                case 24:
                    if (q12.b == 40) {
                        double dN3 = q12.n();
                        if (q1.b == 40) {
                            q1.J(q1.n() / dN3);
                            return q1;
                        }
                        if (dN3 == 1.0d) {
                            return new Q1(28, q1);
                        }
                    }
                    break;
            }
        } else {
            int iQ2 = q(q1);
            if (iQ2 == -1) {
                return q1;
            }
            if (iQ2 == 1) {
                return q12;
            }
        }
        return new Q1(i, q1, q12);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.f1.Q1 d(int r6, com.github.catvod.spider.merge.f1.Q1 r7) {
        /*
            r5 = this;
            int r0 = r7.b
            r1 = 39
            r2 = 1
            java.lang.String r3 = "eval"
            r4 = 0
            if (r0 != r1) goto L1f
            java.lang.String r0 = r7.u()
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L15
            goto L31
        L15:
            java.lang.String r1 = "With"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            r2 = 2
            goto L31
        L1f:
            r1 = 33
            if (r0 != r1) goto L30
            com.github.catvod.spider.merge.f1.Q1 r0 = r7.e
            java.lang.String r0 = r0.u()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L30
            goto L31
        L30:
            r2 = 0
        L31:
            com.github.catvod.spider.merge.f1.Q1 r0 = new com.github.catvod.spider.merge.f1.Q1
            r0.<init>(r6, r7)
            if (r2 == 0) goto L42
            com.github.catvod.spider.merge.f1.Y1 r6 = r5.a
            r6.K0()
            r6 = 10
            r0.E(r6, r2)
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1101Q.d(int, com.github.catvod.spider.merge.f1.Q1):com.github.catvod.spider.merge.f1.Q1");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private Q1 e(int i, Q1 q1, Q1 q12, Q1 q13, Q1 q14, boolean z, boolean z2) {
        int i2;
        Q1 q1B;
        Q1 q1M0;
        int i3 = q12.b;
        if (i3 == 126 || i3 == 157) {
            Q1 q15 = q12.e;
            i2 = q15.b;
            if (i2 == 66 || i2 == 67) {
                iE0 = q15 instanceof C1236c ? ((C1236c) q15).e0() : 0;
                q1B = q15;
                i3 = i2;
            } else {
                if (i2 != 39) {
                    this.a.E0("msg.bad.for.in.lhs", null);
                    throw null;
                }
                i2 = i3;
                q1B = Q1.B(39, q15.u());
                i3 = -1;
            }
        } else if (i3 == 66 || i3 == 67) {
            iE0 = q12 instanceof C1236c ? ((C1236c) q12).e0() : 0;
            q1B = q12;
            i2 = i3;
        } else {
            q1B = s(q12);
            if (q1B == null) {
                this.a.E0("msg.bad.for.in.lhs", null);
                throw null;
            }
            i2 = i3;
            i3 = -1;
        }
        Q1 q16 = new Q1(145);
        Q1 q17 = new Q1(z ? 59 : z2 ? 61 : i3 != -1 ? 60 : 58, q13);
        q17.F(3, q16);
        Q1 q18 = new Q1(62);
        q18.F(3, q16);
        Q1 q19 = new Q1(63);
        q19.F(3, q16);
        Q1 q110 = new Q1(133);
        if (i3 != -1) {
            q1M0 = this.a.E(i, q1B, q19);
            if (!z && !z2 && (i3 == 67 || iE0 != 2)) {
                this.a.E0("msg.bad.for.in.destruct", null);
                throw null;
            }
        } else {
            q1M0 = this.a.M0(q1B, q19);
        }
        q110.e(new Q1(137, q1M0));
        q110.e(q14);
        com.github.catvod.spider.merge.h1.E e = (com.github.catvod.spider.merge.h1.E) q1;
        g(e, 1, q110, q18, null, null);
        e.g(q17);
        if (i2 == 126 || i2 == 157) {
            e.g(q12);
        }
        q16.e(e);
        return q16;
    }

    private static Q1 f(Q1 q1, Q1 q12, Q1 q13, int i) {
        int iQ = q(q1);
        if (iQ == 1) {
            return q12;
        }
        if (iQ == -1) {
            return q13 != null ? q13 : new Q1(133, i);
        }
        Q1 q14 = new Q1(133, i);
        Q1 q1D = Q1.D();
        com.github.catvod.spider.merge.h1.E e = new com.github.catvod.spider.merge.h1.E(7, q1);
        e.o = q1D;
        q14.e(e);
        q14.h(q12);
        if (q13 != null) {
            Q1 q1D2 = Q1.D();
            q14.e(r(5, q1D2));
            q14.e(q1D);
            q14.h(q13);
            q14.e(q1D2);
        } else {
            q14.e(q1D);
        }
        return q14;
    }

    private static Q1 g(com.github.catvod.spider.merge.h1.E e, int i, Q1 q1, Q1 q12, Q1 q13, Q1 q14) {
        Q1 q1D = Q1.D();
        Q1 q1D2 = Q1.D();
        if (i == 2 && q12.b == 132) {
            q12 = new Q1(45);
        }
        com.github.catvod.spider.merge.h1.E e2 = new com.github.catvod.spider.merge.h1.E(6, q12);
        e2.o = q1D;
        Q1 q1D3 = Q1.D();
        e.e(q1D);
        e.h(q1);
        if (i == 1 || i == 2) {
            e.h(new Q1(132, e.q()));
        }
        e.e(q1D2);
        e.e(e2);
        e.e(q1D3);
        e.o = q1D3;
        if (i == 1 || i == 2) {
            e.g(r(5, q1D2));
            if (i == 2) {
                int i2 = q13.b;
                if (i2 != 132) {
                    if (i2 != 126 && i2 != 157) {
                        q13 = new Q1(137, q13);
                    }
                    e.g(q13);
                }
                q1D2 = Q1.D();
                e.d(q1D2, q1);
                if (q14.b != 132) {
                    e.d(new Q1(137, q14), q1D2);
                }
            }
        }
        e.h0(q1D2);
        return e;
    }

    private Q1 h(Q1 q1, String str, Q1 q12, int i) {
        Q1 q13;
        Q1 q14 = str != null ? str.equals("*") ? new Q1(42) : this.a.G(str) : null;
        if (q1 == null) {
            q13 = str == null ? new Q1(81, q12) : new Q1(82, q14, q12);
        } else {
            q13 = str == null ? new Q1(79, q1, q12) : new Q1(80, q1, q14, q12);
        }
        if (i != 0) {
            q13.E(16, i);
        }
        return new Q1(68, q13);
    }

    private Q1 i(Q1 q1, String str, String str2, int i) {
        if (str != null || i != 0) {
            return h(q1, str, Q1.C(str2), i | 1);
        }
        if (q1 == null) {
            return this.a.G(str2);
        }
        this.a.A(str2, 33);
        if (!C1157l2.h0(str2)) {
            return new Q1(33, q1, Q1.C(str2));
        }
        Q1 q12 = new Q1(72, q1);
        q12.F(17, str2);
        return new Q1(68, q12);
    }

    private static Q1 j(int i, Q1 q1) {
        int i2 = q1.b;
        switch (i) {
            case 26:
                int iQ = q(q1);
                if (iQ != 0) {
                    int i3 = iQ == 1 ? 44 : 45;
                    if (i2 != 45 && i2 != 44) {
                        return new Q1(i3);
                    }
                    q1.N(i3);
                    return q1;
                }
                break;
            case 27:
                if (i2 == 40) {
                    double dN = q1.n();
                    Class<?> cls = C1157l2.a;
                    q1.J(com.github.catvod.spider.merge.Q0.a.a(dN) ^ (-1));
                    return q1;
                }
                break;
            case 29:
                if (i2 == 40) {
                    q1.J(-q1.n());
                    return q1;
                }
                break;
            case 31:
                if (i2 == 39) {
                    q1.N(49);
                    return new Q1(i, q1, Q1.C(q1.u()));
                }
                if (i2 == 33 || i2 == 36) {
                    Q1 q12 = q1.d;
                    Q1 q13 = q1.e;
                    q1.G(q12);
                    q1.G(q13);
                    return new Q1(i, q12, q13);
                }
                if (i2 != 68) {
                    return new Q1(i, new Q1(45), q1);
                }
                Q1 q14 = q1.d;
                q1.G(q14);
                return new Q1(70, q14);
            case 32:
                if (i2 == 39) {
                    q1.N(141);
                    return q1;
                }
                break;
        }
        return new Q1(i, q1);
    }

    private static Q1 k(Q1 q1) {
        if (145 != q1.b) {
            C1162n0.c();
            throw null;
        }
        Q1 q12 = new Q1(54);
        q12.F(3, q1);
        return q12;
    }

    private Q1 l(Q1 q1, Q1 q12, int i) {
        this.a.K0();
        Q1 q13 = new Q1(133, i);
        q13.e(new Q1(2, q1));
        q13.h(new Q1(127, q12, i));
        q13.e(new Q1(3));
        return q13;
    }

    private Q1 o(C1258z c1258z) throws Throwable {
        String strU;
        int i = 90;
        this.b.h(90);
        int iQ = c1258z.q();
        Q1 q1T = t(c1258z.A0());
        ArrayList arrayList = (ArrayList) c1258z.z0();
        int size = arrayList.size();
        Q1[] q1Arr = new Q1[size];
        Q1[] q1Arr2 = new Q1[size];
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            C1231A c1231a = (C1231A) arrayList.get(i3);
            this.b.c(" ");
            this.b.h(123);
            this.b.h(i);
            AbstractC1239f abstractC1239fB0 = c1231a.B0();
            if (abstractC1239fB0.b == 39) {
                strU = abstractC1239fB0.u();
                this.b.c(strU);
            } else {
                m(abstractC1239fB0);
                String strK0 = this.a.p.K0();
                this.a.N(i, strK0, false);
                q1T = c(92, b(93, abstractC1239fB0, this.a.G(strK0)), q1T);
                strU = strK0;
            }
            Q1 q1G = this.a.G(strU);
            this.a.N(157, strU, false);
            q1Arr[i3] = q1G;
            if (c1231a.D0()) {
                this.b.c("of ");
            } else {
                this.b.h(52);
            }
            q1Arr2[i3] = t(c1231a.A0());
            this.b.h(91);
            i3++;
            i = 90;
        }
        Q1 q1 = new Q1(137, new Q1(73, q1T, c1258z.q()), iQ);
        if (c1258z.y0() != null) {
            this.b.c(" ");
            this.b.h(116);
            this.b.h(90);
            q1 = f(t(c1258z.y0()), q1, null, iQ);
            this.b.h(91);
        }
        Q1 q1E = q1;
        int i4 = size - 1;
        int i5 = 0;
        while (i4 >= 0) {
            try {
                C1231A c1231a2 = (C1231A) arrayList.get(i4);
                com.github.catvod.spider.merge.h1.U uK = this.a.K(136, c1231a2.q());
                this.a.B0(uK);
                int i6 = i5 + 1;
                try {
                    q1E = e(157, uK, q1Arr[i4], q1Arr2[i4], q1E, false, c1231a2.D0());
                    i4--;
                    i5 = i6;
                } catch (Throwable th) {
                    th = th;
                    i5 = i6;
                    while (i2 < i5) {
                        this.a.y0();
                        i2++;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        while (i2 < i5) {
            this.a.y0();
            i2++;
        }
        this.b.h(91);
        return q1E;
    }

    private static Q1 p(C1257y c1257y, int i, Q1 q1, int i2) {
        com.github.catvod.spider.merge.h1.K kG1;
        c1257y.q1(i2);
        c1257y.e(q1);
        if (c1257y.H0() != 0) {
            c1257y.w1();
        }
        if (i2 == 2 && (kG1 = c1257y.g1()) != null && kG1.e0() != 0 && c1257y.q0(kG1.d0()) == null) {
            c1257y.t0(new com.github.catvod.spider.merge.h1.Z(113, kG1.d0()));
            Q1 q12 = new Q1(137, new Q1(8, Q1.B(49, kG1.d0()), new Q1(64)));
            Q1 q13 = q12;
            while (true) {
                Q1 q14 = q13.c;
                if (q14 == null) {
                    break;
                }
                q13 = q14;
            }
            q13.c = q1.d;
            q1.d = q12;
            if (q1.e == null) {
                q1.e = q13;
            }
        }
        Q1 q15 = q1.e;
        if (q15 == null || q15.b != 4) {
            q1.e(new Q1(4));
        }
        Q1 q1B = Q1.B(113, c1257y.getName());
        q1B.E(1, i);
        return q1B;
    }

    private static int q(Q1 q1) {
        int i = q1.b;
        if (i == 40) {
            double dN = q1.n();
            return (Double.isNaN(dN) || dN == 0.0d) ? -1 : 1;
        }
        if (i == 42 || i == 44) {
            return -1;
        }
        return i != 45 ? 0 : 1;
    }

    private static com.github.catvod.spider.merge.h1.E r(int i, Q1 q1) {
        com.github.catvod.spider.merge.h1.E e = new com.github.catvod.spider.merge.h1.E(i);
        e.o = q1;
        return e;
    }

    private static Q1 s(Q1 q1) {
        int i = q1.b;
        if (i != 33 && i != 36 && i != 68) {
            if (i == 38) {
                q1.N(71);
                return new Q1(68, q1);
            }
            if (i != 39) {
                return null;
            }
        }
        return q1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.github.catvod.spider.merge.h1.D, com.github.catvod.spider.merge.h1.Q, com.github.catvod.spider.merge.h1.f] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.catvod.spider.merge.h1.f] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.catvod.spider.merge.h1.f] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.github.catvod.spider.merge.f1.Q1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.github.catvod.spider.merge.f1.Q] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.github.catvod.spider.merge.f1.Q1, com.github.catvod.spider.merge.h1.D, com.github.catvod.spider.merge.h1.d, com.github.catvod.spider.merge.h1.f] */
    private Q1 u(C1237d c1237d) {
        ?? T;
        com.github.catvod.spider.merge.h1.K kG1;
        AbstractC1239f abstractC1239fE0 = c1237d.e0();
        Y1 y1 = this.a;
        AbstractC1239f abstractC1239fD0 = c1237d.d0();
        y1.getClass();
        ?? D0 = abstractC1239fD0;
        while (D0 instanceof com.github.catvod.spider.merge.h1.P) {
            D0 = ((com.github.catvod.spider.merge.h1.P) D0).d0();
        }
        if (abstractC1239fE0.b == 42 && c1237d.b == 93 && (D0 instanceof com.github.catvod.spider.merge.h1.K) && (abstractC1239fE0 instanceof com.github.catvod.spider.merge.h1.F)) {
            String strD0 = ((com.github.catvod.spider.merge.h1.K) D0).d0();
            AbstractC1239f abstractC1239fT = c1237d.T();
            while (true) {
                if (abstractC1239fT != null) {
                    if ((abstractC1239fT instanceof C1257y) && (kG1 = ((C1257y) abstractC1239fT).g1()) != null && kG1.d0().equals(strD0)) {
                        ?? q = new com.github.catvod.spider.merge.h1.Q();
                        com.github.catvod.spider.merge.h1.F f = new com.github.catvod.spider.merge.h1.F();
                        f.d0(43);
                        q.f0(f);
                        q.h0(D0);
                        c1237d.f0(q);
                        D0 = q;
                        break;
                    }
                    abstractC1239fT = abstractC1239fT.T();
                } else {
                    break;
                }
            }
        }
        if ((D0 instanceof InterfaceC1248o) && ((InterfaceC1248o) D0).a()) {
            m(D0);
            T = D0;
        } else {
            T = t(D0);
        }
        this.b.h(c1237d.b);
        return b(c1237d.b, T, t(abstractC1239fE0));
    }

    private Q1 v(C1253u c1253u) {
        Q1 q1T = t(c1253u.d0());
        this.b.b(85);
        return new Q1(c1253u.b, q1T, c1253u.q());
    }

    private Q1 w(C1254v c1254v) {
        this.b.h(123);
        if (c1254v.C0()) {
            this.b.c("each ");
        }
        this.b.h(90);
        c1254v.b = 136;
        this.a.B0(c1254v);
        try {
            AbstractC1239f abstractC1239fB0 = c1254v.B0();
            int i = abstractC1239fB0 instanceof com.github.catvod.spider.merge.h1.h0 ? abstractC1239fB0.b : -1;
            Q1 q1T = t(abstractC1239fB0);
            if (c1254v.D0()) {
                this.b.c("of ");
            } else {
                this.b.h(52);
            }
            Q1 q1T2 = t(c1254v.A0());
            this.b.h(91);
            this.b.b(88);
            Q1 q1T3 = t(c1254v.y0());
            this.b.b(89);
            return e(i, c1254v, q1T, q1T2, q1T3, c1254v.C0(), c1254v.D0());
        } finally {
            this.a.y0();
        }
    }

    private Q1 x(C1255w c1255w) {
        com.github.catvod.spider.merge.h1.U u;
        this.b.h(123);
        this.b.h(90);
        c1255w.b = 136;
        Y1 y1 = this.a;
        com.github.catvod.spider.merge.h1.U u2 = y1.q;
        y1.q = c1255w;
        try {
            Q1 q1T = t(c1255w.C0());
            this.b.h(85);
            Q1 q1T2 = t(c1255w.A0());
            this.b.h(85);
            Q1 q1T3 = t(c1255w.B0());
            this.b.h(91);
            this.b.b(88);
            Q1 q1T4 = t(c1255w.y0());
            this.b.b(89);
            if (q1T.b == 157) {
                com.github.catvod.spider.merge.h1.U uX0 = com.github.catvod.spider.merge.h1.U.x0(c1255w);
                uX0.b = 157;
                uX0.h(q1T);
                g(c1255w, 2, q1T4, q1T2, new Q1(132), q1T3);
                uX0.e(c1255w);
                u = uX0;
            } else {
                g(c1255w, 2, q1T4, q1T2, q1T, q1T3);
                u = c1255w;
            }
            return u;
        } finally {
            this.a.q = u2;
        }
    }

    private Q1 y(com.github.catvod.spider.merge.h1.D d) {
        Q1 q1T = t(d.d0());
        this.b.h(d.b);
        Q1 q1T2 = t(d.e0());
        if (d instanceof com.github.catvod.spider.merge.h1.l0) {
            this.b.h(91);
        }
        return c(d.b, q1T, q1T2);
    }

    private Q1 z(com.github.catvod.spider.merge.h1.H h) {
        C1197z c1197z;
        com.github.catvod.spider.merge.h1.G gE0 = h.e0();
        List<com.github.catvod.spider.merge.h1.G> listF0 = h.f0();
        this.b.c(gE0.getName());
        ArrayList arrayList = (ArrayList) listF0;
        int i = 107;
        if (arrayList.size() > 1) {
            for (com.github.catvod.spider.merge.h1.G g : arrayList.subList(1, arrayList.size())) {
                this.b.b(107);
                this.b.c(g.getName());
            }
        }
        if (h.g0().b == 133) {
            this.b.h(67);
            c1197z = this.b;
            i = 88;
        } else {
            c1197z = this.b;
        }
        c1197z.b(i);
        Q1 q1T = t(h.g0());
        if (h.g0().b == 133) {
            this.b.b(89);
        }
        Q1 q1D = Q1.D();
        Q1 q1 = new Q1(133, gE0, q1T, q1D);
        gE0.o = q1D;
        return q1;
    }

    public final com.github.catvod.spider.merge.h1.V D(C1240g c1240g) {
        Y1 y1 = this.a;
        y1.p = c1240g;
        y1.o = c1240g.W0();
        int iL = this.b.l();
        com.github.catvod.spider.merge.h1.V v = (com.github.catvod.spider.merge.h1.V) t(c1240g);
        v.Z0(iL, this.b.l());
        if (this.a.a.f()) {
            v.Y0(this.b.m());
        }
        this.b = null;
        return v;
    }

    final void m(AbstractC1239f abstractC1239f) {
        int i = abstractC1239f.b;
        if (i == 33) {
            com.github.catvod.spider.merge.h1.Q q = (com.github.catvod.spider.merge.h1.Q) abstractC1239f;
            m(q.j0());
            this.b.h(112);
            m(q.i0());
            return;
        }
        if (i == 36) {
            C1250q c1250q = (C1250q) abstractC1239f;
            m(c1250q.e0());
            this.b.h(86);
            m(c1250q.d0());
            this.b.h(87);
            return;
        }
        if (i == 43) {
            this.b.h(i);
            return;
        }
        if (i == 83) {
            this.b.a(abstractC1239f.l());
            return;
        }
        if (i != 132) {
            int i2 = 0;
            if (i == 66) {
                this.b.h(86);
                List<AbstractC1239f> listF0 = ((C1236c) abstractC1239f).f0();
                int size = listF0.size();
                while (i2 < size) {
                    m(listF0.get(i2));
                    if (i2 < size - 1) {
                        this.b.h(92);
                    }
                    i2++;
                }
                this.b.h(87);
                return;
            }
            if (i != 67) {
                switch (i) {
                    case 39:
                        this.b.c(((com.github.catvod.spider.merge.h1.K) abstractC1239f).d0());
                        return;
                    case 40:
                        this.b.d(((com.github.catvod.spider.merge.h1.M) abstractC1239f).d0());
                        return;
                    case 41:
                        this.b.f(((com.github.catvod.spider.merge.h1.W) abstractC1239f).getValue());
                        return;
                    default:
                        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("unexpected token: ");
                        sbB.append(com.github.catvod.spider.merge.L1.k.g(abstractC1239f.b));
                        C1162n0.d(sbB.toString());
                        throw null;
                }
            }
            this.b.h(88);
            List<com.github.catvod.spider.merge.h1.O> listD0 = ((com.github.catvod.spider.merge.h1.N) abstractC1239f).d0();
            int size2 = listD0.size();
            while (i2 < size2) {
                com.github.catvod.spider.merge.h1.O o = listD0.get(i2);
                boolean zEquals = Boolean.TRUE.equals(o.s(26));
                m(o.d0());
                if (!zEquals) {
                    this.b.h(107);
                    m(o.e0());
                }
                if (i2 < size2 - 1) {
                    this.b.h(92);
                }
                i2++;
            }
            this.b.h(89);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.github.catvod.spider.merge.f1.Q1 n(com.github.catvod.spider.merge.h1.C1257y r9) {
        /*
            r8 = this;
            com.github.catvod.spider.merge.h1.K r0 = r9.g1()
            if (r0 == 0) goto L10
            com.github.catvod.spider.merge.f1.z r0 = r8.b
            java.lang.String r1 = r9.getName()
            r0.c(r1)
            goto L1f
        L10:
            com.github.catvod.spider.merge.h1.f r0 = r9.j1()
            if (r0 == 0) goto L1f
            com.github.catvod.spider.merge.h1.f r0 = r9.j1()
            com.github.catvod.spider.merge.f1.Q1 r0 = r8.t(r0)
            goto L20
        L1f:
            r0 = 0
        L20:
            int r1 = r9.h1()
            r2 = 4
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 == 0) goto L37
            int r2 = r9.i1()
            r5 = -1
            if (r2 != r5) goto L37
            r2 = 1
            goto L38
        L37:
            r2 = 0
        L38:
            if (r2 != 0) goto L41
            com.github.catvod.spider.merge.f1.z r5 = r8.b
            r6 = 90
            r5.h(r6)
        L41:
            java.util.List r5 = r9.k1()
            int r6 = r5.size()
            int r6 = r6 - r4
        L4a:
            if (r3 > r6) goto L70
            if (r3 <= 0) goto L55
            com.github.catvod.spider.merge.f1.z r4 = r8.b
            r7 = 92
            r4.h(r7)
        L55:
            boolean r4 = r9.V0()
            if (r4 == 0) goto L64
            if (r3 != r6) goto L64
            com.github.catvod.spider.merge.f1.z r4 = r8.b
            r7 = 174(0xae, float:2.44E-43)
            r4.h(r7)
        L64:
            java.lang.Object r4 = r5.get(r3)
            com.github.catvod.spider.merge.h1.f r4 = (com.github.catvod.spider.merge.h1.AbstractC1239f) r4
            r8.m(r4)
            int r3 = r3 + 1
            goto L4a
        L70:
            if (r2 != 0) goto L79
            com.github.catvod.spider.merge.f1.z r2 = r8.b
            r3 = 91
            r2.h(r3)
        L79:
            if (r1 == 0) goto L82
            com.github.catvod.spider.merge.f1.z r1 = r8.b
            r2 = 168(0xa8, float:2.35E-43)
            r1.h(r2)
        L82:
            boolean r9 = r9.m1()
            if (r9 != 0) goto L8f
            com.github.catvod.spider.merge.f1.z r9 = r8.b
            r1 = 88
            r9.b(r1)
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1101Q.n(com.github.catvod.spider.merge.h1.y):com.github.catvod.spider.merge.f1.Q1");
    }

    public final Q1 t(AbstractC1239f abstractC1239f) {
        Q1 q1T;
        Q1 q1;
        Q1 q12;
        X1 x1;
        Q1 q1T2;
        int i = abstractC1239f.b;
        int i2 = 0;
        if (i == 66) {
            C1236c c1236c = (C1236c) abstractC1239f;
            if (c1236c.a()) {
                return c1236c;
            }
            this.b.h(86);
            List<AbstractC1239f> listF0 = c1236c.f0();
            Q1 q13 = new Q1(66);
            ArrayList arrayList = null;
            for (int i3 = 0; i3 < listF0.size(); i3++) {
                AbstractC1239f abstractC1239f2 = listF0.get(i3);
                if (abstractC1239f2.b != 132) {
                    q13.e(t(abstractC1239f2));
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(i3));
                }
                if (i3 < listF0.size() - 1) {
                    this.b.h(92);
                }
            }
            this.b.h(87);
            q13.E(21, c1236c.e0());
            if (arrayList != null) {
                int[] iArr = new int[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                q13.F(11, iArr);
            }
            return q13;
        }
        if (i == 67) {
            return B((com.github.catvod.spider.merge.h1.N) abstractC1239f);
        }
        if (i == 83) {
            C1241h c1241h = (C1241h) abstractC1239f;
            this.b.a(c1241h.l());
            return c1241h;
        }
        if (i == 84) {
            com.github.catvod.spider.merge.h1.e0 e0Var = (com.github.catvod.spider.merge.h1.e0) abstractC1239f;
            this.b.h(84);
            this.b.b(88);
            Q1 q1T3 = t(e0Var.f0());
            this.b.b(89);
            C1242i c1242i = new C1242i();
            for (C1244k c1244k : e0Var.d0()) {
                this.b.h(128);
                com.github.catvod.spider.merge.h1.K kF0 = c1244k.f0();
                if (kF0 != null) {
                    this.b.h(90);
                    this.b.c(kF0.d0());
                    q1 = this.a.G(kF0.d0());
                    AbstractC1239f abstractC1239fE0 = c1244k.e0();
                    if (abstractC1239fE0 != null) {
                        this.b.c(" ");
                        this.b.h(116);
                        q12 = t(abstractC1239fE0);
                    } else {
                        q12 = new com.github.catvod.spider.merge.h1.r();
                    }
                    this.b.h(91);
                } else {
                    q1 = null;
                    q12 = null;
                }
                this.b.b(88);
                Q1 q1T4 = t(c1244k.d0());
                this.b.b(89);
                int iQ = c1244k.q();
                if (q1 == null) {
                    q1 = new Q1(132);
                }
                if (q12 == null) {
                    q12 = new Q1(132);
                }
                Q1 q14 = new Q1(128, q1, q12, q1T4);
                q14.f = iQ;
                c1242i.e(q14);
            }
            if (e0Var.e0() != null) {
                this.b.h(129);
                this.b.b(88);
                q1T = t(e0Var.e0());
                this.b.b(89);
            } else {
                q1T = null;
            }
            int iQ2 = e0Var.q();
            boolean z = q1T != null && (q1T.b != 133 || q1T.w());
            if (q1T3.b == 133 && !q1T3.w() && !z) {
                return q1T3;
            }
            boolean zW = c1242i.w();
            if (!z && !zW) {
                return q1T3;
            }
            Q1 q15 = new Q1(145);
            com.github.catvod.spider.merge.h1.E e = new com.github.catvod.spider.merge.h1.E(84, q1T3);
            e.f = iQ2;
            int i5 = 3;
            e.F(3, q15);
            if (zW) {
                Q1 q1D = Q1.D();
                e.e(r(5, q1D));
                Q1 q1D2 = Q1.D();
                e.o = q1D2;
                e.e(q1D2);
                Q1 q16 = new Q1(145);
                Q1 q17 = c1242i.d;
                int i6 = 0;
                boolean z2 = false;
                while (q17 != null) {
                    int iQ3 = q17.q();
                    Q1 q18 = q17.d;
                    Q1 q19 = q18.c;
                    Q1 q1F = q19.c;
                    q17.G(q18);
                    q17.G(q19);
                    q17.G(q1F);
                    q1F.e(new Q1(i5));
                    q1F.e(r(5, q1D));
                    if (q19.b == 132) {
                        z2 = true;
                    } else {
                        q1F = f(q19, q1F, null, iQ3);
                    }
                    Q1 q110 = new Q1(57, q18, k(q15));
                    q110.F(3, q16);
                    q110.E(14, i6);
                    q16.e(q110);
                    q16.e(l(k(q16), q1F, iQ3));
                    q17 = q17.c;
                    i6++;
                    i5 = 3;
                }
                e.e(q16);
                if (!z2) {
                    Q1 q111 = new Q1(51);
                    q111.F(3, q15);
                    e.e(q111);
                }
                e.e(q1D);
            }
            if (z) {
                Q1 q1D3 = Q1.D();
                e.j0(q1D3);
                e.e(r(139, q1D3));
                Q1 q1D4 = Q1.D();
                e.e(r(5, q1D4));
                e.e(q1D3);
                Q1 q112 = new Q1(129, q1T);
                q112.F(3, q15);
                e.e(q112);
                e.e(q1D4);
            }
            q15.e(e);
            return q15;
        }
        if (i != 132) {
            if (i == 133) {
                boolean z3 = abstractC1239f instanceof com.github.catvod.spider.merge.h1.U;
                if (z3) {
                    this.a.B0((com.github.catvod.spider.merge.h1.U) abstractC1239f);
                }
                try {
                    ArrayList arrayList2 = new ArrayList();
                    O1 o1 = new O1(abstractC1239f);
                    while (o1.hasNext()) {
                        arrayList2.add(t((AbstractC1239f) ((Q1) o1.next())));
                    }
                    abstractC1239f.e = null;
                    abstractC1239f.d = null;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        abstractC1239f.e((Q1) it.next());
                    }
                    return abstractC1239f;
                } finally {
                    if (z3) {
                    }
                }
            }
            if (i != 169) {
                if (i == 170) {
                    this.b.h(170);
                    List<AbstractC1239f> listD0 = ((com.github.catvod.spider.merge.h1.c0) abstractC1239f).d0();
                    Q1 q1C = Q1.C("");
                    for (AbstractC1239f abstractC1239f3 : listD0) {
                        if (abstractC1239f3.b != 171) {
                            this.b.h(172);
                            q1C = c(21, q1C, t(abstractC1239f3));
                            this.b.h(89);
                        } else {
                            com.github.catvod.spider.merge.h1.b0 b0Var = (com.github.catvod.spider.merge.h1.b0) abstractC1239f3;
                            this.b.g(b0Var.d0());
                            String value = b0Var.getValue();
                            if (value.length() > 0) {
                                q1C = c(21, q1C, Q1.C(value));
                            }
                        }
                    }
                    this.b.h(170);
                    return q1C;
                }
                switch (i) {
                    case 4:
                        com.github.catvod.spider.merge.h1.T t = (com.github.catvod.spider.merge.h1.T) abstractC1239f;
                        Boolean bool = Boolean.TRUE;
                        boolean zEquals = bool.equals(t.s(25));
                        boolean zEquals2 = bool.equals(t.s(27));
                        if (!zEquals) {
                            this.b.h(4);
                        } else if (!zEquals2) {
                            this.b.c(" ");
                        }
                        AbstractC1239f abstractC1239fD0 = t.d0();
                        q1T = abstractC1239fD0 != null ? t(abstractC1239fD0) : null;
                        if (!zEquals) {
                            this.b.b(85);
                        }
                        return abstractC1239fD0 == null ? new Q1(4, t.q()) : new Q1(4, q1T, t.q());
                    case 30:
                        com.github.catvod.spider.merge.h1.L l = (com.github.catvod.spider.merge.h1.L) abstractC1239f;
                        this.b.h(30);
                        Q1 q1D5 = d(30, t(l.e0()));
                        q1D5.f = l.q();
                        List<AbstractC1239f> listD02 = l.d0();
                        this.b.h(90);
                        while (i2 < listD02.size()) {
                            q1D5.e(t(listD02.get(i2)));
                            if (i2 < listD02.size() - 1) {
                                this.b.h(92);
                            }
                            i2++;
                        }
                        this.b.h(91);
                        if (l.h0() != null) {
                            q1D5.e(B(l.h0()));
                        }
                        return q1D5;
                    case 33:
                        com.github.catvod.spider.merge.h1.Q q = (com.github.catvod.spider.merge.h1.Q) abstractC1239f;
                        Q1 q1T5 = t(q.j0());
                        String strD0 = q.i0().d0();
                        this.b.h(112);
                        this.b.c(strD0);
                        return i(q1T5, null, strD0, 0);
                    case 36:
                        C1250q c1250q = (C1250q) abstractC1239f;
                        Q1 q1T6 = t(c1250q.e0());
                        this.b.h(86);
                        Q1 q1T7 = t(c1250q.d0());
                        this.b.h(87);
                        return new Q1(36, q1T6, q1T7);
                    case 48:
                        com.github.catvod.spider.merge.h1.S s = (com.github.catvod.spider.merge.h1.S) abstractC1239f;
                        this.b.e(s.getValue(), s.d0());
                        this.a.p.z0(s);
                        return s;
                    case 50:
                        com.github.catvod.spider.merge.h1.d0 d0Var = (com.github.catvod.spider.merge.h1.d0) abstractC1239f;
                        this.b.h(50);
                        Q1 q1T8 = t(d0Var.d0());
                        this.b.b(85);
                        return new Q1(50, q1T8, d0Var.q());
                    case 73:
                        break;
                    case 106:
                        C1246m c1246m = (C1246m) abstractC1239f;
                        Q1 q1T9 = t(c1246m.e0());
                        this.b.h(106);
                        Q1 q1T10 = t(c1246m.f0());
                        this.b.h(107);
                        Q1 q1T11 = t(c1246m.d0());
                        int iQ4 = q(q1T9);
                        return iQ4 == 1 ? q1T10 : iQ4 == -1 ? q1T11 : new Q1(106, q1T9, q1T10, q1T11);
                    case 113:
                        C1257y c1257y = (C1257y) abstractC1239f;
                        int iH1 = c1257y.h1();
                        int iQ5 = this.b.q(iH1, c1257y.l1());
                        Q1 q1N = n(c1257y);
                        int iY0 = this.a.p.y0(c1257y);
                        Y1 y1 = this.a;
                        y1.getClass();
                        x1 = new X1(y1, c1257y);
                        try {
                            Q1 q113 = (Q1) c1257y.s(23);
                            c1257y.H(23);
                            int iQ6 = c1257y.f1().q();
                            this.a.l++;
                            Q1 q1T12 = t(c1257y.f1());
                            if (!c1257y.m1()) {
                                this.b.h(89);
                            }
                            c1257y.Z0(iQ5, this.b.p());
                            if (iH1 != 2 && !c1257y.m1()) {
                                this.b.h(1);
                            }
                            if (q113 != null) {
                                q1T12.g(new Q1(137, q113, iQ6));
                            }
                            int iH12 = c1257y.h1();
                            Q1 q1P = p(c1257y, iY0, q1T12, iH12);
                            if (q1N != null) {
                                q1P = b(93, q1N, q1P);
                                if (iH12 != 2) {
                                    q1P = new Q1(137, q1P, c1257y.q());
                                }
                            }
                            return q1P;
                        } finally {
                        }
                    case 116:
                        C1233C c1233c = (C1233C) abstractC1239f;
                        this.b.h(116);
                        this.b.h(90);
                        Q1 q1T13 = t(c1233c.d0());
                        this.b.h(91);
                        this.b.b(88);
                        Q1 q1T14 = t(c1233c.f0());
                        if (c1233c.e0() != null) {
                            this.b.h(89);
                            this.b.h(117);
                            this.b.b(88);
                            q1T = t(c1233c.e0());
                        }
                        this.b.b(89);
                        return f(q1T13, q1T14, q1T, c1233c.q());
                    case 118:
                        com.github.catvod.spider.merge.h1.Y y = (com.github.catvod.spider.merge.h1.Y) abstractC1239f;
                        this.b.h(118);
                        this.b.h(90);
                        Q1 q1T15 = t(y.o0());
                        this.b.h(91);
                        y.e(q1T15);
                        Q1 q114 = new Q1(133, y, y.q());
                        this.b.b(88);
                        for (com.github.catvod.spider.merge.h1.X x : y.n0()) {
                            AbstractC1239f abstractC1239fE02 = x.e0();
                            if (abstractC1239fE02 != null) {
                                this.b.h(119);
                                q1T2 = t(abstractC1239fE02);
                            } else {
                                this.b.h(120);
                                q1T2 = null;
                            }
                            this.b.b(107);
                            List<AbstractC1239f> listF02 = x.f0();
                            C1242i c1242i2 = new C1242i();
                            if (listF02 != null) {
                                Iterator it2 = ((ArrayList) listF02).iterator();
                                while (it2.hasNext()) {
                                    c1242i2.e(t((AbstractC1239f) it2.next()));
                                }
                            }
                            if (q114.b != 133) {
                                C1162n0.c();
                                throw null;
                            }
                            com.github.catvod.spider.merge.h1.E e2 = (com.github.catvod.spider.merge.h1.E) q114.d;
                            if (e2.b != 118) {
                                C1162n0.c();
                                throw null;
                            }
                            Q1 q1D6 = Q1.D();
                            if (q1T2 != null) {
                                com.github.catvod.spider.merge.h1.E e3 = new com.github.catvod.spider.merge.h1.E(119, q1T2);
                                e3.o = q1D6;
                                e2.e(e3);
                            } else {
                                e2.i0(q1D6);
                            }
                            q114.e(q1D6);
                            q114.e(c1242i2);
                        }
                        this.b.b(89);
                        if (q114.b != 133) {
                            C1162n0.c();
                            throw null;
                        }
                        com.github.catvod.spider.merge.h1.E e4 = (com.github.catvod.spider.merge.h1.E) q114.d;
                        if (e4.b != 118) {
                            C1162n0.c();
                            throw null;
                        }
                        Q1 q1D7 = Q1.D();
                        e4.o = q1D7;
                        Q1 q1E0 = e4.e0();
                        if (q1E0 == null) {
                            q1E0 = q1D7;
                        }
                        q114.d(r(5, q1E0), e4);
                        q114.e(q1D7);
                        return q114;
                    case 127:
                        com.github.catvod.spider.merge.h1.k0 k0Var = (com.github.catvod.spider.merge.h1.k0) abstractC1239f;
                        this.b.h(127);
                        this.b.h(90);
                        Q1 q1T16 = t(k0Var.d0());
                        this.b.h(91);
                        this.b.b(88);
                        Q1 q1T17 = t(k0Var.e0());
                        this.b.b(89);
                        return l(q1T16, q1T17, k0Var.q());
                    case 140:
                        com.github.catvod.spider.merge.h1.V v = (com.github.catvod.spider.merge.h1.V) abstractC1239f;
                        this.b.h(140);
                        Y1 y12 = this.a;
                        if (y12.q != null) {
                            C1162n0.c();
                            throw null;
                        }
                        y12.q = v;
                        O1 o12 = new O1(v);
                        Q1 q115 = null;
                        Q1 q116 = null;
                        while (o12.hasNext()) {
                            Q1 q1T18 = t((AbstractC1239f) ((Q1) o12.next()));
                            q1T18.c = null;
                            if (q116 == null) {
                                q115 = q1T18;
                            } else {
                                q116.c = q1T18;
                            }
                            q116 = q1T18;
                        }
                        v.e = null;
                        v.d = null;
                        if (q115 != null) {
                            v.h(q115);
                        }
                        return v;
                    case 161:
                        C1234a c1234a = (C1234a) abstractC1239f;
                        int iQ7 = c1234a.q();
                        com.github.catvod.spider.merge.h1.U uK = this.a.K(161, iQ7);
                        String strK0 = this.a.p.K0();
                        this.a.B0(uK);
                        try {
                            this.a.N(157, strK0, false);
                            Q1 q117 = new Q1(133, iQ7);
                            q117.e(new Q1(137, b(93, this.a.G(strK0), d(30, this.a.G("Array"))), iQ7));
                            q117.e(a(c1234a, strK0));
                            uK.e(q117);
                            uK.e(this.a.G(strK0));
                            return uK;
                        } finally {
                        }
                    case 173:
                        com.github.catvod.spider.merge.h1.a0 a0Var = (com.github.catvod.spider.merge.h1.a0) abstractC1239f;
                        Q1 q1D8 = d(38, t(a0Var.d0()));
                        q1D8.f = a0Var.q();
                        this.b.h(170);
                        com.github.catvod.spider.merge.h1.c0 c0Var = (com.github.catvod.spider.merge.h1.c0) a0Var.e0();
                        List<AbstractC1239f> listD03 = c0Var.d0();
                        q1D8.e(c0Var);
                        for (AbstractC1239f abstractC1239f4 : listD03) {
                            if (abstractC1239f4.b != 171) {
                                this.b.h(172);
                                q1D8.e(t(abstractC1239f4));
                                this.b.h(89);
                            } else {
                                this.b.g(((com.github.catvod.spider.merge.h1.b0) abstractC1239f4).d0());
                            }
                        }
                        this.a.p.B0(c0Var);
                        this.b.h(170);
                        return q1D8;
                    default:
                        switch (i) {
                            case 38:
                                C1256x c1256x = (C1256x) abstractC1239f;
                                Q1 q1D9 = d(38, t(c1256x.e0()));
                                q1D9.f = c1256x.q();
                                this.b.h(90);
                                List<AbstractC1239f> listD04 = c1256x.d0();
                                while (i2 < listD04.size()) {
                                    q1D9.e(t(listD04.get(i2)));
                                    if (i2 < listD04.size() - 1) {
                                        this.b.h(92);
                                    }
                                    i2++;
                                }
                                this.b.h(91);
                                return q1D9;
                            case 39:
                                com.github.catvod.spider.merge.h1.K k = (com.github.catvod.spider.merge.h1.K) abstractC1239f;
                                this.b.c(k.d0());
                                return k;
                            case 40:
                                com.github.catvod.spider.merge.h1.M m = (com.github.catvod.spider.merge.h1.M) abstractC1239f;
                                this.b.d(m.d0());
                                return m;
                            case 41:
                                com.github.catvod.spider.merge.h1.W w = (com.github.catvod.spider.merge.h1.W) abstractC1239f;
                                this.b.f(w.getValue());
                                return Q1.C(w.getValue());
                            default:
                                switch (i) {
                                    case 121:
                                        com.github.catvod.spider.merge.h1.j0 j0Var = (com.github.catvod.spider.merge.h1.j0) abstractC1239f;
                                        this.b.h(121);
                                        j0Var.b = 136;
                                        this.a.B0(j0Var);
                                        try {
                                            this.b.h(90);
                                            Q1 q1T19 = t(j0Var.A0());
                                            this.b.h(91);
                                            this.b.b(88);
                                            Q1 q1T20 = t(j0Var.y0());
                                            this.b.b(89);
                                            g(j0Var, 1, q1T20, q1T19, null, null);
                                            return j0Var;
                                        } finally {
                                        }
                                    case 122:
                                        C1249p c1249p = (C1249p) abstractC1239f;
                                        c1249p.b = 136;
                                        this.a.B0(c1249p);
                                        try {
                                            this.b.h(122);
                                            this.b.b(88);
                                            Q1 q1T21 = t(c1249p.y0());
                                            this.b.h(89);
                                            this.b.h(121);
                                            this.b.h(90);
                                            Q1 q1T22 = t(c1249p.A0());
                                            this.b.h(91);
                                            this.b.b(85);
                                            g(c1249p, 0, q1T21, q1T22, null, null);
                                            return c1249p;
                                        } finally {
                                        }
                                    case 123:
                                        return abstractC1239f instanceof C1254v ? w((C1254v) abstractC1239f) : x((C1255w) abstractC1239f);
                                    case 124:
                                        C1243j c1243j = (C1243j) abstractC1239f;
                                        this.b.h(124);
                                        if (c1243j.m0() != null) {
                                            this.b.c(c1243j.m0().d0());
                                        }
                                        this.b.b(85);
                                        return c1243j;
                                    case 125:
                                        C1247n c1247n = (C1247n) abstractC1239f;
                                        this.b.h(125);
                                        if (c1247n.m0() != null) {
                                            this.b.c(c1247n.m0().d0());
                                        }
                                        this.b.b(85);
                                        return c1247n;
                                    default:
                                        switch (i) {
                                            case 164:
                                                break;
                                            case 165:
                                                break;
                                            case 166:
                                                C1258z c1258z = (C1258z) abstractC1239f;
                                                C1257y c1257y2 = new C1257y();
                                                c1257y2.c1(this.a.p.K0());
                                                c1257y2.t1();
                                                c1257y2.q1(2);
                                                c1257y2.w1();
                                                int iH13 = c1257y2.h1();
                                                int iQ8 = this.b.q(iH13, false);
                                                Q1 q1N2 = n(c1257y2);
                                                int iY02 = this.a.p.y0(c1257y2);
                                                Y1 y13 = this.a;
                                                y13.getClass();
                                                x1 = new X1(y13, c1257y2);
                                                try {
                                                    Q1 q118 = (Q1) c1257y2.s(23);
                                                    c1257y2.H(23);
                                                    int i7 = c1258z.f;
                                                    this.a.l++;
                                                    Q1 q1O = o(c1258z);
                                                    if (!c1257y2.m1()) {
                                                        this.b.h(89);
                                                    }
                                                    c1257y2.Z0(iQ8, this.b.p());
                                                    if (iH13 != 2 && !c1257y2.m1()) {
                                                        this.b.h(1);
                                                    }
                                                    if (q118 != null) {
                                                        q1O.g(new Q1(137, q118, i7));
                                                    }
                                                    int iH14 = c1257y2.h1();
                                                    Q1 q1P2 = p(c1257y2, iY02, q1O, iH14);
                                                    if (q1N2 != null) {
                                                        q1P2 = b(93, q1N2, q1P2);
                                                        if (iH14 != 2) {
                                                            q1P2 = new Q1(137, q1P2, c1257y2.q());
                                                        }
                                                    }
                                                    this.a.l--;
                                                    x1.a();
                                                    Q1 q1D10 = d(38, q1P2);
                                                    q1D10.f = c1258z.q();
                                                    this.b.h(90);
                                                    this.b.h(91);
                                                    return q1D10;
                                                } finally {
                                                }
                                            default:
                                                if (abstractC1239f instanceof C1253u) {
                                                    return v((C1253u) abstractC1239f);
                                                }
                                                if (abstractC1239f instanceof C1237d) {
                                                    return u((C1237d) abstractC1239f);
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.f0) {
                                                    return E((com.github.catvod.spider.merge.h1.f0) abstractC1239f);
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.g0) {
                                                    return F((com.github.catvod.spider.merge.h1.g0) abstractC1239f);
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.q0) {
                                                    return J((com.github.catvod.spider.merge.h1.q0) abstractC1239f);
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.D) {
                                                    return y((com.github.catvod.spider.merge.h1.D) abstractC1239f);
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.h0) {
                                                    com.github.catvod.spider.merge.h1.h0 h0Var = (com.github.catvod.spider.merge.h1.h0) abstractC1239f;
                                                    H(h0Var);
                                                    return h0Var;
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.P) {
                                                    return C((com.github.catvod.spider.merge.h1.P) abstractC1239f);
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.H) {
                                                    return z((com.github.catvod.spider.merge.h1.H) abstractC1239f);
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.I) {
                                                    com.github.catvod.spider.merge.h1.I i8 = (com.github.catvod.spider.merge.h1.I) abstractC1239f;
                                                    A(i8);
                                                    return i8;
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.s0) {
                                                    return L((com.github.catvod.spider.merge.h1.s0) abstractC1239f);
                                                }
                                                if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.p0) {
                                                    return I((com.github.catvod.spider.merge.h1.p0) abstractC1239f);
                                                }
                                                throw new IllegalArgumentException("Can't transform: " + abstractC1239f);
                                        }
                                        break;
                                }
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                                this.b.h(i);
                                return abstractC1239f;
                        }
                        break;
                }
            }
            com.github.catvod.spider.merge.h1.u0 u0Var = (com.github.catvod.spider.merge.h1.u0) abstractC1239f;
            this.b.h(u0Var.b);
            q1T = u0Var.d0() != null ? t(u0Var.d0()) : null;
            return q1T != null ? new Q1(u0Var.b, q1T, u0Var.q()) : new Q1(u0Var.b, u0Var.q());
        }
        return abstractC1239f;
    }
}
