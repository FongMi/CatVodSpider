package com.github.catvod.spider.merge.N0;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class i implements Iterable<Long> {
    private final long b = 1;
    private final long c = 0;
    private final long d = 1;

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new j(this.b, this.c, this.d);
    }
}
