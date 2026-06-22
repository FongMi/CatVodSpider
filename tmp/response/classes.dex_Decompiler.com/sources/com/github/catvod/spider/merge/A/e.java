package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.z.C0278D;
import com.github.catvod.spider.merge.z.C0287f;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class e {
    public int a;
    public C0287f b;
    public e[] c;
    public boolean d;
    public int e;
    public C0278D f;
    public boolean g;
    public d[] h;

    public e() {
        this.a = -1;
        this.b = new C0287f(true);
        this.d = false;
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
        return l.b(l.f(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(oZP.d("4F"));
        sb.append(this.b);
        if (this.d) {
            sb.append(oZP.d("4851"));
            d[] dVarArr = this.h;
            if (dVarArr != null) {
                sb.append(Arrays.toString(dVarArr));
            } else {
                sb.append(this.e);
            }
        }
        return sb.toString();
    }

    public e(C0287f c0287f) {
        this.a = -1;
        new C0287f(true);
        this.d = false;
        this.b = c0287f;
    }
}
