package com.github.catvod.spider.merge.f0;

import android.text.TextUtils;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.l.C1290c;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class h {
    private final Map<String, List<String>> a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final String d;
    private final String e;
    private Request f;
    private String g;
    private Object h;

    private h(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        RequestBody requestBodyBuild;
        this.g = str2;
        this.e = str3;
        this.d = str;
        this.c = map;
        this.b = map2;
        this.a = map3;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            this.g = C1290c.b(new StringBuilder(), this.g, "?");
            for (String str4 : map.keySet()) {
                String str5 = this.g;
                StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(str4, "=");
                sbA.append(this.c.get(str4));
                sbA.append("&");
                this.g = str5.concat(sbA.toString());
            }
            this.g = m.B(this.g);
        }
        if (this.d.equals("POST")) {
            if (TextUtils.isEmpty(this.e)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map4 = this.c;
                if (map4 != null) {
                    for (String str6 : map4.keySet()) {
                        builder2.add(str6, this.c.get(str6));
                    }
                }
                requestBodyBuild = builder2.build();
            } else {
                requestBodyBuild = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.e);
            }
            builder.post(requestBodyBuild);
        }
        Map<String, String> map5 = this.b;
        if (map5 != null) {
            for (String str7 : map5.keySet()) {
                builder.addHeader(str7, this.b.get(str7));
            }
        }
        Object obj = this.h;
        if (obj != null) {
            builder.tag(obj);
        }
        this.f = builder.url(this.g).build();
    }

    h(String str, String str2, Map map) {
        this("POST", str, str2, null, map, null);
    }

    h(String str, String str2, Map map, Map map2) {
        this("POST", str, str2, null, map, map2);
    }

    h(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(str, str2, null, map, map2, map3);
    }

    public final i a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.f).execute();
            Map<String, List<String>> map = this.a;
            if (map != null) {
                map.clear();
            }
            Map<String, List<String>> map2 = this.a;
            if (map2 != null) {
                map2.putAll(responseExecute.headers().toMultimap());
            }
            int iCode = responseExecute.code();
            String strString = responseExecute.body().string();
            responseExecute.headers().toMultimap();
            return new i(iCode, strString);
        } catch (IOException unused) {
            return new i();
        }
    }

    public final h b() {
        this.h = null;
        return this;
    }
}
