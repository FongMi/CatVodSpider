package com.github.catvod.spider.merge.mk;

import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class c<T> {
    private T a = null;

    protected final void a(Call call, Response response) {
        T tOnParseResponse = onParseResponse(call, response);
        this.a = tOnParseResponse;
        onResponse(tOnParseResponse);
    }

    protected final void b() {
        this.a = "";
    }

    public T getResult() {
        return this.a;
    }

    protected void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    protected abstract void onFailure(Call call, Exception exc);

    protected abstract T onParseResponse(Call call, Response response);

    protected abstract void onResponse(T t);
}
