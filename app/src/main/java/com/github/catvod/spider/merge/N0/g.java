package com.github.catvod.spider.merge.N0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g extends com.github.catvod.spider.merge.M0.b {
    private final int b;
    private final int c;
    private boolean d;
    private int e;

    public g(int i, int i2, int i3) {
        this.b = i3;
        this.c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.d = z;
        this.e = z ? i : i2;
    }

    @Override // com.github.catvod.spider.merge.M0.b
    public final int b() {
        int i = this.e;
        if (i != this.c) {
            this.e = this.b + i;
        } else {
            if (!this.d) {
                throw new NoSuchElementException();
            }
            this.d = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }
}
