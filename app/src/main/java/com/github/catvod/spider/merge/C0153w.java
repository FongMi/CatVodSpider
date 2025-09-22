package com.github.catvod.spider.merge;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.github.catvod.spider.merge.w */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0153w {

    /* renamed from: q */
    public static C0153w f749q = new C0153w();

    /* renamed from: com.github.catvod.spider.merge.w$p */
    static class p implements Callable<String> {

        /* renamed from: q */
        final /* synthetic */ String f750q;

        /* renamed from: xC */
        final /* synthetic */ StringBuilder f751xC;

        p(String str, StringBuilder sb) {
            this.f750q = str;
            this.f751xC = sb;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String call() throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
                java.lang.String r2 = r5.f750q     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
                java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
                r1.connect()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
                java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
            L1d:
                java.lang.String r0 = r1.readLine()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                if (r0 == 0) goto L29
                java.lang.StringBuilder r3 = r5.f751xC     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                r3.append(r0)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                goto L1d
            L29:
                java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                java.lang.StringBuilder r3 = r5.f751xC     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                r0.println(r3)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                r1.close()     // Catch: java.io.IOException -> L5e
                r2.close()     // Catch: java.io.IOException -> L5e
                goto L62
            L3b:
                r0 = move-exception
                goto L50
            L3d:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
                goto L6a
            L42:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
                goto L50
            L47:
                r1 = move-exception
                r2 = r0
                r0 = r1
                r1 = r2
                goto L6a
            L4c:
                r1 = move-exception
                r2 = r0
                r0 = r1
                r1 = r2
            L50:
                r0.printStackTrace()     // Catch: java.lang.Throwable -> L69
                if (r1 == 0) goto L62
                r1.close()     // Catch: java.io.IOException -> L5e
                if (r2 == 0) goto L62
                r2.close()     // Catch: java.io.IOException -> L5e
                goto L62
            L5e:
                r0 = move-exception
                r0.printStackTrace()
            L62:
                java.lang.StringBuilder r0 = r5.f751xC
                java.lang.String r0 = r0.toString()
                return r0
            L69:
                r0 = move-exception
            L6a:
                if (r1 == 0) goto L79
                r1.close()     // Catch: java.io.IOException -> L75
                if (r2 == 0) goto L79
                r2.close()     // Catch: java.io.IOException -> L75
                goto L79
            L75:
                r1 = move-exception
                r1.printStackTrace()
            L79:
                goto L7b
            L7a:
                throw r0
            L7b:
                goto L7a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0153w.p.call():java.lang.String");
        }
    }

    /* renamed from: q */
    public static String m735q(String str) {
        FutureTask futureTask = new FutureTask(new p(str, new StringBuilder()));
        new Thread(futureTask).start();
        try {
            return (String) futureTask.get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
