package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ds extends dr {
    public final int a;
    public final /* synthetic */ int e;

    public ds(int i, int i2) {
        this.e = i2;
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        switch (this.e) {
            case 0:
                if (edVar2.ab() == this.a) {
                }
                break;
            case 1:
                if (edVar2.ab() > this.a) {
                }
                break;
            default:
                if (edVar == edVar2 || edVar2.ab() >= this.a) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        int i = this.a;
        switch (this.e) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(i));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(i));
            default:
                return String.format(":lt(%d)", Integer.valueOf(i));
        }
    }
}
