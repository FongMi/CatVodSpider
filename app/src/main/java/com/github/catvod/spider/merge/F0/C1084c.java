package com.github.catvod.spider.merge.f0;

import okhttp3.Interceptor;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1084c implements Interceptor {
    C1084c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r11) throws java.io.IOException {
        /*
            r10 = this;
            okhttp3.Request r0 = r11.request()
            okhttp3.Request$Builder r1 = r0.newBuilder()
            java.lang.String r2 = "Referer"
            r0.header(r2)
            okhttp3.Request r0 = r1.build()
            r1 = 0
            r2 = 0
            r3 = r2
        L14:
            long r4 = (long) r1
            r6 = 3
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L55
            if (r1 <= 0) goto L22
            r8 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r8)     // Catch: java.lang.InterruptedException -> L3c java.io.IOException -> L4c
        L22:
            okhttp3.Response r2 = r11.proceed(r0)     // Catch: java.lang.InterruptedException -> L3c java.io.IOException -> L4c
            int r8 = r2.code()     // Catch: java.lang.InterruptedException -> L3c java.io.IOException -> L4c
            r9 = 500(0x1f4, float:7.0E-43)
            if (r8 < r9) goto L3b
            r9 = 600(0x258, float:8.41E-43)
            if (r8 >= r9) goto L3b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L37
            goto L3b
        L37:
            r2.close()     // Catch: java.lang.InterruptedException -> L3c java.io.IOException -> L4c
            goto L52
        L3b:
            return r2
        L3c:
            r11 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Retry interrupted"
            r0.<init>(r1, r11)
            throw r0
        L4c:
            r3 = move-exception
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L55
        L52:
            int r1 = r1 + 1
            goto L14
        L55:
            if (r3 != 0) goto L58
            return r2
        L58:
            goto L5a
        L59:
            throw r3
        L5a:
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f0.C1084c.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
