package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.KW.C0818f;
import com.github.catvod.spider.merge.KW.D;
import com.github.catvod.spider.merge.ZrJ;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e {
    public int a;
    public C0818f b;
    public e[] c;
    public boolean d;
    public int e;
    public D f;
    public boolean g;
    public d[] h;

    public e() {
        this.a = -1;
        this.b = new C0818f(true);
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
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.f(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(ZrJ.d("43"));
        sb.append(this.b);
        if (this.d) {
            sb.append(ZrJ.d("447D"));
            d[] dVarArr = this.h;
            if (dVarArr != null) {
                sb.append(Arrays.toString(dVarArr));
            } else {
                sb.append(this.e);
            }
        }
        return sb.toString();
    }

    public e(C0818f c0818f) {
        this.a = -1;
        new C0818f(true);
        this.d = false;
        this.b = c0818f;
    }
}
