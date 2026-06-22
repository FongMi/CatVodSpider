package com.github.catvod.spider.merge.N;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class t extends u {
    public final /* synthetic */ int b;

    public t(o oVar, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.a = oVar;
                break;
            case 2:
                this.a = oVar;
                break;
            case 3:
                this.a = oVar;
                break;
            case 4:
                this.a = oVar;
                break;
            default:
                this.a = oVar;
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        com.github.catvod.spider.merge.L.l lVar3;
        com.github.catvod.spider.merge.L.l lVarK;
        switch (this.b) {
            case 0:
                return (lVar == lVar2 || (lVar3 = (com.github.catvod.spider.merge.L.l) lVar2.a) == null || !this.a.a(lVar, lVar3)) ? false : true;
            case 1:
                return (lVar == lVar2 || (lVarK = lVar2.K()) == null || !this.a.a(lVar, lVarK)) ? false : true;
            case 2:
                return !this.a.a(lVar, lVar2);
            case 3:
                if (lVar == lVar2) {
                    return false;
                }
                com.github.catvod.spider.merge.L.q qVar = lVar2.a;
                while (true) {
                    com.github.catvod.spider.merge.L.l lVar4 = (com.github.catvod.spider.merge.L.l) qVar;
                    if (lVar4 == null) {
                        return false;
                    }
                    if (this.a.a(lVar, lVar4)) {
                        return true;
                    }
                    if (lVar4 == lVar) {
                        return false;
                    }
                    qVar = lVar4.a;
                }
                break;
            default:
                if (lVar == lVar2) {
                    return false;
                }
                do {
                    lVar2 = lVar2.K();
                    if (lVar2 == null) {
                        return false;
                    }
                } while (!this.a.a(lVar, lVar2));
                return true;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return String.format("%s > ", this.a);
            case 1:
                return String.format("%s + ", this.a);
            case 2:
                return String.format(":not(%s)", this.a);
            case 3:
                return String.format("%s ", this.a);
            default:
                return String.format("%s ~ ", this.a);
        }
    }
}
