package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.l.C1290c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0596b {
    private int a;
    private final Map<String, Integer> b = new HashMap();
    private final Class<?> c;
    private final com.github.catvod.spider.merge.H.l d;
    private final String e;
    private com.github.catvod.spider.merge.H.e[] f;

    public C0596b(String str, com.github.catvod.spider.merge.H.l lVar, int i) {
        this.a = -1;
        this.e = str;
        this.c = lVar.a;
        this.a = i;
        this.d = lVar;
        this.f = lVar.h;
    }

    public final String g(com.github.catvod.spider.merge.H.e eVar) {
        StringBuilder sbB;
        if (j(eVar.b)) {
            sbB = new StringBuilder();
            sbB.append(eVar.b);
            sbB.append("_asm_deser__");
        } else {
            sbB = t0.b("_asm_deser__");
            sbB.append(com.github.catvod.spider.merge.H.A.A(eVar.b));
        }
        return sbB.toString();
    }

    public final String h(com.github.catvod.spider.merge.H.e eVar) {
        StringBuilder sbB;
        if (j(eVar.b)) {
            sbB = new StringBuilder();
            sbB.append(eVar.b);
            sbB.append("_asm_prefix__");
        } else {
            sbB = t0.b("asm_field_");
            sbB.append(com.github.catvod.spider.merge.H.A.A(eVar.b));
        }
        return sbB.toString();
    }

    public final Class<?> i() {
        Class<?> cls = this.d.b;
        return cls == null ? this.c : cls;
    }

    final boolean j(String str) {
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                return true;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == 0) {
                boolean[] zArr = com.github.catvod.spider.merge.H.i.c;
                if (!(cCharAt < zArr.length && zArr[cCharAt])) {
                    return false;
                }
            } else {
                boolean[] zArr2 = com.github.catvod.spider.merge.H.i.d;
                if (!(cCharAt < zArr2.length && zArr2[cCharAt])) {
                    return false;
                }
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public final int k(String str) {
        if (((Integer) this.b.get(str)) == null) {
            ?? r0 = this.b;
            int i = this.a;
            this.a = i + 1;
            r0.put(str, Integer.valueOf(i));
        }
        return ((Integer) this.b.get(str)).intValue();
    }

    public final int l(com.github.catvod.spider.merge.H.e eVar) {
        return k(C1290c.b(new StringBuilder(), eVar.b, "_asm"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public final int m(com.github.catvod.spider.merge.H.e eVar) {
        String strB = C1290c.b(new StringBuilder(), eVar.b, "_asm");
        if (((Integer) this.b.get(strB)) == null) {
            this.b.put(strB, Integer.valueOf(this.a));
            this.a += 2;
        }
        return ((Integer) this.b.get(strB)).intValue();
    }
}
