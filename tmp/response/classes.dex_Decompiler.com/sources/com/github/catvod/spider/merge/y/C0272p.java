package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.z.AbstractC0294m;
import com.github.catvod.spider.merge.z.C0282a;
import com.github.catvod.spider.merge.z.S;
import com.github.catvod.spider.merge.z.f0;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class C0272p {
    protected boolean a = false;
    protected int b = -1;
    protected com.github.catvod.spider.merge.B.k c;
    protected y d;
    protected int e;

    protected final void a(x xVar, com.github.catvod.spider.merge.B.k kVar) {
        InterfaceC0253H interfaceC0253H = xVar.e;
        while (true) {
            int iG = interfaceC0253H.g(1);
            if (iG == -1 || kVar.d(iG)) {
                return;
            }
            xVar.j();
            interfaceC0253H = xVar.e;
        }
    }

    protected final String b(String str) {
        String strReplace = str.replace(oZP.d("7F"), oZP.d("2901")).replace(oZP.d("78"), oZP.d("291D")).replace(oZP.d("7C"), oZP.d("291B"));
        StringBuilder sb = new StringBuilder();
        String strD = oZP.d("52");
        sb.append(strD);
        sb.append(strReplace);
        sb.append(strD);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    protected final com.github.catvod.spider.merge.B.k c(x xVar) {
        C0282a c0282a = ((S) xVar.b).a;
        com.github.catvod.spider.merge.B.k kVar = new com.github.catvod.spider.merge.B.k(new int[0]);
        for (C0249D c0249d = xVar.g; c0249d != null; c0249d = c0249d.a) {
            int i = c0249d.b;
            if (i < 0) {
                break;
            }
            kVar.c(c0282a.e(((f0) ((AbstractC0294m) c0282a.a.get(i)).d(0)).c));
        }
        kVar.h();
        return kVar;
    }

    protected final com.github.catvod.spider.merge.B.k d(x xVar) {
        xVar.getClass();
        return com.github.catvod.spider.merge.V.D.q.c(xVar.g(), xVar.g);
    }

    protected final String e(InterfaceC0250E interfaceC0250E) {
        if (interfaceC0250E == null) {
            return oZP.d("49011861183A1E0A197F");
        }
        String text = interfaceC0250E.getText();
        if (text == null) {
            if (interfaceC0250E.getType() == -1) {
                text = oZP.d("492A380752");
            } else {
                StringBuilder sbC = C0133t.c(oZP.d("49"));
                sbC.append(interfaceC0250E.getType());
                sbC.append(oZP.d("4B"));
                text = sbC.toString();
            }
        }
        return b(text);
    }

    public void f(x xVar, C0246A c0246a) {
        com.github.catvod.spider.merge.B.k kVar;
        if (this.b == xVar.e.i() && (kVar = this.c) != null && kVar.d(xVar.g())) {
            xVar.j();
        }
        this.b = xVar.e.i();
        if (this.c == null) {
            this.c = new com.github.catvod.spider.merge.B.k(new int[0]);
        }
        this.c.a(xVar.g());
        a(xVar, c(xVar));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    public InterfaceC0250E g(x xVar) {
        String string;
        InterfaceC0250E interfaceC0250EK = k(xVar);
        if (interfaceC0250EK != null) {
            xVar.j();
            return interfaceC0250EK;
        }
        boolean z = true;
        if (!((S) xVar.b).a.f(((AbstractC0294m) ((S) xVar.b).a.a.get(xVar.g())).d(0).a, xVar.g).d(xVar.e.g(1))) {
            z = false;
        } else if (!this.a) {
            this.a = true;
            InterfaceC0250E interfaceC0250EO = xVar.o();
            com.github.catvod.spider.merge.B.k kVarD = d(xVar);
            StringBuilder sbC = C0133t.c(oZP.d("18060432053B124F"));
            sbC.append(kVarD.l(com.github.catvod.spider.merge.V.D.o));
            sbC.append(oZP.d("550E0361"));
            sbC.append(e(interfaceC0250EO));
            xVar.r(interfaceC0250EO, sbC.toString(), null);
        }
        if (!z) {
            if (this.d == null) {
                throw new C0274r(xVar);
            }
            throw new C0274r(xVar, this.e, this.d);
        }
        InterfaceC0250E interfaceC0250EO2 = xVar.o();
        com.github.catvod.spider.merge.B.k kVarD2 = d(xVar);
        int iE = !kVarD2.f() ? kVarD2.e() : 0;
        if (iE == -1) {
            string = oZP.d("49021E321F3C1B08570423134B");
        } else {
            StringBuilder sbC2 = C0133t.c(oZP.d("49021E321F3C1B0857"));
            sbC2.append(com.github.catvod.spider.merge.V.D.o.a(iE));
            sbC2.append(oZP.d("4B"));
            string = sbC2.toString();
        }
        String str = string;
        InterfaceC0250E interfaceC0250EF = xVar.e.f(-1);
        if (interfaceC0250EO2.getType() == -1 && interfaceC0250EF != null) {
            interfaceC0250EO2 = interfaceC0250EF;
        }
        return ((C0261e) xVar.e.b().c()).a(new com.github.catvod.spider.merge.B.n(interfaceC0250EO2.b(), interfaceC0250EO2.b().b()), iE, str, 0, -1, -1, interfaceC0250EO2.getLine(), interfaceC0250EO2.a());
    }

    public final void h(x xVar, C0246A c0246a) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (c0246a instanceof v) {
            v vVar = (v) c0246a;
            InterfaceC0253H interfaceC0253H = xVar.e;
            String strD = interfaceC0253H != null ? vVar.f().getType() == -1 ? oZP.d("492A380752") : interfaceC0253H.c(vVar.f(), vVar.c()) : oZP.d("491A192A023A020157280225001B49");
            StringBuilder sbC = C0133t.c(oZP.d("1B0057370534170312610D39010A052F0D211C1912610D2155061931192155"));
            sbC.append(b(strD));
            xVar.r(vVar.c(), sbC.toString(), vVar);
            return;
        }
        if (c0246a instanceof C0274r) {
            C0246A c0246a2 = (C0274r) c0246a;
            StringBuilder sbC2 = C0133t.c(oZP.d("1806042C0D21160712254C3C1B1F02354C"));
            sbC2.append(e(c0246a2.c()));
            sbC2.append(oZP.d("550A0F310936010619264C"));
            com.github.catvod.spider.merge.B.k kVarA = c0246a2.a();
            ((com.github.catvod.spider.merge.V.D) xVar).getClass();
            sbC2.append(kVarA.l(com.github.catvod.spider.merge.V.D.o));
            xVar.r(c0246a2.c(), sbC2.toString(), c0246a2);
            return;
        }
        if (!(c0246a instanceof C0273q)) {
            PrintStream printStream = System.err;
            StringBuilder sbC3 = C0133t.c(oZP.d("00011C2F03221B4F05240F3A12011E35053A1B4F12331E3A074F03381C304F4F"));
            sbC3.append(c0246a.getClass().getName());
            printStream.println(sbC3.toString());
            xVar.r(c0246a.c(), c0246a.getMessage(), c0246a);
            return;
        }
        C0246A c0246a3 = (C0273q) c0246a;
        ((com.github.catvod.spider.merge.V.D) xVar).getClass();
        xVar.r(c0246a3.c(), oZP.d("071A1B244C") + com.github.catvod.spider.merge.V.D.n[xVar.g.e()] + oZP.d("55") + c0246a3.getMessage(), c0246a3);
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
        InterfaceC0250E interfaceC0250EO = xVar.o();
        xVar.r(interfaceC0250EO, oZP.d("101703330D3B100002324C3C1B1F02354C") + e(interfaceC0250EO) + oZP.d("550A0F310936010619264C") + d(xVar).l(com.github.catvod.spider.merge.V.D.o), null);
    }

    protected final InterfaceC0250E k(x xVar) {
        if (!d(xVar).d(xVar.e.g(2))) {
            return null;
        }
        j(xVar);
        xVar.j();
        InterfaceC0250E interfaceC0250EO = xVar.o();
        i();
        return interfaceC0250EO;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    public final void l(x xVar) {
        AbstractC0294m abstractC0294m = (AbstractC0294m) ((S) xVar.b).a.a.get(xVar.g());
        if (this.a) {
            return;
        }
        int iG = xVar.e.g(1);
        C0282a c0282a = com.github.catvod.spider.merge.V.D.q;
        com.github.catvod.spider.merge.B.k kVarE = c0282a.e(abstractC0294m);
        if (kVarE.d(iG)) {
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
        int iC = abstractC0294m.c();
        if (iC != 3 && iC != 4 && iC != 5) {
            switch (iC) {
                case 9:
                case 11:
                    j(xVar);
                    com.github.catvod.spider.merge.B.k kVarC = c0282a.c(xVar.g(), xVar.g);
                    com.github.catvod.spider.merge.B.k kVarC2 = c(xVar);
                    com.github.catvod.spider.merge.B.k kVar = new com.github.catvod.spider.merge.B.k(new int[0]);
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
            throw new C0274r(xVar);
        }
    }
}
