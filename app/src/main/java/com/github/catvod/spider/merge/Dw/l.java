package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Nx.l0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class l {
    public l0 a;
    public int b;

    public l(l0 l0Var, int i) {
        this.b = i;
        this.a = l0Var;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.ka.d.b("(");
        sbB.append(this.a);
        sbB.append(", ");
        sbB.append(this.b);
        sbB.append(")");
        return sbB.toString();
    }
}
