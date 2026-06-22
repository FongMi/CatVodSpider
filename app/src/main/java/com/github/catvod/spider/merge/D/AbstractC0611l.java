package com.github.catvod.spider.merge.D;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0611l implements f0 {
    private static final ThreadLocal<L> a = new ThreadLocal<>();
    private static final ThreadLocal<Character> b = new ThreadLocal<>();

    final char f(L l, Object obj, char c) {
        ThreadLocal<L> threadLocal = a;
        L l2 = threadLocal.get();
        threadLocal.set(l);
        ThreadLocal<Character> threadLocal2 = b;
        threadLocal2.set(Character.valueOf(c));
        g();
        threadLocal.set(l2);
        return threadLocal2.get().charValue();
    }

    public abstract void g();
}
