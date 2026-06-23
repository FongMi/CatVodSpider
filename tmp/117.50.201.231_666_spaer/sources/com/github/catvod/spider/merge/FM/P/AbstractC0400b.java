package com.github.catvod.spider.merge.FM.p;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.p.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class AbstractC0400b extends AbstractC0401c<String> {
    @Override // com.github.catvod.spider.merge.FM.p.AbstractC0401c
    public void onError(Call call, Exception exc) {
        d();
        a(exc);
    }

    @Override // com.github.catvod.spider.merge.FM.p.AbstractC0401c
    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }
}
