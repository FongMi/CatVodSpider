package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aw extends fa {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aw(dr drVar, int i) {
        super(drVar);
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final int b() {
        switch (this.a) {
            case 0:
                return ((dr) this.f).b() + 2;
            case 1:
                return ((dr) this.f).b() + 2;
            default:
                return ((dr) this.f).b() * 2;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        switch (this.a) {
            case 0:
                return ((dr) this.f).c(edVar, edVar2);
            case 1:
                return !h(edVar, edVar2);
            default:
                if (edVar == edVar2) {
                    return false;
                }
                fw fwVar = edVar2.ap;
                while (true) {
                    ed edVar3 = (ed) fwVar;
                    if (edVar3 == null) {
                        return false;
                    }
                    if (h(edVar, edVar3)) {
                        return true;
                    }
                    if (edVar3 == edVar) {
                        return false;
                    }
                    fwVar = edVar3.ap;
                }
                break;
        }
    }

    public final String toString() {
        Object obj = this.f;
        switch (this.a) {
            case 0:
                return String.format(":is(%s)", (dr) obj);
            case 1:
                return String.format(":not(%s)", (dr) obj);
            default:
                return String.format("%s ", (dr) obj);
        }
    }
}
