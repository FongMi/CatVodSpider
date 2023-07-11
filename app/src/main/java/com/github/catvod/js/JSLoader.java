package com.github.catvod.js;

import com.whl.quickjs.android.QuickJSLoader;

public class JSLoader {

    public static void init() {
        try {
            QuickJSLoader.init();
        } catch (Throwable ignored) {
        }
    }
}

