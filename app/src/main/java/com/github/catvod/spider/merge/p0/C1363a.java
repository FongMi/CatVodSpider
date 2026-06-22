package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.m0.C1308c;
import com.github.catvod.spider.merge.q0.h;
import com.github.catvod.spider.merge.r0.C1384c;
import com.github.catvod.spider.merge.r0.InterfaceC1382a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1363a {
    private final C1308c a;

    public C1363a(C1308c c1308c) {
        this.a = c1308c;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0125 A[PHI: r0
      0x0125: PHI (r0v7 java.util.regex.Matcher) = (r0v6 java.util.regex.Matcher), (r0v10 java.util.regex.Matcher), (r0v13 java.util.regex.Matcher) binds: [B:58:0x0101, B:61:0x0112, B:64:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(com.github.catvod.spider.merge.q0.h r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p0.C1363a.a(com.github.catvod.spider.merge.q0.h):java.lang.String");
    }

    private HttpURLConnection c(String str, Map map, boolean z) {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) (this.a.e() != null ? url.openConnection(this.a.e()) : url.openConnection());
        for (Map.Entry entry : ((HashMap) this.a.c()).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (map != null) {
            for (Map.Entry entry2 : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        return httpURLConnection;
    }

    public final InterfaceC1382a b(h hVar) {
        try {
            return C1384c.d(a(hVar));
        } catch (com.github.catvod.spider.merge.m0.h | IOException e) {
            return C1384c.b(e);
        }
    }
}
