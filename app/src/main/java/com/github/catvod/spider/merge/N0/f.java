package com.github.catvod.spider.merge.N0;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class f implements Iterable<Integer> {
    private final int b = 1;
    private final int c = 0;
    private final int d = 1;

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new g(this.b, this.c, this.d);
    }
}
