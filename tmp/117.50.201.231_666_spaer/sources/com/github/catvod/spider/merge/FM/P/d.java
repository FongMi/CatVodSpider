package com.github.catvod.spider.merge.FM.p;

import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class d {
    private String a;
    private Object b;
    private final Map<String, String> c;
    private final Map<String, String> d;
    private final AbstractC0401c e;
    private Request f;
    private Request.Builder g;

    d(String str, String str2, String str3, Map<String, String> map, AbstractC0401c abstractC0401c) {
        this(str, str2, str3, null, map, abstractC0401c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private d(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6, java.util.Map<java.lang.String, java.lang.String> r7, com.github.catvod.spider.merge.FM.p.AbstractC0401c r8) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.p.d.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, com.github.catvod.spider.merge.FM.p.c):void");
    }

    d(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC0401c abstractC0401c) {
        this(str, str2, null, map, map2, abstractC0401c);
    }

    final void a(OkHttpClient okHttpClient) {
        Call callNewCall = okHttpClient.newCall(this.f);
        try {
            Response responseExecute = callNewCall.execute();
            AbstractC0401c abstractC0401c = this.e;
            if (abstractC0401c != null) {
                abstractC0401c.c(callNewCall, responseExecute);
            }
        } catch (IOException e) {
            AbstractC0401c abstractC0401c2 = this.e;
            if (abstractC0401c2 != null) {
                abstractC0401c2.onError(callNewCall, e);
            }
        }
    }

    public final void b(Object obj) {
        this.b = obj;
    }
}
