package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.RunnableC0116b;
import com.github.catvod.spider.merge.b.RunnableC0120f;
import com.whl.quickjs.android.QuickJSLoader;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class JSDemo extends Spider {
    private ExecutorService a;
    private QuickJSContext b;

    public static /* synthetic */ void a(JSDemo jSDemo) {
        jSDemo.a.shutdownNow();
        jSDemo.b.destroy();
    }

    public static void b(JSDemo jSDemo) {
        if (jSDemo.b != null) {
            return;
        }
        QuickJSContext quickJSContextCreate = QuickJSContext.create();
        jSDemo.b = quickJSContextCreate;
        QuickJSLoader.initConsoleLog(quickJSContextCreate);
    }

    public static /* synthetic */ String c(JSDemo jSDemo) {
        jSDemo.b.evaluate(C0098a.a(new byte[]{77, -107, -20, 79, 53, -64, 16, -5, 27, -55, -66, 72, 41, -54, 5, -22, 120, -101, -16, 27, 36, -53, 28, -88, 0}, new byte[]{59, -12, -98, 111, 65, -91, 104, -113}));
        return jSDemo.b.getGlobalObject().getString(C0098a.a(new byte[]{91, -98, 0, -85}, new byte[]{47, -5, 120, -33, -37, -47, -56, 61}));
    }

    public void destroy() {
        this.a.submit(new RunnableC0120f(this, 4));
    }

    public String homeContent(boolean z) {
        return (String) this.a.submit(new Callable() { // from class: com.github.catvod.spider.merge.o.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return JSDemo.c(this.a);
            }
        }).get();
    }

    public void init(Context context, String str) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.submit(new RunnableC0116b(this, 5));
    }
}
