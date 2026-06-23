package com.github.catvod.spider.merge.A0;

import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class xh {
    public Object d = null;

    public Object getResult() {
        return this.d;
    }

    public void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    public abstract void onFailure(Call call, Exception exc);

    public abstract Object onParseResponse(Call call, Response response);

    public abstract void onResponse(Object obj);
}
