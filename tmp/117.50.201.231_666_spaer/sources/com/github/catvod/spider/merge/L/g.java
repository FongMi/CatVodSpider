package com.github.catvod.spider.merge.L;

import com.base.model.proto.DramaDetailProto;
import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.I.d;
import com.github.catvod.spider.merge.K.d;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.m.C0595d;
import com.github.catvod.spider.merge.t.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g extends com.github.catvod.spider.merge.K.a<f> {
    private Stack<e> a;
    private e b;

    public g(com.github.catvod.spider.merge.I.c cVar) {
        com.github.catvod.spider.merge.R.c.d(g.class);
        this.a = new Stack<>();
        this.b = e.c(cVar);
        Stack<e> stack = this.a;
        e eVarC = e.c(cVar);
        eVarC.j(this.b);
        stack.push(eVarC);
    }

    private e G() {
        return this.a.peek();
    }

    private void H(com.github.catvod.spider.merge.I.c cVar) {
        this.a.peek().i(cVar);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object B(d.u uVar) {
        List listK = uVar.k(d.n.class);
        if (listK == null) {
            return null;
        }
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this);
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((d.n) it.next()).a(this);
            if (fVar != null) {
                linkedList.add(fVar.g());
            }
        }
        return new f(com.github.catvod.spider.merge.y.f.e(linkedList, ":"));
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object C(d.m mVar) {
        if (mVar.m() == null || mVar.m().f()) {
            return (f) ((d.y) mVar.j(d.y.class)).a(this);
        }
        f fVar = (f) ((d.y) mVar.j(d.y.class)).a(this);
        f fVar2 = (f) mVar.m().a(this);
        switch (mVar.g.getType()) {
            case 17:
                return new f(Double.valueOf(fVar2.c().doubleValue() * fVar.c().doubleValue()));
            case 18:
                return new f(Double.valueOf(fVar.c().doubleValue() / fVar2.c().doubleValue()));
            case 19:
                return new f(Double.valueOf(fVar.c().doubleValue() % fVar2.c().doubleValue()));
            default:
                StringBuilder sbA = C0529a.a("syntax error, ");
                sbA.append(mVar.getText());
                throw new com.github.catvod.spider.merge.P.e(sbA.toString());
        }
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object D(d.f fVar) {
        f fVar2;
        List listK = fVar.k(d.v.class);
        boolean z = true;
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this);
        }
        if (listK.size() != 2) {
            StringBuilder sbA = C0529a.a("error equalityExpr near:");
            sbA.append(fVar.getText());
            throw new com.github.catvod.spider.merge.P.e(sbA.toString());
        }
        f fVar3 = (f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this);
        f fVar4 = (f) ((com.github.catvod.spider.merge.x.b) listK.get(1)).a(this);
        if ("=".equals(fVar.g.getText())) {
            if (fVar3.s().equals(fVar4.s())) {
                if (fVar3 != fVar4 && !fVar3.equals(fVar4)) {
                    z = false;
                }
                fVar2 = new f(Boolean.valueOf(z));
            } else {
                String strG = fVar3.g();
                String strG2 = fVar4.g();
                if (strG != strG2 && (strG == null || !strG.equals(strG2))) {
                    z = false;
                }
                fVar2 = new f(Boolean.valueOf(z));
            }
        } else if (fVar3.s().equals(fVar4.s())) {
            fVar2 = new f(Boolean.valueOf(!(fVar3 == fVar4 || fVar3.equals(fVar4))));
        } else {
            String strG3 = fVar3.g();
            String strG4 = fVar4.g();
            if (strG3 == strG4 || (strG3 != null && strG3.equals(strG4))) {
                z = true;
            }
            fVar2 = new f(Boolean.valueOf(!z));
        }
        return fVar2;
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object b(d.w wVar) {
        f fVar = null;
        for (int i = 0; i < wVar.d(); i++) {
            com.github.catvod.spider.merge.x.b bVarC = wVar.c(i);
            if (bVarC instanceof d.x) {
                fVar = (f) bVarC.a(this);
                if (fVar.n()) {
                    H(fVar.d());
                }
            } else if ("//".equals(bVarC.getText())) {
                G().h();
            } else {
                G().g();
            }
        }
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object c(d.g gVar) {
        return (f) ((d.q) gVar.j(d.q.class)).a(this);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object d(d.n nVar) {
        f fVar = nVar.l(7) != null ? new f(nVar.l(7).getText()) : new f(nVar.l(41).getText());
        fVar.j();
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object e(d.s sVar) {
        long size;
        com.github.catvod.spider.merge.I.c cVar = new com.github.catvod.spider.merge.I.c();
        for (i iVar : G().a()) {
            Stack<e> stack = this.a;
            e eVarB = e.b(iVar);
            eVarB.j(G());
            stack.push(eVarB);
            f fVar = (f) ((d.g) sVar.j(d.g.class)).a(this);
            this.a.pop();
            if (fVar.q()) {
                long jLongValue = fVar.f().longValue();
                if (jLongValue < 0) {
                    String strR0 = iVar.r0();
                    if (strR0 == "JX_TEXT" || (strR0 != null && strR0.equals("JX_TEXT"))) {
                        String strD = iVar.d("EL_SAME_TAG_ALL_NUM");
                        size = com.github.catvod.spider.merge.y.f.b(strD) ? -1 : Integer.parseInt(strD);
                    } else {
                        e eVarG = G();
                        com.github.catvod.spider.merge.I.c cVar2 = new com.github.catvod.spider.merge.I.c();
                        i iVarJ0 = iVar.j0();
                        String strR02 = iVar.r0();
                        iVarJ0.getClass();
                        com.github.catvod.spider.merge.E.c.e(strR02);
                        for (i iVar2 : com.github.catvod.spider.merge.I.a.a(new d.N(com.github.catvod.spider.merge.F.a.f(strR02)), iVarJ0)) {
                            if (eVarG.a().contains(iVar2)) {
                                cVar2.add(iVar2);
                            }
                        }
                        size = cVar2.size();
                    }
                    jLongValue = size + jLongValue + 1;
                    if (jLongValue < 0) {
                        jLongValue = 1;
                    }
                }
                String strR03 = iVar.r0();
                if (strR03 == "JX_TEXT" || (strR03 != null && strR03.equals("JX_TEXT"))) {
                    if (jLongValue == (com.github.catvod.spider.merge.y.f.b(iVar.d("EL_SAME_TAG_INDEX")) ? -1 : Integer.parseInt(r4))) {
                        cVar.add(iVar);
                    }
                } else if (jLongValue == C0595d.b(iVar, G())) {
                    cVar.add(iVar);
                }
            } else if (fVar.l()) {
                if (fVar.a().booleanValue()) {
                    cVar.add(iVar);
                }
            } else if (fVar.r()) {
                if (com.github.catvod.spider.merge.y.f.d(fVar.g())) {
                    cVar.add(iVar);
                }
            } else if (!fVar.n()) {
                if (!fVar.p()) {
                    throw new com.github.catvod.spider.merge.P.e("unknown expr val:" + fVar);
                }
                if (fVar.e().size() > 0) {
                    cVar.add(iVar);
                }
            } else if (fVar.d().size() > 0) {
                cVar.add(iVar);
            }
        }
        return new f(cVar);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object f(d.c cVar) {
        List listK = cVar.k(d.m.class);
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this);
        }
        Double dC = ((f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this)).c();
        String text = null;
        for (int i = 1; i < cVar.d(); i++) {
            com.github.catvod.spider.merge.x.b bVarC = cVar.c(i);
            if (bVarC instanceof d.m) {
                f fVar = (f) bVarC.a(this);
                if (Marker.ANY_NON_NULL_MARKER.equals(text)) {
                    dC = Double.valueOf(fVar.c().doubleValue() + dC.doubleValue());
                } else {
                    if (!"-".equals(text)) {
                        StringBuilder sbA = C0529a.a("syntax error, ");
                        sbA.append(cVar.getText());
                        throw new com.github.catvod.spider.merge.P.e(sbA.toString());
                    }
                    dC = Double.valueOf(dC.doubleValue() - fVar.c().doubleValue());
                }
            } else {
                text = bVarC.getText();
            }
        }
        return new f(dC);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object g(d.h hVar) {
        return (f) ((d.t) hVar.j(d.t.class)).a(this);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object h(d.p pVar) {
        if (((d.o) pVar.j(d.o.class)) != null) {
            return (f) ((d.o) pVar.j(d.o.class)).a(this);
        }
        if (pVar.l(5) != null) {
            return com.github.catvod.spider.merge.Q.a.b(pVar.l(5).getText()).a(G());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x025c A[LOOP:8: B:95:0x0256->B:97:0x025c, LOOP_END] */
    @Override // com.github.catvod.spider.merge.K.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(com.github.catvod.spider.merge.K.d.x r9) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L.g.j(com.github.catvod.spider.merge.K.d$x):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object k(d.i iVar) {
        LinkedList linkedList = new LinkedList();
        f fVar = (f) ((d.j) iVar.j(d.j.class)).a(this);
        for (d.g gVar : iVar.k(d.g.class)) {
            this.a.push(e.d(G()));
            linkedList.add(gVar.a(this));
            this.a.pop();
        }
        return com.github.catvod.spider.merge.Q.a.a(fVar.g()).a(G(), linkedList);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object l(d.t tVar) {
        f fVar;
        com.github.catvod.spider.merge.x.b bVarN;
        if (tVar.m() != null && !tVar.m().f()) {
            bVarN = tVar.m();
        } else {
            if (tVar.n() == null || tVar.n().f()) {
                if (tVar.l(39) != null) {
                    fVar = new f(tVar.l(39).getText());
                    fVar.j();
                } else {
                    if (tVar.l(6) == null) {
                        StringBuilder sbA = C0529a.a("not support variableReference:");
                        sbA.append(tVar.getText());
                        throw new com.github.catvod.spider.merge.P.e(sbA.toString());
                    }
                    String text = tVar.l(6).getText();
                    fVar = new f(text == null ? null : Double.valueOf(text));
                }
                return fVar;
            }
            bVarN = tVar.n();
        }
        return (f) bVarN.a(this);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object n(d.z zVar) {
        f fVar;
        i iVar;
        if (zVar.m() == null && !zVar.m().f()) {
            return (f) ((d.z) zVar.j(d.z.class)).a(this);
        }
        f fVar2 = (f) zVar.m().a(this);
        if (zVar.g != null) {
            this.a.push(e.d(G().e()));
            f fVar3 = (f) ((d.z) zVar.j(d.z.class)).a(this);
            this.a.pop();
            if (!fVar2.n()) {
                if (fVar2.r()) {
                    if (fVar3.n()) {
                        iVar = new i("V");
                        iVar.Q(fVar2.g());
                        fVar3.d().add(iVar);
                        return fVar3;
                    }
                    fVar = new f(fVar2.g() + fVar3.g());
                    return fVar;
                }
                if (fVar2.l()) {
                    if (fVar3.l()) {
                        fVar = new f(Boolean.valueOf(fVar3.a().booleanValue() | fVar2.a().booleanValue()));
                    } else {
                        if (fVar3.n()) {
                            iVar = new i("V");
                            iVar.Q(fVar2.g());
                            fVar3.d().add(iVar);
                            return fVar3;
                        }
                        if (!fVar3.r()) {
                            StringBuilder sbA = C0529a.a("can not merge val1=");
                            sbA.append(fVar2.a());
                            sbA.append(",val2=");
                            sbA.append(fVar3.g());
                            throw new com.github.catvod.spider.merge.P.d(sbA.toString());
                        }
                        fVar = new f(fVar2.a() + fVar3.g());
                    }
                    return fVar;
                }
                if (!fVar2.q()) {
                    LinkedList linkedList = new LinkedList();
                    if (com.github.catvod.spider.merge.y.f.d(fVar2.g())) {
                        linkedList.add(fVar2.g());
                    }
                    if (com.github.catvod.spider.merge.y.f.d(fVar3.g())) {
                        linkedList.add(fVar3.g());
                    }
                    fVar = new f(com.github.catvod.spider.merge.y.f.e(linkedList, ","));
                } else {
                    if (!fVar3.r()) {
                        if (fVar3.n()) {
                            iVar = new i("V");
                            iVar.Q(fVar2.g());
                            fVar3.d().add(iVar);
                            return fVar3;
                        }
                        StringBuilder sbA2 = C0529a.a("can not merge val1=");
                        sbA2.append(fVar2.c());
                        sbA2.append(",val2=");
                        sbA2.append(fVar3.g());
                        throw new com.github.catvod.spider.merge.P.d(sbA2.toString());
                    }
                    fVar = new f(fVar2.c() + fVar3.g());
                }
                return fVar;
            }
            if (fVar3.n()) {
                fVar2.d().addAll(fVar3.d());
            } else {
                i iVar2 = new i("V");
                iVar2.Q(fVar3.g());
                fVar2.d().add(iVar2);
            }
        }
        return fVar2;
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object o(d.y yVar) {
        f fVar = (f) ((d.z) yVar.j(d.z.class)).a(this);
        return yVar.g == null ? fVar : new f(Double.valueOf(-fVar.c().doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object p(d.q qVar) {
        List listK = qVar.k(d.C0018d.class);
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this);
        }
        Boolean boolA = ((f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this)).a();
        for (int i = 1; i < listK.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() | ((f) ((com.github.catvod.spider.merge.x.b) listK.get(i)).a(this)).a().booleanValue());
        }
        return new f(boolA);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object q(d.b bVar) {
        Stack<e> stack = this.a;
        e eVarC = e.c(this.b.a());
        eVarC.j(G());
        stack.push(eVarC);
        String text = bVar.g.getText();
        if (text == "//" || (text != null && text.equals("//"))) {
            G().h();
        }
        f fVar = (f) ((d.w) bVar.j(d.w.class)).a(this);
        this.a.pop();
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object r(d.e eVar) {
        if (eVar.l(7) != null) {
            return com.github.catvod.spider.merge.Q.a.c(eVar.l(7).getText()).a(G().a());
        }
        if (!"@".equals(eVar.getText())) {
            return null;
        }
        f fVar = new f(null);
        fVar.h();
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object s(d.r rVar) {
        com.github.catvod.spider.merge.x.b bVarM;
        if (rVar.m() == null || rVar.m().f()) {
            z zVar = rVar.g;
            if (zVar == null) {
                bVarM = (d.h) rVar.j(d.h.class);
            } else {
                if ("//".equals(zVar.getText())) {
                    G().h();
                }
                bVarM = (d.w) rVar.j(d.w.class);
            }
        } else {
            bVarM = rVar.m();
        }
        return (f) bVarM.a(this);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object t(d.l lVar) {
        return (f) ((d.g) lVar.j(d.g.class)).a(this);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object u(d.C0018d c0018d) {
        List listK = c0018d.k(d.f.class);
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this);
        }
        Boolean boolA = ((f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this)).a();
        for (int i = 1; i < listK.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() & ((f) ((com.github.catvod.spider.merge.x.b) listK.get(i)).a(this)).a().booleanValue());
        }
        return new f(boolA);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object v(d.k kVar) {
        return (f) ((kVar.m() == null || kVar.m().f()) ? (d.b) kVar.j(d.b.class) : kVar.m()).a(this);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object w(d.j jVar) {
        return (f) ((d.u) jVar.j(d.u.class)).a(this);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object x(d.C0528a c0528a) {
        if (!"..".equals(c0528a.getText())) {
            return new f(G().a());
        }
        HashSet hashSet = new HashSet();
        com.github.catvod.spider.merge.I.c cVar = new com.github.catvod.spider.merge.I.c();
        Iterator<i> it = G().a().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().j0());
        }
        cVar.addAll(hashSet);
        return new f(cVar);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object y(d.o oVar) {
        com.github.catvod.spider.merge.x.b bVarM;
        if (Marker.ANY_MARKER.equals(oVar.getText())) {
            f fVar = new f(Marker.ANY_MARKER);
            fVar.j();
            return fVar;
        }
        if (oVar.n() != null && !oVar.n().f()) {
            bVarM = oVar.n();
        } else {
            if (oVar.m() == null || oVar.m().f()) {
                return null;
            }
            bVarM = oVar.m();
        }
        return (f) bVarM.a(this);
    }

    @Override // com.github.catvod.spider.merge.K.e
    public final Object z(d.v vVar) {
        f fVar;
        List listK = vVar.k(d.c.class);
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this);
        }
        if (listK.size() != 2) {
            StringBuilder sbA = C0529a.a("error equalityExpr near:");
            sbA.append(vVar.getText());
            throw new com.github.catvod.spider.merge.P.e(sbA.toString());
        }
        f fVar2 = (f) ((com.github.catvod.spider.merge.x.b) listK.get(0)).a(this);
        f fVar3 = (f) ((com.github.catvod.spider.merge.x.b) listK.get(1)).a(this);
        switch (vVar.g.getType()) {
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
                StringBuilder sbA2 = C0529a.a("unknown operator");
                sbA2.append(vVar.g.getText());
                throw new com.github.catvod.spider.merge.P.e(sbA2.toString());
            case 30:
                fVar = new f(Boolean.valueOf(fVar2.g().startsWith(fVar3.g())));
                break;
            case 31:
                fVar = new f(Boolean.valueOf(fVar2.g().endsWith(fVar3.g())));
                break;
            case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
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
}
