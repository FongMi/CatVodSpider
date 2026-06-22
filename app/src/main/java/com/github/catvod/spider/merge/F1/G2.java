package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class G2 implements Serializable {
    public static final G2 b;
    private static final int c;
    public static final n2 d;

    static {
        G2 g2 = new G2();
        b = g2;
        c = System.identityHashCode(g2);
        d = new F2();
    }

    private G2() {
    }

    public static boolean b(Object obj) {
        return b == obj || d == obj;
    }

    public final boolean equals(Object obj) {
        return b(obj) || super.equals(obj);
    }

    public final int hashCode() {
        return c;
    }
}
