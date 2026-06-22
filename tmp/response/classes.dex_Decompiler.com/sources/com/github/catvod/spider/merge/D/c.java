package com.github.catvod.spider.merge.D;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class c {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static Locale a(Locale locale) {
        return locale != null ? locale : Locale.getDefault();
    }
}
