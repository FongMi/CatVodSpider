package com.github.catvod.spider.merge.m;

import android.app.ProgressDialog;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class RunnableC0137e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Market b;

    public /* synthetic */ RunnableC0137e(Market market, int i) {
        this.a = i;
        this.b = market;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Market market = this.b;
                market.getClass();
                Init.run(new RunnableC0137e(market, 1));
                break;
            case 1:
                Market market2 = this.b;
                market2.getClass();
                try {
                    ProgressDialog progressDialog = new ProgressDialog(Init.getActivity());
                    market2.a = progressDialog;
                    progressDialog.setProgressStyle(1);
                    market2.a.setCancelable(false);
                    if (market2.isBusy()) {
                        market2.a.show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                Market market3 = this.b;
                market3.getClass();
                try {
                    market3.setBusy(false);
                    ProgressDialog progressDialog2 = market3.a;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                break;
        }
    }
}
