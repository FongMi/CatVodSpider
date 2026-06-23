package com.github.catvod.spider.merge.AB.b;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.merge.AB.o.C0113q;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0084e implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ RunnableC0084e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            x.k((x) this.b);
            return;
        }
        if (i == 1) {
            ((MainActivity) this.b).h();
            return;
        }
        Object obj = this.b;
        if (i != 2) {
            Toast.makeText(((C0113q) obj).a, "没有详情数据", 0).show();
            return;
        }
        Config config = (Config) obj;
        config.getClass();
        new Handler(Looper.getMainLooper()).post(new RunnableC0083d(config, 3));
    }
}
