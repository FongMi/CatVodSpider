package com.github.catvod.spider.merge.k;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0578e implements Interceptor {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.github.catvod.spider.merge.k.e$a */
    public final class a extends ResponseBody {
        final /* synthetic */ Response a;
        final /* synthetic */ InflaterInputStream b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Response response, InflaterInputStream inflaterInputStream) {
            this.a = response;
            this.b = inflaterInputStream;
        }

        public final long contentLength() {
            return this.a.body().contentLength();
        }

        public final MediaType contentType() {
            return this.a.body().contentType();
        }

        public final BufferedSource source() {
            return Okio.buffer(Okio.source(this.b));
        }
    }

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
        return responseProceed.newBuilder().headers(responseProceed.headers()).body(new a(responseProceed, new InflaterInputStream(responseProceed.body().byteStream(), new Inflater(true)))).build();
    }
}
