package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ii {
    public final ArrayList a;
    public boolean b;

    static {
        ii iiVar = new ii(new int[0]);
        iiVar.d(0, 1114111);
        iiVar.b = true;
        new ii(new int[0]).b = true;
    }

    public ii(ii iiVar) {
        this(new int[0]);
        e(iiVar);
    }

    public ii(int... iArr) {
        this.a = new ArrayList(iArr.length);
        for (int i : iArr) {
            c(i);
        }
    }

    public final void c(int i) {
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        d(i, i);
    }

    public final void d(int i, int i2) {
        bd bdVarD = bd.d(i, i2);
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (bdVarD.c < bdVarD.b) {
            return;
        }
        ArrayList arrayList = this.a;
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            bd bdVar = (bd) listIterator.next();
            if (bdVarD.equals(bdVar)) {
                return;
            }
            int i3 = bdVarD.b;
            int i4 = bdVar.c;
            if (i3 != i4 + 1) {
                int i5 = bdVarD.c;
                int i6 = bdVar.b;
                if (i5 != i6 - 1 && ((i3 < i6 && i5 < i6) || i3 > i4)) {
                    if (i3 < i6 && i5 < i6) {
                        listIterator.previous();
                        listIterator.add(bdVarD);
                        return;
                    }
                }
            }
            bd bdVarD2 = bd.d(Math.min(i3, bdVar.b), Math.max(bdVarD.c, bdVar.c));
            listIterator.set(bdVarD2);
            while (listIterator.hasNext()) {
                bd bdVar2 = (bd) listIterator.next();
                int i7 = bdVarD2.b;
                int i8 = bdVar2.c;
                if (i7 != i8 + 1) {
                    int i9 = bdVarD2.c;
                    int i10 = bdVar2.b;
                    if (i9 != i10 - 1 && ((i7 < i10 && i9 < i10) || i7 > i8)) {
                        return;
                    }
                }
                listIterator.remove();
                listIterator.previous();
                listIterator.set(bd.d(Math.min(bdVarD2.b, bdVar2.b), Math.max(bdVarD2.c, bdVar2.c)));
                listIterator.next();
            }
            return;
        }
        arrayList.add(bdVarD);
    }

    public final void e(ii iiVar) {
        if (iiVar == null) {
            return;
        }
        ArrayList arrayList = iiVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bd bdVar = (bd) arrayList.get(i);
            d(bdVar.b, bdVar.c);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ii)) {
            return false;
        }
        return this.a.equals(((ii) obj).a);
    }

    public final boolean f(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            bd bdVar = (bd) arrayList.get(i3);
            int i4 = bdVar.b;
            if (bdVar.c < i) {
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

    public final boolean g() {
        ArrayList arrayList = this.a;
        return arrayList == null || arrayList.isEmpty();
    }

    public final void h() {
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bd bdVar = (bd) arrayList.get(i);
            int i2 = bdVar.b;
            int i3 = bdVar.c;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                arrayList.remove(i);
                return;
            }
            if (-2 == i2) {
                bdVar.b = i2 + 1;
                return;
            }
            if (-2 == i3) {
                bdVar.c = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                bdVar.c = -3;
                d(-1, i3);
            }
        }
    }

    public final int hashCode() {
        ArrayList<bd> arrayList = this.a;
        int iJ = 0;
        for (bd bdVar : arrayList) {
            iJ = po.j(po.j(iJ, bdVar.b), bdVar.c);
        }
        return po.e(iJ, arrayList.size() * 2);
    }

    public final int i() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            bd bdVar = (bd) arrayList.get(0);
            return (bdVar.c - bdVar.b) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bd bdVar2 = (bd) arrayList.get(i2);
            i += (bdVar2.c - bdVar2.b) + 1;
        }
        return i;
    }

    public final String j(hn hnVar) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (i() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bd bdVar = (bd) it.next();
            int i = bdVar.b;
            int i2 = bdVar.c;
            String strF = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strF = "<EOF>";
                } else if (i != -2) {
                    strF = hnVar.f(i);
                }
                sb.append(strF);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    sb.append(i3 == -1 ? "<EOF>" : i3 == -2 ? "<EPSILON>" : hnVar.f(i3));
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (i() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (i() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bd bdVar = (bd) it.next();
            int i = bdVar.b;
            int i2 = bdVar.c;
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
        if (i() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }
}
