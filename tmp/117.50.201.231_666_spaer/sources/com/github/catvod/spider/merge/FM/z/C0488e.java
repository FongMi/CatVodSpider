package com.github.catvod.spider.merge.FM.z;

import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.y.C0455D;
import com.github.catvod.spider.merge.FM.y.C0464f;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.z.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0488e {
    public int a;
    public C0464f b;
    public C0488e[] c;
    public boolean d;
    public int e;
    public C0455D f;
    public boolean g;
    public C0487d[] h;

    public C0488e() {
        this.a = -1;
        this.b = new C0464f(true);
        this.d = false;
    }

    public C0488e(C0464f c0464f) {
        this.a = -1;
        new C0464f(true);
        this.d = false;
        this.b = c0464f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0488e) {
            return this.b.equals(((C0488e) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return l.c(l.i(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        sb.append(this.b);
        if (this.d) {
            sb.append("=>");
            C0487d[] c0487dArr = this.h;
            if (c0487dArr != null) {
                sb.append(Arrays.toString(c0487dArr));
            } else {
                sb.append(this.e);
            }
        }
        return sb.toString();
    }
}
