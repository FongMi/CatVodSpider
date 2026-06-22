package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.A.C0019u;
import com.github.catvod.spider.merge.m.D;
import com.github.catvod.spider.merge.M.E;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class l extends q {
    public static final List h = Collections.emptyList();
    public static final String i;
    public final E d;
    public WeakReference e;
    public List f;
    public c g;

    static {
        Pattern.compile("\\s+");
        i = "/".concat("baseUri");
    }

    public l() {
        this(E.a("V", D.d), "", null);
    }

    public static int H(l lVar, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == lVar) {
                return i2;
            }
        }
        return 0;
    }

    public static boolean J(q qVar) {
        if (qVar instanceof l) {
            l lVar = (l) qVar;
            int i2 = 0;
            while (!lVar.d.g) {
                lVar = (l) lVar.a;
                i2++;
                if (i2 >= 6 || lVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    public static void y(q qVar, StringBuilder sb) {
        if (qVar instanceof s) {
            sb.append(((s) qVar).y());
        } else if ((qVar instanceof l) && ((l) qVar).d.b.equals("br")) {
            sb.append("\n");
        }
    }

    public final com.github.catvod.spider.merge.N.e A() {
        return new com.github.catvod.spider.merge.N.e(z());
    }

    @Override // com.github.catvod.spider.merge.L.q
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public l g() {
        return (l) super.g();
    }

    public final String C() {
        String strY;
        StringBuilder sbB = com.github.catvod.bean.b.b();
        for (q qVar : this.f) {
            if (qVar instanceof f) {
                strY = ((f) qVar).y();
            } else if (qVar instanceof e) {
                strY = ((e) qVar).y();
            } else if (qVar instanceof l) {
                strY = ((l) qVar).C();
            } else if (qVar instanceof d) {
                strY = ((d) qVar).y();
            }
            sbB.append(strY);
        }
        return com.github.catvod.bean.b.g(sbB);
    }

    public final void D(String str) {
        d().k(i, str);
    }

    public final int E() {
        q qVar = this.a;
        if (((l) qVar) == null) {
            return 0;
        }
        return H(this, ((l) qVar).z());
    }

    public final boolean F() {
        for (q qVar : this.f) {
            if (qVar instanceof s) {
                if (!com.github.catvod.bean.b.d(((s) qVar).y())) {
                    return true;
                }
            } else if ((qVar instanceof l) && ((l) qVar).F()) {
                return true;
            }
        }
        return false;
    }

    public final String G() {
        h hVar;
        StringBuilder sbB = com.github.catvod.bean.b.b();
        int size = this.f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            q qVar = (q) this.f.get(i2);
            q qVarW = qVar.w();
            hVar = qVarW instanceof h ? (h) qVarW : null;
            if (hVar == null) {
                hVar = new h("");
            }
            com.github.catvod.spider.merge.R.g.a(new com.github.catvod.spider.merge.B.c(sbB, hVar.j), qVar);
            i2++;
        }
        String strG = com.github.catvod.bean.b.g(sbB);
        q qVarW2 = w();
        hVar = qVarW2 instanceof h ? (h) qVarW2 : null;
        return (hVar != null ? hVar.j : new h("").j).e ? strG.trim() : strG;
    }

    public final String I() {
        StringBuilder sbB = com.github.catvod.bean.b.b();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            q qVar = (q) this.f.get(i2);
            if (qVar instanceof s) {
                s sVar = (s) qVar;
                String strY = sVar.y();
                if (J(sVar.a) || (sVar instanceof d)) {
                    sbB.append(strY);
                } else {
                    com.github.catvod.bean.b.a(sbB, strY, s.B(sbB));
                }
            } else if ((qVar instanceof l) && ((l) qVar).d.b.equals("br") && !s.B(sbB)) {
                sbB.append(" ");
            }
        }
        return com.github.catvod.bean.b.g(sbB).trim();
    }

    public final l K() {
        List listZ;
        int iH;
        q qVar = this.a;
        if (qVar != null && (iH = H(this, (listZ = ((l) qVar).z()))) > 0) {
            return (l) listZ.get(iH - 1);
        }
        return null;
    }

    public final com.github.catvod.spider.merge.N.e L(String str) {
        com.github.catvod.spider.merge.J.b.d(str);
        com.github.catvod.spider.merge.N.o oVarJ = com.github.catvod.spider.merge.N.q.j(str);
        com.github.catvod.spider.merge.J.b.f(oVarJ);
        com.github.catvod.spider.merge.N.e eVar = new com.github.catvod.spider.merge.N.e();
        com.github.catvod.spider.merge.R.g.a(new com.github.catvod.spider.merge.N.a(this, eVar, oVarJ), this);
        return eVar;
    }

    public final l M(String str) {
        com.github.catvod.spider.merge.J.b.d(str);
        return new com.github.catvod.spider.merge.N.a(com.github.catvod.spider.merge.N.q.j(str)).d(this, this);
    }

    public final boolean N(g gVar) {
        l lVar;
        if (gVar.e) {
            if (this.d.d || ((lVar = (l) this.a) != null && lVar.d.d)) {
                if (!(!r4.c)) {
                    return true;
                }
                q qVar = this.a;
                l lVar2 = (l) qVar;
                if (lVar2 != null && !lVar2.d.c) {
                    return true;
                }
                q qVar2 = null;
                if (qVar != null && this.b > 0) {
                    qVar2 = (q) qVar.j().get(this.b - 1);
                }
                if (qVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String O() {
        StringBuilder sbB = com.github.catvod.bean.b.b();
        com.github.catvod.spider.merge.R.g.a(new C0019u(sbB), this);
        return com.github.catvod.bean.b.g(sbB).trim();
    }

    public final String P() {
        StringBuilder sbB = com.github.catvod.bean.b.b();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            y((q) this.f.get(i2), sbB);
        }
        return com.github.catvod.bean.b.g(sbB);
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final c d() {
        if (this.g == null) {
            this.g = new c();
        }
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final String e() {
        for (l lVar = this; lVar != null; lVar = (l) lVar.a) {
            c cVar = lVar.g;
            if (cVar != null) {
                String str = i;
                if (cVar.g(str) != -1) {
                    return lVar.g.d(str);
                }
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final int f() {
        return this.f.size();
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final q h(q qVar) {
        l lVar = (l) super.h(qVar);
        c cVar = this.g;
        lVar.g = cVar != null ? cVar.clone() : null;
        k kVar = new k(lVar, this.f.size());
        lVar.f = kVar;
        kVar.addAll(this.f);
        return lVar;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final q i() {
        this.f.clear();
        return this;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final List j() {
        if (this.f == q.c) {
            this.f = new k(this, 4);
        }
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final boolean l() {
        return this.g != null;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public String o() {
        return this.d.a;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public void q(Appendable appendable, int i2, g gVar) throws IOException {
        if (N(gVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            q.m(appendable, i2, gVar);
        }
        Appendable appendableAppend = appendable.append('<');
        E e = this.d;
        appendableAppend.append(e.a);
        c cVar = this.g;
        if (cVar != null) {
            cVar.f(appendable, gVar);
        }
        if (this.f.isEmpty()) {
            boolean z = e.e;
            if ((z || e.f) && (gVar.h != 1 || !z)) {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.merge.L.q
    public void r(Appendable appendable, int i2, g gVar) throws IOException {
        boolean zIsEmpty = this.f.isEmpty();
        E e = this.d;
        if (zIsEmpty && (e.e || e.f)) {
            return;
        }
        if (gVar.e && !this.f.isEmpty() && e.d) {
            q.m(appendable, i2, gVar);
        }
        appendable.append("</").append(e.a).append('>');
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final q s() {
        return (l) this.a;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final q w() {
        q qVar = this;
        while (true) {
            q qVar2 = qVar.a;
            if (qVar2 == null) {
                return (l) qVar;
            }
            qVar = qVar2;
        }
    }

    public final void x(q qVar) {
        q qVar2 = qVar.a;
        if (qVar2 != null) {
            qVar2.v(qVar);
        }
        qVar.a = this;
        j();
        this.f.add(qVar);
        qVar.b = this.f.size() - 1;
    }

    public final List z() {
        List list;
        if (this.f.size() == 0) {
            return h;
        }
        WeakReference weakReference = this.e;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = (q) this.f.get(i2);
            if (qVar instanceof l) {
                arrayList.add((l) qVar);
            }
        }
        this.e = new WeakReference(arrayList);
        return arrayList;
    }

    public l(E e, String str, c cVar) {
        com.github.catvod.spider.merge.J.b.f(e);
        this.f = q.c;
        this.g = cVar;
        this.d = e;
        if (str != null) {
            D(str);
        }
    }
}
