package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0755g implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0755g(Object obj, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0775q.f((C0775q) this.c, (Map) this.d);
                break;
            case 1:
                C0775q c0775q = (C0775q) this.c;
                String str = (String) this.d;
                c0775q.getClass();
                try {
                    C0773p.a.b = Integer.parseInt(str);
                    com.github.catvod.spider.merge.g.b.g(c0775q.K(), str);
                    com.github.catvod.spider.merge.i0.d.b("阿里线程设置成功 当前为" + C0773p.a.b);
                } catch (Exception unused) {
                    Init.show("請輸入正確的數字");
                    return;
                }
                break;
            case 2:
                O.d((O) this.c, (String) this.d);
                break;
            case 3:
                Q0 q0 = (Q0) this.c;
                String strTrim = (String) this.d;
                q0.getClass();
                if (!strTrim.startsWith("http")) {
                    com.github.catvod.spider.merge.P0.e.c(q0.e.b);
                    SpiderDebug.log("set new Cookie:" + strTrim);
                    if (strTrim.startsWith("http")) {
                        strTrim = com.github.catvod.spider.merge.f0.d.l(strTrim).trim();
                    }
                    if (com.github.catvod.spider.merge.P0.e.d(strTrim)) {
                        com.github.catvod.spider.merge.b0.c cVar = q0.e;
                        cVar.b = strTrim;
                        cVar.c();
                        com.github.catvod.spider.merge.i0.m.w("115安全删除码 设为" + strTrim);
                    }
                } else {
                    q0.l(com.github.catvod.spider.merge.f0.d.l(strTrim), true);
                }
                break;
            default:
                Init.c((Init) this.c, (Boolean) this.d);
                break;
        }
    }
}
