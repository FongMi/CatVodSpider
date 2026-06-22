package com.github.catvod.spider.merge.Wb;

import com.github.catvod.spider.merge.CQ.A;
import com.github.catvod.spider.merge.CQ.B;
import com.github.catvod.spider.merge.CQ.C;
import com.github.catvod.spider.merge.CQ.E;
import com.github.catvod.spider.merge.CQ.i;
import com.github.catvod.spider.merge.CQ.k;
import com.github.catvod.spider.merge.CQ.l;
import com.github.catvod.spider.merge.CQ.m;
import com.github.catvod.spider.merge.CQ.n;
import com.github.catvod.spider.merge.CQ.o;
import com.github.catvod.spider.merge.CQ.p;
import com.github.catvod.spider.merge.CQ.q;
import com.github.catvod.spider.merge.CQ.r;
import com.github.catvod.spider.merge.CQ.s;
import com.github.catvod.spider.merge.CQ.t;
import com.github.catvod.spider.merge.CQ.u;
import com.github.catvod.spider.merge.CQ.v;
import com.github.catvod.spider.merge.CQ.w;
import com.github.catvod.spider.merge.CQ.x;
import com.github.catvod.spider.merge.CQ.y;
import com.github.catvod.spider.merge.CQ.z;
import com.github.catvod.spider.merge.HR.C0720c;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.HR.C0735s;
import com.github.catvod.spider.merge.VE.h;
import com.github.catvod.spider.merge.XI.j;
import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g extends com.github.catvod.spider.merge.Bk.a implements E<f> {
    private Stack<e> a;
    private e b;

    public g(C0724g c0724g) {
        j.d(g.class);
        this.a = new Stack<>();
        this.b = e.c(c0724g);
        Stack<e> stack = this.a;
        e eVarC = e.c(c0724g);
        eVarC.j(this.b);
        stack.push(eVarC);
    }

    private e G() {
        return this.a.peek();
    }

    private void H(C0724g c0724g) {
        this.a.peek().i(c0724g);
    }

    public final Object A(com.github.catvod.spider.merge.CQ.g gVar) {
        if (gVar.l(7) != null) {
            return com.github.catvod.spider.merge.XI.g.c(gVar.l(7).getText()).a(G().a());
        }
        if (!ZrJ.d("39").equals(gVar.getText())) {
            return null;
        }
        f fVar = new f(null);
        fVar.h();
        return fVar;
    }

    public final Object B(l lVar) {
        return (f) lVar.j(w.class).b(this);
    }

    public final Object C(t tVar) {
        m mVarM;
        if (tVar.m() == null || tVar.m().f()) {
            com.github.catvod.spider.merge.yZ.E e = tVar.g;
            if (e == null) {
                mVarM = (com.github.catvod.spider.merge.CQ.j) tVar.j(com.github.catvod.spider.merge.CQ.j.class);
            } else {
                if (ZrJ.d("566C").equals(e.getText())) {
                    G().h();
                }
                mVarM = (y) tVar.j(y.class);
            }
        } else {
            mVarM = tVar.m();
        }
        return (f) mVarM.b(this);
    }

    public final Object D(m mVar) {
        return (f) ((mVar.m() == null || mVar.m().f()) ? (com.github.catvod.spider.merge.CQ.d) mVar.j(com.github.catvod.spider.merge.CQ.d.class) : mVar.m()).b(this);
    }

    public final Object b(B b) {
        f fVar;
        com.github.catvod.spider.merge.UY.m mVar;
        if (b.m() == null && !b.m().f()) {
            return (f) b.j(B.class).b(this);
        }
        f fVar2 = (f) b.m().b(this);
        if (b.g != null) {
            this.a.push(e.d(G().e()));
            f fVar3 = (f) b.j(B.class).b(this);
            this.a.pop();
            boolean zN = fVar2.n();
            String strD = ZrJ.d("2F");
            if (!zN) {
                if (fVar2.r()) {
                    if (fVar3.n()) {
                        mVar = new com.github.catvod.spider.merge.UY.m(strD);
                        mVar.P(fVar2.g());
                        fVar3.d().add(mVar);
                        return fVar3;
                    }
                    fVar = new f(fVar2.g() + fVar3.g());
                    return fVar;
                }
                boolean zL = fVar2.l();
                String strD2 = ZrJ.d("55352A217A78");
                String strD3 = ZrJ.d("1A22256D262A0D6326283A221C633D2C247444");
                if (zL) {
                    if (fVar3.l()) {
                        fVar = new f(Boolean.valueOf(fVar3.a().booleanValue() | fVar2.a().booleanValue()));
                    } else {
                        if (fVar3.n()) {
                            mVar = new com.github.catvod.spider.merge.UY.m(strD);
                            mVar.P(fVar2.g());
                            fVar3.d().add(mVar);
                            return fVar3;
                        }
                        if (!fVar3.r()) {
                            StringBuilder sbB = C0925t.b(strD3);
                            sbB.append(fVar2.a());
                            sbB.append(strD2);
                            sbB.append(fVar3.g());
                            throw new com.github.catvod.spider.merge.XU.d(sbB.toString());
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
                    fVar = new f(h.e(linkedList, ZrJ.d("55")));
                } else {
                    if (!fVar3.r()) {
                        if (fVar3.n()) {
                            mVar = new com.github.catvod.spider.merge.UY.m(strD);
                            mVar.P(fVar2.g());
                            fVar3.d().add(mVar);
                            return fVar3;
                        }
                        StringBuilder sbB2 = C0925t.b(strD3);
                        sbB2.append(fVar2.c());
                        sbB2.append(strD2);
                        sbB2.append(fVar3.g());
                        throw new com.github.catvod.spider.merge.XU.d(sbB2.toString());
                    }
                    fVar = new f(fVar2.c() + fVar3.g());
                }
                return fVar;
            }
            if (fVar3.n()) {
                fVar2.d().addAll(fVar3.d());
            } else {
                com.github.catvod.spider.merge.UY.m mVar2 = new com.github.catvod.spider.merge.UY.m(strD);
                mVar2.P(fVar3.g());
                fVar2.d().add(mVar2);
            }
        }
        return fVar2;
    }

    public final Object c(n nVar) {
        return (f) nVar.j(i.class).b(this);
    }

    public final Object d(A a) {
        f fVar = (f) a.j(B.class).b(this);
        return a.g == null ? fVar : new f(Double.valueOf(-fVar.c().doubleValue()));
    }

    public final Object e(x xVar) {
        f fVar;
        List listK = xVar.k(com.github.catvod.spider.merge.CQ.e.class);
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this);
        }
        if (listK.size() != 2) {
            StringBuilder sbB = C0925t.b(ZrJ.d("1C3139223A651C323E2C242C0D3A0E353837592D2E2C3A7F"));
            sbB.append(xVar.getText());
            throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
        }
        f fVar2 = (f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this);
        f fVar3 = (f) ((com.github.catvod.spider.merge.cz.b) listK.get(1)).b(this);
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
                StringBuilder sbB2 = C0925t.b(ZrJ.d("0C2D202327321763243D2D371837243F"));
                sbB2.append(xVar.g.getText());
                throw new com.github.catvod.spider.merge.XU.e(sbB2.toString());
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

    public final Object f(com.github.catvod.spider.merge.CQ.e eVar) {
        List listK = eVar.k(o.class);
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this);
        }
        Double dC = ((f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this)).c();
        String text = null;
        for (int i = 1; i < eVar.d(); i++) {
            com.github.catvod.spider.merge.cz.b bVarC = eVar.c(i);
            if (bVarC instanceof o) {
                f fVar = (f) bVarC.b(this);
                if (ZrJ.d("52").equals(text)) {
                    dC = Double.valueOf(fVar.c().doubleValue() + dC.doubleValue());
                } else {
                    if (!ZrJ.d("54").equals(text)) {
                        StringBuilder sbB = C0925t.b(ZrJ.d("0A3A2539293D5926393F27375563"));
                        sbB.append(eVar.getText());
                        throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
                    }
                    dC = Double.valueOf(dC.doubleValue() - fVar.c().doubleValue());
                }
            } else {
                text = bVarC.getText();
            }
        }
        return new f(dC);
    }

    public final Object g(i iVar) {
        return (f) iVar.j(s.class).b(this);
    }

    public final Object h(com.github.catvod.spider.merge.CQ.f fVar) {
        List listK = fVar.k(com.github.catvod.spider.merge.CQ.h.class);
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this);
        }
        Boolean boolA = ((f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this)).a();
        for (int i = 1; i < listK.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() & ((f) ((com.github.catvod.spider.merge.cz.b) listK.get(i)).b(this)).a().booleanValue());
        }
        return new f(boolA);
    }

    public final Object j(C c) {
        return l(c);
    }

    public final Object k(com.github.catvod.spider.merge.CQ.d dVar) {
        Stack<e> stack = this.a;
        e eVarC = e.c(this.b.a());
        eVarC.j(G());
        stack.push(eVarC);
        String text = dVar.g.getText();
        String strD = ZrJ.d("566C");
        if (text == strD || (text != null && text.equals(strD))) {
            G().h();
        }
        f fVar = (f) dVar.j(y.class).b(this);
        this.a.pop();
        return fVar;
    }

    public final Object m(y yVar) {
        f fVar = null;
        for (int i = 0; i < yVar.d(); i++) {
            com.github.catvod.spider.merge.cz.b bVarC = yVar.c(i);
            if (bVarC instanceof z) {
                fVar = (f) bVarC.b(this);
                if (fVar.n()) {
                    H(fVar.d());
                }
            } else {
                if (ZrJ.d("566C").equals(bVarC.getText())) {
                    G().h();
                } else {
                    G().g();
                }
            }
        }
        return fVar;
    }

    public final Object n(k kVar) {
        LinkedList linkedList = new LinkedList();
        f fVar = (f) kVar.j(l.class).b(this);
        for (i iVar : kVar.k(i.class)) {
            this.a.push(e.d(G()));
            linkedList.add(iVar.b(this));
            this.a.pop();
        }
        return com.github.catvod.spider.merge.XI.g.a(fVar.g()).a(G(), linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021e A[LOOP:6: B:87:0x0218->B:89:0x021e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(com.github.catvod.spider.merge.CQ.z r9) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Wb.g.o(com.github.catvod.spider.merge.CQ.z):java.lang.Object");
    }

    public final Object p(o oVar) {
        if (oVar.m() == null || oVar.m().f()) {
            return (f) oVar.j(A.class).b(this);
        }
        f fVar = (f) oVar.j(A.class).b(this);
        f fVar2 = (f) oVar.m().b(this);
        switch (oVar.g.getType()) {
            case 17:
                return new f(Double.valueOf(fVar2.c().doubleValue() * fVar.c().doubleValue()));
            case 18:
                return new f(Double.valueOf(fVar.c().doubleValue() / fVar2.c().doubleValue()));
            case 19:
                return new f(Double.valueOf(fVar.c().doubleValue() % fVar2.c().doubleValue()));
            default:
                StringBuilder sbB = C0925t.b(ZrJ.d("0A3A2539293D5926393F27375563"));
                sbB.append(oVar.getText());
                throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
        }
    }

    public final Object q(p pVar) {
        f fVar = pVar.l(7) != null ? new f(pVar.l(7).getText()) : new f(pVar.l(41).getText());
        fVar.j();
        return fVar;
    }

    public final Object r(com.github.catvod.spider.merge.CQ.h hVar) {
        f fVar;
        List listK = hVar.k(x.class);
        boolean z = true;
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this);
        }
        if (listK.size() != 2) {
            StringBuilder sbB = C0925t.b(ZrJ.d("1C3139223A651C323E2C242C0D3A0E353837592D2E2C3A7F"));
            sbB.append(hVar.getText());
            throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
        }
        f fVar2 = (f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this);
        f fVar3 = (f) ((com.github.catvod.spider.merge.cz.b) listK.get(1)).b(this);
        if (ZrJ.d("44").equals(hVar.g.getText())) {
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

    public final Object s(u uVar) {
        long j;
        C0724g c0724g = new C0724g();
        for (com.github.catvod.spider.merge.UY.m mVar : G().a()) {
            Stack<e> stack = this.a;
            e eVarB = e.b(mVar);
            eVarB.j(G());
            stack.push(eVarB);
            f fVar = (f) uVar.j(i.class).b(this);
            this.a.pop();
            if (fVar.q()) {
                long jLongValue = fVar.f().longValue();
                String strD = ZrJ.d("331B14190D1D2D");
                if (jLongValue < 0) {
                    String strT0 = mVar.t0();
                    if (strT0 == strD || (strT0 != null && strT0.equals(strD))) {
                        String strC = mVar.c(ZrJ.d("3C0F141E09083C1C1F0C0F1A380F0712061034"));
                        jLongValue = ((long) (h.b(strC) ? -1 : Integer.parseInt(strC))) + jLongValue + 1;
                        j = 0;
                    } else {
                        e eVarG = G();
                        C0724g c0724g2 = new C0724g();
                        com.github.catvod.spider.merge.UY.m mVarK0 = mVar.k0();
                        String strT02 = mVar.t0();
                        mVarK0.getClass();
                        com.github.catvod.spider.merge.XU.k.e(strT02);
                        for (com.github.catvod.spider.merge.UY.m mVar2 : C0720c.a(new C0735s(com.github.catvod.spider.merge.Bk.l.d(strT02), 1), mVarK0)) {
                            if (eVarG.a().contains(mVar2)) {
                                c0724g2.add(mVar2);
                            }
                        }
                        jLongValue = ((long) c0724g2.size()) + jLongValue + 1;
                        j = 0;
                    }
                    if (jLongValue < j) {
                        jLongValue = 1;
                    }
                }
                String strT03 = mVar.t0();
                if (strT03 == strD || (strT03 != null && strT03.equals(strD))) {
                    if (jLongValue == (h.b(mVar.c(ZrJ.d("3C0F141E09083C1C1F0C0F1A300D0F0810"))) ? -1 : Integer.parseInt(r4))) {
                        c0724g.add(mVar);
                    }
                } else if (jLongValue == com.github.catvod.spider.merge.Bk.p.b(mVar, G())) {
                    c0724g.add(mVar);
                }
            } else if (fVar.l()) {
                if (fVar.a().booleanValue()) {
                    c0724g.add(mVar);
                }
            } else if (fVar.r()) {
                if (h.d(fVar.g())) {
                    c0724g.add(mVar);
                }
            } else if (!fVar.n()) {
                if (!fVar.p()) {
                    throw new com.github.catvod.spider.merge.XU.e(ZrJ.d("0C2D2023273217632E35383759352A2172") + fVar);
                }
                if (fVar.e().size() > 0) {
                    c0724g.add(mVar);
                }
            } else if (fVar.d().size() > 0) {
                c0724g.add(mVar);
            }
        }
        return new f(c0724g);
    }

    public final Object t(q qVar) {
        w wVarM;
        String text = qVar.getText();
        String strD = ZrJ.d("53");
        if (strD.equals(text)) {
            f fVar = new f(strD);
            fVar.j();
            return fVar;
        }
        if (qVar.n() != null && !qVar.n().f()) {
            wVarM = qVar.n();
        } else {
            if (qVar.m() == null || qVar.m().f()) {
                return null;
            }
            wVarM = qVar.m();
        }
        return (f) wVarM.b(this);
    }

    public final Object u(com.github.catvod.spider.merge.CQ.j jVar) {
        return (f) jVar.j(v.class).b(this);
    }

    public final Object v(com.github.catvod.spider.merge.CQ.c cVar) {
        if (!ZrJ.d("576D").equals(cVar.getText())) {
            return new f(G().a());
        }
        HashSet hashSet = new HashSet();
        C0724g c0724g = new C0724g();
        Iterator<com.github.catvod.spider.merge.UY.m> it = G().a().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().k0());
        }
        c0724g.addAll(hashSet);
        return new f(c0724g);
    }

    public final Object w(v vVar) {
        f fVar;
        i iVarN;
        if (vVar.m() != null && !vVar.m().f()) {
            iVarN = vVar.m();
        } else {
            if (vVar.n() == null || vVar.n().f()) {
                if (vVar.l(39) != null) {
                    fVar = new f(vVar.l(39).getText());
                    fVar.j();
                } else {
                    if (vVar.l(6) == null) {
                        StringBuilder sbB = C0925t.b(ZrJ.d("172C3F6D3B300933243F3C650F2239242927152619282E200B26252E2D7F"));
                        sbB.append(vVar.getText());
                        throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
                    }
                    String text = vVar.l(6).getText();
                    fVar = new f(text == null ? null : Double.valueOf(text));
                }
                return fVar;
            }
            iVarN = vVar.n();
        }
        return (f) iVarN.b(this);
    }

    public final Object x(w wVar) {
        List listK = wVar.k(p.class);
        if (listK == null) {
            return null;
        }
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this);
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((p) it.next()).b(this);
            if (fVar != null) {
                linkedList.add(fVar.g());
            }
        }
        return new f(h.e(linkedList, ZrJ.d("43")));
    }

    public final Object y(r rVar) {
        if (rVar.j(q.class) != null) {
            return (f) rVar.j(q.class).b(this);
        }
        if (rVar.l(5) != null) {
            return com.github.catvod.spider.merge.XI.g.b(rVar.l(5).getText()).a(G());
        }
        return null;
    }

    public final Object z(s sVar) {
        List listK = sVar.k(com.github.catvod.spider.merge.CQ.f.class);
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this);
        }
        Boolean boolA = ((f) ((com.github.catvod.spider.merge.cz.b) listK.get(0)).b(this)).a();
        for (int i = 1; i < listK.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() | ((f) ((com.github.catvod.spider.merge.cz.b) listK.get(i)).b(this)).a().booleanValue());
        }
        return new f(boolA);
    }
}
