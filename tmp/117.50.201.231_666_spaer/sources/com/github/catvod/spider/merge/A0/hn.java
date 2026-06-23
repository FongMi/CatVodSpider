package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class hn {
    public static final String[] a;
    public static final hn b;
    public final String[] c;
    public final String[] d;
    public final String[] e;

    static {
        String[] strArr = new String[0];
        a = strArr;
        b = new hn(strArr, strArr, strArr);
    }

    public hn(String[] strArr, String[] strArr2, String[] strArr3) {
        String[] strArr4 = a;
        this.c = strArr;
        this.d = strArr2;
        strArr3 = strArr3 == null ? strArr4 : strArr3;
        this.e = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto Lc
            java.lang.String[] r0 = r2.e
            int r1 = r0.length
            if (r3 >= r1) goto Lc
            r0 = r0[r3]
            if (r0 == 0) goto Lc
            return r0
        Lc:
            if (r3 < 0) goto L16
            java.lang.String[] r0 = r2.c
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
            java.lang.String r0 = r2.g(r3)
            if (r0 == 0) goto L21
            return r0
        L21:
            java.lang.String r3 = java.lang.Integer.toString(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.hn.f(int):java.lang.String");
    }

    public final String g(int i) {
        if (i >= 0) {
            String[] strArr = this.d;
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
