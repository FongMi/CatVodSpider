package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class et extends dr {
    public final /* synthetic */ int a;
    public final String e;

    public et(String str, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.e = qf.c(str);
                break;
            case 4:
                StringBuilder sbG = ws.g();
                ws.f(sbG, str, false);
                this.e = qf.c(ws.n(sbG));
                break;
            case 5:
                StringBuilder sbG2 = ws.g();
                ws.f(sbG2, str, false);
                this.e = qf.c(ws.n(sbG2));
                break;
            default:
                wc.e(str);
                this.e = qf.c(str);
                break;
        }
    }

    public /* synthetic */ et(String str, int i, boolean z) {
        this.a = i;
        this.e = str;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public int b() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 6;
            case 3:
            case 4:
            case 6:
            default:
                return super.b();
            case 5:
                return 10;
            case 7:
                return 10;
            case 8:
                return 2;
            case 9:
                return 1;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        switch (this.a) {
            case 0:
                return edVar2.av(this.e);
            case 1:
                qh qhVarL = edVar2.l();
                qhVarL.getClass();
                ArrayList arrayList = new ArrayList(qhVarL.a);
                for (int i = 0; i < qhVarL.a; i++) {
                    String str = qhVarL.b[i];
                    if (!qh.d(str)) {
                        arrayList.add(new qe(str, (String) qhVarL.c[i], qhVarL));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (qf.c(((qe) it.next()).d).startsWith(this.e)) {
                        return true;
                    }
                }
                return false;
            case 2:
                return edVar2.ad(this.e);
            case 3:
                edVar2.getClass();
                StringBuilder sbG = ws.g();
                pp.b(new ej(sbG), edVar2);
                return qf.c(ws.n(sbG)).contains(this.e);
            case 4:
                return qf.c(edVar2.ag()).contains(this.e);
            case 5:
                return qf.c(edVar2.ak()).contains(this.e);
            case 6:
                return ((String) edVar2.i.stream().map(new el(0)).collect(ws.m(""))).contains(this.e);
            case 7:
                edVar2.getClass();
                return ((String) pq.b(edVar2, fw.class).map(new el(0)).collect(ws.m(""))).contains(this.e);
            case 8:
                qh qhVar = edVar2.j;
                return this.e.equals(qhVar != null ? qhVar.i("id") : "");
            case 9:
                return edVar2.aw(this.e);
            case 10:
                return edVar2.g.c.endsWith(this.e);
            default:
                return edVar2.g.c.startsWith(this.e);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "[" + this.e + "]";
            case 1:
                return "[^" + this.e + "]";
            case 2:
                return "." + this.e;
            case 3:
                return ":containsData(" + this.e + ")";
            case 4:
                return ":containsOwn(" + this.e + ")";
            case 5:
                return ":contains(" + this.e + ")";
            case 6:
                return ":containsWholeOwnText(" + this.e + ")";
            case 7:
                return ":containsWholeText(" + this.e + ")";
            case 8:
                return "#" + this.e;
            case 9:
                return this.e;
            case 10:
                return this.e;
            default:
                return this.e;
        }
    }
}
