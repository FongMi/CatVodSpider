package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.a.C0529a;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d {
    private String a;
    private String b;

    d(a aVar, String str) {
        aVar.getClass();
        this.a = aVar.v();
        this.b = str;
    }

    d(a aVar, String str, Object... objArr) {
        aVar.getClass();
        this.a = aVar.v();
        this.b = String.format(str, objArr);
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("<");
        sbA.append(this.a);
        sbA.append(">: ");
        sbA.append(this.b);
        return sbA.toString();
    }
}
