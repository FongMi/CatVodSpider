package com.github.catvod.spider.merge.A0;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class aci {
    public boolean a = false;
    public int b = -1;
    public ii c;
    public rf d;
    public int e;

    public static void f(dn dnVar, ii iiVar) {
        int iE = dnVar.b.e(1);
        while (iE != -1 && !iiVar.f(iE)) {
            dnVar.h();
            iE = dnVar.b.e(1);
        }
    }

    public static String g(String str) {
        return "'" + str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") + "'";
    }

    public static ii h(dn dnVar) {
        jj jjVar = ((ol) dnVar.r).p;
        ii iiVar = new ii(new int[0]);
        for (rf rfVar = dnVar.d; rfVar != null; rfVar = rfVar.e) {
            int i = rfVar.f;
            if (i < 0) {
                break;
            }
            iiVar.e(jjVar.l(((abw) ((lq) jjVar.a.get(i)).k(0)).f));
        }
        iiVar.h();
        return iiVar;
    }

    public static String i(to toVar) {
        if (toVar == null) {
            return "<no token>";
        }
        String strJ = toVar.j();
        if (strJ == null) {
            int i = toVar.a;
            if (i == -1) {
                strJ = "<EOF>";
            } else {
                strJ = "<" + i + ">";
            }
        }
        return g(strJ);
    }

    public final void j() {
        this.a = false;
        this.c = null;
        this.b = -1;
    }

    public void k(dn dnVar, ip ipVar) {
        ii iiVar;
        if (this.b == dnVar.b.c && (iiVar = this.c) != null && iiVar.f(dnVar.s)) {
            dnVar.h();
        }
        this.b = dnVar.b.c;
        if (this.c == null) {
            this.c = new ii(new int[0]);
        }
        this.c.c(dnVar.s);
        f(dnVar, h(dnVar));
    }

    public to l(wl wlVar) {
        String str;
        to toVarO = o(wlVar);
        if (toVarO != null) {
            wlVar.h();
            return toVarO;
        }
        int i = 0;
        if (!((ol) wlVar.r).p.m(((lq) ((ol) wlVar.r).p.a.get(wlVar.s)).k(0).g, wlVar.d).f(wlVar.b.e(1))) {
            if (this.d == null) {
                throw new ck(wlVar);
            }
            int i2 = this.e;
            ck ckVar = new ck(wlVar, wlVar.b, this.d);
            ckVar.e = i2;
            ckVar.d = wlVar.l();
            throw ckVar;
        }
        if (!this.a) {
            this.a = true;
            to toVarL = wlVar.l();
            wlVar.o(toVarL, "missing " + wlVar.m().j(wl.w) + " at " + i(toVarL), null);
        }
        to toVarL2 = wlVar.l();
        ii iiVarM = wlVar.m();
        if (!iiVarM.g()) {
            if (iiVarM.g()) {
                throw new RuntimeException("set is empty");
            }
            i = ((bd) iiVarM.a.get(0)).b;
        }
        if (i == -1) {
            str = "<missing EOF>";
        } else {
            str = "<missing " + wl.w.f(i) + ">";
        }
        String str2 = str;
        to toVarF = wlVar.b.f(-1);
        if (toVarL2.a == -1 && toVarF != null) {
            toVarL2 = toVarF;
        }
        jo joVar = wlVar.b.a.h;
        Object obj = toVarL2.e.a;
        return joVar.n(new aam((ja) obj, ((abh) ((ja) obj)).f), i, str2, 0, -1, -1, toVarL2.b, toVarL2.c);
    }

    public final void m(dn dnVar, ip ipVar) {
        String str;
        if (this.a) {
            return;
        }
        this.a = true;
        if (!(ipVar instanceof kf)) {
            if (!(ipVar instanceof ck)) {
                System.err.println("unknown recognition error type: ".concat(ipVar.getClass().getName()));
                dnVar.o(ipVar.d, ipVar.getMessage(), ipVar);
                return;
            }
            ip ipVar2 = (ck) ipVar;
            StringBuilder sb = new StringBuilder("mismatched input ");
            sb.append(i(ipVar2.d));
            sb.append(" expecting ");
            uj ujVar = ipVar2.a;
            ii iiVarK = ujVar != null ? ujVar.t().k(ipVar2.e, ipVar2.b) : null;
            ((wl) dnVar).getClass();
            sb.append(iiVarK.j(wl.w));
            dnVar.o(ipVar2.d, sb.toString(), ipVar2);
            return;
        }
        kf kfVar = (kf) ipVar;
        tp tpVar = dnVar.b;
        if (tpVar != null) {
            to toVar = kfVar.f;
            if (toVar.a == -1) {
                str = "<EOF>";
            } else {
                to toVar2 = kfVar.d;
                String string = "";
                if (toVar != null && toVar2 != null) {
                    bd bdVarD = bd.d(toVar.g, toVar2.g);
                    int i = bdVarD.b;
                    int size = bdVarD.c;
                    if (i >= 0 && size >= 0) {
                        if (tpVar.c == -1) {
                            tpVar.k(0);
                            tpVar.c = tpVar.i(0);
                        }
                        while (tpVar.h(DescriptorProtos.Edition.EDITION_2023_VALUE) >= 1000) {
                        }
                        ArrayList arrayList = tpVar.b;
                        if (size >= arrayList.size()) {
                            size = arrayList.size() - 1;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        while (i <= size) {
                            to toVar3 = (to) arrayList.get(i);
                            if (toVar3.a == -1) {
                                break;
                            }
                            sb2.append(toVar3.j());
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
        dnVar.o(kfVar.d, "no viable alternative at input " + g(str), kfVar);
    }

    public final void n(dn dnVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        to toVarL = dnVar.l();
        dnVar.o(toVarL, "extraneous input " + i(toVarL) + " expecting " + dnVar.m().j(wl.w), null);
    }

    public final to o(dn dnVar) {
        if (!dnVar.m().f(dnVar.b.e(2))) {
            return null;
        }
        n(dnVar);
        dnVar.h();
        to toVarL = dnVar.l();
        j();
        return toVarL;
    }

    public final void p(dn dnVar) {
        lq lqVar = (lq) ((ol) dnVar.r).p.a.get(dnVar.s);
        if (this.a) {
            return;
        }
        int iE = dnVar.b.e(1);
        ii iiVarL = wl.y.l(lqVar);
        if (iiVarL.f(iE)) {
            this.d = null;
            this.e = -1;
            return;
        }
        if (iiVarL.f(-2)) {
            if (this.d == null) {
                this.d = dnVar.d;
                this.e = dnVar.s;
                return;
            }
            return;
        }
        int iA = lqVar.a();
        if (iA != 3 && iA != 4 && iA != 5) {
            switch (iA) {
                case 9:
                case 11:
                    n(dnVar);
                    ii iiVarM = dnVar.m();
                    ii iiVarH = h(dnVar);
                    ii iiVar = new ii(new int[0]);
                    iiVar.e(iiVarM);
                    iiVar.e(iiVarH);
                    f(dnVar, iiVar);
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (o(dnVar) == null) {
            throw new ck(dnVar);
        }
    }
}
