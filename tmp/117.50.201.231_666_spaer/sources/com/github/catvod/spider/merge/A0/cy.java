package com.github.catvod.spider.merge.A0;

import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class cy {
    public static final cy a;
    public final jp b;
    public final jp c;

    static {
        jp jpVar = new jp(-1, -1, -1);
        a = new cy(jpVar, jpVar);
    }

    public cy(jp jpVar, jp jpVar2) {
        this.b = jpVar;
        this.c = jpVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cy.class != obj.getClass()) {
            return false;
        }
        cy cyVar = (cy) obj;
        if (this.b.equals(cyVar.b)) {
            return this.c.equals(cyVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    public final String toString() {
        return this.b + "-" + this.c;
    }
}
