package com.github.catvod.spider.merge.z;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class x implements w {
    public static final String[] d;
    public static final x e;
    public final String[] a;
    public final String[] b;
    public final String[] c;

    static {
        String[] strArr = new String[0];
        d = strArr;
        e = new x(strArr, strArr, strArr);
    }

    public x(String[] strArr, String[] strArr2, String[] strArr3) {
        String[] strArr4 = d;
        this.a = strArr;
        this.b = strArr2;
        strArr3 = strArr3 == null ? strArr4 : strArr3;
        this.c = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto Lc
            java.lang.String[] r0 = r2.c
            int r1 = r0.length
            if (r3 >= r1) goto Lc
            r0 = r0[r3]
            if (r0 == 0) goto Lc
            return r0
        Lc:
            if (r3 < 0) goto L16
            java.lang.String[] r0 = r2.a
            int r1 = r0.length
            if (r3 >= r1) goto L16
            r0 = r0[r3]
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1a
            return r0
        L1a:
            java.lang.String r0 = r2.b(r3)
            if (r0 == 0) goto L21
            return r0
        L21:
            java.lang.String r3 = java.lang.Integer.toString(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.z.x.a(int):java.lang.String");
    }

    public final String b(int i) {
        if (i >= 0) {
            String[] strArr = this.b;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }
}
