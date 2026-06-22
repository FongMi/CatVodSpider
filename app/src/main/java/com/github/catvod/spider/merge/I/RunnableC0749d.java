package com.github.catvod.spider.merge.I;

import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0749d implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0749d(Object obj, Object obj2, int i) {
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
                    v0Var.m.p(str);
                    v0Var.m.j();
                    com.github.catvod.spider.merge.i0.d.b("uc ut设置成功 当前为" + v0Var.m.h());
                } catch (Exception unused) {
                    Init.show("請輸入正確的字符串");
                    return;
                }
                break;
            case 2:
                BaseApi.a((BaseApi) this.c, (String) this.d);
                break;
            default:
                TgYunDouBanPan.i((TgYunDouBanPan) this.c);
                break;
        }
    }
}
