package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.KW.AbstractC0825m;
import com.github.catvod.spider.merge.KW.C0813a;
import com.github.catvod.spider.merge.KW.S;
import com.github.catvod.spider.merge.KW.f0;
import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.io.PrintStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class p {
    protected boolean a = false;
    protected int b = -1;
    protected com.github.catvod.spider.merge.Bk.k c;
    protected y d;
    protected int e;

    protected final void a(x xVar, com.github.catvod.spider.merge.Bk.k kVar) {
        H h = xVar.e;
        while (true) {
            int iG = h.g(1);
            if (iG == -1 || kVar.d(iG)) {
                return;
            }
            xVar.j();
            h = xVar.e;
        }
    }

    protected final String b(String str) {
        String strReplace = str.replace(ZrJ.d("73"), ZrJ.d("252D")).replace(ZrJ.d("74"), ZrJ.d("2531")).replace(ZrJ.d("70"), ZrJ.d("2537"));
        StringBuilder sb = new StringBuilder();
        String strD = ZrJ.d("5E");
        sb.append(strD);
        sb.append(strReplace);
        sb.append(strD);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    protected final com.github.catvod.spider.merge.Bk.k c(x xVar) {
        C0813a c0813a = ((S) xVar.b).a;
        com.github.catvod.spider.merge.Bk.k kVar = new com.github.catvod.spider.merge.Bk.k(new int[0]);
        for (D d = xVar.g; d != null; d = d.a) {
            int i = d.b;
            if (i < 0) {
                break;
            }
            kVar.c(c0813a.e(((f0) ((AbstractC0825m) c0813a.a.get(i)).d(0)).c));
        }
        kVar.h();
        return kVar;
    }

    protected final com.github.catvod.spider.merge.Bk.k d(x xVar) {
        xVar.getClass();
        return com.github.catvod.spider.merge.CQ.D.q.c(xVar.g(), xVar.g);
    }

    protected final String e(E e) {
        if (e == null) {
            return ZrJ.d("452D246D3C2A12262573");
        }
        String text = e.getText();
        if (text == null) {
            if (e.getType() == -1) {
                text = ZrJ.d("4506040B76");
            } else {
                StringBuilder sbB = C0925t.b(ZrJ.d("45"));
                sbB.append(e.getType());
                sbB.append(ZrJ.d("47"));
                text = sbB.toString();
            }
        }
        return b(text);
    }

    public void f(x xVar, A a) {
        com.github.catvod.spider.merge.Bk.k kVar;
        if (this.b == xVar.e.i() && (kVar = this.c) != null && kVar.d(xVar.g())) {
            xVar.j();
        }
        this.b = xVar.e.i();
        if (this.c == null) {
            this.c = new com.github.catvod.spider.merge.Bk.k(new int[0]);
        }
        this.c.a(xVar.g());
        a(xVar, c(xVar));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    public E g(x xVar) {
        String string;
        E eK = k(xVar);
        if (eK != null) {
            xVar.j();
            return eK;
        }
        boolean z = true;
        if (!((S) xVar.b).a.f(((AbstractC0825m) ((S) xVar.b).a.a.get(xVar.g())).d(0).a, xVar.g).d(xVar.e.g(1))) {
            z = false;
        } else if (!this.a) {
            this.a = true;
            E eO = xVar.o();
            com.github.catvod.spider.merge.Bk.k kVarD = d(xVar);
            StringBuilder sbB = C0925t.b(ZrJ.d("142A383E212B1E63"));
            sbB.append(kVarD.l(com.github.catvod.spider.merge.CQ.D.o));
            sbB.append(ZrJ.d("59223F6D"));
            sbB.append(e(eO));
            xVar.r(eO, sbB.toString(), null);
        }
        if (!z) {
            if (this.d == null) {
                throw new r(xVar);
            }
            throw new r(xVar, this.e, this.d);
        }
        E eO2 = xVar.o();
        com.github.catvod.spider.merge.Bk.k kVarD2 = d(xVar);
        int iE = !kVarD2.f() ? kVarD2.e() : 0;
        if (iE == -1) {
            string = ZrJ.d("452E223E3B2C17246B08070347");
        } else {
            StringBuilder sbB2 = C0925t.b(ZrJ.d("452E223E3B2C17246B"));
            sbB2.append(com.github.catvod.spider.merge.CQ.D.o.a(iE));
            sbB2.append(ZrJ.d("47"));
            string = sbB2.toString();
        }
        String str = string;
        E eF = xVar.e.f(-1);
        if (eO2.getType() == -1 && eF != null) {
            eO2 = eF;
        }
        return ((C1440e) xVar.e.b().c()).a(new com.github.catvod.spider.merge.Bk.n(eO2.b(), eO2.b().b()), iE, str, 0, -1, -1, eO2.getLine(), eO2.a());
    }

    public final void h(x xVar, A a) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (a instanceof v) {
            v vVar = (v) a;
            H h = xVar.e;
            String strD = h != null ? vVar.f().getType() == -1 ? ZrJ.d("4506040B76") : h.c(vVar.f(), vVar.c()) : ZrJ.d("45362526262A0E2D6B2426350C3775");
            StringBuilder sbB = C0925t.b(ZrJ.d("172C6B3B21241B2F2E6D29290D263923293110352E6D2931592A253D3D3159"));
            sbB.append(b(strD));
            xVar.r(vVar.c(), sbB.toString(), vVar);
            return;
        }
        if (a instanceof r) {
            A a2 = (r) a;
            StringBuilder sbB2 = C0925t.b(ZrJ.d("142A382029311A2B2E29682C17333E3968"));
            sbB2.append(e(a2.c()));
            sbB2.append(ZrJ.d("5926333D2D260D2A252A68"));
            com.github.catvod.spider.merge.Bk.k kVarA = a2.a();
            ((com.github.catvod.spider.merge.CQ.D) xVar).getClass();
            sbB2.append(kVarA.l(com.github.catvod.spider.merge.CQ.D.o));
            xVar.r(a2.c(), sbB2.toString(), a2);
            return;
        }
        if (!(a instanceof q)) {
            PrintStream printStream = System.err;
            StringBuilder sbB3 = C0925t.b(ZrJ.d("0C2D20232732176339282B2A1E2D2239212A17632E3F3A2A0B633F3438204363"));
            sbB3.append(a.getClass().getName());
            printStream.println(sbB3.toString());
            xVar.r(a.c(), a.getMessage(), a);
            return;
        }
        A a3 = (q) a;
        ((com.github.catvod.spider.merge.CQ.D) xVar).getClass();
        xVar.r(a3.c(), ZrJ.d("0B36272868") + com.github.catvod.spider.merge.CQ.D.n[xVar.g.e()] + ZrJ.d("59") + a3.getMessage(), a3);
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
        E eO = xVar.o();
        xVar.r(eO, ZrJ.d("1C3B3F3F292B1C2C3E3E682C17333E3968") + e(eO) + ZrJ.d("5926333D2D260D2A252A68") + d(xVar).l(com.github.catvod.spider.merge.CQ.D.o), null);
    }

    protected final E k(x xVar) {
        if (!d(xVar).d(xVar.e.g(2))) {
            return null;
        }
        j(xVar);
        xVar.j();
        E eO = xVar.o();
        i();
        return eO;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    public final void l(x xVar) {
        AbstractC0825m abstractC0825m = (AbstractC0825m) ((S) xVar.b).a.a.get(xVar.g());
        if (this.a) {
            return;
        }
        int iG = xVar.e.g(1);
        C0813a c0813a = com.github.catvod.spider.merge.CQ.D.q;
        com.github.catvod.spider.merge.Bk.k kVarE = c0813a.e(abstractC0825m);
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
        int iC = abstractC0825m.c();
        if (iC != 3 && iC != 4 && iC != 5) {
            switch (iC) {
                case 9:
                case 11:
                    j(xVar);
                    com.github.catvod.spider.merge.Bk.k kVarC = c0813a.c(xVar.g(), xVar.g);
                    com.github.catvod.spider.merge.Bk.k kVarC2 = c(xVar);
                    com.github.catvod.spider.merge.Bk.k kVar = new com.github.catvod.spider.merge.Bk.k(new int[0]);
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
            throw new r(xVar);
        }
    }
}
