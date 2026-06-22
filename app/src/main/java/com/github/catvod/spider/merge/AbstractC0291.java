package com.github.catvod.spider.merge;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ފ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0291<T> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private T f717 = null;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ފ$Ϳ, reason: contains not printable characters */
    public static abstract class AbstractC0292 extends AbstractC0291<Response> {
        @Override // com.github.catvod.spider.merge.AbstractC0291
        public Response onParseResponse(Call call, Response response) {
            return response;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ފ$Ԩ, reason: contains not printable characters */
    public static abstract class AbstractC0293 extends AbstractC0291<String> {
        @Override // com.github.catvod.spider.merge.AbstractC0291
        public void onError(Call call, Exception exc) {
            m1073("");
            super.onError(call, exc);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0291
        public String onParseResponse(Call call, Response response) {
            try {
                return response.body().string();
            } catch (IOException unused) {
                return "";
            }
        }
    }

    public T getResult() {
        return this.f717;
    }

    protected void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    protected abstract void onFailure(Call call, Exception exc);

    protected abstract T onParseResponse(Call call, Response response);

    protected abstract void onResponse(T t);

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected void m1072(Call call, Response response) {
        T tOnParseResponse = onParseResponse(call, response);
        m1073(tOnParseResponse);
        onResponse(tOnParseResponse);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected void m1073(T t) {
        this.f717 = t;
    }
}
