package com.github.catvod.spider.merge.N;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class m extends o {
    public final int a;
    public final int b;
    public final /* synthetic */ int c;

    public m(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        com.github.catvod.spider.merge.L.l lVar3 = (com.github.catvod.spider.merge.L.l) lVar2.a;
        if (lVar3 == null || (lVar3 instanceof com.github.catvod.spider.merge.L.h)) {
            return false;
        }
        int iB = b(lVar2);
        int i = this.b;
        int i2 = this.a;
        if (i2 == 0) {
            return iB == i;
        }
        int i3 = iB - i;
        return i3 * i2 >= 0 && i3 % i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(com.github.catvod.spider.merge.L.l lVar) {
        switch (this.c) {
            case 0:
                return lVar.E() + 1;
            case 1:
                com.github.catvod.spider.merge.L.l lVar2 = (com.github.catvod.spider.merge.L.l) lVar.a;
                if (lVar2 == null) {
                    return 0;
                }
                return lVar2.A().size() - lVar.E();
            case 2:
                com.github.catvod.spider.merge.L.l lVar3 = (com.github.catvod.spider.merge.L.l) lVar.a;
                int i = 0;
                if (lVar3 != null) {
                    e eVarA = lVar3.A();
                    for (int iE = lVar.E(); iE < eVarA.size(); iE++) {
                        if (((com.github.catvod.spider.merge.L.l) eVarA.get(iE)).d.equals(lVar.d)) {
                            i++;
                        }
                    }
                }
                return i;
            default:
                com.github.catvod.spider.merge.L.l lVar4 = (com.github.catvod.spider.merge.L.l) lVar.a;
                int i2 = 0;
                if (lVar4 != null) {
                    for (com.github.catvod.spider.merge.L.l lVar5 : lVar4.A()) {
                        if (lVar5.d.equals(lVar.d)) {
                            i2++;
                        }
                        if (lVar5 == lVar) {
                        }
                    }
                }
                return i2;
        }
    }

    public final String c() {
        switch (this.c) {
            case 0:
                return "nth-child";
            case 1:
                return "nth-last-child";
            case 2:
                return "nth-last-of-type";
            default:
                return "nth-of-type";
        }
    }

    public String toString() {
        int i = this.b;
        int i2 = this.a;
        return i2 == 0 ? String.format(":%s(%d)", c(), Integer.valueOf(i)) : i == 0 ? String.format(":%s(%dn)", c(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", c(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
