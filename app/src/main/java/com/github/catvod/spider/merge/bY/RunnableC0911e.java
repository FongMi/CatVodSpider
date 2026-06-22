package com.github.catvod.spider.merge.bY;

import android.os.Handler;
import android.os.Looper;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0911e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0911e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.k((x) this.b);
                break;
            case 1:
                ((L) this.b).o();
                break;
            case 2:
                ((MainActivity) this.b).m();
                break;
            default:
                Config config = (Config) this.b;
                config.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC0908b(config, 4));
                break;
        }
    }
}
