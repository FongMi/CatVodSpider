package com.github.catvod.spider.merge.v;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0236a extends Error {
    Exception a;

    public C0236a(String str, Exception exc) {
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
