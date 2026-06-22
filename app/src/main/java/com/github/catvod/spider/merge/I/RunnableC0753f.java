package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0753f implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0753f(Object obj, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0775q.b((C0775q) this.c, (com.github.catvod.spider.merge.L.c) this.d);
                break;
            case 1:
                v0 v0Var = (v0) this.c;
                String str = (String) this.d;
                v0Var.getClass();
                try {
                    v0Var.m.c = Integer.valueOf(Integer.parseInt(str));
                    v0Var.m.j();
                    com.github.catvod.spider.merge.i0.d.b("uc线程设置成功 当前为" + v0Var.m.c);
                } catch (Exception unused) {
                    Init.show("請輸入正確的數字");
                    return;
                }
                break;
            case 2:
                C0 c0 = (C0) this.c;
                String str2 = (String) this.d;
                int i = C0.i;
                c0.getClass();
                try {
                    c0.v(str2, true);
                    c0.f.g();
                    com.github.catvod.spider.merge.i0.d.b("迅雷网盘账号密码为 " + c0.f.e() + "|" + c0.f.f());
                } catch (Exception unused2) {
                    Init.show("请输入正确的字符串");
                }
                break;
            default:
                TgYunDouBanPan.l((TgYunDouBanPan) this.c, (String) this.d);
                break;
        }
    }
}
