package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0019b extends k1 {
    static final String[] A;
    static final String[] B;
    static final String[] C;
    static final String[] D;
    static final String[] E;
    static final String[] x;
    static final String[] y;
    static final String[] z;
    private B l;
    private B m;
    private boolean n;

    @Nullable
    private com.github.catvod.spider.merge.L.m o;

    @Nullable
    private com.github.catvod.spider.merge.L.p p;
    private ArrayList<com.github.catvod.spider.merge.L.m> q;
    private ArrayList<B> r;
    private List<String> s;
    private M t;
    private boolean u;
    private boolean v;
    private String[] w = {null};

    static {
        String strD = oZP.d("160E0735053A1B");
        String strD2 = oZP.d("1D1B1A2D");
        String strD3 = oZP.d("010E152D09");
        String strD4 = oZP.d("010B");
        String strD5 = oZP.d("0107");
        x = new String[]{oZP.d("141F072D0921"), strD, strD2, oZP.d("180E0530193010"), oZP.d("1A0D1D240F21"), strD3, strD4, strD5};
        y = new String[]{oZP.d("1A03"), oZP.d("0003")};
        z = new String[]{oZP.d("171A0335033B")};
        A = new String[]{strD2, strD3};
        String strD6 = oZP.d("1A1F03261E3A001F");
        String strD7 = oZP.d("1A1F0328033B");
        B = new String[]{strD6, strD7};
        String strD8 = oZP.d("110B");
        String strD9 = oZP.d("111B");
        String strD10 = oZP.d("1906");
        String strD11 = oZP.d("05");
        C = new String[]{strD8, strD9, strD10, strD6, strD7, strD11, oZP.d("070D"), oZP.d("071F"), oZP.d("071B"), oZP.d("071B14")};
        D = new String[]{strD, oZP.d("16001B261E3A001F"), strD8, strD9, strD10, strD6, strD7, strD11, oZP.d("070D"), oZP.d("071F"), oZP.d("071B"), oZP.d("071B14"), oZP.d("010D182515"), strD4, oZP.d("0109182E18"), strD5, oZP.d("0107122008"), oZP.d("011D")};
        E = new String[]{oZP.d("140B1333092606"), oZP.d("141F072D0921"), oZP.d("141D1220"), oZP.d("141D03280F3910"), oZP.d("141C1E2509"), oZP.d("170E0424"), oZP.d("170E04240A3A1B1B"), oZP.d("1708042E193B11"), oZP.d("17031822072400000324"), oZP.d("17001338"), oZP.d("171D"), oZP.d("171A0335033B"), strD, oZP.d("160A19350927"), oZP.d("16001B"), oZP.d("16001B261E3A001F"), oZP.d("16001A2C0D3B11"), strD8, oZP.d("110A0320053906"), oZP.d("110605"), oZP.d("110601"), oZP.d("1103"), strD9, oZP.d("1002152408"), oZP.d("1306122D0826101B"), oZP.d("130610220D250106182F"), oZP.d("130610341E30"), oZP.d("130018350927"), oZP.d("1300052C"), oZP.d("131D162C09"), oZP.d("131D162C0926101B"), oZP.d("1D5E"), oZP.d("1D5D"), oZP.d("1D5C"), oZP.d("1D5B"), oZP.d("1D5A"), oZP.d("1D59"), oZP.d("1D0A1625"), oZP.d("1D0A16250927"), oZP.d("1D08052E1925"), oZP.d("1D1D"), strD2, oZP.d("1C0905200130"), oZP.d("1C0210"), oZP.d("1C01073418"), oZP.d("1C1C1E2F08300D"), strD10, oZP.d("1906192A"), oZP.d("19060435053B12"), oZP.d("180E0530193010"), oZP.d("180A1934"), oZP.d("180A0320"), oZP.d("1B0E01"), oZP.d("1B00122C0E3011"), oZP.d("1B0011330D38101C"), oZP.d("1B0004221E3C051B"), oZP.d("1A0D1D240F21"), oZP.d("1A03"), strD11, oZP.d("050E052001"), oZP.d("050316280221101703"), oZP.d("051D12"), oZP.d("060C05281C21"), oZP.d("060A1435053A1B"), oZP.d("060A1B240F21"), oZP.d("061B0E2D09"), oZP.d("061A1A2C0D270C"), strD3, oZP.d("010D182515"), strD4, oZP.d("010A0F350D27100E"), oZP.d("0109182E18"), strD5, oZP.d("0107122008"), oZP.d("0106032D09"), oZP.d("011D"), oZP.d("0003"), oZP.d("020D05"), oZP.d("0D0207")};
    }

    private boolean H(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strI0 = this.e.get(size).i0();
            if (com.github.catvod.spider.merge.K.b.c(strI0, strArr)) {
                return true;
            }
            if (com.github.catvod.spider.merge.K.b.c(strI0, strArr2)) {
                return false;
            }
            if (strArr3 != null && com.github.catvod.spider.merge.K.b.c(strI0, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Q(com.github.catvod.spider.merge.L.s r3) {
        /*
            r2 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.L.m> r0 = r2.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.github.catvod.spider.merge.L.h r0 = r2.d
            goto L27
        Lb:
            boolean r0 = r2.v
            if (r0 == 0) goto L23
            com.github.catvod.spider.merge.L.m r0 = r2.a()
            java.lang.String r0 = r0.i0()
            java.lang.String[] r1 = com.github.catvod.spider.merge.M.A.A
            boolean r0 = com.github.catvod.spider.merge.K.b.c(r0, r1)
            if (r0 == 0) goto L23
            r2.O(r3)
            goto L2a
        L23:
            com.github.catvod.spider.merge.L.m r0 = r2.a()
        L27:
            r0.L(r3)
        L2a:
            boolean r0 = r3 instanceof com.github.catvod.spider.merge.L.m
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.L.m r3 = (com.github.catvod.spider.merge.L.m) r3
            com.github.catvod.spider.merge.M.G r0 = r3.s0()
            boolean r0 = r0.e()
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.L.p r0 = r2.p
            if (r0 == 0) goto L41
            r0.y0(r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.M.C0019b.Q(com.github.catvod.spider.merge.L.s):void");
    }

    private static boolean Z(ArrayList<com.github.catvod.spider.merge.L.m> arrayList, com.github.catvod.spider.merge.L.m mVar) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == mVar) {
                return true;
            }
            size--;
        }
        return false;
    }

    private void o(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.L.m mVar = this.e.get(size);
            String strI0 = mVar.i0();
            int i = com.github.catvod.spider.merge.K.b.f;
            int length = strArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].equals(strI0)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2 || mVar.i0().equals(oZP.d("1D1B1A2D"))) {
                return;
            }
            this.e.remove(size);
        }
    }

    @Nullable
    final com.github.catvod.spider.merge.L.m A(String str) {
        int size = this.e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            com.github.catvod.spider.merge.L.m mVar = this.e.get(size);
            if (mVar.i0().equals(str)) {
                return mVar;
            }
            size--;
        }
        return null;
    }

    final com.github.catvod.spider.merge.L.m B() {
        return this.o;
    }

    final List<String> C() {
        return this.s;
    }

    final boolean D(String str) {
        return E(str, z);
    }

    final boolean E(String str, String[] strArr) {
        String[] strArr2 = x;
        String[] strArr3 = this.w;
        strArr3[0] = str;
        return H(strArr3, strArr2, strArr);
    }

    final boolean F(String[] strArr) {
        return H(strArr, x, null);
    }

    final boolean G(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String strI0 = this.e.get(size).i0();
            if (strI0.equals(str)) {
                return true;
            }
            if (!com.github.catvod.spider.merge.K.b.c(strI0, B)) {
                return false;
            }
        }
        com.github.catvod.spider.merge.J.c.a(oZP.d("260718340031550118354C37104F05240D361D0E152D09"));
        throw null;
    }

    final boolean I(String str) {
        String[] strArr = A;
        String[] strArr2 = this.w;
        strArr2[0] = str;
        return H(strArr2, strArr, null);
    }

    final com.github.catvod.spider.merge.L.m J(N n) {
        if (n.u() && !n.n.isEmpty() && n.n.k(this.h) > 0) {
            Object[] objArr = {n.e};
            D dA = this.a.a();
            if (dA.a()) {
                dA.add(new C(this.b, oZP.d("311D18311C30114F13341C391C0C16350975141B03330537001B12691F7C550619611834124F2C641F08"), objArr));
            }
        }
        if (!n.m) {
            G gK = k(n.w(), this.h);
            E e = this.h;
            com.github.catvod.spider.merge.L.c cVar = n.n;
            e.c(cVar);
            com.github.catvod.spider.merge.L.m mVar = new com.github.catvod.spider.merge.L.m(gK, null, cVar);
            Q(mVar);
            this.e.add(mVar);
            return mVar;
        }
        com.github.catvod.spider.merge.L.m mVarM = M(n);
        this.e.add(mVarM);
        this.c.v(j1.a);
        T t = this.c;
        M m = this.t;
        m.h();
        m.v(mVarM.t0());
        t.k(m);
        return mVarM;
    }

    final void K(I i) {
        com.github.catvod.spider.merge.L.m mVarA = a();
        String strI0 = mVarA.i0();
        String strL = i.l();
        mVarA.L(i instanceof H ? new com.github.catvod.spider.merge.L.d(strL) : e(strI0) ? new com.github.catvod.spider.merge.L.f(strL) : new com.github.catvod.spider.merge.L.v(strL));
    }

    final void L(J j) {
        Q(new com.github.catvod.spider.merge.L.e(j.m()));
    }

    final com.github.catvod.spider.merge.L.m M(N n) {
        G gK = k(n.w(), this.h);
        E e = this.h;
        com.github.catvod.spider.merge.L.c cVar = n.n;
        e.c(cVar);
        com.github.catvod.spider.merge.L.m mVar = new com.github.catvod.spider.merge.L.m(gK, null, cVar);
        Q(mVar);
        if (n.m) {
            if (!gK.g()) {
                gK.l();
            } else if (!gK.d()) {
                this.c.s(oZP.d("210E10613770063257220D3B1B0003610E30551C122D0A7516031832053B1254572F0321550E5737033C114F03200B"), gK.j());
            }
        }
        return mVar;
    }

    final com.github.catvod.spider.merge.L.p N(N n, boolean z2, boolean z3) {
        G gK = k(n.w(), this.h);
        E e = this.h;
        com.github.catvod.spider.merge.L.c cVar = n.n;
        e.c(cVar);
        com.github.catvod.spider.merge.L.p pVar = new com.github.catvod.spider.merge.L.p(gK, cVar);
        if (!z3 || !Y(oZP.d("010A1A310034010A"))) {
            this.p = pVar;
        }
        Q(pVar);
        if (z2) {
            this.e.add(pVar);
        }
        return pVar;
    }

    final void O(com.github.catvod.spider.merge.L.s sVar) {
        com.github.catvod.spider.merge.L.m mVarL;
        com.github.catvod.spider.merge.L.m mVarA = A(oZP.d("010E152D09"));
        boolean z2 = false;
        if (mVarA == null) {
            mVarL = this.e.get(0);
        } else if (mVarA.k0() != null) {
            mVarL = mVarA.k0();
            z2 = true;
        } else {
            mVarL = l(mVarA);
        }
        if (!z2) {
            mVarL.L(sVar);
        } else {
            com.github.catvod.spider.merge.J.c.g(mVarA);
            mVarA.S(sVar);
        }
    }

    final void P() {
        this.q.add(null);
    }

    final com.github.catvod.spider.merge.L.m R() {
        com.github.catvod.spider.merge.L.m mVar = new com.github.catvod.spider.merge.L.m(k(oZP.d("1D1B1A2D"), this.h), null, null);
        Q(mVar);
        this.e.add(mVar);
        return mVar;
    }

    final boolean S(com.github.catvod.spider.merge.L.m mVar) {
        return Z(this.q, mVar);
    }

    final boolean T(com.github.catvod.spider.merge.L.m mVar) {
        return com.github.catvod.spider.merge.K.b.c(mVar.i0(), E);
    }

    final void U() {
        this.m = this.l;
    }

    final void V(com.github.catvod.spider.merge.L.m mVar) {
        if (this.n) {
            return;
        }
        String strA = mVar.a(oZP.d("1D1D1227"));
        if (strA.length() != 0) {
            this.f = strA;
            this.n = true;
            this.d.F(strA);
        }
    }

    final void W() {
        this.s = new ArrayList();
    }

    final boolean X(com.github.catvod.spider.merge.L.m mVar) {
        return Z(this.e, mVar);
    }

    final boolean Y(String str) {
        return A(str) != null;
    }

    final B a0() {
        return this.m;
    }

    final com.github.catvod.spider.merge.L.m b0() {
        return this.e.remove(this.e.size() - 1);
    }

    @Override // com.github.catvod.spider.merge.M.k1
    final E c() {
        return E.c;
    }

    @Nullable
    final com.github.catvod.spider.merge.L.m c0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.L.m mVar = this.e.get(size);
            this.e.remove(size);
            if (mVar.i0().equals(str)) {
                boolean z2 = this.g instanceof M;
                return mVar;
            }
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.M.k1
    @ParametersAreNonnullByDefault
    protected final void d(Reader reader, String str, F f) {
        super.d(reader, str, f);
        this.l = B.a;
        this.m = null;
        this.n = false;
        this.o = null;
        this.p = null;
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.s = new ArrayList();
        this.t = new M();
        this.u = true;
        this.v = false;
    }

    @Nullable
    final B d0() {
        if (this.r.size() <= 0) {
            return null;
        }
        return this.r.remove(r0.size() - 1);
    }

    @Override // com.github.catvod.spider.merge.M.k1
    protected final boolean e(String str) {
        return str.equals(oZP.d("060C05281C21")) || str.equals(oZP.d("061B0E2D09"));
    }

    final int e0(com.github.catvod.spider.merge.L.m mVar) {
        for (int i = 0; i < this.q.size(); i++) {
            if (mVar == this.q.get(i)) {
                return i;
            }
        }
        return -1;
    }

    final boolean f0(Q q, B b) {
        this.g = q;
        return b.d(q, this);
    }

    @Override // com.github.catvod.spider.merge.M.k1
    protected final boolean g(Q q) {
        this.g = q;
        return this.l.d(q, this);
    }

    final void g0(com.github.catvod.spider.merge.L.m mVar) {
        m(mVar);
        this.q.add(mVar);
    }

    final void h0(B b) {
        this.r.add(b);
    }

    final void i0(com.github.catvod.spider.merge.L.m mVar, int i) {
        m(mVar);
        try {
            this.q.add(i, mVar);
        } catch (IndexOutOfBoundsException unused) {
            this.q.add(mVar);
        }
    }

    final void j0() {
        com.github.catvod.spider.merge.L.m mVar;
        C0019b c0019b;
        if (this.e.size() > 256) {
            return;
        }
        if (this.q.size() > 0) {
            mVar = this.q.get(r0.size() - 1);
        } else {
            mVar = null;
        }
        if (mVar == null || X(mVar)) {
            return;
        }
        int size = this.q.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        boolean z2 = true;
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            mVar = this.q.get(i3);
            if (mVar == null || X(mVar)) {
                c0019b = this;
                z2 = false;
                break;
            }
        }
        c0019b = this;
        while (true) {
            if (!z2) {
                i3++;
                mVar = c0019b.q.get(i3);
            }
            com.github.catvod.spider.merge.J.c.g(mVar);
            com.github.catvod.spider.merge.L.m mVar2 = new com.github.catvod.spider.merge.L.m(c0019b.k(mVar.i0(), c0019b.h), null, mVar.d().clone());
            c0019b.Q(mVar2);
            c0019b.e.add(mVar2);
            c0019b.q.set(i3, mVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    final void k0(com.github.catvod.spider.merge.L.m mVar) {
        int size = this.q.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.q.get(size) != mVar);
        this.q.remove(size);
    }

    @Nullable
    final com.github.catvod.spider.merge.L.m l(com.github.catvod.spider.merge.L.m mVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == mVar) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    final boolean l0(com.github.catvod.spider.merge.L.m mVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == mVar) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    final void m(com.github.catvod.spider.merge.L.m mVar) {
        int size = this.q.size() - 1;
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = 0;
        while (size >= i) {
            com.github.catvod.spider.merge.L.m mVar2 = this.q.get(size);
            if (mVar2 == null) {
                return;
            }
            if (mVar.i0().equals(mVar2.i0()) && mVar.d().equals(mVar2.d())) {
                i2++;
            }
            if (i2 == 3) {
                this.q.remove(size);
                return;
            }
            size--;
        }
    }

    final void m0(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        ArrayList<com.github.catvod.spider.merge.L.m> arrayList = this.q;
        int iLastIndexOf = arrayList.lastIndexOf(mVar);
        com.github.catvod.spider.merge.J.c.c(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, mVar2);
    }

    final void n() {
        while (!this.q.isEmpty()) {
            int size = this.q.size();
            if ((size > 0 ? this.q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    final void n0() {
        if (!Y(oZP.d("17001338"))) {
            this.e.add(this.d.y0());
        }
        this.l = B.g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194 A[LOOP:0: B:10:0x0020->B:109:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /*  JADX ERROR: NullPointerException in pass: SwitchBreakVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean o0() {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.M.C0019b.o0():boolean");
    }

    final void p() {
        o(oZP.d("010D182515"), oZP.d("0109182E18"), oZP.d("0107122008"), oZP.d("010A1A310034010A"));
    }

    final void p0() {
        this.p = null;
    }

    final void q() {
        o(oZP.d("010E152D09"), oZP.d("010A1A310034010A"));
    }

    final void q0(boolean z2) {
        this.v = z2;
    }

    final void r() {
        o(oZP.d("011D"), oZP.d("010A1A310034010A"));
    }

    final void r0(com.github.catvod.spider.merge.L.m mVar) {
        this.o = mVar;
    }

    final void s() {
        String strD = oZP.d("05");
        w(strD);
        if (!strD.equals(a().i0())) {
            t(this.l);
        }
        c0(strD);
    }

    final B s0() {
        return this.l;
    }

    final void t(B b) {
        if (this.a.a().a()) {
            this.a.a().add(new C(this.b, oZP.d("200112391C30161B12254C70064F032E07301B4F2C641F0855181F2402751C0157321834010A571A492628"), this.g.getClass().getSimpleName(), this.g, b));
        }
    }

    final int t0() {
        return this.r.size();
    }

    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("211D12242E201C0313241E2E161A0533093B013B182A093B48"));
        sbC.append(this.g);
        sbC.append(oZP.d("594F04350D211052"));
        sbC.append(this.l);
        sbC.append(oZP.d("594F14341E27100103040030180A193551"));
        sbC.append(a());
        sbC.append('}');
        return sbC.toString();
    }

    final void u(boolean z2) {
        this.u = z2;
    }

    final void u0(B b) {
        this.l = b;
    }

    final boolean v() {
        return this.u;
    }

    final void w(String str) {
        while (com.github.catvod.spider.merge.K.b.c(a().i0(), C)) {
            if (str != null && b(str)) {
                return;
            } else {
                b0();
            }
        }
    }

    final void x(boolean z2) {
        String[] strArr = z2 ? D : C;
        while (com.github.catvod.spider.merge.K.b.c(a().i0(), strArr)) {
            b0();
        }
    }

    final com.github.catvod.spider.merge.L.m y(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.L.m mVar = this.q.get(size);
            if (mVar == null) {
                return null;
            }
            if (mVar.i0().equals(str)) {
                return mVar;
            }
        }
        return null;
    }

    @Nullable
    final com.github.catvod.spider.merge.L.p z() {
        return this.p;
    }
}
