package com.github.catvod.spider.merge.A0;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.AbstractMap;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class oq extends xh {
    public final /* synthetic */ AbstractMap a;

    public oq(AbstractMap abstractMap) {
        this.a = abstractMap;
    }

    @Override // com.github.catvod.spider.merge.A0.xh
    public final void onFailure(Call call, Exception exc) {
        this.d = "";
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.merge.A0.xh
    public final Object onParseResponse(Call call, Response response) {
        AbstractMap abstractMap = this.a;
        if (abstractMap != null) {
            try {
                abstractMap.clear();
                abstractMap.putAll(response.headers().toMultimap());
            } catch (IOException unused) {
                return "";
            }
        }
        return response.body().string();
    }

    @Override // com.github.catvod.spider.merge.A0.xh
    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
    }
}
