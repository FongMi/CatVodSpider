package com.github.catvod.spider.merge.N0;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class a implements Iterable<Character> {
    private final char b = 1;
    private final char c = (char) 0;
    private final int d = 1;

    public final char a() {
        return this.b;
    }

    public final char b() {
        return this.c;
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new b(this.b, this.c, this.d);
    }
}
