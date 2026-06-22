package com.github.catvod.spider.merge.q;

import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class d {
    private String a;
    private Object b;
    private final Map<String, String> c;
    private final Map<String, String> d;
    private final AbstractC0224c e;
    private Request f;
    private Request.Builder g;

    d(String str, String str2, String str3, Map<String, String> map, AbstractC0224c abstractC0224c) {
        this(str, str2, str3, null, map, abstractC0224c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private d(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6, java.util.Map<java.lang.String, java.lang.String> r7, com.github.catvod.spider.merge.q.AbstractC0224c r8) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.q.d.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, com.github.catvod.spider.merge.q.c):void");
    }

    d(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC0224c abstractC0224c) {
        this(str, str2, null, map, map2, abstractC0224c);
    }

    final void a(OkHttpClient okHttpClient) {
        Call callNewCall = okHttpClient.newCall(this.f);
        try {
            Response responseExecute = callNewCall.execute();
            AbstractC0224c abstractC0224c = this.e;
            if (abstractC0224c != null) {
                abstractC0224c.c(callNewCall, responseExecute);
            }
        } catch (IOException e) {
            AbstractC0224c abstractC0224c2 = this.e;
            if (abstractC0224c2 != null) {
                abstractC0224c2.onError(callNewCall, e);
            }
        }
    }

    public final void b(Object obj) {
        this.b = obj;
    }
}
