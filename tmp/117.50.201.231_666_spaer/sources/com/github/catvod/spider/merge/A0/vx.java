package com.github.catvod.spider.merge.A0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class vx implements Serializable {
    public final Object a;

    public static final Throwable b(Object obj) {
        if (obj instanceof jx) {
            return ((jx) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vx) {
            return ko.b(this.a, ((vx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof jx) {
            return ((jx) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
