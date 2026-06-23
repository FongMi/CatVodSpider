package com.github.catvod.spider.merge.A0;

import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class rj extends dr {
    public final /* synthetic */ int a;

    public /* synthetic */ rj(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public int b() {
        switch (this.a) {
            case 0:
                return 10;
            case 6:
                return 1;
            case 7:
                return -1;
            case 8:
                return 1;
            default:
                return super.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac A[ORIG_RETURN, RETURN] */
    @Override // com.github.catvod.spider.merge.A0.dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.github.catvod.spider.merge.A0.ed r6, com.github.catvod.spider.merge.A0.ed r7) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.rj.c(com.github.catvod.spider.merge.A0.ed, com.github.catvod.spider.merge.A0.ed):boolean");
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return Marker.ANY_MARKER;
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return "";
        }
    }
}
