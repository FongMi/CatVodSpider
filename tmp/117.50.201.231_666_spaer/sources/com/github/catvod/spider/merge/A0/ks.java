package com.github.catvod.spider.merge.A0;

import com.whl.quickjs.wrapper.JSArray;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ks {
    public static JSArray a(QuickJSContext quickJSContext, List list) {
        JSArray jSArrayCreateNewJSArray = quickJSContext.createNewJSArray();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                jSArrayCreateNewJSArray.set(list.get(i), i);
            }
        }
        return jSArrayCreateNewJSArray;
    }
}
