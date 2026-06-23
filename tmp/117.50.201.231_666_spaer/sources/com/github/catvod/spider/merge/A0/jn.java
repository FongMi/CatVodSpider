package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class jn implements Set {
    public int d;
    public BitSet e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public boolean a = false;
    public final ArrayList c = new ArrayList(7);
    public int i = -1;
    public jm b = new jm(jl.a);

    public jn(boolean z) {
        this.h = z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        j((jk) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j((jk) it.next(), null);
        }
        return false;
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
        jm jmVar = this.b;
        if (jmVar != null) {
            return jmVar.contains(obj);
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
        if (!(obj instanceof jn)) {
            return false;
        }
        jn jnVar = (jn) obj;
        ArrayList arrayList = this.c;
        return arrayList != null && arrayList.equals(jnVar.c) && this.h == jnVar.h && this.d == jnVar.d && this.e == jnVar.e && this.f == jnVar.f && this.g == jnVar.g;
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

    public final void j(jk jkVar, xa xaVar) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (jkVar.i != vf.e) {
            this.f = true;
        }
        if ((jkVar.h & (-1073741825)) > 0) {
            this.g = true;
        }
        jk jkVar2 = (jk) this.b.h(jkVar);
        if (jkVar2 == jkVar) {
            this.i = -1;
            this.c.add(jkVar);
            return;
        }
        xr xrVarL = xr.l(jkVar2.g, jkVar.g, !this.h, xaVar);
        jkVar2.h = Math.max(jkVar2.h, jkVar.h);
        if (jkVar.j()) {
            jkVar2.h |= 1073741824;
        }
        jkVar2.g = xrVarL;
    }

    public final void k(ol olVar) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.b.isEmpty()) {
            return;
        }
        for (jk jkVar : this.c) {
            xr xrVarK = jkVar.g;
            xa xaVar = olVar.q;
            if (xaVar != null) {
                synchronized (xaVar) {
                    xrVarK = xr.k(xrVarK, olVar.q, new IdentityHashMap());
                }
            }
            jkVar.g = xrVarK;
        }
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
        return (jk[]) this.b.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.b.toArray(objArr);
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
