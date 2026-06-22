package com.github.catvod.spider.merge.nU;

import android.text.TextUtils;
import com.github.catvod.spider.merge.bY.C0925t;
import com.github.catvod.spider.merge.pT.C;
import java.io.IOException;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
        if (str.equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{-67, -21, -58}, new byte[]{-6, -82, -110, 105, 38, 90, -5, 91})) && map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f);
            this.f = C0925t.a(new byte[]{89}, new byte[]{102, 18, 42, 29, 97, 33, -89, 2}, sb);
            for (String str4 : map.keySet()) {
                String str5 = this.f;
                StringBuilder sbB = C0925t.b(str4);
                sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-7}, new byte[]{-60, -18, -19, 52, 85, -28, 93, -48}));
                sbB.append(this.b.get(str4));
                sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{16}, new byte[]{54, -7, 22, -87, -24, 108, 74, 108}));
                this.f = str5.concat(sbB.toString());
            }
            this.f = C.s(this.f);
        }
        if (this.c.equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{-92, 63, 100, -2}, new byte[]{-12, 112, 55, -86, -20, 114, -96, 15}))) {
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
                requestBodyBuild = RequestBody.create(MediaType.get(com.github.catvod.spider.merge.XI.f.a(new byte[]{51, 4, -71, -38, -94, 71, -56, 85, 59, 27, -89, -103, -95, 87, -58, 79, 105, 84, -86, -34, -86, 86, -38, 68, 38, 73, -68, -62, -83, 9, -111}, new byte[]{82, 116, -55, -74, -53, 36, -87, 33})), this.d);
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
