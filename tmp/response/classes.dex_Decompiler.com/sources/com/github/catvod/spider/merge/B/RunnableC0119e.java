package com.github.catvod.spider.merge.b;

import android.os.Handler;
import android.os.Looper;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0119e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0119e(Object obj, int i) {
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
                ((C0110L) this.b).o();
                break;
            case 2:
                ((MainActivity) this.b).m();
                break;
            default:
                Config config = (Config) this.b;
                config.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC0116b(config, 4));
                break;
        }
    }
}
