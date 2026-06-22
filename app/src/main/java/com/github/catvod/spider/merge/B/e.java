package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.A.C0003d;
import com.github.catvod.spider.merge.A.C0004e;
import com.github.catvod.spider.merge.A.C0024z;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class e {
    public int a = -1;
    public C0004e b;
    public e[] c;
    public boolean d;
    public int e;
    public C0024z f;
    public boolean g;
    public d[] h;

    public e(C0004e c0004e) {
        new ArrayList(7);
        new C0003d(0);
        this.d = false;
        this.b = c0004e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.b.equals(((e) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.b(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        sb.append(this.b);
        if (this.d) {
            sb.append("=>");
            d[] dVarArr = this.h;
            if (dVarArr != null) {
                sb.append(Arrays.toString(dVarArr));
            } else {
                sb.append(this.e);
            }
        }
        return sb.toString();
    }
}
