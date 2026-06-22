package com.github.catvod.spider.merge.A;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0024z {
    public final InterfaceC0023y[] a;
    public final int b;

    public C0024z(InterfaceC0023y[] interfaceC0023yArr) {
        this.a = interfaceC0023yArr;
        int iC = 0;
        for (InterfaceC0023y interfaceC0023y : interfaceC0023yArr) {
            iC = com.github.catvod.spider.merge.R.a.c(iC, interfaceC0023y);
        }
        this.b = com.github.catvod.spider.merge.R.a.a(iC, interfaceC0023yArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0024z)) {
            return false;
        }
        C0024z c0024z = (C0024z) obj;
        return this.b == c0024z.b && Arrays.equals(this.a, c0024z.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
