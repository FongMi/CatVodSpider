package com.github.catvod.spider.merge.W;

import com.github.catvod.spider.merge.D.h;
import com.github.catvod.spider.merge.N.C0070c;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.N.C0085s;
import com.github.catvod.spider.merge.V.A;
import com.github.catvod.spider.merge.V.B;
import com.github.catvod.spider.merge.V.C;
import com.github.catvod.spider.merge.V.C0095c;
import com.github.catvod.spider.merge.V.C0096d;
import com.github.catvod.spider.merge.V.C0097e;
import com.github.catvod.spider.merge.V.E;
import com.github.catvod.spider.merge.V.i;
import com.github.catvod.spider.merge.V.j;
import com.github.catvod.spider.merge.V.k;
import com.github.catvod.spider.merge.V.l;
import com.github.catvod.spider.merge.V.m;
import com.github.catvod.spider.merge.V.n;
import com.github.catvod.spider.merge.V.o;
import com.github.catvod.spider.merge.V.p;
import com.github.catvod.spider.merge.V.q;
import com.github.catvod.spider.merge.V.r;
import com.github.catvod.spider.merge.V.s;
import com.github.catvod.spider.merge.V.t;
import com.github.catvod.spider.merge.V.u;
import com.github.catvod.spider.merge.V.v;
import com.github.catvod.spider.merge.V.w;
import com.github.catvod.spider.merge.V.x;
import com.github.catvod.spider.merge.V.y;
import com.github.catvod.spider.merge.V.z;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.InterfaceC0250E;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class g extends com.github.catvod.spider.merge.B.a implements E<f> {
    private Stack<e> a;
    private e b;

    public g(C0074g c0074g) {
        com.github.catvod.spider.merge.c0.c.d(g.class);
        this.a = new Stack<>();
        this.b = e.c(c0074g);
        Stack<e> stack = this.a;
        e eVarC = e.c(c0074g);
        eVarC.j(this.b);
        stack.push(eVarC);
    }

    private e G() {
        return this.a.peek();
    }

    private void H(C0074g c0074g) {
        this.a.peek().i(c0074g);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f A(com.github.catvod.spider.merge.V.g gVar) {
        if (gVar.l(7) != null) {
            return com.github.catvod.spider.merge.b0.a.c(gVar.l(7).getText()).a(G().a());
        }
        if (!oZP.d("35").equals(gVar.getText())) {
            return null;
        }
        f fVar = new f(null);
        fVar.h();
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f B(l lVar) {
        return (f) ((w) lVar.j(w.class)).b(this);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f C(t tVar) {
        com.github.catvod.spider.merge.C.b bVarM;
        if (tVar.m() == null || tVar.m().f()) {
            InterfaceC0250E interfaceC0250E = tVar.g;
            if (interfaceC0250E == null) {
                bVarM = (j) tVar.j(j.class);
            } else {
                if (oZP.d("5A40").equals(interfaceC0250E.getText())) {
                    G().h();
                }
                bVarM = (y) tVar.j(y.class);
            }
        } else {
            bVarM = tVar.m();
        }
        return (f) bVarM.b(this);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f D(m mVar) {
        return (f) ((mVar.m() == null || mVar.m().f()) ? (C0096d) mVar.j(C0096d.class) : mVar.m()).b(this);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f b(B b) {
        f fVar;
        com.github.catvod.spider.merge.L.m mVar;
        if (b.m() == null && !b.m().f()) {
            return (f) ((B) b.j(B.class)).b(this);
        }
        f fVar2 = (f) b.m().b(this);
        if (b.g != null) {
            this.a.push(e.d(G().e()));
            f fVar3 = (f) ((B) b.j(B.class)).b(this);
            this.a.pop();
            boolean zN = fVar2.n();
            String strD = oZP.d("23");
            if (!zN) {
                if (fVar2.r()) {
                    if (fVar3.n()) {
                        mVar = new com.github.catvod.spider.merge.L.m(strD);
                        mVar.P(fVar2.g());
                        fVar3.d().add(mVar);
                        return fVar3;
                    }
                    fVar = new f(fVar2.g() + fVar3.g());
                    return fVar;
                }
                boolean zL = fVar2.l();
                String strD2 = oZP.d("5919162D5E68");
                String strD3 = oZP.d("160E1961023A014F1A241E32104F0120006448");
                if (zL) {
                    if (fVar3.l()) {
                        fVar = new f(Boolean.valueOf(fVar3.a().booleanValue() | fVar2.a().booleanValue()));
                    } else {
                        if (fVar3.n()) {
                            mVar = new com.github.catvod.spider.merge.L.m(strD);
                            mVar.P(fVar2.g());
                            fVar3.d().add(mVar);
                            return fVar3;
                        }
                        if (!fVar3.r()) {
                            StringBuilder sbC = C0133t.c(strD3);
                            sbC.append(fVar2.a());
                            sbC.append(strD2);
                            sbC.append(fVar3.g());
                            throw new com.github.catvod.spider.merge.a0.d(sbC.toString());
                        }
                        fVar = new f(fVar2.a() + fVar3.g());
                    }
                    return fVar;
                }
                if (!fVar2.q()) {
                    LinkedList linkedList = new LinkedList();
                    if (h.d(fVar2.g())) {
                        linkedList.add(fVar2.g());
                    }
                    if (h.d(fVar3.g())) {
                        linkedList.add(fVar3.g());
                    }
                    fVar = new f(h.e(linkedList, oZP.d("59")));
                } else {
                    if (!fVar3.r()) {
                        if (fVar3.n()) {
                            mVar = new com.github.catvod.spider.merge.L.m(strD);
                            mVar.P(fVar2.g());
                            fVar3.d().add(mVar);
                            return fVar3;
                        }
                        StringBuilder sbC2 = C0133t.c(strD3);
                        sbC2.append(fVar2.c());
                        sbC2.append(strD2);
                        sbC2.append(fVar3.g());
                        throw new com.github.catvod.spider.merge.a0.d(sbC2.toString());
                    }
                    fVar = new f(fVar2.c() + fVar3.g());
                }
                return fVar;
            }
            if (fVar3.n()) {
                fVar2.d().addAll(fVar3.d());
            } else {
                com.github.catvod.spider.merge.L.m mVar2 = new com.github.catvod.spider.merge.L.m(strD);
                mVar2.P(fVar3.g());
                fVar2.d().add(mVar2);
            }
        }
        return fVar2;
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f c(n nVar) {
        return (f) ((i) nVar.j(i.class)).b(this);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f d(A a) {
        f fVar = (f) ((B) a.j(B.class)).b(this);
        return a.g == null ? fVar : new f(Double.valueOf(-fVar.c().doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f e(x xVar) {
        f fVar;
        List listK = xVar.k(C0097e.class);
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this);
        }
        if (listK.size() != 2) {
            StringBuilder sbC = C0133t.c(oZP.d("101D052E1E75101E0220003C011632391C27550112201E6F"));
            sbC.append(xVar.getText());
            throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
        }
        f fVar2 = (f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this);
        f fVar3 = (f) ((com.github.catvod.spider.merge.C.b) listK.get(1)).b(this);
        switch (xVar.g.getType()) {
            case 24:
                fVar = new f(Boolean.valueOf(fVar2.compareTo(fVar3) < 0));
                break;
            case 25:
                fVar = new f(Boolean.valueOf(fVar2.compareTo(fVar3) > 0));
                break;
            case 26:
                fVar = new f(Boolean.valueOf(fVar2.compareTo(fVar3) <= 0));
                break;
            case 27:
                fVar = new f(Boolean.valueOf(fVar2.compareTo(fVar3) >= 0));
                break;
            case 28:
            case 29:
            default:
                StringBuilder sbC2 = C0133t.c(oZP.d("00011C2F03221B4F18310927141B1833"));
                sbC2.append(xVar.g.getText());
                throw new com.github.catvod.spider.merge.a0.e(sbC2.toString());
            case 30:
                fVar = new f(Boolean.valueOf(fVar2.g().startsWith(fVar3.g())));
                break;
            case 31:
                fVar = new f(Boolean.valueOf(fVar2.g().endsWith(fVar3.g())));
                break;
            case 32:
                fVar = new f(Boolean.valueOf(fVar2.g().contains(fVar3.g())));
                break;
            case 33:
                fVar = new f(Boolean.valueOf(fVar2.g().matches(fVar3.g())));
                break;
            case 34:
                fVar = new f(Boolean.valueOf(!fVar2.g().matches(fVar3.g())));
                break;
        }
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f f(C0097e c0097e) {
        List listK = c0097e.k(o.class);
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this);
        }
        Double dC = ((f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this)).c();
        String text = null;
        for (int i = 1; i < c0097e.d(); i++) {
            com.github.catvod.spider.merge.C.b bVarC = c0097e.c(i);
            if (bVarC instanceof o) {
                f fVar = (f) bVarC.b(this);
                if (oZP.d("5E").equals(text)) {
                    dC = Double.valueOf(fVar.c().doubleValue() + dC.doubleValue());
                } else {
                    if (!oZP.d("58").equals(text)) {
                        StringBuilder sbC = C0133t.c(oZP.d("061619350D2D550A05330327594F"));
                        sbC.append(c0097e.getText());
                        throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
                    }
                    dC = Double.valueOf(dC.doubleValue() - fVar.c().doubleValue());
                }
            } else {
                text = bVarC.getText();
            }
        }
        return new f(dC);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f g(i iVar) {
        return (f) ((s) iVar.j(s.class)).b(this);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f h(com.github.catvod.spider.merge.V.f fVar) {
        List listK = fVar.k(com.github.catvod.spider.merge.V.h.class);
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this);
        }
        Boolean boolA = ((f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this)).a();
        for (int i = 1; i < listK.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() & ((f) ((com.github.catvod.spider.merge.C.b) listK.get(i)).b(this)).a().booleanValue());
        }
        return new f(boolA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.github.catvod.spider.merge.W.f, java.lang.Object] */
    @Override // com.github.catvod.spider.merge.V.E
    public final f j(C c) {
        return l(c);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f k(C0096d c0096d) {
        Stack<e> stack = this.a;
        e eVarC = e.c(this.b.a());
        eVarC.j(G());
        stack.push(eVarC);
        String text = c0096d.g.getText();
        String strD = oZP.d("5A40");
        if (text == strD || (text != null && text.equals(strD))) {
            G().h();
        }
        f fVar = (f) ((y) c0096d.j(y.class)).b(this);
        this.a.pop();
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f m(y yVar) {
        f fVar = null;
        for (int i = 0; i < yVar.d(); i++) {
            com.github.catvod.spider.merge.C.b bVarC = yVar.c(i);
            if (bVarC instanceof z) {
                fVar = (f) bVarC.b(this);
                if (fVar.n()) {
                    H(fVar.d());
                }
            } else {
                if (oZP.d("5A40").equals(bVarC.getText())) {
                    G().h();
                } else {
                    G().g();
                }
            }
        }
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f n(k kVar) {
        LinkedList linkedList = new LinkedList();
        f fVar = (f) ((l) kVar.j(l.class)).b(this);
        for (i iVar : kVar.k(i.class)) {
            this.a.push(e.d(G()));
            linkedList.add(iVar.b(this));
            this.a.pop();
        }
        return com.github.catvod.spider.merge.b0.a.a(fVar.g()).a(G(), linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021e A[LOOP:6: B:87:0x0218->B:89:0x021e, LOOP_END] */
    @Override // com.github.catvod.spider.merge.V.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.W.f o(com.github.catvod.spider.merge.V.z r9) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.W.g.o(com.github.catvod.spider.merge.V.z):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f p(o oVar) {
        if (oVar.m() == null || oVar.m().f()) {
            return (f) ((A) oVar.j(A.class)).b(this);
        }
        f fVar = (f) ((A) oVar.j(A.class)).b(this);
        f fVar2 = (f) oVar.m().b(this);
        switch (oVar.g.getType()) {
            case 17:
                return new f(Double.valueOf(fVar2.c().doubleValue() * fVar.c().doubleValue()));
            case 18:
                return new f(Double.valueOf(fVar.c().doubleValue() / fVar2.c().doubleValue()));
            case 19:
                return new f(Double.valueOf(fVar.c().doubleValue() % fVar2.c().doubleValue()));
            default:
                StringBuilder sbC = C0133t.c(oZP.d("061619350D2D550A05330327594F"));
                sbC.append(oVar.getText());
                throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
        }
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f q(p pVar) {
        f fVar = pVar.l(7) != null ? new f(pVar.l(7).getText()) : new f(pVar.l(41).getText());
        fVar.j();
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f r(com.github.catvod.spider.merge.V.h hVar) {
        f fVar;
        List listK = hVar.k(x.class);
        boolean z = true;
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this);
        }
        if (listK.size() != 2) {
            StringBuilder sbC = C0133t.c(oZP.d("101D052E1E75101E0220003C011632391C27550112201E6F"));
            sbC.append(hVar.getText());
            throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
        }
        f fVar2 = (f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this);
        f fVar3 = (f) ((com.github.catvod.spider.merge.C.b) listK.get(1)).b(this);
        if (oZP.d("48").equals(hVar.g.getText())) {
            if (fVar2.s().equals(fVar3.s())) {
                if (fVar2 != fVar3 && !fVar2.equals(fVar3)) {
                    z = false;
                }
                fVar = new f(Boolean.valueOf(z));
            } else {
                String strG = fVar2.g();
                String strG2 = fVar3.g();
                if (strG != strG2 && (strG == null || !strG.equals(strG2))) {
                    z = false;
                }
                fVar = new f(Boolean.valueOf(z));
            }
        } else if (fVar2.s().equals(fVar3.s())) {
            fVar = new f(Boolean.valueOf(!(fVar2 == fVar3 || fVar2.equals(fVar3))));
        } else {
            String strG3 = fVar2.g();
            String strG4 = fVar3.g();
            if (strG3 == strG4 || (strG3 != null && strG3.equals(strG4))) {
                z = true;
            }
            fVar = new f(Boolean.valueOf(!z));
        }
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f s(u uVar) {
        long j;
        C0074g c0074g = new C0074g();
        for (com.github.catvod.spider.merge.L.m mVar : G().a()) {
            Stack<e> stack = this.a;
            e eVarB = e.b(mVar);
            eVarB.j(G());
            stack.push(eVarB);
            f fVar = (f) ((i) uVar.j(i.class)).b(this);
            this.a.pop();
            if (fVar.q()) {
                long jLongValue = fVar.f().longValue();
                String strD = oZP.d("3F372815290D21");
                if (jLongValue < 0) {
                    String strT0 = mVar.t0();
                    if (strT0 == strD || (strT0 != null && strT0.equals(strD))) {
                        String strC = mVar.c(oZP.d("302328122D18303023002B0A34233B1E220038"));
                        jLongValue = ((long) (h.b(strC) ? -1 : Integer.parseInt(strC))) + jLongValue + 1;
                        j = 0;
                    } else {
                        e eVarG = G();
                        C0074g c0074g2 = new C0074g();
                        com.github.catvod.spider.merge.L.m mVarK0 = mVar.k0();
                        String strT02 = mVar.t0();
                        mVarK0.getClass();
                        com.github.catvod.spider.merge.J.c.e(strT02);
                        for (com.github.catvod.spider.merge.L.m mVar2 : C0070c.a(new C0085s(com.github.catvod.spider.merge.B.l.d(strT02), 1), mVarK0)) {
                            if (eVarG.a().contains(mVar2)) {
                                c0074g2.add(mVar2);
                            }
                        }
                        jLongValue = ((long) c0074g2.size()) + jLongValue + 1;
                        j = 0;
                    }
                    if (jLongValue < j) {
                        jLongValue = 1;
                    }
                }
                String strT03 = mVar.t0();
                if (strT03 == strD || (strT03 != null && strT03.equals(strD))) {
                    if (jLongValue == (h.b(mVar.c(oZP.d("302328122D18303023002B0A3C21330434"))) ? -1 : Integer.parseInt(r4))) {
                        c0074g.add(mVar);
                    }
                } else if (jLongValue == com.github.catvod.spider.merge.B.p.b(mVar, G())) {
                    c0074g.add(mVar);
                }
            } else if (fVar.l()) {
                if (fVar.a().booleanValue()) {
                    c0074g.add(mVar);
                }
            } else if (fVar.r()) {
                if (h.d(fVar.g())) {
                    c0074g.add(mVar);
                }
            } else if (!fVar.n()) {
                if (!fVar.p()) {
                    throw new com.github.catvod.spider.merge.a0.e(oZP.d("00011C2F03221B4F12391C275519162D56") + fVar);
                }
                if (fVar.e().size() > 0) {
                    c0074g.add(mVar);
                }
            } else if (fVar.d().size() > 0) {
                c0074g.add(mVar);
            }
        }
        return new f(c0074g);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f t(q qVar) {
        com.github.catvod.spider.merge.C.b bVarM;
        String text = qVar.getText();
        String strD = oZP.d("5F");
        if (strD.equals(text)) {
            f fVar = new f(strD);
            fVar.j();
            return fVar;
        }
        if (qVar.n() != null && !qVar.n().f()) {
            bVarM = qVar.n();
        } else {
            if (qVar.m() == null || qVar.m().f()) {
                return null;
            }
            bVarM = qVar.m();
        }
        return (f) bVarM.b(this);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f u(j jVar) {
        return (f) ((v) jVar.j(v.class)).b(this);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f v(C0095c c0095c) {
        if (!oZP.d("5B41").equals(c0095c.getText())) {
            return new f(G().a());
        }
        HashSet hashSet = new HashSet();
        C0074g c0074g = new C0074g();
        Iterator<com.github.catvod.spider.merge.L.m> it = G().a().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().k0());
        }
        c0074g.addAll(hashSet);
        return new f(c0074g);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f w(v vVar) {
        f fVar;
        com.github.catvod.spider.merge.C.b bVarN;
        if (vVar.m() != null && !vVar.m().f()) {
            bVarN = vVar.m();
        } else {
            if (vVar.n() == null || vVar.n().f()) {
                if (vVar.l(39) != null) {
                    fVar = new f(vVar.l(39).getText());
                    fVar.j();
                } else {
                    if (vVar.l(6) == null) {
                        StringBuilder sbC = C0133t.c(oZP.d("1B0003611F20051F18331875030E05280D37190A25240A30070A1922096F"));
                        sbC.append(vVar.getText());
                        throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
                    }
                    String text = vVar.l(6).getText();
                    fVar = new f(text == null ? null : Double.valueOf(text));
                }
                return fVar;
            }
            bVarN = vVar.n();
        }
        return (f) bVarN.b(this);
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f x(w wVar) {
        List listK = wVar.k(p.class);
        if (listK == null) {
            return null;
        }
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this);
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((p) it.next()).b(this);
            if (fVar != null) {
                linkedList.add(fVar.g());
            }
        }
        return new f(h.e(linkedList, oZP.d("4F")));
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f y(r rVar) {
        if (((q) rVar.j(q.class)) != null) {
            return (f) ((q) rVar.j(q.class)).b(this);
        }
        if (rVar.l(5) != null) {
            return com.github.catvod.spider.merge.b0.a.b(rVar.l(5).getText()).a(G());
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V.E
    public final f z(s sVar) {
        List listK = sVar.k(com.github.catvod.spider.merge.V.f.class);
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this);
        }
        Boolean boolA = ((f) ((com.github.catvod.spider.merge.C.b) listK.get(0)).b(this)).a();
        for (int i = 1; i < listK.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() | ((f) ((com.github.catvod.spider.merge.C.b) listK.get(i)).b(this)).a().booleanValue());
        }
        return new f(boolA);
    }
}
