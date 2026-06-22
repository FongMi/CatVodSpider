package com.github.catvod.spider.merge.ai;

import android.app.Activity;
import com.github.catvod.spider.Init;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Market b;

    public /* synthetic */ s(Market market, int i) {
        this.a = i;
        this.b = market;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                try {
                    Activity activity = Init.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            case 1:
                Market market = this.b;
                market.getClass();
                Init.run(new s(market, 3));
                break;
            case 2:
                Market.d(this.b);
                break;
            default:
                Market.b(this.b);
                break;
        }
    }
}
