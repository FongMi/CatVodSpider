package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.L.c;
import com.github.catvod.spider.merge.L.d;
import com.github.catvod.spider.merge.M.e;
import com.github.catvod.spider.merge.M.f;
import com.github.catvod.spider.merge.M.g;
import com.github.catvod.spider.merge.M.h;
import com.github.catvod.spider.merge.M.i;
import com.github.catvod.spider.merge.M.j;
import com.github.catvod.spider.merge.M.k;
import com.github.catvod.spider.merge.M.l;
import com.github.catvod.spider.merge.M.m;
import com.github.catvod.spider.merge.M.n;
import com.github.catvod.spider.merge.N.o;
import com.github.catvod.spider.merge.N.p;
import com.github.catvod.spider.merge.N.r;
import com.github.catvod.spider.merge.R.b;
import com.github.catvod.spider.merge.a.C0531c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {
    private static Map<String, com.github.catvod.spider.merge.L.a> a = new HashMap();
    private static Map<String, d> b = new HashMap();
    private static Map<String, c> c = new HashMap();
    private static b d = com.github.catvod.spider.merge.R.c.d(a.class);

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.L.c>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.L.a>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.L.d>] */
    static {
        Class[] clsArr = {com.github.catvod.spider.merge.M.a.class, com.github.catvod.spider.merge.M.b.class, com.github.catvod.spider.merge.M.c.class, com.github.catvod.spider.merge.M.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, l.class, m.class, n.class};
        int i = 0;
        for (int i2 = 14; i < i2; i2 = 14) {
            try {
                com.github.catvod.spider.merge.L.a aVar = (com.github.catvod.spider.merge.L.a) clsArr[i].newInstance();
                a.put(aVar.name(), aVar);
            } catch (Exception e) {
                d.a(com.github.catvod.spider.merge.A.a.b(e), e);
            }
            i++;
        }
        Class[] clsArr2 = {com.github.catvod.spider.merge.N.a.class, com.github.catvod.spider.merge.N.b.class, com.github.catvod.spider.merge.N.c.class, com.github.catvod.spider.merge.N.d.class, com.github.catvod.spider.merge.N.f.class, com.github.catvod.spider.merge.N.g.class, com.github.catvod.spider.merge.N.h.class, com.github.catvod.spider.merge.N.i.class, com.github.catvod.spider.merge.N.j.class, com.github.catvod.spider.merge.N.k.class, com.github.catvod.spider.merge.N.l.class, com.github.catvod.spider.merge.N.n.class, p.class, com.github.catvod.spider.merge.N.e.class, com.github.catvod.spider.merge.N.m.class, o.class, r.class};
        for (int i3 = 0; i3 < 17; i3++) {
            try {
                c cVar = (c) clsArr2[i3].newInstance();
                c.put(cVar.name(), cVar);
            } catch (Exception e2) {
                d.a(com.github.catvod.spider.merge.A.a.b(e2), e2);
            }
        }
        Class[] clsArr3 = {com.github.catvod.spider.merge.O.a.class, com.github.catvod.spider.merge.O.b.class, com.github.catvod.spider.merge.O.c.class, com.github.catvod.spider.merge.O.d.class, com.github.catvod.spider.merge.O.e.class, com.github.catvod.spider.merge.O.f.class};
        for (int i4 = 0; i4 < 6; i4++) {
            try {
                d dVar = (d) clsArr3[i4].newInstance();
                b.put(dVar.name(), dVar);
            } catch (Exception e3) {
                d.a(com.github.catvod.spider.merge.A.a.b(e3), e3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.L.c>] */
    public static c a(String str) {
        c cVar = (c) c.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new com.github.catvod.spider.merge.P.c(C0531c.a("not support function: ", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.L.d>] */
    public static d b(String str) {
        d dVar = (d) b.get(str);
        if (dVar != null) {
            return dVar;
        }
        throw new com.github.catvod.spider.merge.P.c(C0531c.a("not support nodeTest: ", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.L.a>] */
    public static com.github.catvod.spider.merge.L.a c(String str) {
        com.github.catvod.spider.merge.L.a aVar = (com.github.catvod.spider.merge.L.a) a.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new com.github.catvod.spider.merge.P.b(C0531c.a("not support axis: ", str));
    }
}
