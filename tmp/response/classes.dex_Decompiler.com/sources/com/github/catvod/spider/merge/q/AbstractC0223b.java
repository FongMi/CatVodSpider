package com.github.catvod.spider.merge.q;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.q.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class AbstractC0223b extends AbstractC0224c<String> {
    @Override // com.github.catvod.spider.merge.q.AbstractC0224c
    public void onError(Call call, Exception exc) {
        d();
        a(exc);
    }

    @Override // com.github.catvod.spider.merge.q.AbstractC0224c
    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }
}
