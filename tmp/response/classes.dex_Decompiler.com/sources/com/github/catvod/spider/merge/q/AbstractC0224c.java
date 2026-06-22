package com.github.catvod.spider.merge.q;

import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.q.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class AbstractC0224c<T> {
    private T a = null;

    protected abstract void a(Exception exc);

    protected abstract void b(T t);

    protected final void c(Call call, Response response) {
        T tOnParseResponse = onParseResponse(call, response);
        this.a = tOnParseResponse;
        b(tOnParseResponse);
    }

    protected final void d() {
        this.a = "";
    }

    public T getResult() {
        return this.a;
    }

    protected void onError(Call call, Exception exc) {
        a(exc);
    }

    protected abstract T onParseResponse(Call call, Response response);
}
