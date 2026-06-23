package com.github.catvod.spider.merge.FM.y;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0464f implements Set<C0460b> {
    protected boolean a;
    public C0463e b;
    public final ArrayList<C0460b> c;
    public int d;
    protected BitSet e;
    public boolean f;
    public boolean g;
    public final boolean h;
    private int i;

    public C0464f() {
        this(true);
    }

    public C0464f(boolean z) {
        this.a = false;
        this.c = new ArrayList<>(7);
        this.i = -1;
        this.b = new C0463e(0);
        this.h = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/FM/y/b;Lcom/github/catvod/spider/merge/FM/A/d<Lcom/github/catvod/spider/merge/FM/y/X;Lcom/github/catvod/spider/merge/FM/y/X;Lcom/github/catvod/spider/merge/FM/y/X;>;)Z */
    public final void a(C0460b c0460b, com.github.catvod.spider.merge.FM.A.d dVar) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (c0460b.e != l0.a) {
            this.f = true;
        }
        if (c0460b.b() > 0) {
            this.g = true;
        }
        C0460b c0460bF = this.b.f(c0460b);
        if (c0460bF == c0460b) {
            this.i = -1;
            this.c.add(c0460b);
            return;
        }
        X xG = X.g(c0460bF.c, c0460b.c, !this.h, dVar);
        c0460bF.d = Math.max(c0460bF.d, c0460b.d);
        if (c0460b.c()) {
            c0460bF.d |= 1073741824;
        }
        c0460bF.c = xG;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        a((C0460b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends C0460b> collection) {
        Iterator<? extends C0460b> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next(), null);
        }
        return false;
    }

    public final void b(AbstractC0470l abstractC0470l) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.b.isEmpty()) {
            return;
        }
        for (C0460b c0460b : this.c) {
            X xB = c0460b.c;
            Y y = abstractC0470l.b;
            if (y != null) {
                synchronized (y) {
                    xB = X.b(xB, abstractC0470l.b, new IdentityHashMap());
                }
            }
            c0460b.c = xB;
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
        C0463e c0463e = this.b;
        if (c0463e != null) {
            return c0463e.contains(obj);
        }
        throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0464f)) {
            return false;
        }
        C0464f c0464f = (C0464f) obj;
        ArrayList<C0460b> arrayList = this.c;
        return arrayList != null && arrayList.equals(c0464f.c) && this.h == c0464f.h && this.d == c0464f.d && this.e == c0464f.e && this.f == c0464f.f && this.g == c0464f.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        if (!this.a) {
            return this.c.hashCode();
        }
        if (this.i == -1) {
            this.i = this.c.hashCode();
        }
        return this.i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<C0460b> iterator() {
        return this.c.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.b.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.b.toArray(tArr);
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
}
