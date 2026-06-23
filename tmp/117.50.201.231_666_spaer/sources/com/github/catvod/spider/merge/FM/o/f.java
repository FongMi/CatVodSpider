package com.github.catvod.spider.merge.FM.O;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f extends b {
    private static final com.github.catvod.spider.merge.FM.S.g e = new com.github.catvod.spider.merge.FM.S.g();
    private static final com.github.catvod.spider.merge.FM.S.h f = new com.github.catvod.spider.merge.FM.S.h();
    private static final com.github.catvod.spider.merge.FM.S.i g = new com.github.catvod.spider.merge.FM.S.i();
    private static final com.github.catvod.spider.merge.FM.S.j h = new com.github.catvod.spider.merge.FM.S.j();
    private com.github.catvod.spider.merge.FM.S.b[] a = {new com.github.catvod.spider.merge.FM.S.b(e), new com.github.catvod.spider.merge.FM.S.b(f), new com.github.catvod.spider.merge.FM.S.b(g), new com.github.catvod.spider.merge.FM.S.b(h)};
    private int b;
    private int c;
    private String d;

    public f() {
        h();
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final String c() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final float d() {
        return 0.99f;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int e() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final int f(byte[] bArr, int i) {
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2 && this.c == 1; i3++) {
            for (int i4 = this.b - 1; i4 >= 0; i4--) {
                int iC = this.a[i4].c(bArr[i3]);
                if (iC == 1) {
                    int i5 = this.b - 1;
                    this.b = i5;
                    if (i5 <= 0) {
                        this.c = 3;
                        return 3;
                    }
                    if (i4 != i5) {
                        com.github.catvod.spider.merge.FM.S.b[] bVarArr = this.a;
                        com.github.catvod.spider.merge.FM.S.b bVar = bVarArr[i5];
                        bVarArr[i5] = bVarArr[i4];
                        bVarArr[i4] = bVar;
                    }
                } else if (iC == 2) {
                    this.c = 2;
                    this.d = this.a[i4].a();
                    return this.c;
                }
            }
        }
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.FM.O.b
    public final void h() {
        this.c = 1;
        int i = 0;
        while (true) {
            com.github.catvod.spider.merge.FM.S.b[] bVarArr = this.a;
            if (i >= bVarArr.length) {
                this.b = bVarArr.length;
                this.d = null;
                return;
            } else {
                bVarArr[i].d();
                i++;
            }
        }
    }
}
