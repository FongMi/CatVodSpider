package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class sc implements aar {
    public final yg a;
    public final int b;
    public final int c;
    public final jo d;

    public sc(jo joVar, yg ygVar, int i, int i2) {
        this.a = ygVar;
        this.b = i;
        this.c = i2;
        this.d = joVar;
    }

    public final String e() {
        ArrayList arrayList = new ArrayList(4);
        ek ekVar = ek.a;
        yg ygVar = this.a;
        if (ygVar != ekVar) {
            arrayList.add("context=" + ygVar);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(i2 != 1 ? "null" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + sw.b(arrayList, null, null, null, 62) + ']';
    }

    public final String toString() {
        return this.d + " -> " + e();
    }
}
