package com.github.catvod.spider.merge.A0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class th extends tj {
    public th(List list) {
        this.a.addAll(list);
        h();
    }

    public th(dr... drVarArr) {
        this(Arrays.asList(drVarArr));
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        for (int i = 0; i < this.f; i++) {
            if (!((dr) this.e.get(i)).c(edVar, edVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ws.l("", this.a);
    }
}
