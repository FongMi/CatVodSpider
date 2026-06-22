package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class b {
    protected m a;
    protected int b = 0;
    protected int c;

    public b(m mVar) {
        this.a = mVar;
    }

    public final String a() {
        return this.a.e;
    }

    public final int b() {
        return this.c;
    }

    public final int c(byte b) {
        int iB = this.a.a.b(b & 255);
        int i = this.b;
        if (i == 0) {
            this.c = this.a.d[iB];
        }
        m mVar = this.a;
        int iB2 = mVar.c.b((i * mVar.b) + iB);
        this.b = iB2;
        return iB2;
    }

    public final void d() {
        this.b = 0;
    }
}
