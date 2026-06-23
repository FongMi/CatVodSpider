package com.github.catvod.spider.merge.A0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class pe implements Iterator, wi {
    public final /* synthetic */ int a = 2;
    public int b;
    public final Object c;

    public pe(ei eiVar) {
        this.c = eiVar.a.iterator();
        this.b = eiVar.b;
    }

    public pe(ph phVar) {
        this.c = phVar;
    }

    public pe(Object[] objArr) {
        ko.f("array", objArr);
        this.c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.a) {
            case 0:
                return this.b < ((ph) this.c).size();
            case 1:
                return this.b < ((Object[]) this.c).length;
        }
        while (true) {
            int i = this.b;
            it = (Iterator) this.c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.b;
                this.b = i + 1;
                return ((ph) this.c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
        while (true) {
            int i3 = this.b;
            it = (Iterator) this.c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
