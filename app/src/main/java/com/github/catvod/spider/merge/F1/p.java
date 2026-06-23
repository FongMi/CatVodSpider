package com.github.catvod.spider.merge.F1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p {
    private static final Map<String, String> a = new HashMap();
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static com.github.catvod.spider.merge.p1.i f;
    private static com.github.catvod.spider.merge.p1.i g;

    public static String a(String str, String str2) {
        com.github.catvod.spider.merge.p1.i iVar = g;
        if (iVar != null) {
            throw iVar;
        }
        if (b == null) {
            b = o.c(str);
        }
        if (c == null) {
            try {
                c = D.b(b);
            } catch (com.github.catvod.spider.merge.p1.i e2) {
                g = e2;
                throw e2;
            } catch (Exception e3) {
                g = new com.github.catvod.spider.merge.p1.i("Could not get signature parameter deobfuscation JavaScript function", e3);
                throw e3;
            }
        }
        try {
            String strF = com.github.catvod.spider.merge.L1.l.f(c, "deobfuscate", str2);
            return strF != null ? strF : "";
        } catch (Exception e4) {
            throw new com.github.catvod.spider.merge.p1.i("Could not run signature parameter deobfuscation JavaScript function", e4);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public static String b(String str, String str2) throws Exception {
        String strC = F.c(str2);
        if (strC == null) {
            return str2;
        }
        Object r1 = a;
        CharSequence charSequence = (String) r1.get(strC);
        if (charSequence != null) {
            return str2.replace(strC, charSequence);
        }
        if (b == null) {
            b = o.c(str);
        }
        com.github.catvod.spider.merge.p1.i iVar = f;
        if (iVar != null) {
            throw iVar;
        }
        if (e == null) {
            try {
                String strB = F.b(b);
                d = strB;
                e = F.a(b, strB);
            } catch (com.github.catvod.spider.merge.p1.i e2) {
                f = e2;
                throw e2;
            } catch (Exception e3) {
                f = new com.github.catvod.spider.merge.p1.i("Could not get throttling parameter deobfuscation JavaScript function", e3);
                throw e3;
            }
        }
        try {
            String strF = com.github.catvod.spider.merge.L1.l.f(e, d, strC);
            if (com.github.catvod.spider.merge.L1.m.j(strF)) {
                throw new IllegalStateException("Extracted n-parameter is empty");
            }
            r1.put(strC, strF);
            return str2.replace(strC, strF);
        } catch (Exception e4) {
            throw new com.github.catvod.spider.merge.p1.i("Could not run throttling parameter deobfuscation JavaScript function", e4);
        }
    }
}
