package com.github.catvod.spider.merge.C0.x;

import com.github.catvod.spider.merge.C0.d.d;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f implements Serializable {
    public final Throwable c;

    public f(Throwable th) {
        this.c = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && com.github.catvod.spider.merge.C0.E.f.a(this.c, ((f) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sbB = d.b("Failure(");
        sbB.append(this.c);
        sbB.append(')');
        return sbB.toString();
    }
}
