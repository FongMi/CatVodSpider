package com.github.catvod.spider.merge.k;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.m.C0590I;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0576c {
    private final Map<String, String> a;
    private final Map<String, String> b;
    private final String c;
    private final String d;
    private Request e;
    private String f;
    private Object g;

    private C0576c(String str, String str2, String str3, Map map, Map map2) {
        RequestBody requestBodyBuild;
        this.f = str2;
        this.d = str3;
        this.c = str;
        this.b = map;
        this.a = map2;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            this.f = C0544h.b(new StringBuilder(), this.f, "?");
            for (String str4 : map.keySet()) {
                this.f = this.f.concat(str4 + "=" + this.b.get(str4) + "&");
            }
            String strSubstring = this.f;
            List<String> list = C0590I.a;
            if (strSubstring != null && strSubstring.length() > 1) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            this.f = strSubstring;
        }
        if (this.c.equals("POST")) {
            if (TextUtils.isEmpty(this.d)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map3 = this.b;
                if (map3 != null) {
                    for (String str5 : map3.keySet()) {
                        builder2.add(str5, this.b.get(str5));
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
            for (String str6 : map4.keySet()) {
                builder.addHeader(str6, this.a.get(str6));
            }
        }
        Object obj = this.g;
        if (obj != null) {
            builder.tag(obj);
        }
        this.e = builder.url(this.f).build();
    }

    C0576c(String str, String str2, Map map) {
        this("POST", str, str2, null, map);
    }

    C0576c(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this(str, str2, null, map, map2);
    }

    C0576c(String str, Map map, Map map2, Map map3) {
        this("GET", str, null, map, map2);
    }

    public final C0577d a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.e).execute();
            return new C0577d(responseExecute.code(), responseExecute.body().string(), responseExecute.headers().toMultimap());
        } catch (IOException unused) {
            return new C0577d();
        }
    }

    public final C0576c b() {
        this.g = "";
        return this;
    }
}
