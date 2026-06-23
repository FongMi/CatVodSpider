package com.github.catvod.spider.merge.i0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {
    private static final char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
    private static final Map<char[], Map<Character, Integer>> b = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    static char b(char[] cArr, Character ch) {
        Map<char[], Map<Character, Integer>> map = b;
        Object map2 = (Map) map.get(cArr);
        if (map2 == 0) {
            map2 = new HashMap();
            map.put(cArr, (Map<Character, Integer>) map2);
            for (int i = 0; i < cArr.length; i++) {
                map2.put(Character.valueOf(cArr[i]), Integer.valueOf(i));
            }
        }
        return (char) ((Integer) map2.get(ch)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.i0.b.c(java.lang.String):java.lang.String");
    }
}
