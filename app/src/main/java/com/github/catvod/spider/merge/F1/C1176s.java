package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1176s implements CharSequence, Serializable {
    private CharSequence b;
    private CharSequence c;
    private final int d;
    private boolean e;

    public C1176s(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence instanceof String) && !(charSequence instanceof C1176s)) {
            charSequence = charSequence.toString();
        }
        if (!(charSequence2 instanceof String) && !(charSequence2 instanceof C1176s)) {
            charSequence2 = charSequence2.toString();
        }
        this.b = charSequence;
        this.c = charSequence2;
        this.d = this.c.length() + charSequence.length();
        this.e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[Catch: all -> 0x005d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0015, B:8:0x0019, B:10:0x001f, B:11:0x0022, B:17:0x0049, B:12:0x002a, B:15:0x0041, B:18:0x0057), top: B:26:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.lang.String a() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.e     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L57
            int r0 = r6.d     // Catch: java.lang.Throwable -> L5d
            char[] r1 = new char[r0]     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.CharSequence r3 = r6.b     // Catch: java.lang.Throwable -> L5d
            r2.addFirst(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.CharSequence r3 = r6.c     // Catch: java.lang.Throwable -> L5d
        L15:
            boolean r4 = r3 instanceof com.github.catvod.spider.merge.f1.C1176s     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L2a
            com.github.catvod.spider.merge.f1.s r3 = (com.github.catvod.spider.merge.f1.C1176s) r3     // Catch: java.lang.Throwable -> L5d
            boolean r4 = r3.e     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L22
            java.lang.CharSequence r3 = r3.b     // Catch: java.lang.Throwable -> L5d
            goto L2a
        L22:
            java.lang.CharSequence r4 = r3.b     // Catch: java.lang.Throwable -> L5d
            r2.addFirst(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.CharSequence r3 = r3.c     // Catch: java.lang.Throwable -> L5d
            goto L47
        L2a:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5d
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L5d
            int r0 = r0 - r4
            r4 = 0
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L5d
            r3.getChars(r4, r5, r1, r0)     // Catch: java.lang.Throwable -> L5d
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L41
            r3 = 0
            goto L47
        L41:
            java.lang.Object r3 = r2.removeFirst()     // Catch: java.lang.Throwable -> L5d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L5d
        L47:
            if (r3 != 0) goto L15
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            r6.b = r0     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = ""
            r6.c = r0     // Catch: java.lang.Throwable -> L5d
            r0 = 1
            r6.e = r0     // Catch: java.lang.Throwable -> L5d
        L57:
            java.lang.CharSequence r0 = r6.b     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            return r0
        L5d:
            r0 = move-exception
            monitor-exit(r6)
            goto L61
        L60:
            throw r0
        L61:
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1176s.a():java.lang.String");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return (this.e ? (String) this.b : a()).charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return (this.e ? (String) this.b : a()).substring(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e ? (String) this.b : a();
    }
}
