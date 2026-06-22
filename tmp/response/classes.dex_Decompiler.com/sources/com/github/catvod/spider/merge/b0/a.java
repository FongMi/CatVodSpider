package com.github.catvod.spider.merge.b0;

import com.github.catvod.spider.merge.W.c;
import com.github.catvod.spider.merge.W.d;
import com.github.catvod.spider.merge.X.e;
import com.github.catvod.spider.merge.X.f;
import com.github.catvod.spider.merge.X.g;
import com.github.catvod.spider.merge.X.h;
import com.github.catvod.spider.merge.X.i;
import com.github.catvod.spider.merge.X.j;
import com.github.catvod.spider.merge.X.k;
import com.github.catvod.spider.merge.X.l;
import com.github.catvod.spider.merge.X.m;
import com.github.catvod.spider.merge.X.n;
import com.github.catvod.spider.merge.Y.o;
import com.github.catvod.spider.merge.Y.p;
import com.github.catvod.spider.merge.Y.r;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c0.b;
import com.github.catvod.spider.merge.oZP;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class a {
    private static Map<String, com.github.catvod.spider.merge.W.a> a = new HashMap();
    private static Map<String, d> b = new HashMap();
    private static Map<String, c> c = new HashMap();
    private static b d = com.github.catvod.spider.merge.c0.c.d(a.class);

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.c>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.a>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.d>] */
    static {
        Class[] clsArr = {com.github.catvod.spider.merge.X.a.class, com.github.catvod.spider.merge.X.b.class, com.github.catvod.spider.merge.X.c.class, com.github.catvod.spider.merge.X.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, l.class, m.class, n.class};
        int i = 0;
        for (int i2 = 14; i < i2; i2 = 14) {
            try {
                com.github.catvod.spider.merge.W.a aVar = (com.github.catvod.spider.merge.W.a) clsArr[i].newInstance();
                a.put(aVar.name(), aVar);
            } catch (Exception e) {
                d.a(com.github.catvod.spider.merge.F.a.a(e), e);
            }
            i++;
        }
        Class[] clsArr2 = {com.github.catvod.spider.merge.Y.a.class, com.github.catvod.spider.merge.Y.b.class, com.github.catvod.spider.merge.Y.c.class, com.github.catvod.spider.merge.Y.d.class, com.github.catvod.spider.merge.Y.f.class, com.github.catvod.spider.merge.Y.g.class, com.github.catvod.spider.merge.Y.h.class, com.github.catvod.spider.merge.Y.i.class, com.github.catvod.spider.merge.Y.j.class, com.github.catvod.spider.merge.Y.k.class, com.github.catvod.spider.merge.Y.l.class, com.github.catvod.spider.merge.Y.n.class, p.class, com.github.catvod.spider.merge.Y.e.class, com.github.catvod.spider.merge.Y.m.class, o.class, r.class};
        for (int i3 = 0; i3 < 17; i3++) {
            try {
                c cVar = (c) clsArr2[i3].newInstance();
                c.put(cVar.name(), cVar);
            } catch (Exception e2) {
                d.a(com.github.catvod.spider.merge.F.a.a(e2), e2);
            }
        }
        Class[] clsArr3 = {com.github.catvod.spider.merge.Z.a.class, com.github.catvod.spider.merge.Z.b.class, com.github.catvod.spider.merge.Z.c.class, com.github.catvod.spider.merge.Z.d.class, com.github.catvod.spider.merge.Z.e.class, com.github.catvod.spider.merge.Z.g.class};
        for (int i4 = 0; i4 < 6; i4++) {
            try {
                d dVar = (d) clsArr3[i4].newInstance();
                b.put(dVar.name(), dVar);
            } catch (Exception e3) {
                d.a(com.github.catvod.spider.merge.F.a.a(e3), e3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.c>] */
    public static c a(String str) {
        c cVar = (c) c.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new com.github.catvod.spider.merge.a0.c(y.a(oZP.d("1B0003611F20051F18331875131A1922183C1A014D61"), str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.d>] */
    public static d b(String str) {
        d dVar = (d) b.get(str);
        if (dVar != null) {
            return dVar;
        }
        throw new com.github.catvod.spider.merge.a0.c(y.a(oZP.d("1B0003611F20051F183318751B0013243830061B4D61"), str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.W.a>] */
    public static com.github.catvod.spider.merge.W.a c(String str) {
        com.github.catvod.spider.merge.W.a aVar = (com.github.catvod.spider.merge.W.a) a.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new com.github.catvod.spider.merge.a0.b(y.a(oZP.d("1B0003611F20051F1833187514171E325675"), str));
    }
}
