package com.github.catvod.spider.merge.g0;

import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.RunnableC0770n0;
import com.github.catvod.utils.merge.UcDriveApi;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1210f implements Runnable {
    public static final /* synthetic */ RunnableC1210f c = new RunnableC1210f(0);
    public static final /* synthetic */ RunnableC1210f d = new RunnableC1210f(1);
    public static final /* synthetic */ RunnableC1210f e = new RunnableC1210f(2);
    public static final /* synthetic */ RunnableC1210f f = new RunnableC1210f(3);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1210f(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                UcDriveApi v0VarR = UcDriveApi.r();
                v0VarR.getClass();
                Init.run(new RunnableC0770n0(v0VarR, 1));
                return;
            case 1:
                String str2 = ConfigCenter.m;
                com.github.catvod.utils.merge.GuangYaPanApi oL = com.github.catvod.utils.merge.GuangYaPanApi.l();
                oL.getClass();
                Init.run(new com.github.catvod.spider.merge.I.M(oL, 0));
                return;
            case 2:
                String str3 = ConfigCenter.m;
                new Thread(RunnableC1212h.f).start();
                return;
        }
        while (true) {
            try {
                Thread.sleep(2000L);
                BaseApi.monitorCurrentActivityButtons();
            } catch (Exception unused) {
                return;
            }
        }
    }
}
