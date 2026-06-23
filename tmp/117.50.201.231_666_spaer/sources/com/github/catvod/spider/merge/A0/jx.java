package com.github.catvod.spider.merge.A0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class jx implements Serializable {
    public final Throwable a;

    public jx(Throwable th) {
        ko.f("exception", th);
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jx) {
            if (ko.b(this.a, ((jx) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
