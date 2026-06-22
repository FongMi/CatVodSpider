package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.z.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class f implements c {
    public final ArrayList a;
    public boolean b;

    static {
        f fVar = new f(new int[0]);
        fVar.b(0, 1114111);
        fVar.b = true;
        new f(new int[0]).b = true;
    }

    public f(f fVar) {
        this(new int[0]);
        c(fVar);
    }

    public final void a(int i) {
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        b(i, i);
    }

    public final void b(int i, int i2) {
        e eVarA = e.a(i, i2);
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (eVarA.b < eVarA.a) {
            return;
        }
        ArrayList arrayList = this.a;
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            e eVar = (e) listIterator.next();
            if (eVarA.equals(eVar)) {
                return;
            }
            int i3 = eVarA.a;
            int i4 = eVar.b;
            if (i3 != i4 + 1) {
                int i5 = eVarA.b;
                int i6 = eVar.a;
                if (i5 != i6 - 1 && ((i3 < i6 && i5 < i6) || i3 > i4)) {
                    if (i3 < i6 && i5 < i6) {
                        listIterator.previous();
                        listIterator.add(eVarA);
                        return;
                    }
                }
            }
            e eVarA2 = e.a(Math.min(i3, eVar.a), Math.max(eVarA.b, eVar.b));
            listIterator.set(eVarA2);
            while (listIterator.hasNext()) {
                e eVar2 = (e) listIterator.next();
                int i7 = eVarA2.a;
                int i8 = eVar2.b;
                if (i7 != i8 + 1) {
                    int i9 = eVarA2.b;
                    int i10 = eVar2.a;
                    if (i9 != i10 - 1 && ((i7 < i10 && i9 < i10) || i7 > i8)) {
                        return;
                    }
                }
                listIterator.remove();
                listIterator.previous();
                listIterator.set(e.a(Math.min(eVarA2.a, eVar2.a), Math.max(eVarA2.b, eVar2.b)));
                listIterator.next();
            }
            return;
        }
        arrayList.add(eVarA);
    }

    public final void c(c cVar) {
        if (cVar == null) {
            return;
        }
        int i = 0;
        if (cVar instanceof f) {
            ArrayList arrayList = ((f) cVar).a;
            int size = arrayList.size();
            while (i < size) {
                e eVar = (e) arrayList.get(i);
                b(eVar.a, eVar.b);
                i++;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = ((f) cVar).a;
        int size2 = arrayList3.size();
        while (i < size2) {
            e eVar2 = (e) arrayList3.get(i);
            int i2 = eVar2.b;
            for (int i3 = eVar2.a; i3 <= i2; i3++) {
                arrayList2.add(Integer.valueOf(i3));
            }
            i++;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a(((Integer) it.next()).intValue());
        }
    }

    public final boolean d(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            e eVar = (e) arrayList.get(i3);
            int i4 = eVar.a;
            if (eVar.b < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return true;
                }
                size = i3 - 1;
            }
        }
        return false;
    }

    public final boolean e() {
        ArrayList arrayList = this.a;
        return arrayList == null || arrayList.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        return this.a.equals(((f) obj).a);
    }

    public final void f() {
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) arrayList.get(i);
            int i2 = eVar.a;
            int i3 = eVar.b;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                arrayList.remove(i);
                return;
            }
            if (-2 == i2) {
                eVar.a = i2 + 1;
                return;
            }
            if (-2 == i3) {
                eVar.b = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                eVar.b = -3;
                b(-1, i3);
            }
        }
    }

    public final int g() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            e eVar = (e) arrayList.get(0);
            return (eVar.b - eVar.a) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar2 = (e) arrayList.get(i2);
            i += (eVar2.b - eVar2.a) + 1;
        }
        return i;
    }

    public final String h(x xVar) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (g() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i = eVar.a;
            int i2 = eVar.b;
            String strA = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strA = "<EOF>";
                } else if (i != -2) {
                    strA = xVar.a(i);
                }
                sb.append(strA);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    sb.append(i3 == -1 ? "<EOF>" : i3 == -2 ? "<EPSILON>" : xVar.a(i3));
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (g() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    public final int hashCode() {
        ArrayList<e> arrayList = this.a;
        int iB = 0;
        for (e eVar : arrayList) {
            iB = com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.b(iB, eVar.a), eVar.b);
        }
        return com.github.catvod.spider.merge.R.a.a(iB, arrayList.size() * 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (g() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i = eVar.a;
            int i2 = eVar.b;
            if (i != i2) {
                sb.append(i);
                sb.append("..");
                sb.append(i2);
            } else if (i == -1) {
                sb.append("<EOF>");
            } else {
                sb.append(i);
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (g() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    public f(int... iArr) {
        this.a = new ArrayList(iArr.length);
        for (int i : iArr) {
            a(i);
        }
    }
}
