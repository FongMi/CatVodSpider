package com.github.catvod.spider.merge.D;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c0 {
    public final c0 a;
    public final Object b;
    public final Object c;
    public final int d;

    public c0(c0 c0Var, Object obj, Object obj2, int i) {
        this.a = c0Var;
        this.b = obj;
        this.c = obj2;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(java.lang.StringBuilder r13) {
        /*
            r12 = this;
            com.github.catvod.spider.merge.D.c0 r0 = r12.a
            if (r0 != 0) goto L7
            r0 = 36
            goto L28
        L7:
            r0.a(r13)
            java.lang.Object r0 = r12.c
            if (r0 != 0) goto L12
            java.lang.String r0 = ".null"
            goto L99
        L12:
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L2d
            r0 = 91
            r13.append(r0)
            java.lang.Object r0 = r12.c
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13.append(r0)
            r0 = 93
        L28:
            r13.append(r0)
            goto L9c
        L2d:
            r0 = 46
            r13.append(r0)
            java.lang.Object r0 = r12.c
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 0
        L3a:
            int r3 = r0.length()
            r4 = 122(0x7a, float:1.71E-43)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 90
            r7 = 97
            r8 = 57
            r9 = 65
            r10 = 48
            if (r2 >= r3) goto L65
            char r3 = r0.charAt(r2)
            if (r3 < r10) goto L56
            if (r3 <= r8) goto L60
        L56:
            if (r3 < r9) goto L5a
            if (r3 <= r6) goto L60
        L5a:
            if (r3 < r7) goto L5e
            if (r3 <= r4) goto L60
        L5e:
            if (r3 <= r5) goto L63
        L60:
            int r2 = r2 + 1
            goto L3a
        L63:
            r2 = 1
            goto L66
        L65:
            r2 = 0
        L66:
            if (r2 == 0) goto L99
        L68:
            int r2 = r0.length()
            if (r1 >= r2) goto L9c
            char r2 = r0.charAt(r1)
            r3 = 92
            if (r2 != r3) goto L77
            goto L8a
        L77:
            if (r2 < r10) goto L7b
            if (r2 <= r8) goto L93
        L7b:
            if (r2 < r9) goto L7f
            if (r2 <= r6) goto L93
        L7f:
            if (r2 < r7) goto L83
            if (r2 <= r4) goto L93
        L83:
            if (r2 <= r5) goto L86
            goto L93
        L86:
            r11 = 34
            if (r2 != r11) goto L8d
        L8a:
            r13.append(r3)
        L8d:
            r13.append(r3)
            r13.append(r3)
        L93:
            r13.append(r2)
            int r1 = r1 + 1
            goto L68
        L99:
            r13.append(r0)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.c0.a(java.lang.StringBuilder):void");
    }

    public final String toString() {
        if (this.a == null) {
            return "$";
        }
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }
}
