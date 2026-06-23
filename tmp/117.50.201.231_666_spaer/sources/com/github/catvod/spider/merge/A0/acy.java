package com.github.catvod.spider.merge.A0;

import rxhttp.wrapper.param.BodyParam;
import rxhttp.wrapper.param.FormParam;
import rxhttp.wrapper.param.JsonArrayParam;
import rxhttp.wrapper.param.JsonParam;
import rxhttp.wrapper.param.Method;
import rxhttp.wrapper.param.NoBodyParam;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract /* synthetic */ class acy {
    public static BodyParam a(String str) {
        return new BodyParam(str, Method.DELETE);
    }

    public static FormParam b(String str) {
        return new FormParam(str, Method.DELETE);
    }

    public static JsonParam c(String str) {
        return new JsonParam(str, Method.DELETE);
    }

    public static JsonArrayParam d(String str) {
        return new JsonArrayParam(str, Method.DELETE);
    }

    public static NoBodyParam e(String str) {
        return new NoBodyParam(str, Method.GET);
    }

    public static NoBodyParam f(String str) {
        return new NoBodyParam(str, Method.HEAD);
    }

    public static BodyParam g(String str) {
        return new BodyParam(str, Method.PATCH);
    }

    public static FormParam h(String str) {
        return new FormParam(str, Method.PATCH);
    }

    public static JsonParam i(String str) {
        return new JsonParam(str, Method.PATCH);
    }

    public static JsonArrayParam j(String str) {
        return new JsonArrayParam(str, Method.PATCH);
    }

    public static BodyParam k(String str) {
        return new BodyParam(str, Method.POST);
    }

    public static FormParam l(String str) {
        return new FormParam(str, Method.POST);
    }

    public static JsonParam m(String str) {
        return new JsonParam(str, Method.POST);
    }

    public static JsonArrayParam n(String str) {
        return new JsonArrayParam(str, Method.POST);
    }

    public static BodyParam o(String str) {
        return new BodyParam(str, Method.PUT);
    }

    public static FormParam p(String str) {
        return new FormParam(str, Method.PUT);
    }

    public static JsonParam q(String str) {
        return new JsonParam(str, Method.PUT);
    }

    public static JsonArrayParam r(String str) {
        return new JsonArrayParam(str, Method.PUT);
    }
}
