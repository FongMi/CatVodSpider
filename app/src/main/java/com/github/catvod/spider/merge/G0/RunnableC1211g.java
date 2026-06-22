package com.github.catvod.spider.merge.g0;

import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.C0754f0;
import com.github.catvod.spider.merge.I.C0775q;
import com.github.catvod.spider.merge.I.RunnableC0746b0;
import com.github.catvod.spider.merge.I.t0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1211g implements Runnable {
    public static final /* synthetic */ RunnableC1211g c = new RunnableC1211g(0);
    public static final /* synthetic */ RunnableC1211g d = new RunnableC1211g(1);
    public static final /* synthetic */ RunnableC1211g e = new RunnableC1211g(2);
    public static final /* synthetic */ RunnableC1211g f = new RunnableC1211g(3);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1211g(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                C0754f0 c0754f0O = C0754f0.o();
                c0754f0O.getClass();
                Init.run(new RunnableC0746b0(c0754f0O, 0));
                break;
            case 1:
                String str2 = ConfigCenter.m;
                Init.get().exeAListProxy(Init.context(), Boolean.FALSE);
                com.github.catvod.spider.merge.i0.m.w("正在启动alist 账号密码都是admin 请稍后在浏览器输入 " + ConfigCenter.n + " 访问");
                break;
            case 2:
                String str3 = ConfigCenter.m;
                BaseApi.get().setNetPanDown();
                break;
            default:
                String str4 = ConfigCenter.m;
                try {
                    String strL = com.github.catvod.spider.merge.f0.d.l(C0775q.r().c + "/api/ping");
                    com.github.catvod.spider.merge.i0.m.w(com.github.catvod.spider.merge.P0.e.d(strL) ? "GO代理已启动: " + strL : "GO代理未响应");
                } catch (Exception e2) {
                    StringBuilder sbB = t0.b("GO代理状态检查失败: ");
                    sbB.append(e2.getMessage());
                    com.github.catvod.spider.merge.i0.m.w(sbB.toString());
                    return;
                }
                break;
        }
    }
}
