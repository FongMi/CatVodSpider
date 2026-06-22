package com.github.catvod.spider.merge.mk;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class b extends c<String> {
    @Override // com.github.catvod.spider.merge.mk.c
    public void onError(Call call, Exception exc) {
        b();
        onFailure(call, exc);
    }

    @Override // com.github.catvod.spider.merge.mk.c
    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }
}
