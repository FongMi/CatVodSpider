package com.github.catvod.spider.merge.D0;

import java.io.StringReader;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f<T> {
    private final Class<T> a;

    f(Class<T> cls) {
        this.a = cls;
    }

    public final T a(String str) {
        return (T) new g(new j(new StringReader(str))).e(this.a);
    }
}
