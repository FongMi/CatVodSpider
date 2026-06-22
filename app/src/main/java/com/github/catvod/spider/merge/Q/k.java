package com.github.catvod.spider.merge.q;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class k implements Iterator<Map.Entry<Object, Object>>, Map.Entry<Object, Object> {
    int b;
    final /* synthetic */ m e;
    boolean d = false;
    int c = -1;

    k(m mVar) {
        this.e = mVar;
        this.b = mVar.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C1376e.c(entry.getKey(), this.e.b(this.c, 0)) && C1376e.c(entry.getValue(), this.e.b(this.c, 1));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.d) {
            return this.e.b(this.c, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.d) {
            return this.e.b(this.c, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object objB = this.e.b(this.c, 0);
        Object objB2 = this.e.b(this.c, 1);
        return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Map.Entry<Object, Object> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c++;
        this.d = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        this.e.h(this.c);
        this.c--;
        this.b--;
        this.d = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.d) {
            return this.e.i(this.c, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
