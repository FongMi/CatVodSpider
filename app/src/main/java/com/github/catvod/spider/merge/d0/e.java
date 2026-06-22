package com.github.catvod.spider.merge.D0;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e extends LinkedHashMap<String, Object> {
    public static d<e> a() {
        return new d<>(new e());
    }

    public final c b(String str) {
        c cVar = new c();
        Object obj = get(str);
        return obj instanceof c ? (c) obj : cVar;
    }

    public final boolean c(String str) {
        return d(str);
    }

    public final boolean d(String str) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public final int e(String str, int i) {
        Object obj = get(str);
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    public final long f(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    public final e g(String str) {
        return h(str, new e());
    }

    public final e h(String str, e eVar) {
        Object obj = get(str);
        return obj instanceof e ? (e) obj : eVar;
    }

    public final String i(String str, String str2) {
        Object obj = get(str);
        return obj instanceof String ? (String) obj : str2;
    }
}
