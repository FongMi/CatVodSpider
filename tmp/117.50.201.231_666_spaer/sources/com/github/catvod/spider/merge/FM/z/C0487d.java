package com.github.catvod.spider.merge.FM.z;

import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.y.l0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.z.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0487d {
    public l0 a;
    public int b;

    public C0487d(l0 l0Var, int i) {
        this.b = i;
        this.a = l0Var;
    }

    public final String toString() {
        StringBuilder sbB = P.b("(");
        sbB.append(this.a);
        sbB.append(", ");
        sbB.append(this.b);
        sbB.append(")");
        return sbB.toString();
    }
}
