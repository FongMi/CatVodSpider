package com.github.catvod.spider.merge.E;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class b {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static Locale a(Locale locale) {
        return locale != null ? locale : Locale.getDefault();
    }
}
