package com.github.catvod.js.utils;

import com.whl.quickjs.wrapper.JSArray;
import com.whl.quickjs.wrapper.QuickJSContext;

import java.util.List;

public class JSUtil {

    public static JSArray toArray(QuickJSContext ctx, List<String> items) {
        JSArray array = ctx.createNewJSArray();
        if (items == null || items.isEmpty()) return array;
        for (int i = 0; i < items.size(); i++) array.set(items.get(i), i);
        return array;
    }
}
