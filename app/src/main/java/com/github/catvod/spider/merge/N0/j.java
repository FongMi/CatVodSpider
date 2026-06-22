package com.github.catvod.spider.merge.N0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j extends com.github.catvod.spider.merge.M0.c {
    private final long b;
    private final long c;
    private boolean d;
    private long e;

    public j(long j, long j2, long j3) {
        this.b = j3;
        this.c = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.d = z;
        this.e = z ? j : j2;
    }

    @Override // com.github.catvod.spider.merge.M0.c
    public final long b() {
        long j = this.e;
        if (j != this.c) {
            this.e = this.b + j;
        } else {
            if (!this.d) {
                throw new NoSuchElementException();
            }
            this.d = false;
        }
        return j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }
}
