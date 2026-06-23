package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ti extends tj {
    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        for (int i = 0; i < this.f; i++) {
            if (((dr) this.e.get(i)).c(edVar, edVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return ws.l(", ", this.a);
    }
}
