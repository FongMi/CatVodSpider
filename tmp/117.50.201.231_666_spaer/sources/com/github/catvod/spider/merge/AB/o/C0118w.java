package com.github.catvod.spider.merge.AB.o;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0118w {
    private static final char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
    private static final Map<char[], Map<Character, Integer>> b = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    static char b(char[] cArr, Character ch) {
        Map<char[], Map<Character, Integer>> map = b;
        ?? map2 = (Map) map.get(cArr);
        if (map2 == 0) {
            map2 = new HashMap();
            map.put(cArr, (Map<Character, Integer>) map2);
            for (int i = 0; i < cArr.length; i++) {
                map2.put(Character.valueOf(cArr[i]), Integer.valueOf(i));
            }
        }
        return (char) ((Integer) map2.get(ch)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AB.o.C0118w.c(java.lang.String):java.lang.String");
    }
}
