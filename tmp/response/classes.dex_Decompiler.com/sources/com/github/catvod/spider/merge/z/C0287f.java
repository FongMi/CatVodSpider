package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class C0287f implements Set<C0283b> {
    protected boolean a;
    public C0286e b;
    public final ArrayList<C0283b> c;
    public int d;
    protected BitSet e;
    public boolean f;
    public boolean g;
    public final boolean h;
    private int i;

    public C0287f() {
        this(true);
    }

    public C0287f(boolean z) {
        this.a = false;
        this.c = new ArrayList<>(7);
        this.i = -1;
        this.b = new C0286e(0);
        this.h = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/z/b;Lcom/github/catvod/spider/merge/B/d<Lcom/github/catvod/spider/merge/z/X;Lcom/github/catvod/spider/merge/z/X;Lcom/github/catvod/spider/merge/z/X;>;)Z */
    public final void a(C0283b c0283b, com.github.catvod.spider.merge.B.d dVar) {
        if (this.a) {
            throw new IllegalStateException(oZP.d("21071E324C26101B57281F75070A1625033B1916"));
        }
        if (c0283b.e != l0.a) {
            this.f = true;
        }
        if (c0283b.b() > 0) {
            this.g = true;
        }
        C0283b c0283bF = this.b.f(c0283b);
        if (c0283bF == c0283b) {
            this.i = -1;
            this.c.add(c0283b);
            return;
        }
        X xG = X.g(c0283bF.c, c0283b.c, !this.h, dVar);
        c0283bF.d = Math.max(c0283bF.d, c0283b.d);
        if (c0283b.c()) {
            c0283bF.d |= 1073741824;
        }
        c0283bF.c = xG;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        a((C0283b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends C0283b> collection) {
        Iterator<? extends C0283b> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next(), null);
        }
        return false;
    }

    public final void b(AbstractC0293l abstractC0293l) {
        if (this.a) {
            throw new IllegalStateException(oZP.d("21071E324C26101B57281F75070A1625033B1916"));
        }
        if (this.b.isEmpty()) {
            return;
        }
        for (C0283b c0283b : this.c) {
            X xB = c0283b.c;
            Y y = abstractC0293l.b;
            if (y != null) {
                synchronized (y) {
                    xB = X.b(xB, abstractC0293l.b, new IdentityHashMap());
                }
            }
            c0283b.c = xB;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.a) {
            throw new IllegalStateException(oZP.d("21071E324C26101B57281F75070A1625033B1916"));
        }
        this.c.clear();
        this.i = -1;
        this.b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        C0286e c0286e = this.b;
        if (c0286e != null) {
            return c0286e.contains(obj);
        }
        throw new UnsupportedOperationException(oZP.d("21071E324C38101B1F2E08751C1C572F032155061A310030180A19350931550918334C27100E132E02390C4F042418265B"));
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
        if (!(obj instanceof C0287f)) {
            return false;
        }
        C0287f c0287f = (C0287f) obj;
        ArrayList<C0283b> arrayList = this.c;
        return arrayList != null && arrayList.equals(c0287f.c) && this.h == c0287f.h && this.d == c0287f.d && this.e == c0287f.e && this.f == c0287f.f && this.g == c0287f.g;
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
    public final Iterator<C0283b> iterator() {
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
            sb.append(oZP.d("590716323F30180E1935053636001935092D0152"));
            sb.append(this.f);
        }
        if (this.d != 0) {
            sb.append(oZP.d("591A19281D20102E1B3551"));
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(oZP.d("590C182F0A391C0C032802323403033251"));
            sb.append(this.e);
        }
        if (this.g) {
            sb.append(oZP.d("590B1E311F1C1B1B180E1921101D342E0221101703"));
        }
        return sb.toString();
    }
}
