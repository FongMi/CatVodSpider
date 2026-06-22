package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C {
    private String a;
    private String b;

    C(C0017a c0017a, String str) {
        c0017a.getClass();
        this.a = c0017a.v();
        this.b = str;
    }

    C(C0017a c0017a, String str, Object... objArr) {
        c0017a.getClass();
        this.a = c0017a.v();
        this.b = String.format(str, objArr);
    }

    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("49"));
        sbC.append(this.a);
        sbC.append(oZP.d("4B5557"));
        sbC.append(this.b);
        return sbC.toString();
    }
}
