package com.github.catvod.spider.merge.N0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b extends com.github.catvod.spider.merge.M0.a {
    private final int b;
    private final int c;
    private boolean d;
    private int e;

    public b(char c, char c2, int i) {
        this.b = i;
        this.c = c2;
        boolean z = true;
        if (i <= 0 ? com.github.catvod.spider.merge.B.j.a(c, c2) < 0 : com.github.catvod.spider.merge.B.j.a(c, c2) > 0) {
            z = false;
        }
        this.d = z;
        this.e = z ? c : c2;
    }

    @Override // com.github.catvod.spider.merge.M0.a
    public final char b() {
        int i = this.e;
        if (i != this.c) {
            this.e = this.b + i;
        } else {
            if (!this.d) {
                throw new NoSuchElementException();
            }
            this.d = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }
}
