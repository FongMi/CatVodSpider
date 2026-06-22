package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0818f implements Set<C0814b> {
    protected boolean a;
    public C0817e b;
    public final ArrayList<C0814b> c;
    public int d;
    protected BitSet e;
    public boolean f;
    public boolean g;
    public final boolean h;
    private int i;

    public C0818f() {
        this(true);
    }

    public C0818f(boolean z) {
        this.a = false;
        this.c = new ArrayList<>(7);
        this.i = -1;
        this.b = new C0817e(0);
        this.h = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/KW/b;Lcom/github/catvod/spider/merge/Bk/d<Lcom/github/catvod/spider/merge/KW/X;Lcom/github/catvod/spider/merge/KW/X;Lcom/github/catvod/spider/merge/KW/X;>;)Z */
    public final void a(C0814b c0814b, com.github.catvod.spider.merge.Bk.d dVar) {
        if (this.a) {
            throw new IllegalStateException(ZrJ.d("2D2B223E68361C376B243B650B262A29272B153A"));
        }
        if (c0814b.e != l0.a) {
            this.f = true;
        }
        if (c0814b.b() > 0) {
            this.g = true;
        }
        C0814b c0814bF = this.b.f(c0814b);
        if (c0814bF == c0814b) {
            this.i = -1;
            this.c.add(c0814b);
            return;
        }
        X xG = X.g(c0814bF.c, c0814b.c, !this.h, dVar);
        c0814bF.d = Math.max(c0814bF.d, c0814b.d);
        if (c0814b.c()) {
            c0814bF.d |= 1073741824;
        }
        c0814bF.c = xG;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        a((C0814b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends C0814b> collection) {
        Iterator<? extends C0814b> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next(), null);
        }
        return false;
    }

    public final void b(AbstractC0824l abstractC0824l) {
        if (this.a) {
            throw new IllegalStateException(ZrJ.d("2D2B223E68361C376B243B650B262A29272B153A"));
        }
        if (this.b.isEmpty()) {
            return;
        }
        for (C0814b c0814b : this.c) {
            X xB = c0814b.c;
            Y y = abstractC0824l.b;
            if (y != null) {
                synchronized (y) {
                    xB = X.b(xB, abstractC0824l.b, new IdentityHashMap());
                }
            }
            c0814b.c = xB;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.a) {
            throw new IllegalStateException(ZrJ.d("2D2B223E68361C376B243B650B262A29272B153A"));
        }
        this.c.clear();
        this.i = -1;
        this.b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        C0817e c0817e = this.b;
        if (c0817e != null) {
            return c0817e.contains(obj);
        }
        throw new UnsupportedOperationException(ZrJ.d("2D2B223E68281C3723222C6510306B232731592A263D2420142625392D215925243F68371C222F222629006338283C3657"));
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
        if (!(obj instanceof C0818f)) {
            return false;
        }
        C0818f c0818f = (C0818f) obj;
        ArrayList<C0814b> arrayList = this.c;
        return arrayList != null && arrayList.equals(c0818f.c) && this.h == c0818f.h && this.d == c0818f.d && this.e == c0818f.e && this.f == c0818f.f && this.g == c0818f.g;
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
    public final Iterator<C0814b> iterator() {
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
            sb.append(ZrJ.d("552B2A3E1B201422253921263A2C25392D3D0D7E"));
            sb.append(this.f);
        }
        if (this.d != 0) {
            sb.append(ZrJ.d("5536252439301C02273975"));
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(ZrJ.d("552024232E2910203F242622382F3F3E75"));
            sb.append(this.e);
        }
        if (this.g) {
            sb.append(ZrJ.d("5527223D3B0C173724023D311C31082226311C3B3F"));
        }
        return sb.toString();
    }
}
