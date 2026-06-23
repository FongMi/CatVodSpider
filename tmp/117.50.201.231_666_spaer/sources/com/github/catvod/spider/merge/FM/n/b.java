package com.github.catvod.spider.merge.FM.N;

import com.github.catvod.spider.merge.FM.O.f;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class b {
    private int a;
    private boolean b;
    private boolean c;
    private boolean d;
    private byte e;
    private String f;
    private f h = null;
    private com.github.catvod.spider.merge.FM.O.b[] g = new com.github.catvod.spider.merge.FM.O.b[3];

    public b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            com.github.catvod.spider.merge.FM.O.b[] bVarArr = this.g;
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
        f fVar = this.h;
        if (fVar != null) {
            fVar.h();
        }
        while (true) {
            com.github.catvod.spider.merge.FM.O.b[] bVarArr2 = this.g;
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
        com.github.catvod.spider.merge.FM.O.b[] bVarArr;
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.N.b.c(byte[], int):void");
    }
}
