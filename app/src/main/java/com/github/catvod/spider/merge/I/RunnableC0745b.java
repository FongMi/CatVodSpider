package com.github.catvod.spider.merge.I;

import com.github.catvod.demo.MainActivity;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0745b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0745b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0775q.a((C0775q) this.c);
                break;
            case 1:
                C0775q.a((C0775q) this.c);
                break;
            case 2:
                C0775q c0775q = (C0775q) this.c;
                c0775q.getClass();
                String strL = com.github.catvod.spider.merge.f0.d.l("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3");
                Init.run(new RunnableC0757h(c0775q, strL, com.github.catvod.spider.merge.L.c.g(strL).b().c(), 0));
                break;
            default:
                ((MainActivity) this.c).h();
                break;
        }
    }
}
