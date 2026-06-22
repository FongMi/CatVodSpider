package com.github.catvod.spider.merge;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1391u {
    private String a;
    private Object b;
    private final Map<String, String> c;
    private final Map<String, String> d;
    private final t e;
    private Request f;
    private Request.Builder g;

    private C1391u(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, t tVar) {
        RequestBody requestBodyBuild;
        this.b = null;
        this.a = str2;
        this.c = map;
        this.d = map2;
        this.e = tVar;
        this.g = new Request.Builder();
        if (str.equals("GET")) {
            if (map != null) {
                this.a = r.a(new StringBuilder(), this.a, "?");
                for (String str4 : map.keySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.a);
                    sb.append(str4);
                    sb.append("=");
                    this.a = r.a(sb, this.c.get(str4), "&");
                }
                this.a = this.a.substring(0, r2.length() - 1);
            }
        } else if (str.equals("POST")) {
            Request.Builder builder = this.g;
            if (TextUtils.isEmpty(str3)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                if (map != null) {
                    for (String str5 : map.keySet()) {
                        builder2.add(str5, this.c.get(str5));
                    }
                }
                requestBodyBuild = builder2.build();
            } else {
                requestBodyBuild = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str3);
            }
            builder.post(requestBodyBuild);
        }
        this.g.url(this.a);
        Object obj = this.b;
        if (obj != null) {
            this.g.tag(obj);
        }
        Map<String, String> map3 = this.d;
        if (map3 != null) {
            for (String str6 : map3.keySet()) {
                this.g.addHeader(str6, this.d.get(str6));
            }
        }
        this.f = this.g.build();
    }

    C1391u(String str, String str2, Map map, t tVar) {
        this("POST", str, str2, null, map, tVar);
    }

    C1391u(String str, String str2, Map<String, String> map, Map<String, String> map2, t tVar) {
        this(str, str2, null, map, map2, tVar);
    }

    final void a(OkHttpClient okHttpClient) {
        Call callNewCall = okHttpClient.newCall(this.f);
        try {
            Response responseExecute = callNewCall.execute();
            t tVar = this.e;
            if (tVar != null) {
                tVar.c(callNewCall, responseExecute);
            }
        } catch (IOException e) {
            t tVar2 = this.e;
            if (tVar2 != null) {
                tVar2.onError(callNewCall, e);
            }
        }
    }

    public final void b(Object obj) {
        this.b = obj;
    }
}
