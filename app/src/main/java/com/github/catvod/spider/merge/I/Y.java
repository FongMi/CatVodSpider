package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class Y implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ C0754f0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ Y(C0754f0 c0754f0, String str, int i) {
        this.b = i;
        this.c = c0754f0;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0754f0.g(this.c, this.d);
                break;
            default:
                C0754f0 c0754f0 = this.c;
                String str = this.d;
                c0754f0.getClass();
                try {
                    c0754f0.m.d = Integer.valueOf(Integer.parseInt(str));
                    c0754f0.m.i();
                    com.github.catvod.spider.merge.i0.d.b("夸克线程设置成功 当前为" + c0754f0.m.d);
                } catch (Exception unused) {
                    Init.show("請輸入正確的數字");
                    return;
                }
                break;
        }
    }
}
