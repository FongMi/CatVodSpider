package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.C0255J;
import com.github.catvod.spider.merge.y.InterfaceC0254I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class k implements g {
    protected List<j> a;
    protected boolean b;

    static {
        g(0, 1114111).i();
        new k(new int[0]).i();
    }

    public k(int... iArr) {
        this.a = new ArrayList(iArr.length);
        for (int i : iArr) {
            a(i);
        }
    }

    public static k g(int i, int i2) {
        k kVar = new k(new int[0]);
        kVar.b(i, i2);
        return kVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public static k k(k kVar, k kVar2) {
        int i = 0;
        if (kVar.f()) {
            return new k(new int[0]);
        }
        k kVar3 = new k(new int[0]);
        kVar3.c(kVar);
        if (!kVar2.f()) {
            int i2 = 0;
            while (i < kVar3.a.size() && i2 < kVar2.a.size()) {
                j jVar = (j) kVar3.a.get(i);
                j jVar2 = (j) kVar2.a.get(i2);
                int i3 = jVar2.b;
                int i4 = jVar.a;
                if (i3 >= i4) {
                    int i5 = jVar2.a;
                    int i6 = jVar.b;
                    if (i5 <= i6) {
                        j jVar3 = i5 > i4 ? new j(i4, i5 - 1) : null;
                        j jVar4 = i3 < i6 ? new j(i3 + 1, i6) : null;
                        ?? r2 = kVar3.a;
                        if (jVar3 != null) {
                            r2.set(i, jVar3);
                            if (jVar4 != null) {
                                i++;
                                kVar3.a.add(i, jVar4);
                            }
                        } else if (jVar4 != null) {
                            r2.set(i, jVar4);
                        } else {
                            r2.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return kVar3;
    }

    public final void a(int i) {
        if (this.b) {
            throw new IllegalStateException(oZP.d("160E19661875140303241E75070A1625033B191657080221101D01200006101B"));
        }
        b(i, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void b(int i, int i2) {
        j jVarB = j.b(i, i2);
        if (this.b) {
            throw new IllegalStateException(oZP.d("160E19661875140303241E75070A1625033B191657080221101D01200006101B"));
        }
        if (jVarB.b < jVarB.a) {
            return;
        }
        ListIterator<j> listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            j next = listIterator.next();
            if (jVarB.equals(next)) {
                return;
            }
            boolean z = true;
            if ((jVarB.a == next.b + 1 || jVarB.b == next.a - 1) || !jVarB.a(next)) {
                j jVarC = jVarB.c(next);
                listIterator.set(jVarC);
                while (listIterator.hasNext()) {
                    j next2 = listIterator.next();
                    if (!(jVarC.a == next2.b + 1 || jVarC.b == next2.a - 1) && jVarC.a(next2)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(jVarC.c(next2));
                    listIterator.next();
                }
                return;
            }
            int i3 = jVarB.a;
            int i4 = next.a;
            if (i3 >= i4 || jVarB.b >= i4) {
                z = false;
            }
            if (z) {
                listIterator.previous();
                listIterator.add(jVarB);
                return;
            }
        }
        this.a.add(jVarB);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public final k c(g gVar) {
        if (gVar == null) {
            return this;
        }
        int i = 0;
        if (gVar instanceof k) {
            k kVar = (k) gVar;
            int size = kVar.a.size();
            while (i < size) {
                j jVar = (j) kVar.a.get(i);
                b(jVar.a, jVar.b);
                i++;
            }
        } else {
            k kVar2 = (k) gVar;
            ArrayList arrayList = new ArrayList();
            int size2 = kVar2.a.size();
            while (i < size2) {
                j jVar2 = (j) kVar2.a.get(i);
                int i2 = jVar2.b;
                for (int i3 = jVar2.a; i3 <= i2; i3++) {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public final boolean d(int i) {
        int size = this.a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            j jVar = (j) this.a.get(i3);
            int i4 = jVar.a;
            if (jVar.b < i) {
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public final int e() {
        if (f()) {
            throw new RuntimeException(oZP.d("060A03610526550A1A31182C"));
        }
        return ((j) this.a.get(0)).a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        return this.a.equals(((k) obj).a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public final boolean f() {
        ?? r0 = this.a;
        return r0 == 0 || r0.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public final void h() {
        if (this.b) {
            throw new IllegalStateException(oZP.d("160E19661875140303241E75070A1625033B191657080221101D01200006101B"));
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            j jVar = (j) this.a.get(i);
            int i2 = jVar.a;
            int i3 = jVar.b;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                this.a.remove(i);
                return;
            }
            if (-2 == i2) {
                jVar.a = i2 + 1;
                return;
            }
            if (-2 == i3) {
                jVar.b = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                jVar.b = -3;
                b(-1, i3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public final int hashCode() {
        int iF = 0;
        for (j jVar : this.a) {
            iF = l.f(l.f(iF, jVar.a), jVar.b);
        }
        return l.b(iF, this.a.size() * 2);
    }

    public final void i() {
        boolean z = this.b;
        this.b = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public final int j() {
        int size = this.a.size();
        if (size == 1) {
            j jVar = (j) this.a.get(0);
            return (jVar.b - jVar.a) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j jVar2 = (j) this.a.get(i2);
            i += (jVar2.b - jVar2.a) + 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public final String l(InterfaceC0254I interfaceC0254I) {
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.a;
        if (r1 == 0 || r1.isEmpty()) {
            return oZP.d("0E12");
        }
        if (j() > 1) {
            sb.append(oZP.d("0E"));
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            int i = jVar.a;
            int i2 = jVar.b;
            String strD = oZP.d("594F");
            String strD2 = oZP.d("492A271225193A2149");
            String strD3 = oZP.d("492A380752");
            if (i == i2) {
                if (i == -1) {
                    strD2 = strD3;
                } else if (i != -2) {
                    strD2 = ((C0255J) interfaceC0254I).a(i);
                }
                sb.append(strD2);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(strD);
                    }
                    sb.append(i3 == -1 ? strD3 : i3 == -2 ? strD2 : ((C0255J) interfaceC0254I).a(i3));
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(strD);
            }
        }
        if (j() > 1) {
            sb.append(oZP.d("08"));
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.B.j>] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.a;
        if (r1 == 0 || r1.isEmpty()) {
            return oZP.d("0E12");
        }
        if (j() > 1) {
            sb.append(oZP.d("0E"));
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            int i = jVar.a;
            int i2 = jVar.b;
            if (i != i2) {
                sb.append(i);
                sb.append(oZP.d("5B41"));
                sb.append(i2);
            } else if (i == -1) {
                sb.append(oZP.d("492A380752"));
            } else {
                sb.append(i);
            }
            if (it.hasNext()) {
                sb.append(oZP.d("594F"));
            }
        }
        if (j() > 1) {
            sb.append(oZP.d("08"));
        }
        return sb.toString();
    }
}
