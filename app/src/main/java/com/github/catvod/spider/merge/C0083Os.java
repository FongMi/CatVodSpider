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

/* renamed from: com.github.catvod.spider.merge.Os */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
class C0083Os {

    /* renamed from: MH */
    private Object f498MH;

    /* renamed from: Mo */
    private Request f499Mo;

    /* renamed from: QU */
    private final Map<String, String> f500QU;

    /* renamed from: UJ */
    private final String f501UJ;

    /* renamed from: i */
    private String f502i;

    /* renamed from: q */
    private final Map<String, List<String>> f503q;

    /* renamed from: u */
    private final String f504u;

    /* renamed from: xC */
    private final Map<String, String> f505xC;

    C0083Os(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(str, str2, null, map, map2, map3);
    }

    /* renamed from: QU */
    private RequestBody m331QU() {
        if (!TextUtils.isEmpty(this.f504u)) {
            return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.f504u);
        }
        FormBody.Builder builder = new FormBody.Builder(C0118ga.f675UJ);
        Map<String, String> map = this.f500QU;
        if (map != null) {
            for (String str : map.keySet()) {
                builder.add(str, this.f500QU.get(str));
            }
        }
        return builder.build();
    }

    /* renamed from: UJ */
    private void m332UJ() {
        this.f502i += "?";
        for (String str : this.f500QU.keySet()) {
            this.f502i = this.f502i.concat(str + "=" + this.f500QU.get(str) + "&");
        }
        this.f502i = this.f502i.substring(0, r0.length() - 1);
    }

    /* renamed from: xC */
    private void m333xC() {
        Request.Builder builder = new Request.Builder();
        if (this.f501UJ.equals("GET") && this.f500QU != null) {
            m332UJ();
        }
        if (this.f501UJ.equals("POST")) {
            builder.post(m331QU());
        }
        Map<String, String> map = this.f505xC;
        if (map != null) {
            for (String str : map.keySet()) {
                builder.addHeader(str, this.f505xC.get(str));
            }
        }
        Object obj = this.f498MH;
        if (obj != null) {
            builder.tag(obj);
        }
        this.f499Mo = builder.url(this.f502i).build();
    }

    /* renamed from: q */
    public String m334q(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.f499Mo).execute();
            Map<String, List<String>> map = this.f503q;
            if (map != null) {
                map.clear();
            }
            Map<String, List<String>> map2 = this.f503q;
            if (map2 != null) {
                map2.putAll(responseExecute.headers().toMultimap());
            }
            return responseExecute.body().string();
        } catch (IOException unused) {
            return "";
        }
    }

    private C0083Os(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this.f502i = str2;
        this.f504u = str3;
        this.f501UJ = str;
        this.f500QU = map;
        this.f505xC = map2;
        this.f503q = map3;
        m333xC();
    }
}
