package com.github.catvod.spider.merge.k0;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1281d extends AbstractC1279b<String> {
    final /* synthetic */ Map b;

    C1281d(Map map) {
        this.b = map;
    }

    @Override // com.github.catvod.spider.merge.k0.AbstractC1279b
    public final void a(Exception exc) {
        d();
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.merge.k0.AbstractC1279b
    public final /* bridge */ /* synthetic */ void b(String str) {
    }

    @Override // com.github.catvod.spider.merge.k0.AbstractC1279b
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
}
