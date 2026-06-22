package com.github.catvod.spider.merge;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class eE {
    public static eE l8 = new eE();

    static class aA implements Callable<String> {
        final /* synthetic */ StringBuilder S;
        final /* synthetic */ String l8;

        aA(String str, StringBuilder sb) {
            this.l8 = str;
            this.S = sb;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: l8, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String call() throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
                java.lang.String r2 = r5.l8     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
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
                java.lang.StringBuilder r3 = r5.S     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                r3.append(r0)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                goto L1d
            L29:
                java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
                java.lang.StringBuilder r3 = r5.S     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L69
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
                java.lang.StringBuilder r0 = r5.S
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
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.eE.aA.call():java.lang.String");
        }
    }

    public static String l8(String str) {
        FutureTask futureTask = new FutureTask(new aA(str, new StringBuilder()));
        new Thread(futureTask).start();
        try {
            return (String) futureTask.get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
