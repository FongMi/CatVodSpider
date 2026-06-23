package com.github.catvod.spider.merge.D;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0600a {
    private final com.github.catvod.spider.merge.H.e[] a;
    private final String b;
    private final d0 c;
    private final boolean d;
    private Map<String, Integer> e = new HashMap();
    private int f = 9;
    private final boolean g;

    public C0600a(com.github.catvod.spider.merge.H.e[] eVarArr, d0 d0Var, String str, boolean z, boolean z2) {
        this.a = eVarArr;
        this.b = str;
        this.c = d0Var;
        this.d = z;
        this.g = z2 || d0Var.a.isEnum();
    }

    public final int f(String str) {
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            if (this.a[i].b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public final int g(String str) {
        if (((Integer) this.e.get(str)) == null) {
            Map<String, Integer> r0 = this.e;
            int i = this.f;
            this.f = i + 1;
            r0.put(str, Integer.valueOf(i));
        }
        return ((Integer) this.e.get(str)).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public final int h(String str) {
        if (((Integer) this.e.get(str)) == null) {
            this.e.put(str, Integer.valueOf(this.f));
            this.f += 2;
        }
        return ((Integer) this.e.get(str)).intValue();
    }
}
