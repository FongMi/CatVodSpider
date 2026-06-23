package com.github.catvod.spider.merge.FM.x;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0442i extends AbstractC0445l {
    private final char[] c;

    C0442i(int i, int i2, char[] cArr) {
        super(i2);
        this.c = cArr;
    }

    @Override // com.github.catvod.spider.merge.FM.x.InterfaceC0437d
    public final String e(com.github.catvod.spider.merge.FM.A.j jVar) {
        int iMin = Math.min(jVar.a, this.a);
        return new String(this.c, iMin, Math.min((jVar.b - jVar.a) + 1, this.a - iMin));
    }

    @Override // com.github.catvod.spider.merge.FM.x.s
    public final int h(int i) {
        char c;
        int iSignum = Integer.signum(1);
        if (iSignum == -1) {
            int i2 = this.b + 1;
            if (i2 < 0) {
                return -1;
            }
            c = this.c[i2];
        } else {
            if (iSignum == 0) {
                return 0;
            }
            if (iSignum != 1) {
                throw new UnsupportedOperationException("Not reached");
            }
            int i3 = (this.b + 1) - 1;
            if (i3 >= this.a) {
                return -1;
            }
            c = this.c[i3];
        }
        return c & 65535;
    }
}
