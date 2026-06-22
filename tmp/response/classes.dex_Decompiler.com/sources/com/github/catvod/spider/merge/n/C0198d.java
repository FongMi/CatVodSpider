package com.github.catvod.spider.merge.n;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.p.C0207D;
import java.io.IOException;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0198d {
    private final Map<String, String> a;
    private final Map<String, String> b;
    private final String c;
    private final String d;
    private Request e;
    private String f;

    C0198d(String str, String str2, String str3, Map<String, String> map) {
        this(str, str2, str3, null, map);
    }

    private C0198d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        RequestBody requestBodyBuild;
        this.f = str2;
        this.d = str3;
        this.c = str;
        this.b = map;
        this.a = map2;
        Request.Builder builder = new Request.Builder();
        if (str.equals(C0098a.a(new byte[]{-29, 22, -11}, new byte[]{-92, 83, -95, 11, -78, -66, 90, -63})) && map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f);
            this.f = C0133t.b(new byte[]{-103}, new byte[]{-90, 50, -15, 112, 98, -53, 79, 28}, sb);
            for (String str4 : map.keySet()) {
                String str5 = this.f;
                StringBuilder sbC = C0133t.c(str4);
                sbC.append(C0098a.a(new byte[]{100}, new byte[]{89, -113, -59, -85, -15, 86, 106, -39}));
                sbC.append(this.b.get(str4));
                sbC.append(C0098a.a(new byte[]{83}, new byte[]{117, -41, -65, 4, 105, 55, 80, -50}));
                this.f = str5.concat(sbC.toString());
            }
            this.f = C0207D.s(this.f);
        }
        if (this.c.equals(C0098a.a(new byte[]{-48, 53, 83, -113}, new byte[]{-128, 122, 0, -37, -87, 109, -111, -104}))) {
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
                requestBodyBuild = RequestBody.create(MediaType.get(C0098a.a(new byte[]{34, 109, 11, 30, 46, 111, -50, -110, 42, 114, 21, 93, 45, 127, -64, -120, 120, 61, 24, 26, 38, 126, -36, -125, 55, 32, 14, 6, 33, 33, -105}, new byte[]{67, 29, 123, 114, 71, 12, -81, -26})), this.d);
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

    C0198d(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this(str, str2, null, map, map2);
    }

    public final C0199e a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.e).execute();
            return new C0199e(responseExecute.code(), responseExecute.body().string(), responseExecute.headers().toMultimap());
        } catch (IOException unused) {
            return new C0199e();
        }
    }
}
