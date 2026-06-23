package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class mi extends xh {
    @Override // com.github.catvod.spider.merge.A0.xh
    public void onError(Call call, Exception exc) {
        this.d = "";
        onFailure(call, exc);
    }

    @Override // com.github.catvod.spider.merge.A0.xh
    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }
}
