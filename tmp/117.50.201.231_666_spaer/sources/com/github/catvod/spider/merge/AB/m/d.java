package com.github.catvod.spider.merge.AB.m;

import android.text.TextUtils;
import com.github.catvod.spider.merge.AB.b.H;
import com.github.catvod.spider.merge.AB.b.t;
import com.github.catvod.spider.merge.AB.o.c0;
import java.io.IOException;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class d {
    private final Map<String, String> a;
    private final Map<String, String> b;
    private final String c;
    private final String d;
    private Request e;
    private String f;

    d(String str, String str2, String str3, Map<String, String> map) {
        this(str, str2, str3, null, map);
    }

    private d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        RequestBody requestBodyBuild;
        this.f = str2;
        this.d = str3;
        this.c = str;
        this.b = map;
        this.a = map2;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f);
            this.f = t.b(new byte[]{53}, new byte[]{10, 68, -107, -78, 109, -127, 65, 88}, sb);
            for (String str4 : map.keySet()) {
                String str5 = this.f;
                StringBuilder sbA = H.a(str4);
                sbA.append("=");
                sbA.append(this.b.get(str4));
                sbA.append("&");
                this.f = str5.concat(sbA.toString());
            }
            this.f = c0.s(this.f);
        }
        if (this.c.equals("POST")) {
            if (TextUtils.isEmpty(this.d)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map3 = this.b;
                if (map3 != null) {
                    for (String str6 : map3.keySet()) {
                        builder2.add(str6, this.b.get(str6));
                    }
                }
                requestBodyBuild = builder2.build();
            } else {
                requestBodyBuild = RequestBody.create(MediaType.get("application/json; charset=utf-8"), this.d);
            }
            builder.post(requestBodyBuild);
        }
        Map<String, String> map4 = this.a;
        if (map4 != null) {
            for (String str7 : map4.keySet()) {
                builder.addHeader(str7, this.a.get(str7));
            }
        }
        this.e = builder.url(this.f).build();
    }

    d(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this(str, str2, null, map, map2);
    }

    public final e a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.e).execute();
            return new e(responseExecute.code(), responseExecute.body().string(), responseExecute.headers().toMultimap());
        } catch (IOException unused) {
            return new e();
        }
    }
}
