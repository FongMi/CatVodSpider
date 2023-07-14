package com.github.catvod.js;

import com.github.catvod.utils.Utils;
import com.google.errorprone.annotations.Keep;
import com.whl.quickjs.wrapper.JSMethod;
import com.whl.quickjs.wrapper.QuickJSContext;

public class Method {

    private QuickJSContext ctx;

    public Method(QuickJSContext ctx) {
        this.ctx = ctx;
    }

    @Keep
    @JSMethod
    public void showToast(String msg) {
        Utils.notify(msg);
    }
}
