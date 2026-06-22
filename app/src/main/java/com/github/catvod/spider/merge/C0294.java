package com.github.catvod.spider.merge;

import android.text.TextUtils;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ދ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0294 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final String f718;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private String f719;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private Object f720;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final Map<String, String> f721;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private final String f722;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private final Map<String, String> f723;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private final AbstractC0291 f724;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private Request f725;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private Request.Builder f726;

    C0294(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC0291 abstractC0291) {
        this(str, str2, null, map, map2, abstractC0291);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private void m1074() {
        this.f726 = new Request.Builder();
        String str = this.f718;
        str.hashCode();
        if (str.equals(SOY.d("3D1705"))) {
            m1076();
        } else if (str.equals(SOY.d("2A1D0222"))) {
            this.f726.post(m1075());
        }
        this.f726.url(this.f719);
        Object obj = this.f720;
        if (obj != null) {
            this.f726.tag(obj);
        }
        if (this.f723 != null) {
            m1077();
        }
        this.f725 = this.f726.build();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private RequestBody m1075() {
        Map<String, String> map;
        String strD = SOY.d("193A300407120E6F");
        boolean zIsEmpty = TextUtils.isEmpty(this.f722);
        String strD2 = SOY.d("393D3F0211190E7F050F0412");
        if (!zIsEmpty) {
            String strD3 = SOY.d("1B22211A1D141B2638191A5810213E184F57193A300407120E6F2402125A42");
            MediaType mediaType = MediaType.parse(strD3);
            Map<String, String> map2 = this.f723;
            if (map2 != null) {
                for (String str : map2.keySet()) {
                    if (str.equalsIgnoreCase(strD2)) {
                        mediaType = MediaType.parse(this.f723.get(str).isEmpty() ? strD3 : this.f723.get(str));
                    }
                }
            }
            return RequestBody.create(mediaType, this.f722);
        }
        FormBody.Builder builder = new FormBody.Builder();
        Map<String, String> map3 = this.f723;
        if (map3 != null) {
            for (String str2 : map3.keySet()) {
                if (str2.equalsIgnoreCase(strD2) && (map = this.f721) != null) {
                    for (String str3 : map.keySet()) {
                        try {
                            builder.addEncoded(str3, URLEncoder.encode(this.f721.get(str3), this.f723.get(str2).contains(strD) ? this.f723.get(str2).split(strD)[1] : SOY.d("0F26375B4C")));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return builder.build();
                }
            }
        }
        Map<String, String> map4 = this.f721;
        if (map4 != null) {
            for (String str4 : map4.keySet()) {
                builder.add(str4, this.f721.get(str4));
            }
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private void m1076() {
        if (this.f721 != null) {
            this.f719 += SOY.d("45");
            for (String str : this.f721.keySet()) {
                this.f719 += str + SOY.d("47") + this.f721.get(str) + SOY.d("5C");
            }
            this.f719 = this.f719.substring(0, r0.length() - 1);
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private void m1077() {
        Map<String, String> map = this.f723;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f726.addHeader(str, this.f723.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    void m1078(OkHttpClient okHttpClient) {
        Call callNewCall = okHttpClient.newCall(this.f725);
        try {
            Response responseExecute = callNewCall.execute();
            AbstractC0291 abstractC0291 = this.f724;
            if (abstractC0291 != null) {
                abstractC0291.m1072(callNewCall, responseExecute);
            }
        } catch (IOException e) {
            AbstractC0291 abstractC02912 = this.f724;
            if (abstractC02912 != null) {
                abstractC02912.onError(callNewCall, e);
            }
        }
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public void m1079(Object obj) {
        this.f720 = obj;
    }

    C0294(String str, String str2, String str3, Map<String, String> map, AbstractC0291 abstractC0291) {
        this(str, str2, str3, null, map, abstractC0291);
    }

    private C0294(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, AbstractC0291 abstractC0291) {
        this.f720 = null;
        this.f718 = str;
        this.f719 = str2;
        this.f722 = str3;
        this.f721 = map;
        this.f723 = map2;
        this.f724 = abstractC0291;
        m1074();
    }
}
