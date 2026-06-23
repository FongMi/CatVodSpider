package com.github.catvod.spider.merge.C0.Q;

import com.github.catvod.spider.merge.C0.S.c;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class f implements Set<b> {
    protected boolean c;
    public e d;
    public final ArrayList<b> e;
    public int f;
    protected BitSet g;
    public boolean h;
    public boolean i;
    public final boolean j;
    private int k;

    public f() {
        this(true);
    }

    public f(boolean z) {
        this.c = false;
        this.e = new ArrayList<>(7);
        this.k = -1;
        this.d = new e(0);
        this.j = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/C0/Q/b;Lcom/github/catvod/spider/merge/C0/S/c<Lcom/github/catvod/spider/merge/C0/Q/X;Lcom/github/catvod/spider/merge/C0/Q/X;Lcom/github/catvod/spider/merge/C0/Q/X;>;)Z */
    public final void a(b bVar, c cVar) {
        if (this.c) {
            throw new IllegalStateException("This set is readonly");
        }
        if (bVar.e != l0.c) {
            this.h = true;
        }
        if (bVar.b() > 0) {
            this.i = true;
        }
        b bVar2 = (b) this.d.f(bVar);
        if (bVar2 == bVar) {
            this.k = -1;
            this.e.add(bVar);
            return;
        }
        X xG = X.g(bVar2.c, bVar.c, !this.j, cVar);
        bVar2.d = Math.max(bVar2.d, bVar.d);
        if (bVar.c()) {
            bVar2.d |= 1073741824;
        }
        bVar2.c = xG;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        a((b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends b> collection) {
        Iterator<? extends b> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next(), null);
        }
        return false;
    }

    public final void b(l lVar) {
        if (this.c) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.d.isEmpty()) {
            return;
        }
        for (b bVar : this.e) {
            X xB = bVar.c;
            Y y = lVar.b;
            if (y != null) {
                synchronized (y) {
                    xB = X.b(xB, lVar.b, new IdentityHashMap());
                }
            }
            bVar.c = xB;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.c) {
            throw new IllegalStateException("This set is readonly");
        }
        this.e.clear();
        this.k = -1;
        this.d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        e eVar = this.d;
        if (eVar != null) {
            return eVar.contains(obj);
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        ArrayList<b> arrayList = this.e;
        return arrayList != null && arrayList.equals(fVar.e) && this.j == fVar.j && this.f == fVar.f && this.g == fVar.g && this.h == fVar.h && this.i == fVar.i;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        if (!this.c) {
            return this.e.hashCode();
        }
        if (this.k == -1) {
            this.k = this.e.hashCode();
        }
        return this.k;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<b> iterator() {
        return this.e.iterator();
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
        return this.e.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return (b[]) this.d.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.d.toArray(tArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.toString());
        if (this.h) {
            sb.append(",hasSemanticContext=");
            sb.append(this.h);
        }
        if (this.f != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.f);
        }
        if (this.g != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.g);
        }
        if (this.i) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }
}
