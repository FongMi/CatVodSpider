package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.I.t0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1287f {
    static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    int c;
    final char[] a = new char[25];
    int b = 0;
    boolean d = false;

    final void a(char c) {
        char[] cArr = this.a;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    public final String toString() {
        StringBuilder sbB = t0.b("[chars:");
        sbB.append(new String(this.a, 0, this.b));
        sbB.append(", point:");
        sbB.append(this.c);
        sbB.append("]");
        return sbB.toString();
    }
}
