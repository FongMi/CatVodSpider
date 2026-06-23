package com.github.catvod.spider.merge.Mm;

import com.github.catvod.spider.merge.gu.H;
import com.github.catvod.spider.merge.gu.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j implements f {
    protected List<i> a;
    protected boolean b;

    static {
        g(0, 1114111).i();
        new j(new int[0]).i();
    }

    public j(int... iArr) {
        this.a = new ArrayList(iArr.length);
        for (int i : iArr) {
            a(i);
        }
    }

    public static j g(int i, int i2) {
        j jVar = new j(new int[0]);
        jVar.b(i, i2);
        return jVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public static j k(j jVar, j jVar2) {
        int i = 0;
        if (jVar.f()) {
            return new j(new int[0]);
        }
        j jVar3 = new j(new int[0]);
        jVar3.c(jVar);
        if (!jVar2.f()) {
            int i2 = 0;
            while (i < jVar3.a.size() && i2 < jVar2.a.size()) {
                i iVar = (i) jVar3.a.get(i);
                i iVar2 = (i) jVar2.a.get(i2);
                int i3 = iVar2.b;
                int i4 = iVar.a;
                if (i3 >= i4) {
                    int i5 = iVar2.a;
                    int i6 = iVar.b;
                    if (i5 <= i6) {
                        i iVar3 = i5 > i4 ? new i(i4, i5 - 1) : null;
                        i iVar4 = i3 < i6 ? new i(i3 + 1, i6) : null;
                        Object r2 = jVar3.a;
                        if (iVar3 != null) {
                            r2.set(i, iVar3);
                            if (iVar4 != null) {
                                i++;
                                jVar3.a.add(i, iVar4);
                            }
                        } else if (iVar4 != null) {
                            r2.set(i, iVar4);
                        } else {
                            r2.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return jVar3;
    }

    public final void a(int i) {
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        b(i, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void b(int i, int i2) {
        i iVarB = i.b(i, i2);
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (iVarB.b < iVarB.a) {
            return;
        }
        ListIterator<i> listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            i next = listIterator.next();
            if (iVarB.equals(next)) {
                return;
            }
            boolean z = true;
            if ((iVarB.a == next.b + 1 || iVarB.b == next.a - 1) || !iVarB.a(next)) {
                i iVarC = iVarB.c(next);
                listIterator.set(iVarC);
                while (listIterator.hasNext()) {
                    i next2 = listIterator.next();
                    if (!(iVarC.a == next2.b + 1 || iVarC.b == next2.a - 1) && iVarC.a(next2)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(iVarC.c(next2));
                    listIterator.next();
                }
                return;
            }
            int i3 = iVarB.a;
            int i4 = next.a;
            if (i3 >= i4 || iVarB.b >= i4) {
                z = false;
            }
            if (z) {
                listIterator.previous();
                listIterator.add(iVarB);
                return;
            }
        }
        this.a.add(iVarB);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public final j c(f fVar) {
        if (fVar == null) {
            return this;
        }
        int i = 0;
        if (fVar instanceof j) {
            j jVar = (j) fVar;
            int size = jVar.a.size();
            while (i < size) {
                i iVar = (i) jVar.a.get(i);
                b(iVar.a, iVar.b);
                i++;
            }
        } else {
            j jVar2 = (j) fVar;
            ArrayList arrayList = new ArrayList();
            int size2 = jVar2.a.size();
            while (i < size2) {
                i iVar2 = (i) jVar2.a.get(i);
                int i2 = iVar2.b;
                for (int i3 = iVar2.a; i3 <= i2; i3++) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a(((Integer) it.next()).intValue());
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public final boolean d(int i) {
        int size = this.a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            i iVar = (i) this.a.get(i3);
            int i4 = iVar.a;
            if (iVar.b < i) {
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public final int e() {
        if (f()) {
            throw new RuntimeException("set is empty");
        }
        return ((i) this.a.get(0)).a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        return this.a.equals(((j) obj).a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public final boolean f() {
        Object r0 = this.a;
        return r0 == 0 || r0.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public final void h() {
        if (this.b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            i iVar = (i) this.a.get(i);
            int i2 = iVar.a;
            int i3 = iVar.b;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                this.a.remove(i);
                return;
            }
            if (-2 == i2) {
                iVar.a = i2 + 1;
                return;
            }
            if (-2 == i3) {
                iVar.b = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                iVar.b = -3;
                b(-1, i3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public final int hashCode() {
        int iO = 0;
        for (i iVar : this.a) {
            iO = com.github.catvod.spider.merge.Dw.i.o(com.github.catvod.spider.merge.Dw.i.o(iO, iVar.a), iVar.b);
        }
        return com.github.catvod.spider.merge.Dw.i.b(iO, this.a.size() * 2);
    }

    public final void i() {
        boolean z = this.b;
        this.b = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public final int j() {
        int size = this.a.size();
        if (size == 1) {
            i iVar = (i) this.a.get(0);
            return (iVar.b - iVar.a) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i iVar2 = (i) this.a.get(i2);
            i += (iVar2.b - iVar2.a) + 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public final String l(H h) {
        StringBuilder sb = new StringBuilder();
        Object r1 = this.a;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (j() > 1) {
            sb.append("{");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            int i = iVar.a;
            int i2 = iVar.b;
            String strA = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strA = "<EOF>";
                } else if (i != -2) {
                    strA = ((I) h).a(i);
                }
                sb.append(strA);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    sb.append(i3 == -1 ? "<EOF>" : i3 == -2 ? "<EPSILON>" : ((I) h).a(i3));
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Mm.i>] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object r1 = this.a;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (j() > 1) {
            sb.append("{");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            int i = iVar.a;
            int i2 = iVar.b;
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
        if (j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }
}
