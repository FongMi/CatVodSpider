package com.github.catvod.spider.merge.u;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0634c implements Set<C0633b> {
    protected boolean a;
    public a b;
    public final ArrayList<C0633b> c;
    public int d;
    protected BitSet e;
    public boolean f;
    public boolean g;
    public final boolean h;
    private int i;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.u.c$a */
    public static abstract class a extends com.github.catvod.spider.merge.w.b<C0633b> {
        public a(com.github.catvod.spider.merge.w.a aVar) {
            super(aVar, 2);
        }

        @Override // com.github.catvod.spider.merge.w.b
        protected final C0633b a(Object obj) {
            if (obj instanceof C0633b) {
                return (C0633b) obj;
            }
            return null;
        }

        @Override // com.github.catvod.spider.merge.w.b
        protected final C0633b[] c(int i) {
            return new C0633b[i];
        }

        @Override // com.github.catvod.spider.merge.w.b
        protected final C0633b[][] d(int i) {
            return new C0633b[i][];
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.u.c$b */
    public static final class b extends com.github.catvod.spider.merge.w.a {
        public static final b a = new b();

        private b() {
        }

        @Override // com.github.catvod.spider.merge.w.a
        public final boolean E(Object obj, Object obj2) {
            C0633b c0633b = (C0633b) obj;
            C0633b c0633b2 = (C0633b) obj2;
            if (c0633b == c0633b2) {
                return true;
            }
            return c0633b != null && c0633b2 != null && c0633b.a.b == c0633b2.a.b && c0633b.b == c0633b2.b && c0633b.e.equals(c0633b2.e);
        }

        @Override // com.github.catvod.spider.merge.w.a
        public final int F(Object obj) {
            C0633b c0633b = (C0633b) obj;
            return c0633b.e.hashCode() + ((((c0633b.a.b + 217) * 31) + c0633b.b) * 31);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.u.c$c, reason: collision with other inner class name */
    public static class C0043c extends a {
        public C0043c() {
            super(b.a);
        }
    }

    public C0634c() {
        this(true);
    }

    public C0634c(boolean z) {
        this.a = false;
        this.c = new ArrayList<>(7);
        this.i = -1;
        this.b = new C0043c();
        this.h = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/u/b;Lcom/github/catvod/spider/merge/w/c<Lcom/github/catvod/spider/merge/u/S;Lcom/github/catvod/spider/merge/u/S;Lcom/github/catvod/spider/merge/u/S;>;)Z */
    public final void a(C0633b c0633b, com.github.catvod.spider.merge.w.c cVar) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (c0633b.e != b0.a) {
            this.f = true;
        }
        if (c0633b.b() > 0) {
            this.g = true;
        }
        C0633b c0633bF = this.b.f(c0633b);
        if (c0633bF == c0633b) {
            this.i = -1;
            this.c.add(c0633b);
            return;
        }
        S sG = S.g(c0633bF.c, c0633b.c, !this.h, cVar);
        c0633bF.d = Math.max(c0633bF.d, c0633b.d);
        if (c0633b.c()) {
            c0633bF.d |= 1073741824;
        }
        c0633bF.c = sG;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        a((C0633b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends C0633b> collection) {
        Iterator<? extends C0633b> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next(), null);
        }
        return false;
    }

    public final void b(AbstractC0639h abstractC0639h) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.b.isEmpty()) {
            return;
        }
        for (C0633b c0633b : this.c) {
            S sB = c0633b.c;
            T t = abstractC0639h.b;
            if (t != null) {
                synchronized (t) {
                    sB = S.b(sB, abstractC0639h.b, new IdentityHashMap());
                }
            }
            c0633b.c = sB;
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
        a aVar = this.b;
        if (aVar != null) {
            return aVar.contains(obj);
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
        if (!(obj instanceof C0634c)) {
            return false;
        }
        C0634c c0634c = (C0634c) obj;
        ArrayList<C0633b> arrayList = this.c;
        return arrayList != null && arrayList.equals(c0634c.c) && this.h == c0634c.h && this.d == c0634c.d && this.e == c0634c.e && this.f == c0634c.f && this.g == c0634c.g;
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
    public final Iterator<C0633b> iterator() {
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
