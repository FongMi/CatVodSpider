package com.github.catvod.spider.merge.y;

import java.io.Closeable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class T implements Cloneable, Closeable {
    protected boolean b;
    protected int c = -1;
    protected char d;
    private Boolean e;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x019d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a() {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.y.T.a():boolean");
    }

    public static T c(String str) {
        return new S(str);
    }

    static final boolean d(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f' || c == '\b';
    }

    protected abstract void b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    abstract void e();

    final void f() {
        while (d(this.d)) {
            e();
        }
    }

    public final boolean g() {
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a()) {
            f();
            if (this.b) {
                this.e = Boolean.TRUE;
                return true;
            }
        }
        this.e = Boolean.FALSE;
        return false;
    }
}
