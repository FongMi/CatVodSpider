package com.github.catvod.spider.merge.C0.k;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class f extends c<String> {
    final Map b;

    f(Map map) {
        this.b = map;
    }

    @Override // com.github.catvod.spider.merge.C0.k.c
    public final void onFailure(Call call, Exception exc) {
        b();
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.merge.C0.k.c
    public final String onParseResponse(Call call, Response response) {
        try {
            Map map = this.b;
            if (map != null) {
                map.clear();
                this.b.putAll(response.headers().toMultimap());
            }
            return response.body().string();
        } catch (IOException e) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.merge.C0.k.c
    public final /* bridge */ /* synthetic */ void onResponse(String str) {
    }
}
