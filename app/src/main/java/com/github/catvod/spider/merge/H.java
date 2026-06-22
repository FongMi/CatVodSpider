package com.github.catvod.spider.merge;

import android.text.TextUtils;
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
class H {
    private Object N;
    private final String OL;
    private final Map<String, String> S;
    private final Map<String, String> T4;
    private final String b;
    private Request l;
    private final Map<String, List<String>> l8;
    private String tT;

    H(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(str, str2, null, map, map2, map3);
    }

    private void S() {
        Request.Builder builder = new Request.Builder();
        if (this.b.equals("GET") && this.T4 != null) {
            b();
        }
        if (this.b.equals("POST")) {
            builder.post(T4());
        }
        Map<String, String> map = this.S;
        if (map != null) {
            for (String str : map.keySet()) {
                builder.addHeader(str, this.S.get(str));
            }
        }
        Object obj = this.N;
        if (obj != null) {
            builder.tag(obj);
        }
        this.l = builder.url(this.tT).build();
    }

    private RequestBody T4() {
        if (!TextUtils.isEmpty(this.OL)) {
            return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.OL);
        }
        FormBody.Builder builder = new FormBody.Builder(ZP.b);
        Map<String, String> map = this.T4;
        if (map != null) {
            for (String str : map.keySet()) {
                builder.add(str, this.T4.get(str));
            }
        }
        return builder.build();
    }

    private void b() {
        this.tT += "?";
        for (String str : this.T4.keySet()) {
            this.tT = this.tT.concat(str + "=" + this.T4.get(str) + "&");
        }
        this.tT = this.tT.substring(0, r0.length() - 1);
    }

    public String l8(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.l).execute();
            Map<String, List<String>> map = this.l8;
            if (map != null) {
                map.clear();
            }
            Map<String, List<String>> map2 = this.l8;
            if (map2 != null) {
                map2.putAll(responseExecute.headers().toMultimap());
            }
            return responseExecute.body().string();
        } catch (IOException unused) {
            return "";
        }
    }

    private H(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this.tT = str2;
        this.OL = str3;
        this.b = str;
        this.T4 = map;
        this.S = map2;
        this.l8 = map3;
        S();
    }
}
