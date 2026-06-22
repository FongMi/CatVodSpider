package com.github.catvod.spider.merge.X0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c extends IllegalStateException {
    private Throwable b;

    c(String str, Throwable th) {
        super(str);
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
