package com.github.catvod.spider.merge.q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.q.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1373b<K, V> extends n<K, V> implements Map<K, V> {
    m<K, V> i;

    private m<K, V> l() {
        if (this.i == null) {
            this.i = new C1372a(this);
        }
        return this.i;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        m<K, V> mVarL = l();
        if (mVarL.a == null) {
            mVarL.a = new i(mVarL);
        }
        return mVarL.a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        m<K, V> mVarL = l();
        if (mVarL.b == null) {
            mVarL.b = new j(mVarL);
        }
        return mVarL.b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        m<K, V> mVarL = l();
        if (mVarL.c == null) {
            mVarL.c = new l(mVarL);
        }
        return mVarL.c;
    }
}
