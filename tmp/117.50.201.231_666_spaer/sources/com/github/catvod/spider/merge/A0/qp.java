package com.github.catvod.spider.merge.A0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class qp extends fa {
    public static final abb a = new abb(new se(7));
    public final boolean i;

    public qp(dr drVar) {
        boolean z;
        super(drVar);
        if (drVar instanceof tj) {
            for (dr drVar2 : ((tj) drVar).a) {
                if ((drVar2 instanceof zv) || (drVar2 instanceof no)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.i = z;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final int b() {
        return ((dr) this.f).b() * 10;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        boolean z = this.i;
        dr drVar = (dr) this.f;
        if (z) {
            ed edVar3 = (ed) edVar2.ap;
            for (ed edVarAc = edVar3 != null ? edVar3.ac() : edVar2; edVarAc != null; edVarAc = edVarAc.af()) {
                if (edVarAc != edVar2 && drVar.c(edVar2, edVarAc)) {
                    return true;
                }
            }
        }
        abb abbVar = a;
        aau aauVar = (aau) abbVar.g();
        if (aauVar.f.isInstance(edVar2)) {
            aauVar.b = edVar2;
        }
        aauVar.c = edVar2;
        aauVar.d = edVar2;
        aauVar.a = edVar2;
        aauVar.e = (ed) edVar2.ap;
        while (aauVar.hasNext()) {
            try {
                aauVar.g();
                fw fwVar = aauVar.b;
                if (fwVar == null) {
                    throw new NoSuchElementException();
                }
                aauVar.d = aauVar.c;
                aauVar.c = fwVar;
                aauVar.e = fwVar.w();
                aauVar.b = null;
                ed edVar4 = (ed) fwVar;
                if (edVar4 != edVar2 && drVar.c(edVar2, edVar4)) {
                    return true;
                }
            } finally {
                abbVar.i(aauVar);
            }
        }
        abbVar.i(aauVar);
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", (dr) this.f);
    }
}
