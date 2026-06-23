package com.github.catvod.spider.merge.A0;

import java.util.Map;
import rxhttp.wrapper.param.IParam;
import rxhttp.wrapper.param.Param;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract /* synthetic */ class gy {
    public static Param a(IParam iParam, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            iParam.add((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    public static Param b(IParam iParam, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            iParam.addEncodedQuery((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    public static Param c(IParam iParam, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            iParam.addQuery((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    public static Param d(IParam iParam, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            iParam.setEncodedQuery((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    public static Param e(IParam iParam, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            iParam.setQuery((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    public static Param f(IParam iParam, String str, Object obj) {
        iParam.removeAllQuery(str);
        return iParam.addEncodedQuery(str, obj);
    }

    public static Param g(IParam iParam, String str, Object obj) {
        iParam.removeAllQuery(str);
        return iParam.addQuery(str, obj);
    }

    public static Param h(IParam iParam, Object obj) {
        return iParam.tag(Object.class, obj);
    }
}
