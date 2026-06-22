package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0970C {
    private String a;
    private String b;

    C0970C(C0973a c0973a, String str) {
        c0973a.getClass();
        this.a = c0973a.v();
        this.b = str;
    }

    C0970C(C0973a c0973a, String str, Object... objArr) {
        c0973a.getClass();
        this.a = c0973a.v();
        this.b = String.format(str, objArr);
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("<");
        sbB.append(this.a);
        sbB.append(">: ");
        sbB.append(this.b);
        return sbB.toString();
    }
}
