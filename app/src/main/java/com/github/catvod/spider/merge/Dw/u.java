package com.github.catvod.spider.merge.Dw;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class u implements Serializable {
    public final Throwable c;

    public u(Throwable th) {
        this.c = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && com.github.catvod.spider.merge.E.f.a(this.c, ((u) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.ka.d.b("Failure(");
        sbB.append(this.c);
        sbB.append(')');
        return sbB.toString();
    }
}
