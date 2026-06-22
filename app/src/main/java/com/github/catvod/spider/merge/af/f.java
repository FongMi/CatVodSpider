package com.github.catvod.spider.merge.af;

import java.util.zip.InflaterInputStream;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class f extends ResponseBody {
    final /* synthetic */ Response a;
    final /* synthetic */ InflaterInputStream b;

    f(Response response, InflaterInputStream inflaterInputStream) {
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
