package com.github.catvod.spider.merge.FM.u;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0413a extends Error {
    Exception a;

    public C0413a(String str, Exception exc) {
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
