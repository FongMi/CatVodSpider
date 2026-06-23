package com.github.catvod.spider.merge.FM.m;

import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.o.z;
import java.io.IOException;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.m.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0379d {
    private final Map<String, String> a;
    private final Map<String, String> b;
    private final String c;
    private final String d;
    private Request e;
    private String f;

    C0379d(String str, String str2, String str3, Map<String, String> map) {
        this(str, str2, str3, null, map);
    }

    private C0379d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
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
            this.f = P.a(new byte[]{-40}, new byte[]{-25, 82, -28, -2, 36, -80, -73, -10}, sb);
            for (String str4 : map.keySet()) {
                String str5 = this.f;
                StringBuilder sbB = P.b(str4);
                sbB.append("=");
                sbB.append(this.b.get(str4));
                sbB.append("&");
                this.f = str5.concat(sbB.toString());
            }
            this.f = z.q(this.f);
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

    C0379d(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this(str, str2, null, map, map2);
    }

    public final C0380e a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.e).execute();
            return new C0380e(responseExecute.code(), responseExecute.body().string(), responseExecute.headers().toMultimap());
        } catch (IOException unused) {
            return new C0380e();
        }
    }
}
