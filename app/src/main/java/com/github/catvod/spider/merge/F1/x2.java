package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class x2 implements w2, Serializable {
    public static final x2 c = new x2("Symbol.iterator");
    public static final x2 d = new x2("Symbol.toStringTag");
    public static final x2 e = new x2("Symbol.species");
    public static final x2 f = new x2("Symbol.hasInstance");
    public static final x2 g = new x2("Symbol.isConcatSpreadable");
    public static final x2 h = new x2("Symbol.isRegExp");
    public static final x2 i = new x2("Symbol.toPrimitive");
    public static final x2 j = new x2("Symbol.match");
    public static final x2 k = new x2("Symbol.replace");
    public static final x2 l = new x2("Symbol.search");
    public static final x2 m = new x2("Symbol.split");
    public static final x2 n = new x2("Symbol.unscopables");
    private String b;

    public x2(String str) {
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return obj instanceof x2 ? obj == this : (obj instanceof M1) && ((M1) obj).r1() == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        if (this.b == null) {
            return "Symbol()";
        }
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("Symbol(");
        sbB.append(this.b);
        sbB.append(')');
        return sbB.toString();
    }
}
