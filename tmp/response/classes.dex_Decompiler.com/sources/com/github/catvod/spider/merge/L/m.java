package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.M.E;
import com.github.catvod.spider.merge.M.G;
import com.github.catvod.spider.merge.N.C0070c;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.N.C0075h;
import com.github.catvod.spider.merge.N.N;
import com.github.catvod.spider.merge.N.P;
import com.github.catvod.spider.merge.N.S;
import com.github.catvod.spider.merge.oZP;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class m extends s {
    private static final List<m> h = Collections.emptyList();
    private static final String i;
    private G d;

    @Nullable
    private WeakReference<List<m>> e;
    List<s> f;

    @Nullable
    c g;

    static {
        Pattern.compile(oZP.d("291C5C"));
        i = c.s(oZP.d("170E042439271C"));
    }

    public m(G g, @Nullable String str, @Nullable c cVar) {
        com.github.catvod.spider.merge.J.c.g(g);
        this.f = s.c;
        this.g = cVar;
        this.d = g;
        if (str != null) {
            k(str);
        }
    }

    private static void K(m mVar, C0074g c0074g) {
        m mVar2 = (m) mVar.a;
        if (mVar2 == null || mVar2.t0().equals(oZP.d("561D182E18"))) {
            return;
        }
        c0074g.add(mVar2);
        K(mVar2, c0074g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(StringBuilder sb, v vVar) {
        String strI = vVar.I();
        if (m0(vVar.a) || (vVar instanceof d)) {
            sb.append(strI);
        } else {
            com.github.catvod.spider.merge.K.b.a(sb, strI, v.N(sb));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(s sVar, StringBuilder sb) {
        if (sVar instanceof v) {
            sb.append(((v) sVar).I());
        } else if ((sVar instanceof m) && ((m) sVar).d.j().equals(oZP.d("171D"))) {
            sb.append(oZP.d("7F"));
        }
    }

    private static <E extends m> int e0(m mVar, List<E> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == mVar) {
                return i2;
            }
        }
        return 0;
    }

    static boolean m0(@Nullable s sVar) {
        if (sVar instanceof m) {
            m mVar = (m) sVar;
            int i2 = 0;
            while (!mVar.d.k()) {
                mVar = (m) mVar.a;
                i2++;
                if (i2 >= 6 || mVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final s E() {
        s sVar = this;
        while (true) {
            s sVar2 = sVar.a;
            if (sVar2 == null) {
                return (m) sVar;
            }
            sVar = sVar2;
        }
    }

    public final m L(s sVar) {
        s sVar2 = sVar.a;
        if (sVar2 != null) {
            sVar2.C(sVar);
        }
        sVar.a = this;
        m();
        this.f.add(sVar);
        sVar.b = this.f.size() - 1;
        return this;
    }

    public final m M(Collection<? extends s> collection) {
        if (collection == null) {
            throw new com.github.catvod.spider.merge.J.d(oZP.d("36071E2D0827100157220339190A1435053A1B4F032E4C37104F1E2F1F30071B12254C38001C0361023A014F15244C3B00031B6F"));
        }
        int iG = g();
        int i2 = (iG + 1) - 1;
        com.github.catvod.spider.merge.J.c.d(i2 >= 0 && i2 <= iG, oZP.d("3C0104241E21551F183205211C0019610320014F18274C371A1A19251F7B"));
        b(i2, (s[]) new ArrayList(collection).toArray(new s[0]));
        return this;
    }

    public final m N(String str) {
        m mVar = new m(G.m(str, t.a(this).f()), e(), null);
        L(mVar);
        return mVar;
    }

    public final m P(String str) {
        com.github.catvod.spider.merge.J.c.g(str);
        L(new v(str));
        return this;
    }

    public final m R(String str, String str2) {
        d().x(t.a(this).f().b(str), str2);
        return this;
    }

    public final m S(s sVar) {
        com.github.catvod.spider.merge.J.c.g(this.a);
        this.a.b(this.b, sVar);
        return this;
    }

    public final m T() {
        return U().get(0);
    }

    final List<m> U() {
        List<m> list;
        if (g() == 0) {
            return h;
        }
        WeakReference<List<m>> weakReference = this.e;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.f.get(i2);
            if (sVar instanceof m) {
                arrayList.add((m) sVar);
            }
        }
        this.e = new WeakReference<>(arrayList);
        return arrayList;
    }

    public final C0074g V() {
        return new C0074g(U());
    }

    @Override // com.github.catvod.spider.merge.L.s
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m i() {
        return (m) super.i();
    }

    public final String X() {
        String strI;
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        for (s sVar : this.f) {
            if (sVar instanceof f) {
                strI = ((f) sVar).I();
            } else if (sVar instanceof e) {
                strI = ((e) sVar).I();
            } else if (sVar instanceof m) {
                strI = ((m) sVar).X();
            } else if (sVar instanceof d) {
                strI = ((d) sVar).I();
            }
            sbB.append(strI);
        }
        return com.github.catvod.spider.merge.K.b.h(sbB);
    }

    public final int Y() {
        s sVar = this.a;
        if (((m) sVar) == null) {
            return 0;
        }
        return e0(this, ((m) sVar).U());
    }

    public final C0074g Z() {
        return C0070c.a(new C0075h(), this);
    }

    public final boolean a0(String str) {
        c cVar = this.g;
        if (cVar == null) {
            return false;
        }
        String strM = cVar.m(oZP.d("160316321F"));
        int length = strM.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM);
            }
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.isWhitespace(strM.charAt(i3))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i3 - i2 == length2 && strM.regionMatches(true, i2, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i2 = i3;
                    z = true;
                }
            }
            if (z && length - i2 == length2) {
                return strM.regionMatches(true, i2, str, 0, length2);
            }
        }
        return false;
    }

    public final boolean b0() {
        for (s sVar : this.f) {
            if (sVar instanceof v) {
                if (!((v) sVar).M()) {
                    return true;
                }
            } else if ((sVar instanceof m) && ((m) sVar).b0()) {
                return true;
            }
        }
        return false;
    }

    public final String c0() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f.get(i2).u(sbB);
        }
        String strH = com.github.catvod.spider.merge.K.b.h(sbB);
        h hVarX = x();
        if (hVarX == null) {
            hVarX = new h("");
        }
        return hVarX.A0().i() ? strH.trim() : strH;
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final c d() {
        if (this.g == null) {
            this.g = new c();
        }
        return this.g;
    }

    public final String d0() {
        c cVar = this.g;
        return cVar != null ? cVar.m(oZP.d("1C0B")) : "";
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final String e() {
        String str = i;
        for (m mVar = this; mVar != null; mVar = (m) mVar.a) {
            c cVar = mVar.g;
            if (cVar != null) {
                if (cVar.q(str) != -1) {
                    return mVar.g.l(str);
                }
            }
        }
        return "";
    }

    public final boolean f0() {
        return this.d.c();
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final int g() {
        return this.f.size();
    }

    @Nullable
    public final m g0() {
        s sVar = this.a;
        if (sVar == null) {
            return null;
        }
        List<m> listU = ((m) sVar).U();
        int iE0 = e0(this, listU) + 1;
        if (listU.size() > iE0) {
            return listU.get(iE0);
        }
        return null;
    }

    final void h0() {
        this.e = null;
    }

    public final String i0() {
        return this.d.j();
    }

    @Override // com.github.catvod.spider.merge.L.s
    protected final s j(@Nullable s sVar) {
        m mVar = (m) super.j(sVar);
        c cVar = this.g;
        mVar.g = cVar != null ? cVar.clone() : null;
        l lVar = new l(mVar, this.f.size());
        mVar.f = lVar;
        lVar.addAll(this.f);
        return mVar;
    }

    public final String j0() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        for (int i2 = 0; i2 < g(); i2++) {
            s sVar = this.f.get(i2);
            if (sVar instanceof v) {
                O(sbB, (v) sVar);
            } else if ((sVar instanceof m) && ((m) sVar).d.j().equals(oZP.d("171D")) && !v.N(sbB)) {
                sbB.append(oZP.d("55"));
            }
        }
        return com.github.catvod.spider.merge.K.b.h(sbB).trim();
    }

    @Override // com.github.catvod.spider.merge.L.s
    protected final void k(String str) {
        d().w(i, str);
    }

    @Nullable
    public final m k0() {
        return (m) this.a;
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final s l() {
        this.f.clear();
        return this;
    }

    public final C0074g l0() {
        C0074g c0074g = new C0074g();
        K(this, c0074g);
        return c0074g;
    }

    @Override // com.github.catvod.spider.merge.L.s
    protected final List<s> m() {
        if (this.f == s.c) {
            this.f = new l(this, 4);
        }
        return this.f;
    }

    @Nullable
    public final m n0() {
        List<m> listU;
        int iE0;
        s sVar = this.a;
        if (sVar != null && (iE0 = e0(this, (listU = ((m) sVar).U()))) > 0) {
            return listU.get(iE0 - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.L.s
    protected final boolean o() {
        return this.g != null;
    }

    public final C0074g o0(String str) {
        com.github.catvod.spider.merge.J.c.e(str);
        N nJ = P.j(str);
        com.github.catvod.spider.merge.J.c.g(nJ);
        return C0070c.a(nJ, this);
    }

    @Nullable
    public final m p0(String str) {
        return S.a(str, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean q0(com.github.catvod.spider.merge.L.g r5) {
        /*
            r4 = this;
            boolean r5 = r5.i()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.M.G r5 = r4.d
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
            com.github.catvod.spider.merge.L.s r5 = r4.a
            com.github.catvod.spider.merge.L.m r5 = (com.github.catvod.spider.merge.L.m) r5
            if (r5 == 0) goto L1e
            com.github.catvod.spider.merge.M.G r5 = r5.d
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L21
        L20:
            r5 = 1
        L21:
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.M.G r5 = r4.d
            boolean r5 = r5.f()
            if (r5 == 0) goto L54
            com.github.catvod.spider.merge.L.s r5 = r4.a
            com.github.catvod.spider.merge.L.m r5 = (com.github.catvod.spider.merge.L.m) r5
            if (r5 == 0) goto L37
            boolean r5 = r5.f0()
            if (r5 == 0) goto L54
        L37:
            com.github.catvod.spider.merge.L.s r5 = r4.a
            r2 = 0
            if (r5 != 0) goto L3d
            goto L50
        L3d:
            int r3 = r4.b
            if (r3 <= 0) goto L50
            java.util.List r5 = r5.m()
            int r2 = r4.b
            int r2 = r2 + (-1)
            java.lang.Object r5 = r5.get(r2)
            r2 = r5
            com.github.catvod.spider.merge.L.s r2 = (com.github.catvod.spider.merge.L.s) r2
        L50:
            if (r2 == 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            if (r5 != 0) goto L58
            goto L59
        L58:
            r0 = 0
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L.m.q0(com.github.catvod.spider.merge.L.g):boolean");
    }

    public final C0074g r0() {
        s sVar = this.a;
        if (sVar == null) {
            return new C0074g(0);
        }
        List<m> listU = ((m) sVar).U();
        C0074g c0074g = new C0074g(listU.size() - 1);
        for (m mVar : listU) {
            if (mVar != this) {
                c0074g.add(mVar);
            }
        }
        return c0074g;
    }

    @Override // com.github.catvod.spider.merge.L.s
    public String s() {
        return this.d.b();
    }

    public final G s0() {
        return this.d;
    }

    public final String t0() {
        return this.d.b();
    }

    public m u0(String str) {
        com.github.catvod.spider.merge.J.c.g(str);
        this.f.clear();
        h hVarX = x();
        L((hVarX == null || !hVarX.C0().b(i0())) ? new v(str) : new f(str));
        return this;
    }

    @Override // com.github.catvod.spider.merge.L.s
    void v(Appendable appendable, int i2, g gVar) throws IOException {
        if (q0(gVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            q(appendable, i2, gVar);
        }
        appendable.append('<').append(t0());
        c cVar = this.g;
        if (cVar != null) {
            cVar.p(appendable, gVar);
        }
        if (this.f.isEmpty() && this.d.i() && (gVar.k() != 1 || !this.d.d())) {
            appendable.append(oZP.d("554049"));
        } else {
            appendable.append('>');
        }
    }

    public final String v0() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        com.github.catvod.spider.merge.F.a.b(new k(sbB), this);
        return com.github.catvod.spider.merge.K.b.h(sbB).trim();
    }

    @Override // com.github.catvod.spider.merge.L.s
    void w(Appendable appendable, int i2, g gVar) throws IOException {
        if (this.f.isEmpty() && this.d.i()) {
            return;
        }
        if (gVar.i() && !this.f.isEmpty() && this.d.a()) {
            q(appendable, i2, gVar);
        }
        appendable.append(oZP.d("4940")).append(t0()).append('>');
    }

    public final List<v> w0() {
        ArrayList arrayList = new ArrayList();
        for (s sVar : this.f) {
            if (sVar instanceof v) {
                arrayList.add((v) sVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String x0() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        int iG = g();
        for (int i2 = 0; i2 < iG; i2++) {
            Q(this.f.get(i2), sbB);
        }
        return com.github.catvod.spider.merge.K.b.h(sbB);
    }

    @Override // com.github.catvod.spider.merge.L.s
    @Nullable
    public final s y() {
        return (m) this.a;
    }

    public m(String str) {
        this(G.m(str, E.d), "", null);
    }
}
