package com.github.catvod.spider.merge.lq;

import android.text.TextUtils;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.nz.o;
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
final class c {
    private final Map<String, List<String>> a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final String d;
    private final String e;
    private Request f;
    private String g;
    private Object h;

    private c(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        RequestBody requestBodyBuild;
        this.g = str2;
        this.e = str3;
        this.d = str;
        this.c = map;
        this.b = map2;
        this.a = map3;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            this.g = n.b(new StringBuilder(), this.g, "?");
            for (String str4 : map.keySet()) {
                this.g = this.g.concat(str4 + "=" + this.c.get(str4) + "&");
            }
            String strSubstring = this.g;
            int i = o.a;
            if (strSubstring != null && strSubstring.length() > 1) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            this.g = strSubstring;
        }
        if (this.d.equals("POST")) {
            if (TextUtils.isEmpty(this.e)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map4 = this.c;
                if (map4 != null) {
                    for (String str5 : map4.keySet()) {
                        builder2.add(str5, this.c.get(str5));
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
            for (String str6 : map5.keySet()) {
                builder.addHeader(str6, this.b.get(str6));
            }
        }
        Object obj = this.h;
        if (obj != null) {
            builder.tag(obj);
        }
        this.f = builder.url(this.g).build();
    }

    c(String str, String str2, Map map) {
        this("POST", str, str2, null, map, null);
    }

    c(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(str, str2, null, map, map2, map3);
    }

    public final d a(OkHttpClient okHttpClient) {
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
            return new d(responseExecute.code(), responseExecute.body().string());
        } catch (IOException unused) {
            return new d();
        }
    }

    public final c b() {
        this.h = null;
        return this;
    }
}
