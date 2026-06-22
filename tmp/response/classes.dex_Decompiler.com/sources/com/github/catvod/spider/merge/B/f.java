package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class f<K, V> implements Map<K, V> {
    protected final a a;
    protected int c = 0;
    protected int d = 12;
    protected LinkedList<e<K, V>>[] b = new LinkedList[8];

    public f(a aVar) {
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
        LinkedList<e<K, V>> linkedList = this.b[iF & (r2.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (e<K, V> eVar : linkedList) {
            if (this.a.E(eVar.a, obj)) {
                return eVar.b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        e<K, V> next;
        int iF = 0;
        for (LinkedList<e<K, V>> linkedList : this.b) {
            if (linkedList != null) {
                Iterator<e<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    iF = l.f(iF, this.a.F(next.a));
                }
            }
        }
        return l.b(iF, this.c);
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
        e<K, V> next;
        if (k == null) {
            return null;
        }
        if (this.c > this.d) {
            LinkedList<e<K, V>>[] linkedListArr = this.b;
            int length = linkedListArr.length * 2;
            this.b = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.d = (int) (d * 0.75d);
            int i = this.c;
            for (LinkedList<e<K, V>> linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator<e<K, V>> it = linkedList.iterator();
                    while (it.hasNext() && (next = it.next()) != null) {
                        put(next.a, next.b);
                    }
                }
            }
            this.c = i;
        }
        int iF = this.a.F(k);
        LinkedList<e<K, V>>[] linkedListArr2 = this.b;
        int length2 = iF & (linkedListArr2.length - 1);
        LinkedList<e<K, V>> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList<>();
            linkedListArr2[length2] = linkedList2;
        }
        for (e<K, V> eVar : linkedList2) {
            if (this.a.E(eVar.a, k)) {
                V v2 = eVar.b;
                eVar.b = v;
                this.c++;
                return v2;
            }
        }
        linkedList2.add(new e<>(k, v));
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
        e<K, V> next;
        if (this.c == 0) {
            return oZP.d("0E12");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (LinkedList<e<K, V>> linkedList : this.b) {
            if (linkedList != null) {
                Iterator<e<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(oZP.d("594F"));
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
        for (LinkedList<e<K, V>> linkedList : this.b) {
            if (linkedList != null) {
                Iterator<e<K, V>> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b);
                }
            }
        }
        return arrayList;
    }
}
