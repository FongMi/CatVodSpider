package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class act {
    public static final String[] a = {"input", "keygen", "object", "select", "textarea"};

    public static final jx b(Throwable th) {
        ko.f("exception", th);
        return new jx(th);
    }

    public static final void c(Object obj) throws Throwable {
        if (obj instanceof jx) {
            throw ((jx) obj).a;
        }
    }
}
