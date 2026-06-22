package com.github.catvod.spider.merge.P;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class h extends b {
    private int a;
    private int b;
    private byte c;
    private byte d;
    private b e = null;
    private b f = null;

    public h() {
        h();
    }

    protected static boolean i(byte b) {
        int i = b & 255;
        return i == 234 || i == 237 || i == 239 || i == 243 || i == 245;
    }

    @Override // com.github.catvod.spider.merge.P.b
    public final String c() {
        int i = this.a - this.b;
        if (i >= 5) {
            return com.github.catvod.spider.merge.O.a.t;
        }
        if (i <= -5) {
            return com.github.catvod.spider.merge.O.a.f;
        }
        float fD = this.e.d() - this.f.d();
        if (fD > 0.01f) {
            return com.github.catvod.spider.merge.O.a.t;
        }
        if (fD >= -0.01f && i >= 0) {
            return com.github.catvod.spider.merge.O.a.t;
        }
        return com.github.catvod.spider.merge.O.a.f;
    }

    @Override // com.github.catvod.spider.merge.P.b
    public final float d() {
        return 0.0f;
    }

    @Override // com.github.catvod.spider.merge.P.b
    public final int e() {
        return (this.e.e() == 3 && this.f.e() == 3) ? 3 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    @Override // com.github.catvod.spider.merge.P.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(byte[] r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.e()
            r1 = 3
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            int r8 = r8 + r0
            r1 = 0
        Lb:
            r2 = 1
            if (r1 >= r8) goto L5b
            r3 = r7[r1]
            r4 = 32
            byte r5 = r6.d
            if (r3 != r4) goto L41
            if (r5 == r4) goto L52
            byte r4 = r6.c
            boolean r4 = i(r4)
            if (r4 == 0) goto L26
            int r4 = r6.a
            int r4 = r4 + r2
            r6.a = r4
            goto L52
        L26:
            byte r4 = r6.c
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 235(0xeb, float:3.3E-43)
            if (r4 == r5) goto L3d
            r5 = 238(0xee, float:3.34E-43)
            if (r4 == r5) goto L3d
            r5 = 240(0xf0, float:3.36E-43)
            if (r4 == r5) goto L3d
            r5 = 244(0xf4, float:3.42E-43)
            if (r4 != r5) goto L3b
            goto L3d
        L3b:
            r4 = 0
            goto L3e
        L3d:
            r4 = 1
        L3e:
            if (r4 == 0) goto L52
            goto L4d
        L41:
            if (r5 != r4) goto L52
            byte r5 = r6.c
            boolean r5 = i(r5)
            if (r5 == 0) goto L52
            if (r3 == r4) goto L52
        L4d:
            int r4 = r6.b
            int r4 = r4 + r2
            r6.b = r4
        L52:
            byte r2 = r6.c
            r6.d = r2
            r6.c = r3
            int r1 = r1 + 1
            goto Lb
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.P.h.f(byte[], int):int");
    }

    @Override // com.github.catvod.spider.merge.P.b
    public final void h() {
        this.a = 0;
        this.b = 0;
        this.c = (byte) 32;
        this.d = (byte) 32;
    }

    public final void j(b bVar, b bVar2) {
        this.e = bVar;
        this.f = bVar2;
    }
}
