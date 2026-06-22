package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class S implements Map {
    public int b = 0;
    public int c = 12;
    public LinkedList[] a = new LinkedList[8];

    @Override // java.util.Map
    public final void clear() {
        this.a = new LinkedList[16];
        this.b = 0;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = r10
            com.github.catvod.spider.merge.A.b r1 = (com.github.catvod.spider.merge.A.C0001b) r1
            com.github.catvod.spider.merge.A.i r2 = r1.a
            int r2 = r2.b
            r3 = 7
            int r2 = com.github.catvod.spider.merge.R.a.b(r3, r2)
            com.github.catvod.spider.merge.A.Q r1 = r1.c
            int r1 = com.github.catvod.spider.merge.R.a.c(r2, r1)
            r2 = 2
            int r1 = com.github.catvod.spider.merge.R.a.a(r1, r2)
            java.util.LinkedList[] r2 = r9.a
            int r3 = r2.length
            r4 = 1
            int r3 = r3 - r4
            r1 = r1 & r3
            r1 = r2[r1]
            if (r1 != 0) goto L26
            return r0
        L26:
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.next()
            com.github.catvod.spider.merge.C.b r2 = (com.github.catvod.spider.merge.C.b) r2
            java.lang.Object r3 = r2.a
            com.github.catvod.spider.merge.A.b r3 = (com.github.catvod.spider.merge.A.C0001b) r3
            r5 = r10
            com.github.catvod.spider.merge.A.b r5 = (com.github.catvod.spider.merge.A.C0001b) r5
            if (r3 != r5) goto L41
        L3f:
            r6 = 1
            goto L59
        L41:
            r6 = 0
            if (r3 == 0) goto L59
            com.github.catvod.spider.merge.A.i r7 = r3.a
            int r7 = r7.b
            com.github.catvod.spider.merge.A.i r8 = r5.a
            int r8 = r8.b
            if (r7 != r8) goto L59
            com.github.catvod.spider.merge.A.Q r3 = r3.c
            com.github.catvod.spider.merge.A.Q r5 = r5.c
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L59
            goto L3f
        L59:
            if (r6 == 0) goto L2a
            java.lang.Object r10 = r2.b
            return r10
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A.S.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int hashCode() {
        com.github.catvod.spider.merge.C.b bVar;
        int iB = 0;
        for (LinkedList linkedList : this.a) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (bVar = (com.github.catvod.spider.merge.C.b) it.next()) != null) {
                    C0001b c0001b = (C0001b) bVar.a;
                    iB = com.github.catvod.spider.merge.R.a.b(iB, com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.c(com.github.catvod.spider.merge.R.a.b(7, c0001b.a.b), c0001b.c), 2));
                }
            }
        }
        return com.github.catvod.spider.merge.R.a.a(iB, this.b);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        com.github.catvod.spider.merge.C.b bVar;
        if (obj == null) {
            return null;
        }
        int i = this.b;
        if (i > this.c) {
            LinkedList[] linkedListArr = this.a;
            int length = linkedListArr.length * 2;
            this.a = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            this.c = (int) (d * 0.75d);
            for (LinkedList linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext() && (bVar = (com.github.catvod.spider.merge.C.b) it.next()) != null) {
                        put(bVar.a, bVar.b);
                    }
                }
            }
            this.b = i;
        }
        C0001b c0001b = (C0001b) obj;
        int iA = com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.c(com.github.catvod.spider.merge.R.a.b(7, c0001b.a.b), c0001b.c), 2);
        LinkedList[] linkedListArr2 = this.a;
        int length2 = iA & (linkedListArr2.length - 1);
        LinkedList<com.github.catvod.spider.merge.C.b> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            linkedListArr2[length2] = linkedList2;
        }
        for (com.github.catvod.spider.merge.C.b bVar2 : linkedList2) {
            C0001b c0001b2 = (C0001b) bVar2.a;
            C0001b c0001b3 = (C0001b) obj;
            if (c0001b2 == c0001b3 || (c0001b2 != null && c0001b2.a.b == c0001b3.a.b && c0001b2.c.equals(c0001b3.c))) {
                Object obj3 = bVar2.b;
                bVar2.b = obj2;
                this.b++;
                return obj3;
            }
        }
        linkedList2.add(new com.github.catvod.spider.merge.C.b(obj, obj2));
        this.b++;
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
        return this.b;
    }

    public final String toString() {
        com.github.catvod.spider.merge.C.b bVar;
        if (this.b == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (LinkedList linkedList : this.a) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (bVar = (com.github.catvod.spider.merge.C.b) it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(bVar.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ArrayList arrayList = new ArrayList(this.b);
        for (LinkedList linkedList : this.a) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.github.catvod.spider.merge.C.b) it.next()).b);
                }
            }
        }
        return arrayList;
    }
}
