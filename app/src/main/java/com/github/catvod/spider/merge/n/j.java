package com.github.catvod.spider.merge.N;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class j extends o {
    public final int a;
    public final /* synthetic */ int b;

    public j(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        switch (this.b) {
            case 0:
                if (lVar2.E() == this.a) {
                }
                break;
            case 1:
                if (lVar2.E() > this.a) {
                }
                break;
            default:
                if (lVar == lVar2 || lVar2.E() >= this.a) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        int i = this.a;
        switch (this.b) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(i));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(i));
            default:
                return String.format(":lt(%d)", Integer.valueOf(i));
        }
    }
}
