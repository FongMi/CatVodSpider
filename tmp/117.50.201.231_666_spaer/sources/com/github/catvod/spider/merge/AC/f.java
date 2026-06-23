package com.github.catvod.spider.merge.AC;

import com.github.catvod.crawler.SpiderDebug;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f implements Interceptor {
    final Response a(Interceptor.Chain chain, int i) {
        try {
            return chain.proceed(chain.request());
        } catch (Exception e) {
            SpiderDebug.log("准备重试请求:" + e.getMessage());
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            if (10 > i) {
                return a(chain, i + 1);
            }
            return null;
        }
    }

    public final Response intercept(Interceptor.Chain chain) {
        return a(chain, 0);
    }
}
