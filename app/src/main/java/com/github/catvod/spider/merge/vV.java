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

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class vV {
    private Request.Builder HM;
    private Request N;
    private final String OL;
    private String S;
    private Object T4;
    private final Map<String, String> b;
    private final Map<String, String> l;
    private final String l8;
    private final xx tT;

    vV(String str, String str2, Map<String, String> map, Map<String, String> map2, xx xxVar) {
        this(str, str2, null, map, map2, xxVar);
    }

    private void OL() {
        Map<String, String> map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                this.HM.addHeader(str, this.l.get(str));
            }
        }
    }

    private void S() {
        this.HM = new Request.Builder();
        String str = this.l8;
        str.hashCode();
        if (str.equals("GET")) {
            b();
        } else if (str.equals("POST")) {
            this.HM.post(T4());
        }
        this.HM.url(this.S);
        Object obj = this.T4;
        if (obj != null) {
            this.HM.tag(obj);
        }
        if (this.l != null) {
            OL();
        }
        this.N = this.HM.build();
    }

    private RequestBody T4() {
        if (!TextUtils.isEmpty(this.OL)) {
            return RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.OL);
        }
        FormBody.Builder builder = new FormBody.Builder();
        Map<String, String> map = this.b;
        if (map != null) {
            for (String str : map.keySet()) {
                builder.add(str, this.b.get(str));
            }
        }
        return builder.build();
    }

    private void b() {
        if (this.b != null) {
            this.S += "?";
            for (String str : this.b.keySet()) {
                this.S += str + "=" + this.b.get(str) + "&";
            }
            this.S = this.S.substring(0, r0.length() - 1);
        }
    }

    public void l(Object obj) {
        this.T4 = obj;
    }

    void l8(OkHttpClient okHttpClient) {
        Call callNewCall = okHttpClient.newCall(this.N);
        try {
            Response responseExecute = callNewCall.execute();
            xx xxVar = this.tT;
            if (xxVar != null) {
                xxVar.l8(callNewCall, responseExecute);
            }
        } catch (IOException e) {
            xx xxVar2 = this.tT;
            if (xxVar2 != null) {
                xxVar2.onError(callNewCall, e);
            }
        }
    }

    vV(String str, String str2, String str3, Map<String, String> map, xx xxVar) {
        this(str, str2, str3, null, map, xxVar);
    }

    private vV(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, xx xxVar) {
        this.T4 = null;
        this.l8 = str;
        this.S = str2;
        this.OL = str3;
        this.b = map;
        this.l = map2;
        this.tT = xxVar;
        S();
    }
}
