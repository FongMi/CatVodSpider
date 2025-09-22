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

/* renamed from: com.github.catvod.spider.merge.ZM */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
class C0107ZM {

    /* renamed from: MH */
    private Request f563MH;

    /* renamed from: Mo */
    private final Map<String, String> f564Mo;

    /* renamed from: QU */
    private Object f565QU;

    /* renamed from: UJ */
    private final Map<String, String> f566UJ;

    /* renamed from: i */
    private final AbstractC0099V3 f567i;

    /* renamed from: q */
    private final String f568q;

    /* renamed from: se */
    private Request.Builder f569se;

    /* renamed from: u */
    private final String f570u;

    /* renamed from: xC */
    private String f571xC;

    C0107ZM(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC0099V3 abstractC0099V3) {
        this(str, str2, null, map, map2, abstractC0099V3);
    }

    /* renamed from: QU */
    private RequestBody m498QU() {
        if (!TextUtils.isEmpty(this.f570u)) {
            return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.f570u);
        }
        FormBody.Builder builder = new FormBody.Builder();
        Map<String, String> map = this.f566UJ;
        if (map != null) {
            for (String str : map.keySet()) {
                builder.add(str, this.f566UJ.get(str));
            }
        }
        return builder.build();
    }

    /* renamed from: UJ */
    private void m499UJ() {
        if (this.f566UJ != null) {
            this.f571xC += "?";
            for (String str : this.f566UJ.keySet()) {
                this.f571xC += str + "=" + this.f566UJ.get(str) + "&";
            }
            this.f571xC = this.f571xC.substring(0, r0.length() - 1);
        }
    }

    /* renamed from: u */
    private void m500u() {
        Map<String, String> map = this.f564Mo;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f569se.addHeader(str, this.f564Mo.get(str));
            }
        }
    }

    /* renamed from: xC */
    private void m501xC() {
        this.f569se = new Request.Builder();
        String str = this.f568q;
        str.hashCode();
        if (str.equals("GET")) {
            m499UJ();
        } else if (str.equals("POST")) {
            this.f569se.post(m498QU());
        }
        this.f569se.url(this.f571xC);
        Object obj = this.f565QU;
        if (obj != null) {
            this.f569se.tag(obj);
        }
        if (this.f564Mo != null) {
            m500u();
        }
        this.f563MH = this.f569se.build();
    }

    /* renamed from: Mo */
    public void m502Mo(Object obj) {
        this.f565QU = obj;
    }

    /* renamed from: q */
    void m503q(OkHttpClient okHttpClient) {
        Call callNewCall = okHttpClient.newCall(this.f563MH);
        try {
            Response responseExecute = callNewCall.execute();
            AbstractC0099V3 abstractC0099V3 = this.f567i;
            if (abstractC0099V3 != null) {
                abstractC0099V3.m468q(callNewCall, responseExecute);
            }
        } catch (IOException e) {
            AbstractC0099V3 abstractC0099V32 = this.f567i;
            if (abstractC0099V32 != null) {
                abstractC0099V32.onError(callNewCall, e);
            }
        }
    }

    C0107ZM(String str, String str2, String str3, Map<String, String> map, AbstractC0099V3 abstractC0099V3) {
        this(str, str2, str3, null, map, abstractC0099V3);
    }

    private C0107ZM(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, AbstractC0099V3 abstractC0099V3) {
        this.f565QU = null;
        this.f568q = str;
        this.f571xC = str2;
        this.f570u = str3;
        this.f566UJ = map;
        this.f564Mo = map2;
        this.f567i = abstractC0099V3;
        m501xC();
    }
}
