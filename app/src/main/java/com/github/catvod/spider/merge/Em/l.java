package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Fs.D;
import com.github.catvod.spider.merge.Fs.F;
import com.github.catvod.spider.merge.ej.C1057c;
import com.github.catvod.spider.merge.ej.C1061g;
import com.github.catvod.spider.merge.ej.C1062h;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.P;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
        com.github.catvod.spider.merge.Dw.i.k(f);
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

    private static void K(l lVar, C1061g c1061g) {
        l lVar2 = (l) lVar.c;
        if (lVar2 == null || lVar2.n0().equals("#root")) {
            return;
        }
        c1061g.add(lVar2);
        K(lVar2, c1061g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(StringBuilder sb, u uVar) {
        String strI = uVar.I();
        if (h0(uVar.c) || (uVar instanceof d)) {
            sb.append(strI);
            return;
        }
        boolean zM = u.M(sb);
        int i = com.github.catvod.spider.merge.Dw.e.d;
        int length = strI.length();
        int iCharCount = 0;
        boolean z = false;
        boolean z2 = false;
        while (iCharCount < length) {
            int iCodePointAt = strI.codePointAt(iCharCount);
            if (!(iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160)) {
                if (!(iCodePointAt == 8203 || iCodePointAt == 173)) {
                    sb.appendCodePoint(iCodePointAt);
                    z = true;
                    z2 = false;
                }
            } else if ((!zM || z) && !z2) {
                sb.append(' ');
                z2 = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
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
        if (rVar instanceof l) {
            l lVar = (l) rVar;
            int i = 0;
            while (!lVar.f.j()) {
                lVar = (l) lVar.c;
                i++;
                if (i >= 6 || lVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public final r F() {
        r rVar = this;
        while (true) {
            r rVar2 = rVar.c;
            if (rVar2 == null) {
                return (l) rVar;
            }
            rVar = rVar2;
        }
    }

    public final l L(r rVar) {
        com.github.catvod.spider.merge.Dw.i.k(rVar);
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
        com.github.catvod.spider.merge.Dw.i.k(str);
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

    public final C1061g R() {
        return new C1061g(Q());
    }

    @Override // com.github.catvod.spider.merge.Em.r
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public l j() {
        return (l) super.j();
    }

    public final String T() {
        String strI;
        StringBuilder sbA = com.github.catvod.spider.merge.Dw.e.a();
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
        return com.github.catvod.spider.merge.Dw.e.g(sbA);
    }

    public final int U() {
        r rVar = this.c;
        if (((l) rVar) == null) {
            return 0;
        }
        return Z(this, ((l) rVar).Q());
    }

    public final C1061g V() {
        return C1057c.a(new C1062h(), this);
    }

    public final boolean W(String str) {
        c cVar = this.i;
        if (cVar == null) {
            return false;
        }
        String strK = cVar.k("class");
        int length = strK.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
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
        }
        return false;
    }

    public final String X() {
        StringBuilder sbA = com.github.catvod.spider.merge.Dw.e.a();
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            this.h.get(i).v(sbA);
        }
        String strG = com.github.catvod.spider.merge.Dw.e.g(sbA);
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

    @Override // com.github.catvod.spider.merge.Em.r
    public final c d() {
        if (this.i == null) {
            this.i = new c();
        }
        return this.i;
    }

    public final String d0() {
        return this.f.i();
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public final String e() {
        String str = k;
        for (l lVar = this; lVar != null; lVar = (l) lVar.c) {
            c cVar = lVar.i;
            if (cVar != null) {
                if (cVar.o(str) != -1) {
                    return lVar.i.j(str);
                }
            }
        }
        return "";
    }

    public final String e0() {
        StringBuilder sbA = com.github.catvod.spider.merge.Dw.e.a();
        for (r rVar : this.h) {
            if (rVar instanceof u) {
                N(sbA, (u) rVar);
            } else if ((rVar instanceof l) && ((l) rVar).f.b().equals("br") && !u.M(sbA)) {
                sbA.append(" ");
            }
        }
        return com.github.catvod.spider.merge.Dw.e.g(sbA).trim();
    }

    public final l f0() {
        return (l) this.c;
    }

    public final C1061g g0() {
        C1061g c1061g = new C1061g();
        K(this, c1061g);
        return c1061g;
    }

    @Override // com.github.catvod.spider.merge.Em.r
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

    public final C1061g j0(String str) {
        com.github.catvod.spider.merge.Dw.i.i(str);
        N nH = P.h(str);
        com.github.catvod.spider.merge.Dw.i.k(nH);
        return C1057c.a(nH, this);
    }

    @Override // com.github.catvod.spider.merge.Em.r
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
        com.github.catvod.spider.merge.Dw.i.i(str);
        return C1057c.b(P.h(str), this);
    }

    @Override // com.github.catvod.spider.merge.Em.r
    protected final void l(String str) {
        d().t(k, str);
    }

    public final C1061g l0() {
        r rVar = this.c;
        if (rVar == null) {
            return new C1061g(0);
        }
        List<l> listQ = ((l) rVar).Q();
        C1061g c1061g = new C1061g(listQ.size() - 1);
        for (l lVar : listQ) {
            if (lVar != this) {
                c1061g.add(lVar);
            }
        }
        return c1061g;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public final r m() {
        this.h.clear();
        return this;
    }

    public final F m0() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.Em.r
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
        com.github.catvod.spider.merge.Dw.i.k(str);
        this.h.clear();
        h hVarY = y();
        L((hVarY == null || !hVarY.u0().b(d0())) ? new u(str) : new f(str));
        return this;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    protected final boolean p() {
        return this.i != null;
    }

    public final String p0() {
        StringBuilder sbA = com.github.catvod.spider.merge.Dw.e.a();
        com.github.catvod.spider.merge.Dw.q.c(new j(sbA), this);
        return com.github.catvod.spider.merge.Dw.e.g(sbA).trim();
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

    @Override // com.github.catvod.spider.merge.Em.r
    public String t() {
        return this.f.b();
    }

    @Override // com.github.catvod.spider.merge.Em.r
    void w(Appendable appendable, int i, g gVar) throws IOException {
        l lVar;
        l lVar2;
        if (gVar.f()) {
            boolean z = false;
            if (this.f.a() || ((lVar2 = (l) this.c) != null && lVar2.f.a())) {
                if (this.f.f() && !this.f.d() && ((lVar = (l) this.c) == null || lVar.a0())) {
                    r rVar = this.c;
                    r rVar2 = null;
                    if (rVar != null && this.d > 0) {
                        rVar2 = rVar.n().get(this.d - 1);
                    }
                    if (rVar2 != null) {
                        z = true;
                    }
                }
                if (!z && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
                    r(appendable, i, gVar);
                }
            }
        }
        appendable.append('<').append(n0());
        c cVar = this.i;
        if (cVar != null) {
            cVar.n(appendable, gVar);
        }
        if (this.h.isEmpty() && this.f.h() && (gVar.g() != 1 || !this.f.d())) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    @Override // com.github.catvod.spider.merge.Em.r
    void x(Appendable appendable, int i, g gVar) throws IOException {
        if (this.h.isEmpty() && this.f.h()) {
            return;
        }
        if (gVar.f() && !this.h.isEmpty() && this.f.a()) {
            r(appendable, i, gVar);
        }
        appendable.append("</").append(n0()).append('>');
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public final r z() {
        return (l) this.c;
    }
}
