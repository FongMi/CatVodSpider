package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.whl.quickjs.wrapper.QuickJSContext;

public class JSDemo extends Spider {

    private QuickJSContext ctx;

    @Override
    public void init(Context context, String extend) {
        ctx = QuickJSContext.create();
        ctx.evaluate("var text = 'Hello QuickJS';");
        String text = ctx.getGlobalObject().getString("text");
        SpiderDebug.log(text);
    }

    @Override
    public void destroy() {
        ctx.destroy();
    }
}
