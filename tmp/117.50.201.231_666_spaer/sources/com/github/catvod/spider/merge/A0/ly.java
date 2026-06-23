package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ly extends eo {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly(int i, int i2) {
        super(i);
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.eo
    public final int d(abe abeVar, int i) {
        switch (this.e) {
            case 0:
                if (i >= 100) {
                    return i;
                }
                int i2 = abeVar.w + i;
                if (i < abeVar.x) {
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
