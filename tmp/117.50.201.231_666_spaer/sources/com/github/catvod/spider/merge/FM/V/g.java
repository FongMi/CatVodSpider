package com.github.catvod.spider.merge.FM.V;

import com.base.model.proto.DramaDetailProto;
import com.github.catvod.spider.merge.FM.C.h;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.M.C0270c;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.M.C0285s;
import com.github.catvod.spider.merge.FM.U.A;
import com.github.catvod.spider.merge.FM.U.B;
import com.github.catvod.spider.merge.FM.U.C;
import com.github.catvod.spider.merge.FM.U.C0295c;
import com.github.catvod.spider.merge.FM.U.C0296d;
import com.github.catvod.spider.merge.FM.U.C0297e;
import com.github.catvod.spider.merge.FM.U.E;
import com.github.catvod.spider.merge.FM.U.i;
import com.github.catvod.spider.merge.FM.U.j;
import com.github.catvod.spider.merge.FM.U.k;
import com.github.catvod.spider.merge.FM.U.l;
import com.github.catvod.spider.merge.FM.U.m;
import com.github.catvod.spider.merge.FM.U.n;
import com.github.catvod.spider.merge.FM.U.o;
import com.github.catvod.spider.merge.FM.U.p;
import com.github.catvod.spider.merge.FM.U.q;
import com.github.catvod.spider.merge.FM.U.r;
import com.github.catvod.spider.merge.FM.U.s;
import com.github.catvod.spider.merge.FM.U.t;
import com.github.catvod.spider.merge.FM.U.u;
import com.github.catvod.spider.merge.FM.U.v;
import com.github.catvod.spider.merge.FM.U.w;
import com.github.catvod.spider.merge.FM.U.x;
import com.github.catvod.spider.merge.FM.U.y;
import com.github.catvod.spider.merge.FM.U.z;
import com.github.catvod.spider.merge.FM.x.InterfaceC0427E;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g extends com.github.catvod.spider.merge.FM.A.a implements E<f> {
    private Stack<e> a;
    private e b;

    public g(C0274g c0274g) {
        com.github.catvod.spider.merge.FM.b0.c.d(g.class);
        this.a = new Stack<>();
        this.b = e.c(c0274g);
        Stack<e> stack = this.a;
        e eVarC = e.c(c0274g);
        eVarC.j(this.b);
        stack.push(eVarC);
    }

    private e G() {
        return this.a.peek();
    }

    private void H(C0274g c0274g) {
        this.a.peek().i(c0274g);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f A(l lVar) {
        return (f) ((w) lVar.j(w.class)).b(this);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f B(m mVar) {
        return (f) ((mVar.m() == null || mVar.m().f()) ? (C0296d) mVar.j(C0296d.class) : mVar.m()).b(this);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f C(j jVar) {
        return (f) ((v) jVar.j(v.class)).b(this);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f D(x xVar) {
        f fVar;
        List listK = xVar.k(C0297e.class);
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this);
        }
        if (listK.size() != 2) {
            StringBuilder sbB = P.b("error equalityExpr near:");
            sbB.append(xVar.getText());
            throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
        }
        f fVar2 = (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this);
        f fVar3 = (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(1)).b(this);
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
                StringBuilder sbB2 = P.b("unknown operator");
                sbB2.append(xVar.g.getText());
                throw new com.github.catvod.spider.merge.FM.Z.e(sbB2.toString());
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

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f b(C0295c c0295c) {
        if (!"..".equals(c0295c.getText())) {
            return new f(G().a());
        }
        HashSet hashSet = new HashSet();
        C0274g c0274g = new C0274g();
        Iterator<com.github.catvod.spider.merge.FM.K.m> it = G().a().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().k0());
        }
        c0274g.addAll(hashSet);
        return new f(c0274g);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f c(C0297e c0297e) {
        List listK = c0297e.k(o.class);
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this);
        }
        Double dC = ((f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this)).c();
        String text = null;
        for (int i = 1; i < c0297e.d(); i++) {
            com.github.catvod.spider.merge.FM.B.b bVarC = c0297e.c(i);
            if (bVarC instanceof o) {
                f fVar = (f) bVarC.b(this);
                if (Marker.ANY_NON_NULL_MARKER.equals(text)) {
                    dC = Double.valueOf(fVar.c().doubleValue() + dC.doubleValue());
                } else {
                    if (!"-".equals(text)) {
                        StringBuilder sbB = P.b("syntax error, ");
                        sbB.append(c0297e.getText());
                        throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
                    }
                    dC = Double.valueOf(dC.doubleValue() - fVar.c().doubleValue());
                }
            } else {
                text = bVarC.getText();
            }
        }
        return new f(dC);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f d(y yVar) {
        f fVar = null;
        for (int i = 0; i < yVar.d(); i++) {
            com.github.catvod.spider.merge.FM.B.b bVarC = yVar.c(i);
            if (bVarC instanceof z) {
                fVar = (f) bVarC.b(this);
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

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f e(t tVar) {
        com.github.catvod.spider.merge.FM.B.b bVarM;
        if (tVar.m() == null || tVar.m().f()) {
            InterfaceC0427E interfaceC0427E = tVar.g;
            if (interfaceC0427E == null) {
                bVarM = (j) tVar.j(j.class);
            } else {
                if ("//".equals(interfaceC0427E.getText())) {
                    G().h();
                }
                bVarM = (y) tVar.j(y.class);
            }
        } else {
            bVarM = tVar.m();
        }
        return (f) bVarM.b(this);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f h(com.github.catvod.spider.merge.FM.U.g gVar) {
        if (gVar.l(7) != null) {
            return com.github.catvod.spider.merge.FM.a0.a.c(gVar.l(7).getText()).a(G().a());
        }
        if (!"@".equals(gVar.getText())) {
            return null;
        }
        f fVar = new f(null);
        fVar.h();
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f i(o oVar) {
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
                StringBuilder sbB = P.b("syntax error, ");
                sbB.append(oVar.getText());
                throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
        }
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f j(p pVar) {
        f fVar = pVar.l(7) != null ? new f(pVar.l(7).getText()) : new f(pVar.l(41).getText());
        fVar.j();
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f k(n nVar) {
        return (f) ((i) nVar.j(i.class)).b(this);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f l(i iVar) {
        return (f) ((s) iVar.j(s.class)).b(this);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f m(q qVar) {
        com.github.catvod.spider.merge.FM.B.b bVarM;
        if (Marker.ANY_MARKER.equals(qVar.getText())) {
            f fVar = new f(Marker.ANY_MARKER);
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

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f n(v vVar) {
        f fVar;
        com.github.catvod.spider.merge.FM.B.b bVarN;
        if (vVar.m() != null && !vVar.m().f()) {
            bVarN = vVar.m();
        } else {
            if (vVar.n() == null || vVar.n().f()) {
                if (vVar.l(39) != null) {
                    fVar = new f(vVar.l(39).getText());
                    fVar.j();
                } else {
                    if (vVar.l(6) == null) {
                        StringBuilder sbB = P.b("not support variableReference:");
                        sbB.append(vVar.getText());
                        throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
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

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f o(u uVar) {
        long j;
        C0274g c0274g = new C0274g();
        for (com.github.catvod.spider.merge.FM.K.m mVar : G().a()) {
            Stack<e> stack = this.a;
            e eVarB = e.b(mVar);
            eVarB.j(G());
            stack.push(eVarB);
            f fVar = (f) ((i) uVar.j(i.class)).b(this);
            this.a.pop();
            if (fVar.q()) {
                long jLongValue = fVar.f().longValue();
                if (jLongValue < 0) {
                    String strT0 = mVar.t0();
                    if (strT0 == "JX_TEXT" || (strT0 != null && strT0.equals("JX_TEXT"))) {
                        String strC = mVar.c("EL_SAME_TAG_ALL_NUM");
                        jLongValue = ((long) (h.b(strC) ? -1 : Integer.parseInt(strC))) + jLongValue + 1;
                        j = 0;
                    } else {
                        e eVarG = G();
                        C0274g c0274g2 = new C0274g();
                        com.github.catvod.spider.merge.FM.K.m mVarK0 = mVar.k0();
                        String strT02 = mVar.t0();
                        mVarK0.getClass();
                        com.github.catvod.spider.merge.FM.I.c.e(strT02);
                        for (com.github.catvod.spider.merge.FM.K.m mVar2 : C0270c.a(new C0285s(com.github.catvod.spider.merge.FM.A.l.e(strT02), 1), mVarK0)) {
                            if (eVarG.a().contains(mVar2)) {
                                c0274g2.add(mVar2);
                            }
                        }
                        jLongValue = ((long) c0274g2.size()) + jLongValue + 1;
                        j = 0;
                    }
                    if (jLongValue < j) {
                        jLongValue = 1;
                    }
                }
                String strT03 = mVar.t0();
                if (strT03 == "JX_TEXT" || (strT03 != null && strT03.equals("JX_TEXT"))) {
                    if (jLongValue == (h.b(mVar.c("EL_SAME_TAG_INDEX")) ? -1 : Integer.parseInt(r4))) {
                        c0274g.add(mVar);
                    }
                } else if (jLongValue == com.github.catvod.spider.merge.FM.A.p.b(mVar, G())) {
                    c0274g.add(mVar);
                }
            } else if (fVar.l()) {
                if (fVar.a().booleanValue()) {
                    c0274g.add(mVar);
                }
            } else if (fVar.r()) {
                if (h.d(fVar.g())) {
                    c0274g.add(mVar);
                }
            } else if (!fVar.n()) {
                if (!fVar.p()) {
                    throw new com.github.catvod.spider.merge.FM.Z.e("unknown expr val:" + fVar);
                }
                if (fVar.e().size() > 0) {
                    c0274g.add(mVar);
                }
            } else if (fVar.d().size() > 0) {
                c0274g.add(mVar);
            }
        }
        return new f(c0274g);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f p(com.github.catvod.spider.merge.FM.U.f fVar) {
        List listK = fVar.k(com.github.catvod.spider.merge.FM.U.h.class);
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this);
        }
        Boolean boolA = ((f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this)).a();
        for (int i = 1; i < listK.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() & ((f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(i)).b(this)).a().booleanValue());
        }
        return new f(boolA);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0212 A[LOOP:6: B:87:0x020c->B:89:0x0212, LOOP_END] */
    @Override // com.github.catvod.spider.merge.FM.U.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.FM.V.f q(com.github.catvod.spider.merge.FM.U.z r9) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.V.g.q(com.github.catvod.spider.merge.FM.U.z):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f r(s sVar) {
        List listK = sVar.k(com.github.catvod.spider.merge.FM.U.f.class);
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this);
        }
        Boolean boolA = ((f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this)).a();
        for (int i = 1; i < listK.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() | ((f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(i)).b(this)).a().booleanValue());
        }
        return new f(boolA);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f s(C0296d c0296d) {
        Stack<e> stack = this.a;
        e eVarC = e.c(this.b.a());
        eVarC.j(G());
        stack.push(eVarC);
        String text = c0296d.g.getText();
        if (text == "//" || (text != null && text.equals("//"))) {
            G().h();
        }
        f fVar = (f) ((y) c0296d.j(y.class)).b(this);
        this.a.pop();
        return fVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.github.catvod.spider.merge.FM.V.f, java.lang.Object] */
    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f t(C c) {
        return g(c);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f u(k kVar) {
        LinkedList linkedList = new LinkedList();
        f fVar = (f) ((l) kVar.j(l.class)).b(this);
        for (i iVar : kVar.k(i.class)) {
            this.a.push(e.d(G()));
            linkedList.add(iVar.b(this));
            this.a.pop();
        }
        return com.github.catvod.spider.merge.FM.a0.a.a(fVar.g()).a(G(), linkedList);
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f v(B b) {
        f fVar;
        com.github.catvod.spider.merge.FM.K.m mVar;
        if (b.m() == null && !b.m().f()) {
            return (f) ((B) b.j(B.class)).b(this);
        }
        f fVar2 = (f) b.m().b(this);
        if (b.g != null) {
            this.a.push(e.d(G().e()));
            f fVar3 = (f) ((B) b.j(B.class)).b(this);
            this.a.pop();
            if (!fVar2.n()) {
                if (fVar2.r()) {
                    if (fVar3.n()) {
                        mVar = new com.github.catvod.spider.merge.FM.K.m("V");
                        mVar.P(fVar2.g());
                        fVar3.d().add(mVar);
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
                            mVar = new com.github.catvod.spider.merge.FM.K.m("V");
                            mVar.P(fVar2.g());
                            fVar3.d().add(mVar);
                            return fVar3;
                        }
                        if (!fVar3.r()) {
                            StringBuilder sbB = P.b("can not merge val1=");
                            sbB.append(fVar2.a());
                            sbB.append(",val2=");
                            sbB.append(fVar3.g());
                            throw new com.github.catvod.spider.merge.FM.Z.d(sbB.toString());
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
                    fVar = new f(h.e(linkedList, ","));
                } else {
                    if (!fVar3.r()) {
                        if (fVar3.n()) {
                            mVar = new com.github.catvod.spider.merge.FM.K.m("V");
                            mVar.P(fVar2.g());
                            fVar3.d().add(mVar);
                            return fVar3;
                        }
                        StringBuilder sbB2 = P.b("can not merge val1=");
                        sbB2.append(fVar2.c());
                        sbB2.append(",val2=");
                        sbB2.append(fVar3.g());
                        throw new com.github.catvod.spider.merge.FM.Z.d(sbB2.toString());
                    }
                    fVar = new f(fVar2.c() + fVar3.g());
                }
                return fVar;
            }
            if (fVar3.n()) {
                fVar2.d().addAll(fVar3.d());
            } else {
                com.github.catvod.spider.merge.FM.K.m mVar2 = new com.github.catvod.spider.merge.FM.K.m("V");
                mVar2.P(fVar3.g());
                fVar2.d().add(mVar2);
            }
        }
        return fVar2;
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f w(A a) {
        f fVar = (f) ((B) a.j(B.class)).b(this);
        return a.g == null ? fVar : new f(Double.valueOf(-fVar.c().doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f x(w wVar) {
        List listK = wVar.k(p.class);
        if (listK == null) {
            return null;
        }
        if (listK.size() <= 1) {
            return (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this);
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((p) it.next()).b(this);
            if (fVar != null) {
                linkedList.add(fVar.g());
            }
        }
        return new f(h.e(linkedList, ":"));
    }

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f y(com.github.catvod.spider.merge.FM.U.h hVar) {
        f fVar;
        List listK = hVar.k(x.class);
        boolean z = true;
        if (listK.size() == 1) {
            return (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this);
        }
        if (listK.size() != 2) {
            StringBuilder sbB = P.b("error equalityExpr near:");
            sbB.append(hVar.getText());
            throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
        }
        f fVar2 = (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(0)).b(this);
        f fVar3 = (f) ((com.github.catvod.spider.merge.FM.B.b) listK.get(1)).b(this);
        if ("=".equals(hVar.g.getText())) {
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

    @Override // com.github.catvod.spider.merge.FM.U.E
    public final f z(r rVar) {
        if (((q) rVar.j(q.class)) != null) {
            return (f) ((q) rVar.j(q.class)).b(this);
        }
        if (rVar.l(5) != null) {
            return com.github.catvod.spider.merge.FM.a0.a.b(rVar.l(5).getText()).a(G());
        }
        return null;
    }
}
