package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.JSDemo;
import com.whl.quickjs.android.QuickJSLoader;
import com.whl.quickjs.wrapper.QuickJSContext;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class RunnableC0135c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ JSDemo b;

    public /* synthetic */ RunnableC0135c(JSDemo jSDemo, int i) {
        this.a = i;
        this.b = jSDemo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                JSDemo jSDemo = this.b;
                jSDemo.a.shutdownNow();
                jSDemo.b.destroy();
                break;
            default:
                JSDemo jSDemo2 = this.b;
                if (jSDemo2.b == null) {
                    QuickJSContext quickJSContextCreate = QuickJSContext.create();
                    jSDemo2.b = quickJSContextCreate;
                    QuickJSLoader.initConsoleLog(quickJSContextCreate);
                    break;
                }
                break;
        }
    }
}
