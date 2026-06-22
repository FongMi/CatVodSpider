package com.github.catvod.spider.merge.k0;

import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1279b<T> {
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

    protected abstract T onParseResponse(Call call, Response response);
}
