package com.github.catvod.spider.merge.mk;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class f extends c<String> {
    final /* synthetic */ Map b;

    f(Map map) {
        this.b = map;
    }

    @Override // com.github.catvod.spider.merge.mk.c
    public final void onFailure(Call call, Exception exc) {
        b();
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.merge.mk.c
    public final String onParseResponse(Call call, Response response) {
        try {
            Map map = this.b;
            if (map != null) {
                map.clear();
                this.b.putAll(response.headers().toMultimap());
            }
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.merge.mk.c
    public final /* bridge */ /* synthetic */ void onResponse(String str) {
    }
}
