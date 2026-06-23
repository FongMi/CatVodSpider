package com.github.catvod.spider.merge.FM.n;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.b.Q;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class j implements Runnable {
    public static final /* synthetic */ j b = new j(0);
    public static final /* synthetic */ j c = new j(1);
    public static final /* synthetic */ j d = new j(2);
    public static final /* synthetic */ j e = new j(3);
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                new Thread(g.c).start();
                break;
            case 1:
                new Thread(i.d).start();
                break;
            case 2:
                try {
                    Q q = Q.q();
                    q.getClass();
                    Init.checkPermission();
                    q.l();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
            default:
                Init.a();
                break;
        }
    }
}
