package com.github.catvod.spider.merge.f1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1090F implements Iterator<s2> {
    private s2 b;

    C1090F(s2 s2Var) {
        this.b = s2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final s2 next() {
        s2 s2Var = this.b;
        if (s2Var == null) {
            throw new NoSuchElementException();
        }
        this.b = s2Var.g;
        return s2Var;
    }
}
