package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.HR.C0720c;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.HR.C0725h;
import com.github.catvod.spider.merge.HR.N;
import com.github.catvod.spider.merge.HR.P;
import com.github.catvod.spider.merge.HR.S;
import com.github.catvod.spider.merge.Mp.E;
import com.github.catvod.spider.merge.Mp.G;
import com.github.catvod.spider.merge.ZrJ;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
        Pattern.compile(ZrJ.d("253060"));
        i = c.s(ZrJ.d("1B2238281D3710"));
    }

    public m(G g, @Nullable String str, @Nullable c cVar) {
        com.github.catvod.spider.merge.XU.k.g(g);
        this.f = s.c;
        this.g = cVar;
        this.d = g;
        if (str != null) {
            k(str);
        }
    }

    private static void K(m mVar, C0724g c0724g) {
        m mVar2 = (m) mVar.a;
        if (mVar2 == null || mVar2.t0().equals(ZrJ.d("5A3124223C"))) {
            return;
        }
        c0724g.add(mVar2);
        K(mVar2, c0724g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(StringBuilder sb, v vVar) {
        String strI = vVar.I();
        if (m0(vVar.a) || (vVar instanceof d)) {
            sb.append(strI);
        } else {
            com.github.catvod.spider.merge.XU.n.a(sb, strI, v.N(sb));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(s sVar, StringBuilder sb) {
        if (sVar instanceof v) {
            sb.append(((v) sVar).I());
        } else if ((sVar instanceof m) && ((m) sVar).d.j().equals(ZrJ.d("1B31"))) {
            sb.append(ZrJ.d("73"));
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

    @Override // com.github.catvod.spider.merge.UY.s
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
            throw new com.github.catvod.spider.merge.XU.l(ZrJ.d("3A2B22212C371C2D6B2E272915262839212A17633F2268271C6322233B200B372E2968280C303F6D262A0D632928682B0C2F2763"));
        }
        int iG = g();
        int i2 = (iG + 1) - 1;
        com.github.catvod.spider.merge.XU.k.d(i2 >= 0 && i2 <= iG, ZrJ.d("302D38283A315933243E2131102C256D27300D63242B6827163625293B6B"));
        b(i2, (s[]) new ArrayList(collection).toArray(new s[0]));
        return this;
    }

    public final m N(String str) {
        m mVar = new m(G.m(str, t.a(this).f()), e(), null);
        L(mVar);
        return mVar;
    }

    public final m P(String str) {
        com.github.catvod.spider.merge.XU.k.g(str);
        L(new v(str));
        return this;
    }

    public final m R(String str, String str2) {
        d().x(t.a(this).f().b(str), str2);
        return this;
    }

    public final m S(s sVar) {
        com.github.catvod.spider.merge.XU.k.g(this.a);
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

    public final C0724g V() {
        return new C0724g(U());
    }

    @Override // com.github.catvod.spider.merge.UY.s
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m i() {
        return (m) super.i();
    }

    public final String X() {
        String strI;
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
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
        return com.github.catvod.spider.merge.XU.n.h(sbB);
    }

    public final int Y() {
        s sVar = this.a;
        if (((m) sVar) == null) {
            return 0;
        }
        return e0(this, ((m) sVar).U());
    }

    public final C0724g Z() {
        return C0720c.a(new C0725h(), this);
    }

    public final boolean a0(String str) {
        c cVar = this.g;
        if (cVar == null) {
            return false;
        }
        String strM = cVar.m(ZrJ.d("1A2F2A3E3B"));
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
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f.get(i2).u(sbB);
        }
        String strH = com.github.catvod.spider.merge.XU.n.h(sbB);
        h hVarX = x();
        if (hVarX == null) {
            hVarX = new h("");
        }
        return hVarX.A0().i() ? strH.trim() : strH;
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final c d() {
        if (this.g == null) {
            this.g = new c();
        }
        return this.g;
    }

    public final String d0() {
        c cVar = this.g;
        return cVar != null ? cVar.m(ZrJ.d("1027")) : "";
    }

    @Override // com.github.catvod.spider.merge.UY.s
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

    @Override // com.github.catvod.spider.merge.UY.s
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

    @Override // com.github.catvod.spider.merge.UY.s
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
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        for (int i2 = 0; i2 < g(); i2++) {
            s sVar = this.f.get(i2);
            if (sVar instanceof v) {
                O(sbB, (v) sVar);
            } else if ((sVar instanceof m) && ((m) sVar).d.j().equals(ZrJ.d("1B31")) && !v.N(sbB)) {
                sbB.append(ZrJ.d("59"));
            }
        }
        return com.github.catvod.spider.merge.XU.n.h(sbB).trim();
    }

    @Override // com.github.catvod.spider.merge.UY.s
    protected final void k(String str) {
        d().w(i, str);
    }

    @Nullable
    public final m k0() {
        return (m) this.a;
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final s l() {
        this.f.clear();
        return this;
    }

    public final C0724g l0() {
        C0724g c0724g = new C0724g();
        K(this, c0724g);
        return c0724g;
    }

    @Override // com.github.catvod.spider.merge.UY.s
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

    @Override // com.github.catvod.spider.merge.UY.s
    protected final boolean o() {
        return this.g != null;
    }

    public final C0724g o0(String str) {
        com.github.catvod.spider.merge.XU.k.e(str);
        N nJ = P.j(str);
        com.github.catvod.spider.merge.XU.k.g(nJ);
        return C0720c.a(nJ, this);
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
    final boolean q0(com.github.catvod.spider.merge.UY.g r5) {
        /*
            r4 = this;
            boolean r5 = r5.i()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.Mp.G r5 = r4.d
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
            com.github.catvod.spider.merge.UY.s r5 = r4.a
            com.github.catvod.spider.merge.UY.m r5 = (com.github.catvod.spider.merge.UY.m) r5
            if (r5 == 0) goto L1e
            com.github.catvod.spider.merge.Mp.G r5 = r5.d
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L21
        L20:
            r5 = 1
        L21:
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.Mp.G r5 = r4.d
            boolean r5 = r5.f()
            if (r5 == 0) goto L54
            com.github.catvod.spider.merge.UY.s r5 = r4.a
            com.github.catvod.spider.merge.UY.m r5 = (com.github.catvod.spider.merge.UY.m) r5
            if (r5 == 0) goto L37
            boolean r5 = r5.f0()
            if (r5 == 0) goto L54
        L37:
            com.github.catvod.spider.merge.UY.s r5 = r4.a
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
            com.github.catvod.spider.merge.UY.s r2 = (com.github.catvod.spider.merge.UY.s) r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.UY.m.q0(com.github.catvod.spider.merge.UY.g):boolean");
    }

    public final C0724g r0() {
        s sVar = this.a;
        if (sVar == null) {
            return new C0724g(0);
        }
        List<m> listU = ((m) sVar).U();
        C0724g c0724g = new C0724g(listU.size() - 1);
        for (m mVar : listU) {
            if (mVar != this) {
                c0724g.add(mVar);
            }
        }
        return c0724g;
    }

    @Override // com.github.catvod.spider.merge.UY.s
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
        com.github.catvod.spider.merge.XU.k.g(str);
        this.f.clear();
        h hVarX = x();
        L((hVarX == null || !hVarX.C0().b(i0())) ? new v(str) : new f(str));
        return this;
    }

    @Override // com.github.catvod.spider.merge.UY.s
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
            appendable.append(ZrJ.d("596C75"));
        } else {
            appendable.append('>');
        }
    }

    public final String v0() {
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        com.github.catvod.spider.merge.XI.p.b(new k(sbB), this);
        return com.github.catvod.spider.merge.XU.n.h(sbB).trim();
    }

    @Override // com.github.catvod.spider.merge.UY.s
    void w(Appendable appendable, int i2, g gVar) throws IOException {
        if (this.f.isEmpty() && this.d.i()) {
            return;
        }
        if (gVar.i() && !this.f.isEmpty() && this.d.a()) {
            q(appendable, i2, gVar);
        }
        appendable.append(ZrJ.d("456C")).append(t0()).append('>');
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
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        int iG = g();
        for (int i2 = 0; i2 < iG; i2++) {
            Q(this.f.get(i2), sbB);
        }
        return com.github.catvod.spider.merge.XU.n.h(sbB);
    }

    @Override // com.github.catvod.spider.merge.UY.s
    @Nullable
    public final s y() {
        return (m) this.a;
    }

    public m(String str) {
        this(G.m(str, E.d), "", null);
    }
}
