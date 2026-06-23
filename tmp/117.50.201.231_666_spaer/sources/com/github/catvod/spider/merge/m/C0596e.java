package com.github.catvod.spider.merge.m;

import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0596e {
    private static char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
    private static char[] b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+-$".toCharArray();
    private static HashMap<char[], HashMap<Character, Integer>> c = new HashMap<>();

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.e$a */
    final class a extends b {
        final /* synthetic */ char[] a;

        a(char[] cArr) {
            this.a = cArr;
        }

        public final Character a(int i) {
            return Character.valueOf(C0596e.b(C0596e.a, Character.valueOf(this.a[i])));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.e$b */
    private static abstract class b {
        b() {
        }
    }

    static {
        char[][] cArr = {a, b};
        for (int i = 0; i < 2; i++) {
            char[] cArr2 = cArr[i];
            if (c.get(cArr2) == null) {
                HashMap<Character, Integer> map = new HashMap<>();
                c.put(cArr2, map);
                for (int i2 = 0; i2 < cArr2.length; i2++) {
                    map.put(Character.valueOf(cArr2[i2]), Integer.valueOf(i2));
                }
            }
        }
    }

    static char b(char[] cArr, Character ch) {
        return (char) c.get(cArr).get(ch).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.m.C0596e.c(java.lang.String):java.lang.String");
    }
}
