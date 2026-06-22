package com.github.catvod.spider.merge.H;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0028d extends h {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028d(int i) {
        super(1);
        this.b = i;
        switch (i) {
            case 1:
                super(2);
                break;
            case 2:
                super(7);
                break;
            case 3:
                super(11);
                break;
            case 4:
                super(10);
                break;
            default:
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.H.h
    public final int c(n nVar, int i) {
        switch (this.b) {
            case 0:
                if (i >= 100) {
                    return i;
                }
                int i2 = nVar.d + i;
                if (i < nVar.e) {
                    i2 += 100;
                }
                return i2;
            case 1:
                return i - 1;
            case 2:
                if (i == 7) {
                    return 1;
                }
                return 1 + i;
            case 3:
                if (i == 24) {
                    return 0;
                }
                return i;
            default:
                if (i == 12) {
                    return 0;
                }
                return i;
        }
    }
}
