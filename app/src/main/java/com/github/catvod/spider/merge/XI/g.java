package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.y;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g {
    private static Map<String, com.github.catvod.spider.merge.Wb.a> a = new HashMap();
    private static Map<String, com.github.catvod.spider.merge.Wb.d> b = new HashMap();
    private static Map<String, com.github.catvod.spider.merge.Wb.c> c = new HashMap();
    private static i d = j.d(g.class);

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Wb.c>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Wb.a>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Wb.d>] */
    static {
        Class[] clsArr = {com.github.catvod.spider.merge.Xq.a.class, com.github.catvod.spider.merge.Xq.b.class, com.github.catvod.spider.merge.Xq.c.class, com.github.catvod.spider.merge.Xq.d.class, com.github.catvod.spider.merge.Xq.e.class, com.github.catvod.spider.merge.Xq.f.class, com.github.catvod.spider.merge.Xq.g.class, com.github.catvod.spider.merge.Xq.h.class, com.github.catvod.spider.merge.Xq.i.class, com.github.catvod.spider.merge.Xq.j.class, com.github.catvod.spider.merge.Xq.k.class, com.github.catvod.spider.merge.Xq.l.class, com.github.catvod.spider.merge.Xq.m.class, com.github.catvod.spider.merge.Xq.n.class};
        int i = 0;
        for (int i2 = 14; i < i2; i2 = 14) {
            try {
                com.github.catvod.spider.merge.Wb.a aVar = (com.github.catvod.spider.merge.Wb.a) clsArr[i].newInstance();
                a.put(aVar.name(), aVar);
            } catch (Exception e) {
                d.a(p.a(e), e);
            }
            i++;
        }
        Class[] clsArr2 = {com.github.catvod.spider.merge.SE.a.class, com.github.catvod.spider.merge.SE.b.class, com.github.catvod.spider.merge.SE.c.class, com.github.catvod.spider.merge.SE.d.class, com.github.catvod.spider.merge.SE.f.class, com.github.catvod.spider.merge.SE.g.class, com.github.catvod.spider.merge.SE.h.class, com.github.catvod.spider.merge.SE.i.class, com.github.catvod.spider.merge.SE.j.class, com.github.catvod.spider.merge.SE.k.class, com.github.catvod.spider.merge.SE.l.class, com.github.catvod.spider.merge.SE.n.class, com.github.catvod.spider.merge.SE.p.class, com.github.catvod.spider.merge.SE.e.class, com.github.catvod.spider.merge.SE.m.class, com.github.catvod.spider.merge.SE.o.class, com.github.catvod.spider.merge.SE.r.class};
        for (int i3 = 0; i3 < 17; i3++) {
            try {
                com.github.catvod.spider.merge.Wb.c cVar = (com.github.catvod.spider.merge.Wb.c) clsArr2[i3].newInstance();
                c.put(cVar.name(), cVar);
            } catch (Exception e2) {
                d.a(p.a(e2), e2);
            }
        }
        Class[] clsArr3 = {com.github.catvod.spider.merge.ZP.a.class, com.github.catvod.spider.merge.ZP.b.class, com.github.catvod.spider.merge.ZP.c.class, com.github.catvod.spider.merge.ZP.d.class, com.github.catvod.spider.merge.ZP.e.class, com.github.catvod.spider.merge.ZP.g.class};
        for (int i4 = 0; i4 < 6; i4++) {
            try {
                com.github.catvod.spider.merge.Wb.d dVar = (com.github.catvod.spider.merge.Wb.d) clsArr3[i4].newInstance();
                b.put(dVar.name(), dVar);
            } catch (Exception e3) {
                d.a(p.a(e3), e3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Wb.c>] */
    public static com.github.catvod.spider.merge.Wb.c a(String str) {
        com.github.catvod.spider.merge.Wb.c cVar = (com.github.catvod.spider.merge.Wb.c) c.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new com.github.catvod.spider.merge.XU.c(y.a(ZrJ.d("172C3F6D3B300933243F3C651F36252E3C2C162D716D"), str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Wb.d>] */
    public static com.github.catvod.spider.merge.Wb.d b(String str) {
        com.github.catvod.spider.merge.Wb.d dVar = (com.github.catvod.spider.merge.Wb.d) b.get(str);
        if (dVar != null) {
            return dVar;
        }
        throw new com.github.catvod.spider.merge.XU.c(y.a(ZrJ.d("172C3F6D3B300933243F3C65172C2F281C200A37716D"), str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.Wb.a>] */
    public static com.github.catvod.spider.merge.Wb.a c(String str) {
        com.github.catvod.spider.merge.Wb.a aVar = (com.github.catvod.spider.merge.Wb.a) a.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new com.github.catvod.spider.merge.XU.b(y.a(ZrJ.d("172C3F6D3B300933243F3C65183B223E7265"), str));
    }
}
