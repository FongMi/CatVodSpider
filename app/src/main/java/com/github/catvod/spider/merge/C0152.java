package com.github.catvod.spider.merge;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˡ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0152 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final ConcurrentMap<String, List<Locale>> f362 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final ConcurrentMap<String, List<Locale>> f363 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static Locale m482(Locale locale) {
        return locale != null ? locale : Locale.getDefault();
    }
}
