package com.github.catvod.net;

import com.github.catvod.utils.Utils;
import com.google.common.net.HttpHeaders;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;

public class OkhttpInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(getRequest(chain));
        String encoding = response.header(HttpHeaders.CONTENT_ENCODING);
        if (response.body() == null || encoding == null || !encoding.equals("deflate")) return response;
        InflaterInputStream is = new InflaterInputStream(response.body().byteStream(), new Inflater(true));
        return response.newBuilder().headers(response.headers()).body(new ResponseBody() {
            @Override
            public MediaType contentType() {
                return response.body().contentType();
            }

            @Override
            public long contentLength() {
                return response.body().contentLength();
            }

            @NonNull
            @Override
            public BufferedSource source() {
                return Okio.buffer(Okio.source(is));
            }
        }).build();
    }

    private Request getRequest(@NonNull Chain chain) {
        Request request = chain.request();
        if (request.url().host().equals("gitcode.net")) return request.newBuilder().addHeader(HttpHeaders.USER_AGENT, Utils.CHROME).build();
        return request;
    }
}
