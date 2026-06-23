package com.github.catvod.spider.merge.C0.c0;

import com.github.catvod.spider.merge.C0.d0.D;
import com.github.catvod.spider.merge.C0.d0.F;
import com.github.catvod.spider.merge.C0.e0.C0176c;
import com.github.catvod.spider.merge.C0.e0.C0180g;
import com.github.catvod.spider.merge.C0.e0.C0181h;
import com.github.catvod.spider.merge.C0.e0.N;
import com.github.catvod.spider.merge.C0.e0.P;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class l extends r {
    private static final List<l> j = Collections.emptyList();
    private static final String k;
    private F f;
    private WeakReference<List<l>> g;
    List<r> h;
    private c i;

    static {
        Pattern.compile("\\s+");
        k = "/baseUri";
    }

    public l(F f, String str, c cVar) {
        com.github.catvod.spider.merge.C0.N.a.k(f);
        this.h = r.e;
        this.i = cVar;
        this.f = f;
        if (str != null) {
            l(str);
        }
    }

    public l(String str) {
        this(F.l(str, D.d), "", null);
    }

    private static void K(l lVar, C0180g c0180g) {
        l lVar2 = (l) lVar.c;
        if (lVar2 == null || lVar2.n0().equals("#root")) {
            return;
        }
        c0180g.add(lVar2);
        K(lVar2, c0180g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(StringBuilder sb, u uVar) {
        String strI = uVar.I();
        if (h0(uVar.c) || (uVar instanceof d)) {
            sb.append(strI);
            return;
        }
        boolean zM = u.M(sb);
        int i = com.github.catvod.spider.merge.C0.b0.b.d;
        int length = strI.length();
        boolean z = false;
        boolean z2 = false;
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = strI.codePointAt(iCharCount);
            if (!(iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160)) {
                if (!(iCodePointAt == 8203 || iCodePointAt == 173)) {
                    sb.appendCodePoint(iCodePointAt);
                    z2 = true;
                    z = false;
                }
            } else if ((!zM || z2) && !z) {
                sb.append(' ');
                z = true;
            }
            iCharCount = Character.charCount(iCodePointAt) + iCharCount;
        }
    }

    private static <E extends l> int Z(l lVar, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == lVar) {
                return i;
            }
        }
        return 0;
    }

    static boolean h0(r rVar) {
        if (!(rVar instanceof l)) {
            return false;
        }
        l lVar = (l) rVar;
        int i = 0;
        while (!lVar.f.j()) {
            l lVar2 = (l) lVar.c;
            i++;
            if (i >= 6 || lVar2 == null) {
                return false;
            }
            lVar = lVar2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.C0.c0.r] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // com.github.catvod.spider.merge.C0.c0.r
    public final r F() {
        ?? r1 = this;
        while (true) {
            ?? r0 = r1;
            r rVar = r0.c;
            if (rVar == null) {
                return (l) r0;
            }
            r1 = rVar;
        }
    }

    public final l L(r rVar) {
        com.github.catvod.spider.merge.C0.N.a.k(rVar);
        r rVar2 = rVar.c;
        if (rVar2 != null) {
            rVar2.D(rVar);
        }
        rVar.c = this;
        n();
        this.h.add(rVar);
        rVar.d = this.h.size() - 1;
        return this;
    }

    public final l M(String str) {
        s.a(this).getClass();
        l lVar = new l(F.l(str, D.c), e(), null);
        L(lVar);
        return lVar;
    }

    public final l O(String str) {
        com.github.catvod.spider.merge.C0.N.a.k(str);
        L(new u(str));
        return this;
    }

    public final l P() {
        return Q().get(0);
    }

    final List<l> Q() {
        List<l> list;
        if (h() == 0) {
            return j;
        }
        WeakReference<List<l>> weakReference = this.g;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.h.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            r rVar = this.h.get(i);
            if (rVar instanceof l) {
                arrayList.add((l) rVar);
            }
        }
        this.g = new WeakReference<>(arrayList);
        return arrayList;
    }

    public final C0180g R() {
        return new C0180g(Q());
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public l j() {
        return (l) super.j();
    }

    public final String T() {
        String strI;
        StringBuilder sbA = com.github.catvod.spider.merge.C0.b0.b.a();
        for (r rVar : this.h) {
            if (rVar instanceof f) {
                strI = ((f) rVar).I();
            } else if (rVar instanceof e) {
                strI = ((e) rVar).I();
            } else if (rVar instanceof l) {
                strI = ((l) rVar).T();
            } else if (rVar instanceof d) {
                strI = ((d) rVar).I();
            }
            sbA.append(strI);
        }
        return com.github.catvod.spider.merge.C0.b0.b.g(sbA);
    }

    public final int U() {
        r rVar = this.c;
        if (((l) rVar) == null) {
            return 0;
        }
        return Z(this, ((l) rVar).Q());
    }

    public final C0180g V() {
        return C0176c.a(new C0181h(), this);
    }

    public final boolean W(String str) {
        c cVar = this.i;
        if (cVar == null) {
            return false;
        }
        String strK = cVar.k("class");
        int length = strK.length();
        int length2 = str.length();
        if (length == 0 || length < length2) {
            return false;
        }
        if (length == length2) {
            return str.equalsIgnoreCase(strK);
        }
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Character.isWhitespace(strK.charAt(i2))) {
                if (!z) {
                    continue;
                } else {
                    if (i2 - i == length2 && strK.regionMatches(true, i, str, 0, length2)) {
                        return true;
                    }
                    z = false;
                }
            } else if (!z) {
                i = i2;
                z = true;
            }
        }
        if (z && length - i == length2) {
            return strK.regionMatches(true, i, str, 0, length2);
        }
        return false;
    }

    public final String X() {
        StringBuilder sbA = com.github.catvod.spider.merge.C0.b0.b.a();
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            this.h.get(i).v(sbA);
        }
        String strG = com.github.catvod.spider.merge.C0.b0.b.g(sbA);
        h hVarY = y();
        if (hVarY == null) {
            hVarY = new h();
        }
        return hVarY.s0().f() ? strG.trim() : strG;
    }

    public final String Y() {
        c cVar = this.i;
        return cVar != null ? cVar.k("id") : "";
    }

    public final boolean a0() {
        return this.f.c();
    }

    public final l b0() {
        r rVar = this.c;
        if (rVar == null) {
            return null;
        }
        List<l> listQ = ((l) rVar).Q();
        int iZ = Z(this, listQ) + 1;
        if (listQ.size() > iZ) {
            return listQ.get(iZ);
        }
        return null;
    }

    final void c0() {
        this.g = null;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    public final c d() {
        if (this.i == null) {
            this.i = new c();
        }
        return this.i;
    }

    public final String d0() {
        return this.f.i();
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    public final String e() {
        String str = k;
        while (this != null) {
            c cVar = this.i;
            if (cVar != null) {
                if (cVar.o(str) != -1) {
                    return this.i.j(str);
                }
            }
            this = (l) this.c;
        }
        return "";
    }

    public final String e0() {
        StringBuilder sbA = com.github.catvod.spider.merge.C0.b0.b.a();
        for (r rVar : this.h) {
            if (rVar instanceof u) {
                N(sbA, (u) rVar);
            } else if ((rVar instanceof l) && ((l) rVar).f.b().equals("br") && !u.M(sbA)) {
                sbA.append(" ");
            }
        }
        return com.github.catvod.spider.merge.C0.b0.b.g(sbA).trim();
    }

    public final l f0() {
        return (l) this.c;
    }

    public final C0180g g0() {
        C0180g c0180g = new C0180g();
        K(this, c0180g);
        return c0180g;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    public final int h() {
        return this.h.size();
    }

    public final l i0() {
        List<l> listQ;
        int iZ;
        r rVar = this.c;
        if (rVar != null && (iZ = Z(this, (listQ = ((l) rVar).Q()))) > 0) {
            return listQ.get(iZ - 1);
        }
        return null;
    }

    public final C0180g j0(String str) {
        com.github.catvod.spider.merge.C0.N.a.i(str);
        N nH = P.h(str);
        com.github.catvod.spider.merge.C0.N.a.k(nH);
        return C0176c.a(nH, this);
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    protected final r k(r rVar) {
        l lVar = (l) super.k(rVar);
        c cVar = this.i;
        lVar.i = cVar != null ? cVar.clone() : null;
        k kVar = new k(lVar, this.h.size());
        lVar.h = kVar;
        kVar.addAll(this.h);
        return lVar;
    }

    public final l k0(String str) {
        com.github.catvod.spider.merge.C0.N.a.i(str);
        return C0176c.b(P.h(str), this);
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    protected final void l(String str) {
        d().t(k, str);
    }

    public final C0180g l0() {
        r rVar = this.c;
        if (rVar == null) {
            return new C0180g(0);
        }
        List<l> listQ = ((l) rVar).Q();
        C0180g c0180g = new C0180g(listQ.size() - 1);
        for (l lVar : listQ) {
            if (lVar != this) {
                c0180g.add(lVar);
            }
        }
        return c0180g;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    public final r m() {
        this.h.clear();
        return this;
    }

    public final F m0() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    protected final List<r> n() {
        if (this.h == r.e) {
            this.h = new k(this, 4);
        }
        return this.h;
    }

    public final String n0() {
        return this.f.b();
    }

    public l o0(String str) {
        com.github.catvod.spider.merge.C0.N.a.k(str);
        this.h.clear();
        h hVarY = y();
        L((hVarY == null || !hVarY.u0().b(d0())) ? new u(str) : new f(str));
        return this;
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    protected final boolean p() {
        return this.i != null;
    }

    public final String p0() {
        StringBuilder sbA = com.github.catvod.spider.merge.C0.b0.b.a();
        com.github.catvod.spider.merge.C0.W.a.c(new j(sbA), this);
        return com.github.catvod.spider.merge.C0.b0.b.g(sbA).trim();
    }

    public final List<u> q0() {
        ArrayList arrayList = new ArrayList();
        for (r rVar : this.h) {
            if (rVar instanceof u) {
                arrayList.add((u) rVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    public String t() {
        return this.f.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    @Override // com.github.catvod.spider.merge.C0.c0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void w(java.lang.Appendable r6, int r7, com.github.catvod.spider.merge.C0.c0.g r8) throws java.io.IOException {
        /*
            r5 = this;
            r1 = 0
            r2 = 1
            boolean r0 = r8.f()
            if (r0 == 0) goto L57
            com.github.catvod.spider.merge.C0.d0.F r0 = r5.f
            boolean r0 = r0.a()
            if (r0 != 0) goto L8f
            com.github.catvod.spider.merge.C0.c0.r r0 = r5.c
            com.github.catvod.spider.merge.C0.c0.l r0 = (com.github.catvod.spider.merge.C0.c0.l) r0
            if (r0 == 0) goto L1e
            com.github.catvod.spider.merge.C0.d0.F r0 = r0.f
            boolean r0 = r0.a()
            if (r0 != 0) goto L8f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L57
            com.github.catvod.spider.merge.C0.d0.F r0 = r5.f
            boolean r0 = r0.f()
            if (r0 == 0) goto Laa
            com.github.catvod.spider.merge.C0.d0.F r0 = r5.f
            boolean r0 = r0.d()
            if (r0 != 0) goto Laa
            com.github.catvod.spider.merge.C0.c0.r r0 = r5.c
            com.github.catvod.spider.merge.C0.c0.l r0 = (com.github.catvod.spider.merge.C0.c0.l) r0
            if (r0 == 0) goto L3d
            boolean r0 = r0.a0()
            if (r0 == 0) goto Laa
        L3d:
            com.github.catvod.spider.merge.C0.c0.r r3 = r5.c
            r0 = 0
            if (r3 != 0) goto L91
        L42:
            if (r0 == 0) goto Laa
            r0 = r2
        L45:
            if (r0 != 0) goto L57
            boolean r0 = r6 instanceof java.lang.StringBuilder
            if (r0 == 0) goto L54
            r0 = r6
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L57
        L54:
            r5.r(r6, r7, r8)
        L57:
            r0 = 60
            java.lang.Appendable r0 = r6.append(r0)
            java.lang.String r1 = r5.n0()
            r0.append(r1)
            com.github.catvod.spider.merge.C0.c0.c r0 = r5.i
            if (r0 == 0) goto L6b
            r0.n(r6, r8)
        L6b:
            java.util.List<com.github.catvod.spider.merge.C0.c0.r> r0 = r5.h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L89
            com.github.catvod.spider.merge.C0.d0.F r0 = r5.f
            boolean r0 = r0.h()
            if (r0 == 0) goto L89
            int r0 = r8.g()
            if (r0 != r2) goto La4
            com.github.catvod.spider.merge.C0.d0.F r0 = r5.f
            boolean r0 = r0.d()
            if (r0 == 0) goto La4
        L89:
            r0 = 62
            r6.append(r0)
        L8e:
            return
        L8f:
            r0 = r2
            goto L1f
        L91:
            int r4 = r5.d
            if (r4 <= 0) goto L42
            java.util.List r0 = r3.n()
            int r3 = r5.d
            int r3 = r3 + (-1)
            java.lang.Object r0 = r0.get(r3)
            com.github.catvod.spider.merge.C0.c0.r r0 = (com.github.catvod.spider.merge.C0.c0.r) r0
            goto L42
        La4:
            java.lang.String r0 = " />"
            r6.append(r0)
            goto L8e
        Laa:
            r0 = r1
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.c0.l.w(java.lang.Appendable, int, com.github.catvod.spider.merge.C0.c0.g):void");
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    void x(Appendable appendable, int i, g gVar) throws IOException {
        if (this.h.isEmpty() && this.f.h()) {
            return;
        }
        if (gVar.f() && !this.h.isEmpty() && this.f.a()) {
            r(appendable, i, gVar);
        }
        appendable.append("</").append(n0()).append('>');
    }

    @Override // com.github.catvod.spider.merge.C0.c0.r
    public final r z() {
        return (l) this.c;
    }
}
