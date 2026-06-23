package com.github.catvod.spider.merge.FM.x;

import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.y.AbstractC0471m;
import com.github.catvod.spider.merge.FM.y.C0459a;
import com.github.catvod.spider.merge.FM.y.S;
import com.github.catvod.spider.merge.FM.y.f0;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0449p {
    protected boolean a = false;
    protected int b = -1;
    protected com.github.catvod.spider.merge.FM.A.k c;
    protected y d;
    protected int e;

    protected final void a(x xVar, com.github.catvod.spider.merge.FM.A.k kVar) {
        InterfaceC0430H interfaceC0430H = xVar.e;
        while (true) {
            int iH = interfaceC0430H.h(1);
            if (iH == -1 || kVar.d(iH)) {
                return;
            }
            xVar.j();
            interfaceC0430H = xVar.e;
        }
    }

    protected final String b(String str) {
        return "'" + str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") + "'";
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    protected final com.github.catvod.spider.merge.FM.A.k c(x xVar) {
        C0459a c0459a = ((S) xVar.b).a;
        com.github.catvod.spider.merge.FM.A.k kVar = new com.github.catvod.spider.merge.FM.A.k(new int[0]);
        for (C0426D c0426d = xVar.g; c0426d != null; c0426d = c0426d.a) {
            int i = c0426d.b;
            if (i < 0) {
                break;
            }
            kVar.c(c0459a.e(((f0) ((AbstractC0471m) c0459a.a.get(i)).d(0)).c));
        }
        kVar.h();
        return kVar;
    }

    protected final com.github.catvod.spider.merge.FM.A.k d(x xVar) {
        xVar.getClass();
        return com.github.catvod.spider.merge.FM.U.D.q.c(xVar.g(), xVar.g);
    }

    protected final String e(InterfaceC0427E interfaceC0427E) {
        if (interfaceC0427E == null) {
            return "<no token>";
        }
        String text = interfaceC0427E.getText();
        if (text == null) {
            if (interfaceC0427E.getType() == -1) {
                text = "<EOF>";
            } else {
                StringBuilder sbB = P.b("<");
                sbB.append(interfaceC0427E.getType());
                sbB.append(">");
                text = sbB.toString();
            }
        }
        return b(text);
    }

    public void f(x xVar, C0423A c0423a) {
        com.github.catvod.spider.merge.FM.A.k kVar;
        if (this.b == xVar.e.i() && (kVar = this.c) != null && kVar.d(xVar.g())) {
            xVar.j();
        }
        this.b = xVar.e.i();
        if (this.c == null) {
            this.c = new com.github.catvod.spider.merge.FM.A.k(new int[0]);
        }
        this.c.a(xVar.g());
        a(xVar, c(xVar));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    public InterfaceC0427E g(x xVar) {
        String string;
        InterfaceC0427E interfaceC0427EK = k(xVar);
        if (interfaceC0427EK != null) {
            xVar.j();
            return interfaceC0427EK;
        }
        boolean z = true;
        if (!((S) xVar.b).a.f(((AbstractC0471m) ((S) xVar.b).a.a.get(xVar.g())).d(0).a, xVar.g).d(xVar.e.h(1))) {
            z = false;
        } else if (!this.a) {
            this.a = true;
            InterfaceC0427E interfaceC0427EO = xVar.o();
            com.github.catvod.spider.merge.FM.A.k kVarD = d(xVar);
            StringBuilder sbB = P.b("missing ");
            sbB.append(kVarD.l(com.github.catvod.spider.merge.FM.U.D.o));
            sbB.append(" at ");
            sbB.append(e(interfaceC0427EO));
            xVar.r(interfaceC0427EO, sbB.toString(), null);
        }
        if (!z) {
            if (this.d == null) {
                throw new C0451r(xVar);
            }
            throw new C0451r(xVar, this.e, this.d);
        }
        InterfaceC0427E interfaceC0427EO2 = xVar.o();
        com.github.catvod.spider.merge.FM.A.k kVarD2 = d(xVar);
        int iE = !kVarD2.f() ? kVarD2.e() : 0;
        if (iE == -1) {
            string = "<missing EOF>";
        } else {
            StringBuilder sbB2 = P.b("<missing ");
            sbB2.append(com.github.catvod.spider.merge.FM.U.D.o.a(iE));
            sbB2.append(">");
            string = sbB2.toString();
        }
        String str = string;
        InterfaceC0427E interfaceC0427EG = xVar.e.g(-1);
        if (interfaceC0427EO2.getType() == -1 && interfaceC0427EG != null) {
            interfaceC0427EO2 = interfaceC0427EG;
        }
        return ((C0438e) xVar.e.b().c()).a(new com.github.catvod.spider.merge.FM.A.n(interfaceC0427EO2.b(), interfaceC0427EO2.b().b()), iE, str, 0, -1, -1, interfaceC0427EO2.getLine(), interfaceC0427EO2.a());
    }

    public final void h(x xVar, C0423A c0423a) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (c0423a instanceof v) {
            v vVar = (v) c0423a;
            InterfaceC0430H interfaceC0430H = xVar.e;
            String strC = interfaceC0430H != null ? vVar.f().getType() == -1 ? "<EOF>" : interfaceC0430H.c(vVar.f(), vVar.c()) : "<unknown input>";
            StringBuilder sbB = P.b("no viable alternative at input ");
            sbB.append(b(strC));
            xVar.r(vVar.c(), sbB.toString(), vVar);
            return;
        }
        if (c0423a instanceof C0451r) {
            C0423A c0423a2 = (C0451r) c0423a;
            StringBuilder sbB2 = P.b("mismatched input ");
            sbB2.append(e(c0423a2.c()));
            sbB2.append(" expecting ");
            com.github.catvod.spider.merge.FM.A.k kVarA = c0423a2.a();
            ((com.github.catvod.spider.merge.FM.U.D) xVar).getClass();
            sbB2.append(kVarA.l(com.github.catvod.spider.merge.FM.U.D.o));
            xVar.r(c0423a2.c(), sbB2.toString(), c0423a2);
            return;
        }
        if (!(c0423a instanceof C0450q)) {
            PrintStream printStream = System.err;
            StringBuilder sbB3 = P.b("unknown recognition error type: ");
            sbB3.append(c0423a.getClass().getName());
            printStream.println(sbB3.toString());
            xVar.r(c0423a.c(), c0423a.getMessage(), c0423a);
            return;
        }
        C0423A c0423a3 = (C0450q) c0423a;
        ((com.github.catvod.spider.merge.FM.U.D) xVar).getClass();
        xVar.r(c0423a3.c(), "rule " + com.github.catvod.spider.merge.FM.U.D.n[xVar.g.e()] + " " + c0423a3.getMessage(), c0423a3);
    }

    public final void i() {
        this.a = false;
        this.c = null;
        this.b = -1;
    }

    protected final void j(x xVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        InterfaceC0427E interfaceC0427EO = xVar.o();
        xVar.r(interfaceC0427EO, "extraneous input " + e(interfaceC0427EO) + " expecting " + d(xVar).l(com.github.catvod.spider.merge.FM.U.D.o), null);
    }

    protected final InterfaceC0427E k(x xVar) {
        if (!d(xVar).d(xVar.e.h(2))) {
            return null;
        }
        j(xVar);
        xVar.j();
        InterfaceC0427E interfaceC0427EO = xVar.o();
        i();
        return interfaceC0427EO;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    public final void l(x xVar) {
        AbstractC0471m abstractC0471m = (AbstractC0471m) ((S) xVar.b).a.a.get(xVar.g());
        if (this.a) {
            return;
        }
        int iH = xVar.e.h(1);
        C0459a c0459a = com.github.catvod.spider.merge.FM.U.D.q;
        com.github.catvod.spider.merge.FM.A.k kVarE = c0459a.e(abstractC0471m);
        if (kVarE.d(iH)) {
            this.d = null;
            this.e = -1;
            return;
        }
        if (kVarE.d(-2)) {
            if (this.d == null) {
                this.d = xVar.g;
                this.e = xVar.g();
                return;
            }
            return;
        }
        int iC = abstractC0471m.c();
        if (iC != 3 && iC != 4 && iC != 5) {
            switch (iC) {
                case 9:
                case 11:
                    j(xVar);
                    com.github.catvod.spider.merge.FM.A.k kVarC = c0459a.c(xVar.g(), xVar.g);
                    com.github.catvod.spider.merge.FM.A.k kVarC2 = c(xVar);
                    com.github.catvod.spider.merge.FM.A.k kVar = new com.github.catvod.spider.merge.FM.A.k(new int[0]);
                    kVar.c(kVarC);
                    kVar.c(kVarC2);
                    a(xVar, kVar);
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (k(xVar) == null) {
            throw new C0451r(xVar);
        }
    }
}
