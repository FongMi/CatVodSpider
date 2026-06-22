package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.KW.l0;
import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d {
    public l0 a;
    public int b;

    public d(l0 l0Var, int i) {
        this.b = i;
        this.a = l0Var;
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("51"));
        sbB.append(this.a);
        sbB.append(ZrJ.d("5563"));
        sbB.append(this.b);
        sbB.append(ZrJ.d("50"));
        return sbB.toString();
    }
}
