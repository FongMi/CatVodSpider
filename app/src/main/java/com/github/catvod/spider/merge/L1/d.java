package com.github.catvod.spider.merge.L1;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d<F extends Serializable, S extends Serializable> implements Serializable {
    private F b;
    private S c;

    public d(F f, S s) {
        this.b = f;
        this.c = s;
    }

    public final F a() {
        return this.b;
    }

    public final S b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        F f = this.b;
        F f2 = dVar.b;
        if (f == f2 || (f != null && f.equals(f2))) {
            S s = this.c;
            S s2 = dVar.c;
            if (s == s2 || (s != null && s.equals(s2))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final String toString() {
        return "{" + this.b + ", " + this.c + "}";
    }
}
