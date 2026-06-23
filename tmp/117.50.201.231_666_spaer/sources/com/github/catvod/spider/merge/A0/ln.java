package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ln extends dr {
    public final ArrayList a;
    public int e;

    public ln(dr drVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = 2;
        arrayList.add(drVar);
        this.e = drVar.b() + this.e;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final int b() {
        return this.e;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        if (edVar2 == edVar) {
            return false;
        }
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (edVar2 == null || !((dr) arrayList.get(size)).c(edVar, edVar2)) {
                return false;
            }
            edVar2 = (ed) edVar2.ap;
        }
        return true;
    }

    public final String toString() {
        return ws.l(" > ", this.a);
    }
}
