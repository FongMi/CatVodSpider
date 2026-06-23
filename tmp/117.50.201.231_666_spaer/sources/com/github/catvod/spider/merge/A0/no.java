package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class no extends fa {
    @Override // com.github.catvod.spider.merge.A0.dr
    public final int b() {
        return ((dr) this.f).b() + 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.github.catvod.spider.merge.A0.ed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.catvod.spider.merge.A0.fw] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.catvod.spider.merge.A0.fw] */
    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        ed edVar3;
        if (edVar == edVar2) {
            return false;
        }
        edVar2.getClass();
        while (true) {
            edVar2 = edVar2.ay();
            if (edVar2 == 0) {
                edVar3 = null;
                break;
            }
            if (edVar2 instanceof ed) {
                edVar3 = (ed) edVar2;
                break;
            }
        }
        return edVar3 != null && h(edVar, edVar3);
    }

    public final String toString() {
        return String.format("%s + ", (dr) this.f);
    }
}
