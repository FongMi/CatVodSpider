package com.github.catvod.spider.merge.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.merge.d.C0558b;
import com.github.catvod.spider.merge.m.C0602k;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0542f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0542f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0545i.a((C0545i) this.b);
                break;
            case 1:
                C0558b c0558b = (C0558b) this.b;
                c0558b.getClass();
                C0602k.c(C0602k.b("aliyun"), c0558b.toString());
                break;
            case 2:
                MainActivity.c((MainActivity) this.b);
                break;
            default:
                Config.a((Config) this.b);
                break;
        }
    }
}
