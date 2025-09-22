package com.github.catvod.spider.merge;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* renamed from: com.github.catvod.spider.merge.V3 */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public abstract class AbstractC0099V3<T> {

    /* renamed from: q */
    private T f550q = null;

    /* renamed from: com.github.catvod.spider.merge.V3$Qe */
    public static abstract class Qe extends AbstractC0099V3<String> {
        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public void onError(Call call, Exception exc) {
            m469xC("");
            super.onError(call, exc);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public String onParseResponse(Call call, Response response) {
            try {
                return response.body().string();
            } catch (IOException unused) {
                return "";
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.V3$p */
    public static abstract class p extends AbstractC0099V3<Response> {
        @Override // com.github.catvod.spider.merge.AbstractC0099V3
        public Response onParseResponse(Call call, Response response) {
            return response;
        }
    }

    public T getResult() {
        return this.f550q;
    }

    protected void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    protected abstract void onFailure(Call call, Exception exc);

    protected abstract T onParseResponse(Call call, Response response);

    protected abstract String onResponse(T t);

    /* renamed from: q */
    protected void m468q(Call call, Response response) {
        T tOnParseResponse = onParseResponse(call, response);
        m469xC(tOnParseResponse);
        onResponse(tOnParseResponse);
    }

    /* renamed from: xC */
    protected void m469xC(T t) {
        this.f550q = t;
    }
}
