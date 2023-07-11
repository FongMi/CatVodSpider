package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.whl.quickjs.wrapper.QuickJSContext;

public class JSDemo extends Spider {

    private QuickJSContext jsContext;

    @Override
    public void init(Context context, String extend) {
        jsContext = QuickJSContext.create();
        jsContext.evaluate("var text = 'Hello QuickJS';");
        String text = jsContext.getGlobalObject().getString("text");
        SpiderDebug.log(text);
    }

    @Override
    public void destroy() {
        super.destroy();
        jsContext.destroy();
    }
}
