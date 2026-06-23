package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.u.AbstractC0640i;
import com.github.catvod.spider.merge.u.C0632a;
import com.github.catvod.spider.merge.u.M;
import com.github.catvod.spider.merge.u.a0;
import java.io.PrintStream;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class m {
    protected boolean a = false;
    protected int b = -1;
    protected com.github.catvod.spider.merge.w.i c;
    protected u d;
    protected int e;

    protected final void a(t tVar, com.github.catvod.spider.merge.w.i iVar) {
        InterfaceC0621C interfaceC0621C = tVar.e;
        while (true) {
            int iG = interfaceC0621C.g(1);
            if (iG == -1 || iVar.d(iG)) {
                return;
            }
            tVar.i();
            interfaceC0621C = tVar.e;
        }
    }

    protected final String b(String str) {
        return com.github.catvod.spider.merge.b.u.a("'", str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"), "'");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    protected final com.github.catvod.spider.merge.w.i c(t tVar) {
        C0632a c0632a = ((M) tVar.b).a;
        com.github.catvod.spider.merge.w.i iVar = new com.github.catvod.spider.merge.w.i(new int[0]);
        for (y yVar = tVar.g; yVar != null; yVar = yVar.a) {
            int i = yVar.b;
            if (i < 0) {
                break;
            }
            iVar.c(c0632a.e(((a0) ((AbstractC0640i) c0632a.a.get(i)).d(0)).c));
        }
        iVar.h();
        return iVar;
    }

    protected final com.github.catvod.spider.merge.w.i d(t tVar) {
        tVar.getClass();
        return com.github.catvod.spider.merge.K.d.q.c(tVar.f(), tVar.g);
    }

    protected final String e(z zVar) {
        if (zVar == null) {
            return "<no token>";
        }
        String text = zVar.getText();
        if (text == null) {
            if (zVar.getType() == -1) {
                text = "<EOF>";
            } else {
                StringBuilder sbA = C0529a.a("<");
                sbA.append(zVar.getType());
                sbA.append(">");
                text = sbA.toString();
            }
        }
        return b(text);
    }

    public void f(t tVar, w wVar) {
        com.github.catvod.spider.merge.w.i iVar;
        if (this.b == tVar.e.h() && (iVar = this.c) != null && iVar.d(tVar.f())) {
            tVar.i();
        }
        this.b = tVar.e.h();
        if (this.c == null) {
            this.c = new com.github.catvod.spider.merge.w.i(new int[0]);
        }
        this.c.a(tVar.f());
        a(tVar, c(tVar));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    public z g(t tVar) {
        String string;
        z zVarK = k(tVar);
        if (zVarK != null) {
            tVar.i();
            return zVarK;
        }
        boolean z = true;
        if (!((M) tVar.b).a.f(((AbstractC0640i) ((M) tVar.b).a.a.get(tVar.f())).d(0).a, tVar.g).d(tVar.e.g(1))) {
            z = false;
        } else if (!this.a) {
            this.a = true;
            z zVarN = tVar.n();
            com.github.catvod.spider.merge.w.i iVarD = d(tVar);
            StringBuilder sbA = C0529a.a("missing ");
            sbA.append(iVarD.l(com.github.catvod.spider.merge.K.d.o));
            sbA.append(" at ");
            sbA.append(e(zVarN));
            tVar.q(zVarN, sbA.toString(), null);
        }
        if (!z) {
            if (this.d == null) {
                throw new o(tVar);
            }
            throw new o(tVar, this.e, this.d);
        }
        z zVarN2 = tVar.n();
        com.github.catvod.spider.merge.w.i iVarD2 = d(tVar);
        int iE = !iVarD2.f() ? iVarD2.e() : 0;
        if (iE == -1) {
            string = "<missing EOF>";
        } else {
            StringBuilder sbA2 = C0529a.a("<missing ");
            sbA2.append(com.github.catvod.spider.merge.K.d.o.a(iE));
            sbA2.append(">");
            string = sbA2.toString();
        }
        String str = string;
        z zVarF = tVar.e.f(-1);
        if (zVarN2.getType() == -1 && zVarF != null) {
            zVarN2 = zVarF;
        }
        return ((j) tVar.e.b().b()).a(new com.github.catvod.spider.merge.w.k(zVarN2.b(), zVarN2.b().getInputStream()), iE, str, 0, -1, -1, zVarN2.getLine(), zVarN2.a());
    }

    public final void h(t tVar, w wVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (wVar instanceof s) {
            s sVar = (s) wVar;
            InterfaceC0621C interfaceC0621C = tVar.e;
            String strA = interfaceC0621C != null ? sVar.f().getType() == -1 ? "<EOF>" : interfaceC0621C.a(sVar.f(), sVar.c()) : "<unknown input>";
            StringBuilder sbA = C0529a.a("no viable alternative at input ");
            sbA.append(b(strA));
            tVar.q(sVar.c(), sbA.toString(), sVar);
            return;
        }
        if (wVar instanceof o) {
            w wVar2 = (o) wVar;
            StringBuilder sbA2 = C0529a.a("mismatched input ");
            sbA2.append(e(wVar2.c()));
            sbA2.append(" expecting ");
            com.github.catvod.spider.merge.w.i iVarA = wVar2.a();
            ((com.github.catvod.spider.merge.K.d) tVar).getClass();
            sbA2.append(iVarA.l(com.github.catvod.spider.merge.K.d.o));
            tVar.q(wVar2.c(), sbA2.toString(), wVar2);
            return;
        }
        if (!(wVar instanceof n)) {
            PrintStream printStream = System.err;
            StringBuilder sbA3 = C0529a.a("unknown recognition error type: ");
            sbA3.append(wVar.getClass().getName());
            printStream.println(sbA3.toString());
            tVar.q(wVar.c(), wVar.getMessage(), wVar);
            return;
        }
        w wVar3 = (n) wVar;
        ((com.github.catvod.spider.merge.K.d) tVar).getClass();
        tVar.q(wVar3.c(), "rule " + com.github.catvod.spider.merge.K.d.n[tVar.g.e()] + " " + wVar3.getMessage(), wVar3);
    }

    public final void i() {
        this.a = false;
        this.c = null;
        this.b = -1;
    }

    protected final void j(t tVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        z zVarN = tVar.n();
        tVar.q(zVarN, "extraneous input " + e(zVarN) + " expecting " + d(tVar).l(com.github.catvod.spider.merge.K.d.o), null);
    }

    protected final z k(t tVar) {
        if (!d(tVar).d(tVar.e.g(2))) {
            return null;
        }
        j(tVar);
        tVar.i();
        z zVarN = tVar.n();
        i();
        return zVarN;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    public final void l(t tVar) {
        AbstractC0640i abstractC0640i = (AbstractC0640i) ((M) tVar.b).a.a.get(tVar.f());
        if (this.a) {
            return;
        }
        int iG = tVar.e.g(1);
        C0632a c0632a = com.github.catvod.spider.merge.K.d.q;
        com.github.catvod.spider.merge.w.i iVarE = c0632a.e(abstractC0640i);
        if (iVarE.d(iG)) {
            this.d = null;
            this.e = -1;
            return;
        }
        if (iVarE.d(-2)) {
            if (this.d == null) {
                this.d = tVar.g;
                this.e = tVar.f();
                return;
            }
            return;
        }
        int iC = abstractC0640i.c();
        if (iC != 3 && iC != 4 && iC != 5) {
            switch (iC) {
                case 9:
                case 11:
                    j(tVar);
                    com.github.catvod.spider.merge.w.i iVarC = c0632a.c(tVar.f(), tVar.g);
                    com.github.catvod.spider.merge.w.i iVarC2 = c(tVar);
                    com.github.catvod.spider.merge.w.i iVar = new com.github.catvod.spider.merge.w.i(new int[0]);
                    iVar.c(iVarC);
                    iVar.c(iVarC2);
                    a(tVar, iVar);
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (k(tVar) == null) {
            throw new o(tVar);
        }
    }
}
