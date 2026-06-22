package com.github.catvod.spider.merge.d0;

import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0963i implements Runnable {
    public static final /* synthetic */ RunnableC0963i b = new RunnableC0963i();

    private /* synthetic */ RunnableC0963i() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (BaseApi.isDebuggable(Init.context())) {
                System.exit(0);
            }
            BaseApi.get();
            BaseApi.getAppSignature(Init.context());
            Thread.sleep(5000L);
            BaseApi.get().getDexPathList();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
