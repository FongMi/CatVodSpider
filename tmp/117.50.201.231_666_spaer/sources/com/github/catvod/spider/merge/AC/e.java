package com.github.catvod.spider.merge.AC;

import com.github.catvod.spider.merge.k.C0578e;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e implements Interceptor {
    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        if (request.url().host().equals("gitcode.net")) {
            request = request.newBuilder().addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36").build();
        }
        Response responseProceed = chain.proceed(request);
        String strHeader = responseProceed.header("Content-Encoding");
        if (responseProceed.body() == null || strHeader == null || !strHeader.equals("deflate")) {
            return responseProceed;
        }
        return responseProceed.newBuilder().headers(responseProceed.headers()).body(new C0578e.a(responseProceed, new InflaterInputStream(responseProceed.body().byteStream(), new Inflater(true)))).build();
    }
}
