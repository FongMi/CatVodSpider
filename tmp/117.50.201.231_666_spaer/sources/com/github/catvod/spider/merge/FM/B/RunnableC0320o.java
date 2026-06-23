package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.d.C0336d;
import com.github.catvod.spider.merge.FM.m.C0378c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0320o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ RunnableC0320o(u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.b(this.b);
                break;
            default:
                u uVar = this.b;
                uVar.getClass();
                String strN = C0378c.n("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null);
                Init.run(new RunnableC0315j(uVar, strN, C0336d.g(strN).b().c(), 0));
                break;
        }
    }
}
