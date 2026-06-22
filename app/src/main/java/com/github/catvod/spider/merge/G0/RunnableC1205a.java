package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.RunnableC0772o0;
import com.github.catvod.spider.merge.I.v0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1205a implements Runnable {
    public static final /* synthetic */ RunnableC1205a c = new RunnableC1205a(0);
    public static final /* synthetic */ RunnableC1205a d = new RunnableC1205a(1);
    public static final /* synthetic */ RunnableC1205a e = new RunnableC1205a(2);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1205a(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                v0 v0VarR = v0.r();
                v0VarR.getClass();
                Init.run(new RunnableC0772o0(v0VarR, 1));
                break;
            case 1:
                String str2 = ConfigCenter.m;
                com.github.catvod.spider.merge.I.O.l().f.a();
                com.github.catvod.spider.merge.i0.m.w("已清除光鸭本地授权");
                break;
            default:
                String str3 = ConfigCenter.m;
                new TgYunDouBanPan().startTgFlow();
                break;
        }
    }
}
