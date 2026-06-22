package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C {
    private String a;
    private String b;

    C(C0838a c0838a, String str) {
        c0838a.getClass();
        this.a = c0838a.v();
        this.b = str;
    }

    C(C0838a c0838a, String str, Object... objArr) {
        c0838a.getClass();
        this.a = c0838a.v();
        this.b = String.format(str, objArr);
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("45"));
        sbB.append(this.a);
        sbB.append(ZrJ.d("47796B"));
        sbB.append(this.b);
        return sbB.toString();
    }
}
