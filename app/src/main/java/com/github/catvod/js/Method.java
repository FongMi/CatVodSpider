package com.github.catvod.js;

import com.github.catvod.utils.Utils;
import com.google.errorprone.annotations.Keep;
import com.whl.quickjs.wrapper.JSMethod;
import com.whl.quickjs.wrapper.QuickJSContext;

public class Method {

    private final QuickJSContext context;

    public Method(QuickJSContext context) {
        this.context = context;
    }

    @Keep
    @JSMethod
    public void showToast(String msg) {
        Utils.notify(msg);
    }

    @Keep
    public class test {

        @Keep
        @JSMethod
        public int add(int a, int b) {
            return a + b;
        }
    }
}
