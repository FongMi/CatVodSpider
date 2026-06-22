package com.github.catvod.spider.merge.af;

import java.io.IOException;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class d {
    private Request c;
    private String d;
    private final Map<String, String> b = null;
    private final Map<String, String> a = null;

    d(String str) {
        this.d = str;
        this.c = new Request.Builder().url(this.d).build();
    }

    public final e a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.c).execute();
            responseExecute.code();
            String strString = responseExecute.body().string();
            responseExecute.headers().toMultimap();
            return new e(strString);
        } catch (IOException unused) {
            return new e();
        }
    }
}
