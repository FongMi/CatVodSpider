package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.G.f;
import com.github.catvod.spider.merge.I.d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class i extends m {
    private static final List<i> h = Collections.emptyList();
    private static final String i;
    private com.github.catvod.spider.merge.H.h d;

    @Nullable
    private WeakReference<List<i>> e;
    List<m> f;

    @Nullable
    com.github.catvod.spider.merge.G.b g;

    final class a implements com.github.catvod.spider.merge.I.e {
        final /* synthetic */ StringBuilder a;

        a(StringBuilder sb) {
            this.a = sb;
        }

        @Override // com.github.catvod.spider.merge.I.e
        public final void a(m mVar, int i) {
            if ((mVar instanceof i) && ((i) mVar).e0() && (mVar.s() instanceof p) && !p.N(this.a)) {
                this.a.append(' ');
            }
        }

        @Override // com.github.catvod.spider.merge.I.e
        public final void b(m mVar, int i) {
            if (mVar instanceof p) {
                i.P(this.a, (p) mVar);
            } else if (mVar instanceof i) {
                i iVar = (i) mVar;
                if (this.a.length() > 0) {
                    if ((iVar.e0() || iVar.d.j().equals("br")) && !p.N(this.a)) {
                        this.a.append(' ');
                    }
                }
            }
        }
    }

    private static final class b extends com.github.catvod.spider.merge.E.a<m> {
        private final i a;

        b(i iVar, int i) {
            super(i);
            this.a = iVar;
        }

        @Override // com.github.catvod.spider.merge.E.a
        public final void a() {
            this.a.g0();
        }
    }

    static {
        Pattern.compile("\\s+");
        i = "/baseUri";
    }

    public i(com.github.catvod.spider.merge.H.h hVar, @Nullable String str, @Nullable com.github.catvod.spider.merge.G.b bVar) {
        com.github.catvod.spider.merge.E.c.g(hVar);
        this.f = m.c;
        this.g = bVar;
        this.d = hVar;
        if (str != null) {
            l(str);
        }
    }

    public i(String str) {
        this(com.github.catvod.spider.merge.H.h.m(str, com.github.catvod.spider.merge.H.f.d), "", null);
    }

    private static void L(i iVar, com.github.catvod.spider.merge.I.c cVar) {
        i iVar2 = (i) iVar.a;
        if (iVar2 == null || iVar2.r0().equals("#root")) {
            return;
        }
        cVar.add(iVar2);
        L(iVar2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(StringBuilder sb, p pVar) {
        String strI = pVar.I();
        if (l0(pVar.a) || (pVar instanceof c)) {
            sb.append(strI);
        } else {
            com.github.catvod.spider.merge.F.b.a(sb, strI, p.N(sb));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R(m mVar, StringBuilder sb) {
        if (mVar instanceof p) {
            sb.append(((p) mVar).I());
        } else if ((mVar instanceof i) && ((i) mVar).d.j().equals("br")) {
            sb.append("\n");
        }
    }

    private static <E extends i> int d0(i iVar, List<E> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == iVar) {
                return i2;
            }
        }
        return 0;
    }

    static boolean l0(@Nullable m mVar) {
        if (mVar instanceof i) {
            i iVar = (i) mVar;
            int i2 = 0;
            while (!iVar.d.k()) {
                iVar = (i) iVar.a;
                i2++;
                if (i2 >= 6 || iVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final m F() {
        m mVar = this;
        while (true) {
            m mVar2 = mVar.a;
            if (mVar2 == null) {
                return (i) mVar;
            }
            mVar = mVar2;
        }
    }

    public final i M(m mVar) {
        m mVar2 = mVar.a;
        if (mVar2 != null) {
            mVar2.D(mVar);
        }
        mVar.a = this;
        n();
        this.f.add(mVar);
        mVar.b = this.f.size() - 1;
        return this;
    }

    public final i N(Collection<? extends m> collection) {
        if (collection == null) {
            throw new com.github.catvod.spider.merge.E.d("Children collection to be inserted must not be null.");
        }
        int iH = h();
        int i2 = (iH + 1) - 1;
        com.github.catvod.spider.merge.E.c.d(i2 >= 0 && i2 <= iH, "Insert position out of bounds.");
        b(i2, (m[]) new ArrayList(collection).toArray(new m[0]));
        return this;
    }

    public final i O(String str) {
        n.a(this).getClass();
        i iVar = new i(com.github.catvod.spider.merge.H.h.m(str, com.github.catvod.spider.merge.H.f.c), f(), null);
        M(iVar);
        return iVar;
    }

    public final i Q(String str) {
        com.github.catvod.spider.merge.E.c.g(str);
        M(new p(str));
        return this;
    }

    public final i S(m mVar) {
        com.github.catvod.spider.merge.E.c.g(this.a);
        this.a.b(this.b, mVar);
        return this;
    }

    public final i T() {
        return U().get(0);
    }

    final List<i> U() {
        List<i> list;
        if (h() == 0) {
            return h;
        }
        WeakReference<List<i>> weakReference = this.e;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.f.get(i2);
            if (mVar instanceof i) {
                arrayList.add((i) mVar);
            }
        }
        this.e = new WeakReference<>(arrayList);
        return arrayList;
    }

    public final com.github.catvod.spider.merge.I.c V() {
        return new com.github.catvod.spider.merge.I.c(U());
    }

    @Override // com.github.catvod.spider.merge.G.m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public i clone() {
        return (i) super.clone();
    }

    public final String X() {
        String strI;
        StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
        for (m mVar : this.f) {
            if (mVar instanceof e) {
                strI = ((e) mVar).I();
            } else if (mVar instanceof d) {
                strI = ((d) mVar).I();
            } else if (mVar instanceof i) {
                strI = ((i) mVar).X();
            } else if (mVar instanceof c) {
                strI = ((c) mVar).I();
            }
            sbB.append(strI);
        }
        return com.github.catvod.spider.merge.F.b.h(sbB);
    }

    public final int Y() {
        m mVar = this.a;
        if (((i) mVar) == null) {
            return 0;
        }
        return d0(this, ((i) mVar).U());
    }

    public final com.github.catvod.spider.merge.I.c Z() {
        return com.github.catvod.spider.merge.I.a.a(new d.C0514a(), this);
    }

    public final boolean a0(String str) {
        com.github.catvod.spider.merge.G.b bVar = this.g;
        if (bVar == null) {
            return false;
        }
        String strM = bVar.m("class");
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

    public final String b0() {
        StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f.get(i2).v(sbB);
        }
        String strH = com.github.catvod.spider.merge.F.b.h(sbB);
        f fVarY = y();
        if (fVarY == null) {
            fVarY = new f("");
        }
        return fVarY.y0().g() ? strH.trim() : strH;
    }

    public final String c0() {
        com.github.catvod.spider.merge.G.b bVar = this.g;
        return bVar != null ? bVar.m("id") : "";
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final com.github.catvod.spider.merge.G.b e() {
        if (this.g == null) {
            this.g = new com.github.catvod.spider.merge.G.b();
        }
        return this.g;
    }

    public final boolean e0() {
        return this.d.c();
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final String f() {
        String str = i;
        for (i iVar = this; iVar != null; iVar = (i) iVar.a) {
            com.github.catvod.spider.merge.G.b bVar = iVar.g;
            if (bVar != null) {
                if (bVar.q(str) != -1) {
                    return iVar.g.l(str);
                }
            }
        }
        return "";
    }

    @Nullable
    public final i f0() {
        m mVar = this.a;
        if (mVar == null) {
            return null;
        }
        List<i> listU = ((i) mVar).U();
        int iD0 = d0(this, listU) + 1;
        if (listU.size() > iD0) {
            return listU.get(iD0);
        }
        return null;
    }

    final void g0() {
        this.e = null;
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final int h() {
        return this.f.size();
    }

    public final String h0() {
        return this.d.j();
    }

    public final String i0() {
        StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
        for (int i2 = 0; i2 < h(); i2++) {
            m mVar = this.f.get(i2);
            if (mVar instanceof p) {
                P(sbB, (p) mVar);
            } else if ((mVar instanceof i) && ((i) mVar).d.j().equals("br") && !p.N(sbB)) {
                sbB.append(" ");
            }
        }
        return com.github.catvod.spider.merge.F.b.h(sbB).trim();
    }

    @Nullable
    public final i j0() {
        return (i) this.a;
    }

    @Override // com.github.catvod.spider.merge.G.m
    protected final m k(@Nullable m mVar) {
        i iVar = (i) super.k(mVar);
        com.github.catvod.spider.merge.G.b bVar = this.g;
        iVar.g = bVar != null ? bVar.clone() : null;
        b bVar2 = new b(iVar, this.f.size());
        iVar.f = bVar2;
        bVar2.addAll(this.f);
        return iVar;
    }

    public final com.github.catvod.spider.merge.I.c k0() {
        com.github.catvod.spider.merge.I.c cVar = new com.github.catvod.spider.merge.I.c();
        L(this, cVar);
        return cVar;
    }

    @Override // com.github.catvod.spider.merge.G.m
    protected final void l(String str) {
        e().w(i, str);
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final m m() {
        this.f.clear();
        return this;
    }

    @Nullable
    public final i m0() {
        List<i> listU;
        int iD0;
        m mVar = this.a;
        if (mVar != null && (iD0 = d0(this, (listU = ((i) mVar).U()))) > 0) {
            return listU.get(iD0 - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.G.m
    protected final List<m> n() {
        if (this.f == m.c) {
            this.f = new b(this, 4);
        }
        return this.f;
    }

    public final com.github.catvod.spider.merge.I.c n0(String str) {
        com.github.catvod.spider.merge.E.c.e(str);
        com.github.catvod.spider.merge.I.d dVarJ = com.github.catvod.spider.merge.I.f.j(str);
        com.github.catvod.spider.merge.E.c.g(dVarJ);
        return com.github.catvod.spider.merge.I.a.a(dVarJ, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean o0(com.github.catvod.spider.merge.G.f.a r5) {
        /*
            r4 = this;
            boolean r5 = r5.g()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.H.h r5 = r4.d
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
            com.github.catvod.spider.merge.G.m r5 = r4.a
            com.github.catvod.spider.merge.G.i r5 = (com.github.catvod.spider.merge.G.i) r5
            if (r5 == 0) goto L1e
            com.github.catvod.spider.merge.H.h r5 = r5.d
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L21
        L20:
            r5 = 1
        L21:
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.H.h r5 = r4.d
            boolean r5 = r5.f()
            if (r5 == 0) goto L54
            com.github.catvod.spider.merge.G.m r5 = r4.a
            com.github.catvod.spider.merge.G.i r5 = (com.github.catvod.spider.merge.G.i) r5
            if (r5 == 0) goto L37
            boolean r5 = r5.e0()
            if (r5 == 0) goto L54
        L37:
            com.github.catvod.spider.merge.G.m r5 = r4.a
            r2 = 0
            if (r5 != 0) goto L3d
            goto L50
        L3d:
            int r3 = r4.b
            if (r3 <= 0) goto L50
            java.util.List r5 = r5.n()
            int r2 = r4.b
            int r2 = r2 + (-1)
            java.lang.Object r5 = r5.get(r2)
            r2 = r5
            com.github.catvod.spider.merge.G.m r2 = (com.github.catvod.spider.merge.G.m) r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.G.i.o0(com.github.catvod.spider.merge.G.f$a):boolean");
    }

    @Override // com.github.catvod.spider.merge.G.m
    protected final boolean p() {
        return this.g != null;
    }

    public final com.github.catvod.spider.merge.I.c p0() {
        m mVar = this.a;
        if (mVar == null) {
            return new com.github.catvod.spider.merge.I.c(0);
        }
        List<i> listU = ((i) mVar).U();
        com.github.catvod.spider.merge.I.c cVar = new com.github.catvod.spider.merge.I.c(listU.size() - 1);
        for (i iVar : listU) {
            if (iVar != this) {
                cVar.add(iVar);
            }
        }
        return cVar;
    }

    public final com.github.catvod.spider.merge.H.h q0() {
        return this.d;
    }

    public final String r0() {
        return this.d.b();
    }

    public i s0(String str) {
        com.github.catvod.spider.merge.E.c.g(str);
        this.f.clear();
        f fVarY = y();
        M((fVarY == null || !fVarY.A0().b(h0())) ? new p(str) : new e(str));
        return this;
    }

    @Override // com.github.catvod.spider.merge.G.m
    public String t() {
        return this.d.b();
    }

    public final String t0() {
        StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
        com.github.catvod.spider.merge.F.a.g(new a(sbB), this);
        return com.github.catvod.spider.merge.F.b.h(sbB).trim();
    }

    public final List<p> u0() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : this.f) {
            if (mVar instanceof p) {
                arrayList.add((p) mVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String v0() {
        StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
        int iH = h();
        for (int i2 = 0; i2 < iH; i2++) {
            R(this.f.get(i2), sbB);
        }
        return com.github.catvod.spider.merge.F.b.h(sbB);
    }

    @Override // com.github.catvod.spider.merge.G.m
    void w(Appendable appendable, int i2, f.a aVar) throws IOException {
        if (o0(aVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            r(appendable, i2, aVar);
        }
        appendable.append('<').append(r0());
        com.github.catvod.spider.merge.G.b bVar = this.g;
        if (bVar != null) {
            bVar.p(appendable, aVar);
        }
        if (this.f.isEmpty() && this.d.i() && (aVar.h() != 1 || !this.d.d())) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    @Override // com.github.catvod.spider.merge.G.m
    void x(Appendable appendable, int i2, f.a aVar) throws IOException {
        if (this.f.isEmpty() && this.d.i()) {
            return;
        }
        if (aVar.g() && !this.f.isEmpty() && this.d.a()) {
            r(appendable, i2, aVar);
        }
        appendable.append("</").append(r0()).append('>');
    }

    @Override // com.github.catvod.spider.merge.G.m
    @Nullable
    public final m z() {
        return (i) this.a;
    }
}
