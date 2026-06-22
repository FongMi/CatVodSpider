package com.github.catvod.spider.merge.J0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a extends Error {
    Exception b;

    public a(String str, Exception exc) {
        super(str);
        this.b = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.b) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.b.getClass().toString() : message2;
    }
}
