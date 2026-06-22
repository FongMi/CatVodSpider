package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0004e implements Set {
    public int d;
    public BitSet e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public boolean a = false;
    public final ArrayList c = new ArrayList(7);
    public int i = -1;
    public C0003d b = new C0003d(0);

    public C0004e(boolean z) {
        this.h = z;
    }

    public final void a(C0001b c0001b, C0019u c0019u) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (c0001b.e != d0.a) {
            this.f = true;
        }
        if ((c0001b.d & (-1073741825)) > 0) {
            this.g = true;
        }
        C0001b c0001b2 = (C0001b) this.b.c(c0001b);
        if (c0001b2 == c0001b) {
            this.i = -1;
            this.c.add(c0001b);
            return;
        }
        Q qG = Q.g(c0001b2.c, c0001b.c, !this.h, c0019u);
        c0001b2.d = Math.max(c0001b2.d, c0001b.d);
        if (c0001b.b()) {
            c0001b2.d |= 1073741824;
        }
        c0001b2.c = qG;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        a((C0001b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a((C0001b) it.next(), null);
        }
        return false;
    }

    public final void b(AbstractC0007h abstractC0007h) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.b.isEmpty()) {
            return;
        }
        for (C0001b c0001b : this.c) {
            Q qB = c0001b.c;
            C0019u c0019u = abstractC0007h.b;
            if (c0019u != null) {
                synchronized (c0019u) {
                    qB = Q.b(qB, abstractC0007h.b, new IdentityHashMap());
                }
            }
            c0001b.c = qB;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        this.c.clear();
        this.i = -1;
        this.b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        C0003d c0003d = this.b;
        if (c0003d != null) {
            return c0003d.contains(obj);
        }
        throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0004e)) {
            return false;
        }
        C0004e c0004e = (C0004e) obj;
        ArrayList arrayList = this.c;
        return arrayList != null && arrayList.equals(c0004e.c) && this.h == c0004e.h && this.d == c0004e.d && this.e == c0004e.e && this.f == c0004e.f && this.g == c0004e.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        boolean z = this.a;
        ArrayList arrayList = this.c;
        if (!z) {
            return arrayList.hashCode();
        }
        if (this.i == -1) {
            this.i = arrayList.hashCode();
        }
        return this.i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.c.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return (C0001b[]) this.b.toArray();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.toString());
        if (this.f) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f);
        }
        if (this.d != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.e);
        }
        if (this.g) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.b.toArray(objArr);
    }
}
