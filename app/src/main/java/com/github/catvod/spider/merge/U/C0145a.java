package com.github.catvod.spider.merge.u;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0145a extends Error {
    public final Exception a;

    public C0145a(String str, Exception exc) {
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
        return message2 == null ? exc.getClass().toString() : message2;
    }
}
