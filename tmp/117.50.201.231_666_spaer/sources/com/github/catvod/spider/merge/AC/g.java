package com.github.catvod.spider.merge.AC;

import android.text.TextUtils;
import com.github.catvod.spider.merge.AC.C.D;
import java.util.HashMap;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class g {
    private final Map<String, String> a;
    private final String b;
    private Request c;
    private String d;

    g(String str, String str2, String str3, HashMap map) {
        this(str, str2, null, str3, map);
    }

    private g(String str, String str2, HashMap map, String str3, Map map2) {
        RequestBody requestBodyBuild;
        this.d = str2;
        this.b = str3;
        this.a = map2;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            this.d += "?";
            for (String str4 : map.keySet()) {
                String str5 = this.d;
                StringBuilder sbA = com.github.catvod.spider.merge.AC.b.g.a(str4);
                sbA.append("=");
                sbA.append((String) map.get(str4));
                sbA.append("&");
                this.d = str5.concat(sbA.toString());
            }
            this.d = D.r(this.d);
        }
        if (str.equals("POST")) {
            String str6 = this.b;
            if (TextUtils.isEmpty(str6)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                if (map != null) {
                    for (String str7 : map.keySet()) {
                        builder2.add(str7, (String) map.get(str7));
                    }
                }
                requestBodyBuild = builder2.build();
            } else {
                requestBodyBuild = RequestBody.create(MediaType.get("application/json; charset=utf-8"), str6);
            }
            builder.post(requestBodyBuild);
        }
        Map<String, String> map3 = this.a;
        if (map3 != null) {
            for (String str8 : map3.keySet()) {
                builder.addHeader(str8, map3.get(str8));
            }
        }
        this.c = builder.url(this.d).build();
    }

    g(String str, String str2, HashMap map, Map map2) {
        this(str, str2, map, null, map2);
    }

    public final h a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.c).execute();
            int iCode = responseExecute.code();
            String strString = responseExecute.body().string();
            responseExecute.headers().toMultimap();
            return new h(iCode, strString);
        } catch (Exception unused) {
            return new h();
        }
    }
}
