package com.github.catvod.spider.merge.FM.a0;

import com.github.catvod.spider.merge.FM.V.c;
import com.github.catvod.spider.merge.FM.V.d;
import com.github.catvod.spider.merge.FM.W.e;
import com.github.catvod.spider.merge.FM.W.f;
import com.github.catvod.spider.merge.FM.W.g;
import com.github.catvod.spider.merge.FM.W.h;
import com.github.catvod.spider.merge.FM.W.i;
import com.github.catvod.spider.merge.FM.W.j;
import com.github.catvod.spider.merge.FM.W.k;
import com.github.catvod.spider.merge.FM.W.l;
import com.github.catvod.spider.merge.FM.W.m;
import com.github.catvod.spider.merge.FM.W.n;
import com.github.catvod.spider.merge.FM.X.o;
import com.github.catvod.spider.merge.FM.X.p;
import com.github.catvod.spider.merge.FM.X.r;
import com.github.catvod.spider.merge.FM.b0.b;
import com.github.catvod.spider.merge.FM.g.C0354j;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {
    private static Map<String, com.github.catvod.spider.merge.FM.V.a> a = new HashMap();
    private static Map<String, d> b = new HashMap();
    private static Map<String, c> c = new HashMap();
    private static b d = com.github.catvod.spider.merge.FM.b0.c.d(a.class);

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.V.c>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.V.a>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.V.d>] */
    static {
        Class[] clsArr = {com.github.catvod.spider.merge.FM.W.a.class, com.github.catvod.spider.merge.FM.W.b.class, com.github.catvod.spider.merge.FM.W.c.class, com.github.catvod.spider.merge.FM.W.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, l.class, m.class, n.class};
        int i = 0;
        for (int i2 = 14; i < i2; i2 = 14) {
            try {
                com.github.catvod.spider.merge.FM.V.a aVar = (com.github.catvod.spider.merge.FM.V.a) clsArr[i].newInstance();
                a.put(aVar.name(), aVar);
            } catch (Exception e) {
                d.a(com.github.catvod.spider.merge.FM.E.a.c(e), e);
            }
            i++;
        }
        Class[] clsArr2 = {com.github.catvod.spider.merge.FM.X.a.class, com.github.catvod.spider.merge.FM.X.b.class, com.github.catvod.spider.merge.FM.X.c.class, com.github.catvod.spider.merge.FM.X.d.class, com.github.catvod.spider.merge.FM.X.f.class, com.github.catvod.spider.merge.FM.X.g.class, com.github.catvod.spider.merge.FM.X.h.class, com.github.catvod.spider.merge.FM.X.i.class, com.github.catvod.spider.merge.FM.X.j.class, com.github.catvod.spider.merge.FM.X.k.class, com.github.catvod.spider.merge.FM.X.l.class, com.github.catvod.spider.merge.FM.X.n.class, p.class, com.github.catvod.spider.merge.FM.X.e.class, com.github.catvod.spider.merge.FM.X.m.class, o.class, r.class};
        for (int i3 = 0; i3 < 17; i3++) {
            try {
                c cVar = (c) clsArr2[i3].newInstance();
                c.put(cVar.name(), cVar);
            } catch (Exception e2) {
                d.a(com.github.catvod.spider.merge.FM.E.a.c(e2), e2);
            }
        }
        Class[] clsArr3 = {com.github.catvod.spider.merge.FM.Y.a.class, com.github.catvod.spider.merge.FM.Y.b.class, com.github.catvod.spider.merge.FM.Y.c.class, com.github.catvod.spider.merge.FM.Y.d.class, com.github.catvod.spider.merge.FM.Y.e.class, com.github.catvod.spider.merge.FM.Y.g.class};
        for (int i4 = 0; i4 < 6; i4++) {
            try {
                d dVar = (d) clsArr3[i4].newInstance();
                b.put(dVar.name(), dVar);
            } catch (Exception e3) {
                d.a(com.github.catvod.spider.merge.FM.E.a.c(e3), e3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.V.c>] */
    public static c a(String str) {
        c cVar = (c) c.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new com.github.catvod.spider.merge.FM.Z.c(C0354j.b("not support function: ", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.V.d>] */
    public static d b(String str) {
        d dVar = (d) b.get(str);
        if (dVar != null) {
            return dVar;
        }
        throw new com.github.catvod.spider.merge.FM.Z.c(C0354j.b("not support nodeTest: ", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.V.a>] */
    public static com.github.catvod.spider.merge.FM.V.a c(String str) {
        com.github.catvod.spider.merge.FM.V.a aVar = (com.github.catvod.spider.merge.FM.V.a) a.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new com.github.catvod.spider.merge.FM.Z.b(C0354j.b("not support axis: ", str));
    }
}
