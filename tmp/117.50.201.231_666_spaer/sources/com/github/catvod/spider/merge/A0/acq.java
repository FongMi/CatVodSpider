package com.github.catvod.spider.merge.A0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class acq implements Iterator, wi {
    public int a = -1;
    public int b;
    public int c;
    public add d;
    public final /* synthetic */ acr e;

    public acq(acr acrVar) {
        this.e = acrVar;
        acrVar.getClass();
        int iH = xj.h(0, 0, ((String) acrVar.c).length());
        this.b = iH;
        this.c = iH;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.github.catvod.spider.merge.A0.ha, com.github.catvod.spider.merge.A0.zy] */
    public final void f() {
        in inVar;
        int i = this.c;
        if (i < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        acr acrVar = this.e;
        acrVar.getClass();
        String str = (String) acrVar.c;
        if (i <= str.length() && (inVar = (in) acrVar.b.invoke(str, Integer.valueOf(this.c))) != null) {
            int iIntValue = ((Number) inVar.a).intValue();
            int iIntValue2 = ((Number) inVar.b).intValue();
            this.d = xj.k(this.b, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.b = i2;
            this.c = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.d = new add(this.b, dc.e(str), 1);
            this.c = -1;
        }
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            f();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            f();
        }
        if (this.a == 0) {
            throw new NoSuchElementException();
        }
        add addVar = this.d;
        ko.d("null cannot be cast to non-null type kotlin.ranges.IntRange", addVar);
        this.d = null;
        this.a = -1;
        return addVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
