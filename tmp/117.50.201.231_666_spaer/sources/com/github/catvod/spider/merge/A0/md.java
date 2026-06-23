package com.github.catvod.spider.merge.A0;

import java.util.List;
import okhttp3.HttpUrl;
import rxhttp.wrapper.cookie.ICookieJar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract /* synthetic */ class md {
    public static List a(ICookieJar iCookieJar, HttpUrl httpUrl) {
        return iCookieJar.loadCookie(httpUrl);
    }

    public static void b(ICookieJar iCookieJar, HttpUrl httpUrl, List list) {
        iCookieJar.saveCookie(httpUrl, list);
    }
}
