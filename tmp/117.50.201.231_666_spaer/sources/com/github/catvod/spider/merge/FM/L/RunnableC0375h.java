package com.github.catvod.spider.merge.FM.l;

import android.os.Handler;
import android.os.Looper;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.l.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0375h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0375h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MainActivity) this.b).h();
                break;
            default:
                Config config = (Config) this.b;
                config.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC0374g(config, 2));
                break;
        }
    }
}
