package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.A.AbstractC0008i;
import com.github.catvod.spider.merge.A.C0000a;
import com.github.catvod.spider.merge.A.L;
import com.github.catvod.spider.merge.A.T;
import com.github.catvod.spider.merge.A.X;
import com.github.catvod.spider.merge.P.A;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class j {
    public boolean a = false;
    public int b = -1;
    public com.github.catvod.spider.merge.C.f c;
    public r d;
    public int e;

    public static void a(q qVar, com.github.catvod.spider.merge.C.f fVar) {
        h hVar = qVar.e;
        while (true) {
            int iA = hVar.a(1);
            if (iA == -1 || fVar.d(iA)) {
                return;
            }
            qVar.c();
            hVar = qVar.e;
        }
    }

    public static String c(String str) {
        return T.g("'", str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"), "'");
    }

    public static com.github.catvod.spider.merge.C.f d(q qVar) {
        C0000a c0000a = ((L) qVar.b).a;
        com.github.catvod.spider.merge.C.f fVar = new com.github.catvod.spider.merge.C.f(new int[0]);
        for (r rVar = qVar.g; rVar != null; rVar = rVar.a) {
            int i = rVar.b;
            if (i < 0) {
                break;
            }
            fVar.c(c0000a.c(((X) ((AbstractC0008i) c0000a.a.get(i)).c(0)).c));
        }
        fVar.f();
        return fVar;
    }

    public static String e(f fVar) {
        if (fVar == null) {
            return "<no token>";
        }
        String strA = fVar.a();
        if (strA == null) {
            int i = fVar.a;
            if (i == -1) {
                strA = "<EOF>";
            } else {
                strA = "<" + i + ">";
            }
        }
        return c(strA);
    }

    public final void b() {
        this.a = false;
        this.c = null;
        this.b = -1;
    }

    public void f(q qVar, s sVar) {
        com.github.catvod.spider.merge.C.f fVar;
        if (this.b == qVar.e.c && (fVar = this.c) != null && fVar.d(qVar.c)) {
            qVar.c();
        }
        this.b = qVar.e.c;
        if (this.c == null) {
            this.c = new com.github.catvod.spider.merge.C.f(new int[0]);
        }
        this.c.a(qVar.c);
        a(qVar, d(qVar));
    }

    public f g(q qVar) {
        String str;
        f fVarJ = j(qVar);
        if (fVarJ != null) {
            qVar.c();
            return fVarJ;
        }
        int i = 0;
        if (!((L) qVar.b).a.d(((AbstractC0008i) ((L) qVar.b).a.a.get(qVar.c)).c(0).a, qVar.g).d(qVar.e.a(1))) {
            if (this.d == null) {
                throw new k(qVar);
            }
            throw new k(qVar, this.e, this.d);
        }
        if (!this.a) {
            this.a = true;
            f fVarG = qVar.g();
            qVar.j(fVarG, "missing " + qVar.h().h(A.m) + " at " + e(fVarG), null);
        }
        f fVarG2 = qVar.g();
        com.github.catvod.spider.merge.C.f fVarH = qVar.h();
        if (!fVarH.e()) {
            if (fVarH.e()) {
                throw new RuntimeException("set is empty");
            }
            i = ((com.github.catvod.spider.merge.C.e) fVarH.a.get(0)).a;
        }
        if (i == -1) {
            str = "<missing EOF>";
        } else {
            str = "<missing " + A.m.a(i) + ">";
        }
        String str2 = str;
        f fVarB = qVar.e.b(-1);
        if (fVarG2.a == -1 && fVarB != null) {
            fVarG2 = fVarB;
        }
        g gVar = ((m) qVar.e.a).f;
        Object obj = fVarG2.e.a;
        com.github.catvod.spider.merge.C.h hVar = new com.github.catvod.spider.merge.C.h((v) obj, ((m) ((v) obj)).d);
        int i2 = fVarG2.b;
        int i3 = fVarG2.c;
        gVar.getClass();
        f fVar = new f(hVar, i, 0, -1, -1);
        fVar.b = i2;
        fVar.c = i3;
        if (str2 != null) {
            fVar.f = str2;
        }
        return fVar;
    }

    public final void h(q qVar, s sVar) {
        String str;
        if (this.a) {
            return;
        }
        this.a = true;
        if (!(sVar instanceof o)) {
            if (!(sVar instanceof k)) {
                System.err.println("unknown recognition error type: ".concat(sVar.getClass().getName()));
                qVar.j(sVar.d, sVar.getMessage(), sVar);
                return;
            }
            s sVar2 = (k) sVar;
            StringBuilder sb = new StringBuilder("mismatched input ");
            sb.append(e(sVar2.d));
            sb.append(" expecting ");
            u uVar = sVar2.a;
            com.github.catvod.spider.merge.C.f fVarB = uVar != null ? uVar.a().b(sVar2.e, sVar2.b) : null;
            ((A) qVar).getClass();
            sb.append(fVarB.h(A.m));
            qVar.j(sVar2.d, sb.toString(), sVar2);
            return;
        }
        o oVar = (o) sVar;
        h hVar = qVar.e;
        if (hVar != null) {
            f fVar = oVar.f;
            if (fVar.a == -1) {
                str = "<EOF>";
            } else {
                f fVar2 = oVar.d;
                String string = "";
                if (fVar != null && fVar2 != null) {
                    com.github.catvod.spider.merge.C.e eVarA = com.github.catvod.spider.merge.C.e.a(fVar.g, fVar2.g);
                    int i = eVarA.a;
                    int size = eVarA.b;
                    if (i >= 0 && size >= 0) {
                        if (hVar.c == -1) {
                            hVar.g(0);
                            hVar.c = hVar.e(0);
                        }
                        while (hVar.d(1000) >= 1000) {
                        }
                        ArrayList arrayList = hVar.b;
                        if (size >= arrayList.size()) {
                            size = arrayList.size() - 1;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        while (i <= size) {
                            f fVar3 = (f) arrayList.get(i);
                            if (fVar3.a == -1) {
                                break;
                            }
                            sb2.append(fVar3.a());
                            i++;
                        }
                        string = sb2.toString();
                    }
                }
                str = string;
            }
        } else {
            str = "<unknown input>";
        }
        qVar.j(oVar.d, "no viable alternative at input " + c(str), oVar);
    }

    public final void i(q qVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        f fVarG = qVar.g();
        qVar.j(fVarG, "extraneous input " + e(fVarG) + " expecting " + qVar.h().h(A.m), null);
    }

    public final f j(q qVar) {
        if (!qVar.h().d(qVar.e.a(2))) {
            return null;
        }
        i(qVar);
        qVar.c();
        f fVarG = qVar.g();
        b();
        return fVarG;
    }

    public final void k(q qVar) throws Throwable {
        AbstractC0008i abstractC0008i = (AbstractC0008i) ((L) qVar.b).a.a.get(qVar.c);
        if (this.a) {
            return;
        }
        int iA = qVar.e.a(1);
        com.github.catvod.spider.merge.C.f fVarC = A.o.c(abstractC0008i);
        if (fVarC.d(iA)) {
            this.d = null;
            this.e = -1;
            return;
        }
        if (fVarC.d(-2)) {
            if (this.d == null) {
                this.d = qVar.g;
                this.e = qVar.c;
                return;
            }
            return;
        }
        int iB = abstractC0008i.b();
        if (iB != 3 && iB != 4 && iB != 5) {
            switch (iB) {
                case 9:
                case 11:
                    i(qVar);
                    com.github.catvod.spider.merge.C.f fVarH = qVar.h();
                    com.github.catvod.spider.merge.C.f fVarD = d(qVar);
                    com.github.catvod.spider.merge.C.f fVar = new com.github.catvod.spider.merge.C.f(new int[0]);
                    fVar.c(fVarH);
                    fVar.c(fVarD);
                    a(qVar, fVar);
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (j(qVar) == null) {
            throw new k(qVar);
        }
    }
}
