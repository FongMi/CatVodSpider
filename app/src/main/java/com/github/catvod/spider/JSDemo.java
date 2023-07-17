package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.crawler.Spider;
import com.whl.quickjs.android.QuickJSLoader;
import com.whl.quickjs.wrapper.QuickJSContext;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JSDemo extends Spider {

    private ExecutorService executor;
    private QuickJSContext ctx;

    private void submit(Runnable runnable) {
        executor.submit(runnable);
    }

    private <T> Future<T> submit(Callable<T> callable) {
        return executor.submit(callable);
    }

    private void initJS() {
        if (ctx != null) return;
        ctx = QuickJSContext.create();
        QuickJSLoader.initConsoleLog(ctx);
    }

    @Override
    public void init(Context context, String extend) {
        this.executor = Executors.newSingleThreadExecutor();
        submit(this::initJS);
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        return submit(() -> {
            ctx.evaluate("var text = 'homeContent';");
            return ctx.getGlobalObject().getString("text");
        }).get();
    }

    @Override
    public void destroy() {
        submit(() -> {
            executor.shutdownNow();
            ctx.destroy();
        });
    }
}
