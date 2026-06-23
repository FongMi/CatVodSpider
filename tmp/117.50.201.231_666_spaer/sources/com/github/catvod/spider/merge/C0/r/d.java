package com.github.catvod.spider.merge.C0.R;

import com.github.catvod.spider.merge.C0.Q.l0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d {
    public l0 a;
    public int b;

    public d(l0 l0Var, int i) {
        this.b = i;
        this.a = l0Var;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("(");
        sbB.append(this.a);
        sbB.append(", ");
        sbB.append(this.b);
        sbB.append(")");
        return sbB.toString();
    }
}
