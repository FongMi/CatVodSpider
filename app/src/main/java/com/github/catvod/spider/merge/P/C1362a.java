package com.github.catvod.spider.merge.p;

import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1362a<K, V> extends h<K, V> {
    private HashMap<K, d<K, V>> f = new HashMap<>();

    @Override // com.github.catvod.spider.merge.p.h
    protected final d<K, V> b(K k) {
        return this.f.get(k);
    }

    public final boolean contains(K k) {
        return this.f.containsKey(k);
    }

    @Override // com.github.catvod.spider.merge.p.h
    public final V e(K k) {
        V v = (V) super.e(k);
        this.f.remove(k);
        return v;
    }
}
