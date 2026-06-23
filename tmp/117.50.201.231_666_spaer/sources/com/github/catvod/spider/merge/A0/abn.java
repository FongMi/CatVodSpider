package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class abn implements Map {
    public final xy a;
    public LinkedList[] b;
    public int c;
    public int d;

    public abn() {
        jl jlVar = jl.c;
        this.c = 0;
        this.d = 12;
        this.a = jlVar;
        this.b = new LinkedList[8];
    }

    @Override // java.util.Map
    public final void clear() {
        this.b = new LinkedList[16];
        this.c = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        xy xyVar = this.a;
        int iF = xyVar.f(obj);
        LinkedList<lt> linkedList = this.b[iF & (r3.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (lt ltVar : linkedList) {
            if (xyVar.e(ltVar.a, obj)) {
                return ltVar.b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        lt ltVar;
        int iJ = 0;
        for (LinkedList linkedList : this.b) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (ltVar = (lt) it.next()) != null) {
                    iJ = po.j(iJ, this.a.f(ltVar.a));
                }
            }
        }
        return po.e(iJ, this.c);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        lt ltVar;
        if (obj == null) {
            return null;
        }
        int i = this.c;
        if (i > this.d) {
            LinkedList[] linkedListArr = this.b;
            int length = linkedListArr.length * 2;
            this.b = new LinkedList[length];
            this.d = (int) (((double) length) * 0.75d);
            for (LinkedList linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext() && (ltVar = (lt) it.next()) != null) {
                        put(ltVar.a, ltVar.b);
                    }
                }
            }
            this.c = i;
        }
        xy xyVar = this.a;
        int iF = xyVar.f(obj);
        LinkedList[] linkedListArr2 = this.b;
        int length2 = iF & (linkedListArr2.length - 1);
        LinkedList<lt> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            linkedListArr2[length2] = linkedList2;
        }
        for (lt ltVar2 : linkedList2) {
            if (xyVar.e(ltVar2.a, obj)) {
                Object obj3 = ltVar2.b;
                ltVar2.b = obj2;
                this.c++;
                return obj3;
            }
        }
        linkedList2.add(new lt(obj, obj2));
        this.c++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.c;
    }

    public final String toString() {
        lt ltVar;
        if (this.c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (LinkedList linkedList : this.b) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (ltVar = (lt) it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(ltVar.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ArrayList arrayList = new ArrayList(this.c);
        for (LinkedList linkedList : this.b) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((lt) it.next()).b);
                }
            }
        }
        return arrayList;
    }
}
