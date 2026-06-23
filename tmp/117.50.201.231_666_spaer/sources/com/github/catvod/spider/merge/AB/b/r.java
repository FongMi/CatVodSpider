package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.spider.Init;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final int a;
    public final x b;

    public /* synthetic */ r(x xVar, int i) {
        this.a = i;
        this.b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        x xVar = this.b;
        if (i == 0) {
            x.b(xVar);
            return;
        }
        xVar.getClass();
        String strL = com.github.catvod.spider.merge.AB.m.c.l("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null);
        Init.run(new RunnableC0091l(xVar, strL, com.github.catvod.spider.merge.AB.d.d.g(strL).b().c()));
    }
}
