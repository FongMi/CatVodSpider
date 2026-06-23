package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C {
    private String a;
    private String b;

    C(C0217a c0217a, String str) {
        c0217a.getClass();
        this.a = c0217a.v();
        this.b = str;
    }

    C(C0217a c0217a, String str, Object... objArr) {
        c0217a.getClass();
        this.a = c0217a.v();
        this.b = String.format(str, objArr);
    }

    public final String toString() {
        StringBuilder sbB = P.b("<");
        sbB.append(this.a);
        sbB.append(">: ");
        sbB.append(this.b);
        return sbB.toString();
    }
}
