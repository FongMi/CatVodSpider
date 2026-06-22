package com.github.catvod.spider.merge;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class k {
    private final Map<Object, rv> S = new ConcurrentHashMap();
    protected String l8;

    public k(String str) {
        this.l8 = str;
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public abstract rv OL(Class<?> cls);

    public rv T4(Class<?> cls) {
        return this.S.computeIfAbsent(cls, new Function() { // from class: com.github.catvod.spider.merge.cI
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.l8.OL(obj);
            }
        });
    }

    protected void l8(Class<?> cls) {
    }
}
