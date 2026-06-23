package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class acl extends ox {
    public static final vp b;
    public static final acl c;

    static {
        int i = ak.b;
        int i2 = ak.c;
        long j = ak.d;
        acl aclVar = new acl();
        aclVar.a = new yp(i, i2, j);
        c = aclVar;
        int i3 = abp.a;
        if (64 >= i3) {
            i3 = 64;
        }
        b = new vp(aclVar, xy.h("kotlinx.coroutines.io.parallelism", i3, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.github.catvod.spider.merge.A0.ym
    public final String toString() {
        return "Dispatchers.Default";
    }
}
