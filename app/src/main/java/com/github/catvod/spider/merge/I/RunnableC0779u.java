package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0779u implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0779u(Object obj, String str, int i) {
        this.b = i;
        this.d = obj;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0781w c0781w = (C0781w) this.d;
                String str = this.c;
                c0781w.getClass();
                try {
                    c0781w.b.c = Integer.valueOf(Integer.parseInt(str));
                    com.github.catvod.spider.merge.N.i iVar = c0781w.b;
                    iVar.getClass();
                    Init.execute(new Z(iVar, 1));
                    com.github.catvod.spider.merge.i0.d.b("摆渡线程设置成功 当前为" + c0781w.b.c);
                } catch (Exception unused) {
                    Init.show("請輸入正確的數字");
                }
                break;
            default:
                com.github.catvod.spider.merge.J.h.b((com.github.catvod.spider.merge.J.h) this.d, this.c);
                break;
        }
    }
}
