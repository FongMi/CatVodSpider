package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0840b extends k1 {
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
    private com.github.catvod.spider.merge.UY.m o;

    @Nullable
    private com.github.catvod.spider.merge.UY.p p;
    private ArrayList<com.github.catvod.spider.merge.UY.m> q;
    private ArrayList<B> r;
    private List<String> s;
    private M t;
    private boolean u;
    private boolean v;
    private String[] w = {null};

    static {
        String strD = ZrJ.d("1A223B39212A17");
        String strD2 = ZrJ.d("11372621");
        String strD3 = ZrJ.d("0D2229212D");
        String strD4 = ZrJ.d("0D27");
        String strD5 = ZrJ.d("0D2B");
        x = new String[]{ZrJ.d("18333B212D31"), strD, strD2, ZrJ.d("1422393C3D201C"), ZrJ.d("162121282B31"), strD3, strD4, strD5};
        y = new String[]{ZrJ.d("162F"), ZrJ.d("0C2F")};
        z = new String[]{ZrJ.d("1B363F39272B")};
        A = new String[]{strD2, strD3};
        String strD6 = ZrJ.d("16333F2A3A2A0C33");
        String strD7 = ZrJ.d("16333F24272B");
        B = new String[]{strD6, strD7};
        String strD8 = ZrJ.d("1D27");
        String strD9 = ZrJ.d("1D37");
        String strD10 = ZrJ.d("152A");
        String strD11 = ZrJ.d("09");
        C = new String[]{strD8, strD9, strD10, strD6, strD7, strD11, ZrJ.d("0B21"), ZrJ.d("0B33"), ZrJ.d("0B37"), ZrJ.d("0B3728")};
        D = new String[]{strD, ZrJ.d("1A2C272A3A2A0C33"), strD8, strD9, strD10, strD6, strD7, strD11, ZrJ.d("0B21"), ZrJ.d("0B33"), ZrJ.d("0B37"), ZrJ.d("0B3728"), ZrJ.d("0D21242931"), strD4, ZrJ.d("0D2524223C"), strD5, ZrJ.d("0D2B2E2C2C"), ZrJ.d("0D31")};
        E = new String[]{ZrJ.d("18272F3F2D360A"), ZrJ.d("18333B212D31"), ZrJ.d("18312E2C"), ZrJ.d("18313F242B291C"), ZrJ.d("183022292D"), ZrJ.d("1B223828"), ZrJ.d("1B2238282E2A1737"), ZrJ.d("1B2438223D2B1D"), ZrJ.d("1B2F242E23340C2C3F28"), ZrJ.d("1B2C2F34"), ZrJ.d("1B31"), ZrJ.d("1B363F39272B"), strD, ZrJ.d("1A2625392D37"), ZrJ.d("1A2C27"), ZrJ.d("1A2C272A3A2A0C33"), ZrJ.d("1A2C2620292B1D"), strD8, ZrJ.d("1D263F2C21290A"), ZrJ.d("1D2A39"), ZrJ.d("1D2A3D"), ZrJ.d("1D2F"), strD9, ZrJ.d("1C2E29282C"), ZrJ.d("1F2A2E212C361C37"), ZrJ.d("1F2A2C2E29350D2A2423"), ZrJ.d("1F2A2C383A20"), ZrJ.d("1F2C24392D37"), ZrJ.d("1F2C3920"), ZrJ.d("1F312A202D"), ZrJ.d("1F312A202D361C37"), ZrJ.d("1172"), ZrJ.d("1171"), ZrJ.d("1170"), ZrJ.d("1177"), ZrJ.d("1176"), ZrJ.d("1175"), ZrJ.d("11262A29"), ZrJ.d("11262A292D37"), ZrJ.d("112439223D35"), ZrJ.d("1131"), strD2, ZrJ.d("1025392C2520"), ZrJ.d("102E2C"), ZrJ.d("102D3B383C"), ZrJ.d("103022232C2001"), strD10, ZrJ.d("152A2526"), ZrJ.d("152A3839212B1E"), ZrJ.d("1422393C3D201C"), ZrJ.d("14262538"), ZrJ.d("14263F2C"), ZrJ.d("17223D"), ZrJ.d("172C2E202A201D"), ZrJ.d("172C2D3F29281C30"), ZrJ.d("172C382E3A2C0937"), ZrJ.d("162121282B31"), ZrJ.d("162F"), strD11, ZrJ.d("0922392C25"), ZrJ.d("092F2A2426311C3B3F"), ZrJ.d("09312E"), ZrJ.d("0A2039243831"), ZrJ.d("0A262839212A17"), ZrJ.d("0A2627282B31"), ZrJ.d("0A3732212D"), ZrJ.d("0A362620293700"), strD3, ZrJ.d("0D21242931"), strD4, ZrJ.d("0D26333929371C22"), ZrJ.d("0D2524223C"), strD5, ZrJ.d("0D2B2E2C2C"), ZrJ.d("0D2A3F212D"), ZrJ.d("0D31"), ZrJ.d("0C2F"), ZrJ.d("0E2139"), ZrJ.d("012E3B")};
    }

    private boolean H(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strI0 = this.e.get(size).i0();
            if (com.github.catvod.spider.merge.XU.n.c(strI0, strArr)) {
                return true;
            }
            if (com.github.catvod.spider.merge.XU.n.c(strI0, strArr2)) {
                return false;
            }
            if (strArr3 != null && com.github.catvod.spider.merge.XU.n.c(strI0, strArr3)) {
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
    private void Q(com.github.catvod.spider.merge.UY.s r3) {
        /*
            r2 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.UY.m> r0 = r2.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.github.catvod.spider.merge.UY.h r0 = r2.d
            goto L27
        Lb:
            boolean r0 = r2.v
            if (r0 == 0) goto L23
            com.github.catvod.spider.merge.UY.m r0 = r2.a()
            java.lang.String r0 = r0.i0()
            java.lang.String[] r1 = com.github.catvod.spider.merge.Mp.A.A
            boolean r0 = com.github.catvod.spider.merge.XU.n.c(r0, r1)
            if (r0 == 0) goto L23
            r2.O(r3)
            goto L2a
        L23:
            com.github.catvod.spider.merge.UY.m r0 = r2.a()
        L27:
            r0.L(r3)
        L2a:
            boolean r0 = r3 instanceof com.github.catvod.spider.merge.UY.m
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.UY.m r3 = (com.github.catvod.spider.merge.UY.m) r3
            com.github.catvod.spider.merge.Mp.G r0 = r3.s0()
            boolean r0 = r0.e()
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.UY.p r0 = r2.p
            if (r0 == 0) goto L41
            r0.y0(r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Mp.C0840b.Q(com.github.catvod.spider.merge.UY.s):void");
    }

    private static boolean Z(ArrayList<com.github.catvod.spider.merge.UY.m> arrayList, com.github.catvod.spider.merge.UY.m mVar) {
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
            com.github.catvod.spider.merge.UY.m mVar = this.e.get(size);
            String strI0 = mVar.i0();
            int i = com.github.catvod.spider.merge.XU.n.f;
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
            if (z2 || mVar.i0().equals(ZrJ.d("11372621"))) {
                return;
            }
            this.e.remove(size);
        }
    }

    @Nullable
    final com.github.catvod.spider.merge.UY.m A(String str) {
        int size = this.e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            com.github.catvod.spider.merge.UY.m mVar = this.e.get(size);
            if (mVar.i0().equals(str)) {
                return mVar;
            }
            size--;
        }
        return null;
    }

    final com.github.catvod.spider.merge.UY.m B() {
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
            if (!com.github.catvod.spider.merge.XU.n.c(strI0, B)) {
                return false;
            }
        }
        com.github.catvod.spider.merge.XU.k.a(ZrJ.d("2A2B24382421592D243968271C6339282926112229212D"));
        throw null;
    }

    final boolean I(String str) {
        String[] strArr = A;
        String[] strArr2 = this.w;
        strArr2[0] = str;
        return H(strArr2, strArr, null);
    }

    final com.github.catvod.spider.merge.UY.m J(N n) {
        if (n.u() && !n.n.isEmpty() && n.n.k(this.h) > 0) {
            Object[] objArr = {n.e};
            D dA = this.a.a();
            if (dA.a()) {
                dA.add(new C(this.b, ZrJ.d("3D31243D38201D632F38382910202A392D6518373F3F21270C372E653B6C592A256D3C241E6310683B18"), objArr));
            }
        }
        if (!n.m) {
            G gK = k(n.w(), this.h);
            E e = this.h;
            com.github.catvod.spider.merge.UY.c cVar = n.n;
            e.c(cVar);
            com.github.catvod.spider.merge.UY.m mVar = new com.github.catvod.spider.merge.UY.m(gK, null, cVar);
            Q(mVar);
            this.e.add(mVar);
            return mVar;
        }
        com.github.catvod.spider.merge.UY.m mVarM = M(n);
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
        com.github.catvod.spider.merge.UY.m mVarA = a();
        String strI0 = mVarA.i0();
        String strL = i.l();
        mVarA.L(i instanceof H ? new com.github.catvod.spider.merge.UY.d(strL) : e(strI0) ? new com.github.catvod.spider.merge.UY.f(strL) : new com.github.catvod.spider.merge.UY.v(strL));
    }

    final void L(J j) {
        Q(new com.github.catvod.spider.merge.UY.e(j.m()));
    }

    final com.github.catvod.spider.merge.UY.m M(N n) {
        G gK = k(n.w(), this.h);
        E e = this.h;
        com.github.catvod.spider.merge.UY.c cVar = n.n;
        e.c(cVar);
        com.github.catvod.spider.merge.UY.m mVar = new com.github.catvod.spider.merge.UY.m(gK, null, cVar);
        Q(mVar);
        if (n.m) {
            if (!gK.g()) {
                gK.l();
            } else if (!gK.d()) {
                this.c.s(ZrJ.d("2D222C6D13600A1E6B2E292B172C3F6D2A2059302E212E651A2F243E212B1E786B23273159226B3B272C1D633F2C2F"), gK.j());
            }
        }
        return mVar;
    }

    final com.github.catvod.spider.merge.UY.p N(N n, boolean z2, boolean z3) {
        G gK = k(n.w(), this.h);
        E e = this.h;
        com.github.catvod.spider.merge.UY.c cVar = n.n;
        e.c(cVar);
        com.github.catvod.spider.merge.UY.p pVar = new com.github.catvod.spider.merge.UY.p(gK, cVar);
        if (!z3 || !Y(ZrJ.d("0D26263D24240D26"))) {
            this.p = pVar;
        }
        Q(pVar);
        if (z2) {
            this.e.add(pVar);
        }
        return pVar;
    }

    final void O(com.github.catvod.spider.merge.UY.s sVar) {
        com.github.catvod.spider.merge.UY.m mVarL;
        com.github.catvod.spider.merge.UY.m mVarA = A(ZrJ.d("0D2229212D"));
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
            com.github.catvod.spider.merge.XU.k.g(mVarA);
            mVarA.S(sVar);
        }
    }

    final void P() {
        this.q.add(null);
    }

    final com.github.catvod.spider.merge.UY.m R() {
        com.github.catvod.spider.merge.UY.m mVar = new com.github.catvod.spider.merge.UY.m(k(ZrJ.d("11372621"), this.h), null, null);
        Q(mVar);
        this.e.add(mVar);
        return mVar;
    }

    final boolean S(com.github.catvod.spider.merge.UY.m mVar) {
        return Z(this.q, mVar);
    }

    final boolean T(com.github.catvod.spider.merge.UY.m mVar) {
        return com.github.catvod.spider.merge.XU.n.c(mVar.i0(), E);
    }

    final void U() {
        this.m = this.l;
    }

    final void V(com.github.catvod.spider.merge.UY.m mVar) {
        if (this.n) {
            return;
        }
        String strA = mVar.a(ZrJ.d("11312E2B"));
        if (strA.length() != 0) {
            this.f = strA;
            this.n = true;
            this.d.F(strA);
        }
    }

    final void W() {
        this.s = new ArrayList();
    }

    final boolean X(com.github.catvod.spider.merge.UY.m mVar) {
        return Z(this.e, mVar);
    }

    final boolean Y(String str) {
        return A(str) != null;
    }

    final B a0() {
        return this.m;
    }

    final com.github.catvod.spider.merge.UY.m b0() {
        return this.e.remove(this.e.size() - 1);
    }

    @Override // com.github.catvod.spider.merge.Mp.k1
    final E c() {
        return E.c;
    }

    @Nullable
    final com.github.catvod.spider.merge.UY.m c0(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.UY.m mVar = this.e.get(size);
            this.e.remove(size);
            if (mVar.i0().equals(str)) {
                boolean z2 = this.g instanceof M;
                return mVar;
            }
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.Mp.k1
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

    @Override // com.github.catvod.spider.merge.Mp.k1
    protected final boolean e(String str) {
        return str.equals(ZrJ.d("0A2039243831")) || str.equals(ZrJ.d("0A3732212D"));
    }

    final int e0(com.github.catvod.spider.merge.UY.m mVar) {
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

    @Override // com.github.catvod.spider.merge.Mp.k1
    protected final boolean g(Q q) {
        this.g = q;
        return this.l.d(q, this);
    }

    final void g0(com.github.catvod.spider.merge.UY.m mVar) {
        m(mVar);
        this.q.add(mVar);
    }

    final void h0(B b) {
        this.r.add(b);
    }

    final void i0(com.github.catvod.spider.merge.UY.m mVar, int i) {
        m(mVar);
        try {
            this.q.add(i, mVar);
        } catch (IndexOutOfBoundsException unused) {
            this.q.add(mVar);
        }
    }

    final void j0() {
        com.github.catvod.spider.merge.UY.m mVar;
        C0840b c0840b;
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
                c0840b = this;
                z2 = false;
                break;
            }
        }
        c0840b = this;
        while (true) {
            if (!z2) {
                i3++;
                mVar = c0840b.q.get(i3);
            }
            com.github.catvod.spider.merge.XU.k.g(mVar);
            com.github.catvod.spider.merge.UY.m mVar2 = new com.github.catvod.spider.merge.UY.m(c0840b.k(mVar.i0(), c0840b.h), null, mVar.d().clone());
            c0840b.Q(mVar2);
            c0840b.e.add(mVar2);
            c0840b.q.set(i3, mVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    final void k0(com.github.catvod.spider.merge.UY.m mVar) {
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
    final com.github.catvod.spider.merge.UY.m l(com.github.catvod.spider.merge.UY.m mVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == mVar) {
                return this.e.get(size - 1);
            }
        }
        return null;
    }

    final boolean l0(com.github.catvod.spider.merge.UY.m mVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (this.e.get(size) == mVar) {
                this.e.remove(size);
                return true;
            }
        }
        return false;
    }

    final void m(com.github.catvod.spider.merge.UY.m mVar) {
        int size = this.q.size() - 1;
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = 0;
        while (size >= i) {
            com.github.catvod.spider.merge.UY.m mVar2 = this.q.get(size);
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

    final void m0(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        ArrayList<com.github.catvod.spider.merge.UY.m> arrayList = this.q;
        int iLastIndexOf = arrayList.lastIndexOf(mVar);
        com.github.catvod.spider.merge.XU.k.c(iLastIndexOf != -1);
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
        if (!Y(ZrJ.d("1B2C2F34"))) {
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
        java.lang.NullPointerException
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Mp.C0840b.o0():boolean");
    }

    final void p() {
        o(ZrJ.d("0D21242931"), ZrJ.d("0D2524223C"), ZrJ.d("0D2B2E2C2C"), ZrJ.d("0D26263D24240D26"));
    }

    final void p0() {
        this.p = null;
    }

    final void q() {
        o(ZrJ.d("0D2229212D"), ZrJ.d("0D26263D24240D26"));
    }

    final void q0(boolean z2) {
        this.v = z2;
    }

    final void r() {
        o(ZrJ.d("0D31"), ZrJ.d("0D26263D24240D26"));
    }

    final void r0(com.github.catvod.spider.merge.UY.m mVar) {
        this.o = mVar;
    }

    final void s() {
        String strD = ZrJ.d("09");
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
            this.a.a().add(new C(this.b, ZrJ.d("2C2D2E3538201A372E2968600A633F222320176310683B18593423282665102D6B3E3C240D266B166D3624"), this.g.getClass().getSimpleName(), this.g, b));
        }
    }

    final int t0() {
        return this.r.size();
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("2D312E280A30102F2F283A3E1A36393F2D2B0D1724262D2B44"));
        sbB.append(this.g);
        sbB.append(ZrJ.d("5563383929311C7E"));
        sbB.append(this.l);
        sbB.append(ZrJ.d("556328383A371C2D3F0824201426253975"));
        sbB.append(a());
        sbB.append('}');
        return sbB.toString();
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
        while (com.github.catvod.spider.merge.XU.n.c(a().i0(), C)) {
            if (str != null && b(str)) {
                return;
            } else {
                b0();
            }
        }
    }

    final void x(boolean z2) {
        String[] strArr = z2 ? D : C;
        while (com.github.catvod.spider.merge.XU.n.c(a().i0(), strArr)) {
            b0();
        }
    }

    final com.github.catvod.spider.merge.UY.m y(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.UY.m mVar = this.q.get(size);
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
    final com.github.catvod.spider.merge.UY.p z() {
        return this.p;
    }
}
