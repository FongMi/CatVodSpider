package com.github.catvod.spider.merge.A;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class t {
    public final Request a;
    public final String b;

    public t(String str, String str2, byte[] bArr, HashMap map) {
        this.b = str2;
        Request.Builder builder = new Request.Builder();
        str.equals("GET");
        if (str.equals("POST")) {
            builder.post(bArr != null ? RequestBody.create(MediaType.get("application/x-protobuf"), bArr) : !TextUtils.isEmpty(null) ? RequestBody.create(MediaType.get("application/json; charset=utf-8"), (String) null) : new FormBody.Builder().build());
        }
        if (map != null) {
            for (String str3 : map.keySet()) {
                builder.addHeader(str3, (String) map.get(str3));
            }
        }
        this.a = builder.url(this.b).build();
    }

    public final u a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.a).execute();
            try {
                responseExecute.code();
                byte[] bArrBytes = responseExecute.body().bytes();
                responseExecute.headers().toMultimap();
                u uVar = new u(bArrBytes);
                responseExecute.close();
                return uVar;
            } finally {
            }
        } catch (IOException e) {
            SpiderDebug.log(e);
            return new u();
        }
    }
}
