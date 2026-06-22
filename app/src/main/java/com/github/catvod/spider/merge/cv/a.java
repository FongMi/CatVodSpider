package com.github.catvod.spider.merge.cv;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a extends Error {
    Exception a;

    public a(String str, Exception exc) {
        super(str);
        this.a = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.a) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.a.getClass().toString() : message2;
    }
}
