package com.github.catvod.spider.merge.mk;

import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class e implements CookieJar {
    e() {
    }

    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        List<Cookie> list = g.d.get(httpUrl.host());
        return list != null ? list : new ArrayList();
    }

    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        g.d.put(httpUrl.host(), list);
    }
}
