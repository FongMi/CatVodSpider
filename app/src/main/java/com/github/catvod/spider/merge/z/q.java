package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.A.AbstractC0007h;
import com.github.catvod.spider.merge.P.A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class q extends u {
    public j d = new j();
    public final h e;
    public final com.github.catvod.spider.merge.C.d f;
    public r g;
    public final boolean h;
    public final ArrayList i;
    public boolean j;

    static {
        new WeakHashMap();
    }

    public q(h hVar) {
        com.github.catvod.spider.merge.C.d dVar = new com.github.catvod.spider.merge.C.d();
        this.f = dVar;
        dVar.a(0);
        this.h = true;
        this.e = null;
        this.d.b();
        this.g = null;
        this.j = false;
        ArrayList arrayList = this.i;
        if (arrayList != null && arrayList.remove((Object) null) && this.i.isEmpty()) {
            this.i = null;
        }
        Arrays.fill(dVar.a, 0, dVar.b, 0);
        dVar.b = 0;
        dVar.a(0);
        AbstractC0007h abstractC0007h = this.b;
        if (abstractC0007h != null) {
            abstractC0007h.a();
        }
        this.e = hVar;
    }

    @Override // com.github.catvod.spider.merge.z.u
    public final boolean b(int i) {
        com.github.catvod.spider.merge.C.d dVar = this.f;
        int i2 = dVar.b;
        int i3 = i2 - 1;
        if (i3 < 0 || i3 >= i2) {
            throw new IndexOutOfBoundsException();
        }
        return i >= dVar.a[i3];
    }

    public final void c() {
        f fVarG = g();
        if (fVarG.a != -1) {
            this.e.c();
        }
        ArrayList arrayList = this.i;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (this.h || z) {
            if (this.d.a) {
                r rVar = this.g;
                com.github.catvod.spider.merge.D.a aVar = new com.github.catvod.spider.merge.D.a(fVarG);
                rVar.getClass();
                rVar.b(aVar);
                ArrayList arrayList2 = this.i;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((p) it.next()).getClass();
                    }
                    return;
                }
                return;
            }
            r rVar2 = this.g;
            com.github.catvod.spider.merge.D.c cVar = new com.github.catvod.spider.merge.D.c(fVarG);
            rVar2.getClass();
            rVar2.b(cVar);
            ArrayList arrayList3 = this.i;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    ((p) it2.next()).getClass();
                    f fVar = cVar.a;
                    if (fVar != null) {
                        fVar.toString();
                    }
                    throw null;
                }
            }
        }
    }

    public final void d(r rVar) {
        r rVar2;
        r rVar3;
        if (this.h && (rVar2 = this.g) != rVar && (rVar3 = rVar2.a) != null) {
            ArrayList arrayList = rVar3.c;
            if (arrayList != null) {
                arrayList.remove(arrayList.size() - 1);
            }
            rVar3.b(rVar);
        }
        this.g = rVar;
    }

    public final void e(int i, r rVar) {
        r rVar2;
        r rVar3;
        this.c = i;
        this.g = rVar;
        this.e.b(1);
        if (this.h && (rVar3 = (rVar2 = this.g).a) != null) {
            rVar3.b(rVar2);
        }
        ArrayList arrayList = this.i;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    public final void f() {
        r rVar;
        int size;
        if (this.j) {
            rVar = this.g;
            this.e.b(1);
        } else {
            rVar = this.g;
            this.e.b(-1);
        }
        rVar.getClass();
        ArrayList arrayList = this.i;
        if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
            this.g.getClass();
            throw null;
        }
        r rVar2 = this.g;
        this.c = rVar2.b;
        this.g = rVar2.a;
    }

    public final f g() {
        return this.e.b(1);
    }

    public final com.github.catvod.spider.merge.C.f h() {
        return A.o.b(this.c, this.g);
    }

    public final f i(int i) {
        f fVarG = g();
        if (fVarG.a == i) {
            if (i == -1) {
                this.j = true;
            }
            this.d.b();
            c();
        } else {
            fVarG = this.d.g(this);
            if (this.h && fVarG.g == -1) {
                r rVar = this.g;
                com.github.catvod.spider.merge.D.a aVar = new com.github.catvod.spider.merge.D.a(fVarG);
                rVar.getClass();
                rVar.b(aVar);
            }
        }
        return fVarG;
    }

    public final void j(f fVar, String str, s sVar) {
        int i = fVar.b;
        int i2 = fVar.c;
        t tVar = this.a;
        if (tVar == null) {
            throw new NullPointerException("delegates");
        }
        Iterator<E> it = tVar.iterator();
        while (it.hasNext()) {
            ((i) it.next()).d(this, fVar, i, i2, str, sVar);
        }
    }
}
