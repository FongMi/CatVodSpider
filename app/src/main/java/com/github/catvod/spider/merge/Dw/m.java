package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Nx.D;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class m {
    public int a;
    public com.github.catvod.spider.merge.Nx.f b;
    public m[] c;
    public boolean d;
    public int e;
    public D f;
    public boolean g;
    public l[] h;

    public m() {
        this.a = -1;
        this.b = new com.github.catvod.spider.merge.Nx.f(true);
        this.d = false;
    }

    public m(com.github.catvod.spider.merge.Nx.f fVar) {
        this.a = -1;
        new com.github.catvod.spider.merge.Nx.f(true);
        this.d = false;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.b.equals(((m) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return i.b(i.o(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        sb.append(this.b);
        if (this.d) {
            sb.append("=>");
            l[] lVarArr = this.h;
            if (lVarArr != null) {
                sb.append(Arrays.toString(lVarArr));
            } else {
                sb.append(this.e);
            }
        }
        return sb.toString();
    }
}
