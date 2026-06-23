package com.github.catvod.spider.merge.FM.K;

import com.github.catvod.spider.merge.FM.L.E;
import com.github.catvod.spider.merge.FM.L.G;
import com.github.catvod.spider.merge.FM.M.C0270c;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.M.C0275h;
import com.github.catvod.spider.merge.FM.M.N;
import com.github.catvod.spider.merge.FM.M.P;
import com.github.catvod.spider.merge.FM.M.S;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
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
        Pattern.compile("\\s+");
        i = "/baseUri";
    }

    public m(G g, @Nullable String str, @Nullable c cVar) {
        com.github.catvod.spider.merge.FM.I.c.g(g);
        this.f = s.c;
        this.g = cVar;
        this.d = g;
        if (str != null) {
            k(str);
        }
    }

    public m(String str) {
        this(G.m(str, E.d), "", null);
    }

    private static void K(m mVar, C0274g c0274g) {
        m mVar2 = (m) mVar.a;
        if (mVar2 == null || mVar2.t0().equals("#root")) {
            return;
        }
        c0274g.add(mVar2);
        K(mVar2, c0274g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(StringBuilder sb, v vVar) {
        String strI = vVar.I();
        if (m0(vVar.a) || (vVar instanceof d)) {
            sb.append(strI);
        } else {
            com.github.catvod.spider.merge.FM.J.b.a(sb, strI, v.N(sb));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(s sVar, StringBuilder sb) {
        if (sVar instanceof v) {
            sb.append(((v) sVar).I());
        } else if ((sVar instanceof m) && ((m) sVar).d.j().equals("br")) {
            sb.append("\n");
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

    @Override // com.github.catvod.spider.merge.FM.K.s
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
            throw new com.github.catvod.spider.merge.FM.I.d("Children collection to be inserted must not be null.");
        }
        int iG = g();
        int i2 = (iG + 1) - 1;
        com.github.catvod.spider.merge.FM.I.c.d(i2 >= 0 && i2 <= iG, "Insert position out of bounds.");
        b(i2, (s[]) new ArrayList(collection).toArray(new s[0]));
        return this;
    }

    public final m N(String str) {
        m mVar = new m(G.m(str, t.a(this).f()), e(), null);
        L(mVar);
        return mVar;
    }

    public final m P(String str) {
        com.github.catvod.spider.merge.FM.I.c.g(str);
        L(new v(str));
        return this;
    }

    public final m R(String str, String str2) {
        d().x(t.a(this).f().b(str), str2);
        return this;
    }

    public final m S(s sVar) {
        com.github.catvod.spider.merge.FM.I.c.g(this.a);
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

    public final C0274g V() {
        return new C0274g(U());
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m i() {
        return (m) super.i();
    }

    public final String X() {
        String strI;
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
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
        return com.github.catvod.spider.merge.FM.J.b.h(sbB);
    }

    public final int Y() {
        s sVar = this.a;
        if (((m) sVar) == null) {
            return 0;
        }
        return e0(this, ((m) sVar).U());
    }

    public final C0274g Z() {
        return C0270c.a(new C0275h(), this);
    }

    public final boolean a0(String str) {
        c cVar = this.g;
        if (cVar == null) {
            return false;
        }
        String strM = cVar.m("class");
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
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f.get(i2).u(sbB);
        }
        String strH = com.github.catvod.spider.merge.FM.J.b.h(sbB);
        h hVarX = x();
        if (hVarX == null) {
            hVarX = new h("");
        }
        return hVarX.A0().i() ? strH.trim() : strH;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final c d() {
        if (this.g == null) {
            this.g = new c();
        }
        return this.g;
    }

    public final String d0() {
        c cVar = this.g;
        return cVar != null ? cVar.m("id") : "";
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
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

    @Override // com.github.catvod.spider.merge.FM.K.s
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

    @Override // com.github.catvod.spider.merge.FM.K.s
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
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        for (int i2 = 0; i2 < g(); i2++) {
            s sVar = this.f.get(i2);
            if (sVar instanceof v) {
                O(sbB, (v) sVar);
            } else if ((sVar instanceof m) && ((m) sVar).d.j().equals("br") && !v.N(sbB)) {
                sbB.append(" ");
            }
        }
        return com.github.catvod.spider.merge.FM.J.b.h(sbB).trim();
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    protected final void k(String str) {
        d().w(i, str);
    }

    @Nullable
    public final m k0() {
        return (m) this.a;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final s l() {
        this.f.clear();
        return this;
    }

    public final C0274g l0() {
        C0274g c0274g = new C0274g();
        K(this, c0274g);
        return c0274g;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
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

    @Override // com.github.catvod.spider.merge.FM.K.s
    protected final boolean o() {
        return this.g != null;
    }

    public final C0274g o0(String str) {
        com.github.catvod.spider.merge.FM.I.c.e(str);
        N nJ = P.j(str);
        com.github.catvod.spider.merge.FM.I.c.g(nJ);
        return C0270c.a(nJ, this);
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
    final boolean q0(com.github.catvod.spider.merge.FM.K.g r5) {
        /*
            r4 = this;
            boolean r5 = r5.i()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.FM.L.G r5 = r4.d
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
            com.github.catvod.spider.merge.FM.K.s r5 = r4.a
            com.github.catvod.spider.merge.FM.K.m r5 = (com.github.catvod.spider.merge.FM.K.m) r5
            if (r5 == 0) goto L1e
            com.github.catvod.spider.merge.FM.L.G r5 = r5.d
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L21
        L20:
            r5 = 1
        L21:
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.FM.L.G r5 = r4.d
            boolean r5 = r5.f()
            if (r5 == 0) goto L54
            com.github.catvod.spider.merge.FM.K.s r5 = r4.a
            com.github.catvod.spider.merge.FM.K.m r5 = (com.github.catvod.spider.merge.FM.K.m) r5
            if (r5 == 0) goto L37
            boolean r5 = r5.f0()
            if (r5 == 0) goto L54
        L37:
            com.github.catvod.spider.merge.FM.K.s r5 = r4.a
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
            com.github.catvod.spider.merge.FM.K.s r2 = (com.github.catvod.spider.merge.FM.K.s) r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.K.m.q0(com.github.catvod.spider.merge.FM.K.g):boolean");
    }

    public final C0274g r0() {
        s sVar = this.a;
        if (sVar == null) {
            return new C0274g(0);
        }
        List<m> listU = ((m) sVar).U();
        C0274g c0274g = new C0274g(listU.size() - 1);
        for (m mVar : listU) {
            if (mVar != this) {
                c0274g.add(mVar);
            }
        }
        return c0274g;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
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
        com.github.catvod.spider.merge.FM.I.c.g(str);
        this.f.clear();
        h hVarX = x();
        L((hVarX == null || !hVarX.C0().b(i0())) ? new v(str) : new f(str));
        return this;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
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
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    public final String v0() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        com.github.catvod.spider.merge.FM.E.a.d(new k(sbB), this);
        return com.github.catvod.spider.merge.FM.J.b.h(sbB).trim();
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    void w(Appendable appendable, int i2, g gVar) throws IOException {
        if (this.f.isEmpty() && this.d.i()) {
            return;
        }
        if (gVar.i() && !this.f.isEmpty() && this.d.a()) {
            q(appendable, i2, gVar);
        }
        appendable.append("</").append(t0()).append('>');
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
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        int iG = g();
        for (int i2 = 0; i2 < iG; i2++) {
            Q(this.f.get(i2), sbB);
        }
        return com.github.catvod.spider.merge.FM.J.b.h(sbB);
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    @Nullable
    public final s y() {
        return (m) this.a;
    }
}
