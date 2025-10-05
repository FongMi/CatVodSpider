package com.github.catvod.js;

import com.github.catvod.js.utils.JSUtil;
import com.github.catvod.js.utils.Parser;
import com.whl.quickjs.wrapper.JSArray;
import com.whl.quickjs.wrapper.JSMethod;
import com.whl.quickjs.wrapper.QuickJSContext;

import java.lang.reflect.Method;

public class Function {

    private final QuickJSContext ctx;
    private final Parser parser;

    public Function(QuickJSContext ctx) {
        this.parser = new Parser();
        this.ctx = ctx;
        setProperty();
    }

    private void setProperty() {
        for (Method method : getClass().getMethods()) {
            if (!method.isAnnotationPresent(JSMethod.class)) continue;
            ctx.getGlobalObject().setProperty(method.getName(), args -> {
                try {
                    return method.invoke(this, args);
                } catch (Exception e) {
                    return null;
                }
            });
        }
    }

    @JSMethod
    public String pd(String html, String rule, String urlKey) {
        return parser.parseDomForUrl(html, rule, urlKey);
    }

    @JSMethod
    public String pdfh(String html, String rule) {
        return parser.parseDomForUrl(html, rule, "");
    }

    @JSMethod
    public JSArray pdfa(String html, String rule) {
        return JSUtil.toArray(ctx, parser.parseDomForArray(html, rule));
    }

    @JSMethod
    public JSArray pdfl(String html, String rule, String texts, String urls, String urlKey) {
        return JSUtil.toArray(ctx, parser.parseDomForList(html, rule, texts, urls, urlKey));
    }
}
