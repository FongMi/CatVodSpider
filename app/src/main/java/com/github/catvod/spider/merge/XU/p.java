package com.github.catvod.spider.merge.XU;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p {
    private int a;
    private boolean b;
    private boolean c;
    private boolean d;
    private byte e;
    private String f;
    private com.github.catvod.spider.merge.PK.f h = null;
    private com.github.catvod.spider.merge.PK.b[] g = new com.github.catvod.spider.merge.PK.b[3];

    public p() {
        int i = 0;
        int i2 = 0;
        while (true) {
            com.github.catvod.spider.merge.PK.b[] bVarArr = this.g;
            if (i2 >= bVarArr.length) {
                break;
            }
            bVarArr[i2] = null;
            i2++;
        }
        this.b = false;
        this.c = true;
        this.f = null;
        this.d = false;
        this.a = 1;
        this.e = (byte) 0;
        com.github.catvod.spider.merge.PK.f fVar = this.h;
        if (fVar != null) {
            fVar.h();
        }
        while (true) {
            com.github.catvod.spider.merge.PK.b[] bVarArr2 = this.g;
            if (i >= bVarArr2.length) {
                return;
            }
            if (bVarArr2[i] != null) {
                bVarArr2[i].h();
            }
            i++;
        }
    }

    public final void a() {
        com.github.catvod.spider.merge.PK.b[] bVarArr;
        if (this.d) {
            if (this.f != null) {
                this.b = true;
                return;
            }
            if (this.a == 3) {
                float f = 0.0f;
                int i = 0;
                int i2 = 0;
                while (true) {
                    bVarArr = this.g;
                    if (i >= bVarArr.length) {
                        break;
                    }
                    float fD = bVarArr[i].d();
                    if (fD > f) {
                        i2 = i;
                        f = fD;
                    }
                    i++;
                }
                if (f > 0.2f) {
                    this.f = bVarArr[i2].c();
                }
            }
        }
    }

    public final String b() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(byte[] r12, int r13) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.XU.p.c(byte[], int):void");
    }
}
