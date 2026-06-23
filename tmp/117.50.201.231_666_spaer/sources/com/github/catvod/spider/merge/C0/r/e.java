package com.github.catvod.spider.merge.C0.R;

import com.github.catvod.spider.merge.C0.N.a;
import com.github.catvod.spider.merge.C0.Q.D;
import com.github.catvod.spider.merge.C0.Q.f;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e {
    public int a;
    public f b;
    public e[] c;
    public boolean d;
    public int e;
    public D f;
    public boolean g;
    public d[] h;

    public e() {
        this.a = -1;
        this.b = new f(true);
        this.d = false;
    }

    public e(f fVar) {
        this.a = -1;
        new f(true);
        this.d = false;
        this.b = fVar;
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
        return a.b(a.o(7, this.b.hashCode()), 1);
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
