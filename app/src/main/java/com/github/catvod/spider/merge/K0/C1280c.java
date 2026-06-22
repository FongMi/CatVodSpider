package com.github.catvod.spider.merge.k0;

import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1280c {
    private String a;
    private Object b = null;
    private final Map<String, String> c = null;
    private final Map<String, String> d;
    private final AbstractC1279b e;
    private Request f;
    private Request.Builder g;

    C1280c(String str, Map map, AbstractC1279b abstractC1279b) {
        this.a = str;
        this.d = map;
        this.e = abstractC1279b;
        Request.Builder builder = new Request.Builder();
        this.g = builder;
        builder.url(this.a);
        Object obj = this.b;
        if (obj != null) {
            this.g.tag(obj);
        }
        for (String str2 : map.keySet()) {
            this.g.addHeader(str2, this.d.get(str2));
        }
        this.f = this.g.build();
    }

    final void a(OkHttpClient okHttpClient) {
        Call callNewCall = okHttpClient.newCall(this.f);
        try {
            Response responseExecute = callNewCall.execute();
            AbstractC1279b abstractC1279b = this.e;
            if (abstractC1279b != null) {
                abstractC1279b.c(callNewCall, responseExecute);
            }
        } catch (IOException e) {
            AbstractC1279b abstractC1279b2 = this.e;
            if (abstractC1279b2 != null) {
                abstractC1279b2.a(e);
            }
        }
    }

    public final void b(Object obj) {
        this.b = obj;
    }
}
