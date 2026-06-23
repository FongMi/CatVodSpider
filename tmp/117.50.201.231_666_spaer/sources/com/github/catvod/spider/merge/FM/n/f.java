package com.github.catvod.spider.merge.FM.n;

import com.github.catvod.spider.merge.FM.b.x;
import com.github.catvod.spider.merge.FM.o.z;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class f implements Runnable {
    public static final /* synthetic */ f b = new f(0);
    public static final /* synthetic */ f c = new f(1);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.e().getClass();
                z.m25b(".baidu");
                break;
            default:
                new Thread(g.d).start();
                break;
        }
    }
}
