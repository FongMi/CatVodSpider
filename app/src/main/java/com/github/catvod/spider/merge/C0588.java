package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ჾ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0588<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected final AbstractC0581<? super K> f1305;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected LinkedList<C0589<K, V>>[] f1306;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected int f1307;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected int f1308;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected int f1309;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected int f1310;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ჾ$Ϳ, reason: contains not printable characters */
    public static class C0589<K, V> {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public final K f1311;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public V f1312;

        public C0589(K k, V v) {
            this.f1311 = k;
            this.f1312 = v;
        }

        public String toString() {
            return this.f1311.toString() + SOY.d("40") + this.f1312.toString();
        }
    }

    public C0588(AbstractC0581<? super K> abstractC0581) {
        this(abstractC0581, 16, 8);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static <K, V> LinkedList<C0589<K, V>>[] m1857(int i) {
        return new LinkedList[i];
    }

    @Override // java.util.Map
    public void clear() {
        this.f1306 = m1857(16);
        this.f1307 = 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        if (obj == 0) {
            return null;
        }
        LinkedList<C0589<K, V>> linkedList = this.f1306[m1859(obj)];
        if (linkedList == null) {
            return null;
        }
        for (C0589<K, V> c0589 : linkedList) {
            if (this.f1305.mo412(c0589.f1311, obj)) {
                return c0589.f1312;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        C0589<K, V> next;
        int iM408 = C0120.m408();
        for (LinkedList<C0589<K, V>> linkedList : this.f1306) {
            if (linkedList != null) {
                Iterator<C0589<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    iM408 = C0120.m410(iM408, this.f1305.mo413(next.f1311));
                }
            }
        }
        return C0120.m406(iM408, size());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f1307 == 0;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            return null;
        }
        if (this.f1307 > this.f1308) {
            m1858();
        }
        int iM1859 = m1859(k);
        LinkedList<C0589<K, V>>[] linkedListArr = this.f1306;
        LinkedList<C0589<K, V>> linkedList = linkedListArr[iM1859];
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            linkedListArr[iM1859] = linkedList;
        }
        for (C0589<K, V> c0589 : linkedList) {
            if (this.f1305.mo412(c0589.f1311, k)) {
                V v2 = c0589.f1312;
                c0589.f1312 = v;
                this.f1307++;
                return v2;
            }
        }
        linkedList.add(new C0589<>(k, v));
        this.f1307++;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.f1307;
    }

    public String toString() {
        C0589<K, V> next;
        if (size() == 0) {
            return SOY.d("012F");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (LinkedList<C0589<K, V>> linkedList : this.f1306) {
            if (linkedList != null) {
                Iterator<C0589<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(SOY.d("5672"));
                    }
                    sb.append(next.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        ArrayList arrayList = new ArrayList(size());
        for (LinkedList<C0589<K, V>> linkedList : this.f1306) {
            if (linkedList != null) {
                Iterator<C0589<K, V>> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f1312);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected void m1858() {
        C0589<K, V> next;
        LinkedList<C0589<K, V>>[] linkedListArr = this.f1306;
        this.f1309 += 4;
        int length = linkedListArr.length * 2;
        this.f1306 = m1857(length);
        double d = length;
        Double.isNaN(d);
        this.f1308 = (int) (d * 0.75d);
        int size = size();
        for (LinkedList<C0589<K, V>> linkedList : linkedListArr) {
            if (linkedList != null) {
                Iterator<C0589<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    put(next.f1311, next.f1312);
                }
            }
        }
        this.f1307 = size;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected int m1859(K k) {
        return this.f1305.mo413(k) & (this.f1306.length - 1);
    }

    public C0588(AbstractC0581<? super K> abstractC0581, int i, int i2) {
        this.f1307 = 0;
        this.f1308 = 12;
        this.f1309 = 1;
        this.f1310 = 8;
        this.f1305 = abstractC0581 == null ? C0121.f308 : abstractC0581;
        this.f1306 = m1857(i2);
        this.f1310 = i2;
    }
}
