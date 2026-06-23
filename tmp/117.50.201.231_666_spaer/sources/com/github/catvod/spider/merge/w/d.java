package com.github.catvod.spider.merge.w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class d<K, V> implements Map<K, V> {
    protected final com.github.catvod.spider.merge.w.a a;
    protected int c = 0;
    protected int d = 12;
    protected LinkedList<a<K, V>>[] b = new LinkedList[8];

    public static class a<K, V> {
        public final K a;
        public V b;

        public a(K k, V v) {
            this.a = k;
            this.b = v;
        }

        public final String toString() {
            return this.a.toString() + ":" + this.b.toString();
        }
    }

    public d(com.github.catvod.spider.merge.w.a aVar) {
        this.a = aVar;
    }

    @Override // java.util.Map
    public final void clear() {
        this.b = new LinkedList[16];
        this.c = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iF = this.a.F(obj);
        LinkedList<a<K, V>> linkedList = this.b[iF & (r2.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (a<K, V> aVar : linkedList) {
            if (this.a.E(aVar.a, obj)) {
                return aVar.b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        a<K, V> next;
        int iH = 0;
        for (LinkedList<a<K, V>> linkedList : this.b) {
            if (linkedList != null) {
                Iterator<a<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    iH = com.github.catvod.spider.merge.F.a.h(iH, this.a.F(next.a));
                }
            }
        }
        return com.github.catvod.spider.merge.F.a.b(iH, this.c);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        a<K, V> next;
        if (k == null) {
            return null;
        }
        if (this.c > this.d) {
            LinkedList<a<K, V>>[] linkedListArr = this.b;
            int length = linkedListArr.length * 2;
            this.b = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.d = (int) (d * 0.75d);
            int i = this.c;
            for (LinkedList<a<K, V>> linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator<a<K, V>> it = linkedList.iterator();
                    while (it.hasNext() && (next = it.next()) != null) {
                        put(next.a, next.b);
                    }
                }
            }
            this.c = i;
        }
        int iF = this.a.F(k);
        LinkedList<a<K, V>>[] linkedListArr2 = this.b;
        int length2 = iF & (linkedListArr2.length - 1);
        LinkedList<a<K, V>> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList<>();
            linkedListArr2[length2] = linkedList2;
        }
        for (a<K, V> aVar : linkedList2) {
            if (this.a.E(aVar.a, k)) {
                V v2 = aVar.b;
                aVar.b = v;
                this.c++;
                return v2;
            }
        }
        linkedList2.add(new a<>(k, v));
        this.c++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.c;
    }

    public final String toString() {
        a<K, V> next;
        if (this.c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (LinkedList<a<K, V>> linkedList : this.b) {
            if (linkedList != null) {
                Iterator<a<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(next.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        ArrayList arrayList = new ArrayList(this.c);
        for (LinkedList<a<K, V>> linkedList : this.b) {
            if (linkedList != null) {
                Iterator<a<K, V>> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b);
                }
            }
        }
        return arrayList;
    }
}
