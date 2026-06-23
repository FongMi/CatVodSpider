package com.github.catvod.spider.merge.FM.p;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class e extends AbstractC0401c<String> {
    final /* synthetic */ Map b;

    e(Map map) {
        this.b = map;
    }

    @Override // com.github.catvod.spider.merge.FM.p.AbstractC0401c
    public final void a(Exception exc) {
        d();
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.merge.FM.p.AbstractC0401c
    public final /* bridge */ /* synthetic */ void b(String str) {
    }

    @Override // com.github.catvod.spider.merge.FM.p.AbstractC0401c
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
