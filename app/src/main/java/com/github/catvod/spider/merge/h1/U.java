package com.github.catvod.spider.merge.h1;

import com.github.catvod.spider.merge.f1.C1162n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class U extends E {
    protected Map<String, Z> r;
    protected U s;
    protected V t;
    private List<U> u;

    public U() {
        this.b = 133;
    }

    public U(int i) {
        this.b = 133;
        this.i = i;
    }

    private Map<String, Z> n0() {
        if (this.r == null) {
            this.r = new LinkedHashMap(5);
        }
        return this.r;
    }

    public static void s0(U u, U u2) {
        Map<String, Z> mapN0 = u.n0();
        Map<String, Z> mapN02 = u2.n0();
        if (!Collections.disjoint(mapN0.keySet(), mapN02.keySet())) {
            C1162n0.c();
            throw null;
        }
        for (Map.Entry<String, Z> entry : mapN0.entrySet()) {
            Z value = entry.getValue();
            value.e(u2);
            mapN02.put(entry.getKey(), value);
        }
    }

    public static U x0(U u) {
        U u2 = new U(u.v());
        u2.r = u.r;
        u.r = null;
        u2.k = u.k;
        u2.v0(u.s);
        u2.v0(u2);
        u.k = u2;
        u2.t = u.t;
        return u2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.U>] */
    public final void m0(U u) {
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(u);
        u.v0(this);
    }

    public final U o0(String str) {
        for (U u = this; u != null; u = u.s) {
            Map<String, Z> map = u.r;
            if (map != null && map.containsKey(str)) {
                return u;
            }
        }
        return null;
    }

    public final U p0() {
        return this.s;
    }

    public final Z q0(String str) {
        Map<String, Z> map = this.r;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final Map<String, Z> r0() {
        return this.r;
    }

    public final void t0(Z z) {
        if (z.d() == null) {
            throw new IllegalArgumentException("null symbol name");
        }
        n0();
        this.r.put(z.d(), z);
        z.e(this);
        this.t.A0(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.U>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.U>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.U>] */
    public final void u0(U u) {
        Object r0 = this.u;
        if (r0 != 0) {
            for (U u2 : r0) {
                if (u.u == null) {
                    u.u = new ArrayList();
                }
                u.u.add(u2);
                u2.v0(u);
            }
            this.u.clear();
            this.u = null;
        }
        Map<String, Z> map = this.r;
        if (map == null || map.isEmpty()) {
            return;
        }
        s0(this, u);
    }

    public final void v0(U u) {
        this.s = u;
        this.t = u == null ? (V) this : u.t;
    }

    public final void w0() {
        this.r = null;
    }
}
