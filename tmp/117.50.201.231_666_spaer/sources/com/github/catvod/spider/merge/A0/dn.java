package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class dn extends uj {
    public aci a = new aci();
    public final tp b;
    public final wz c;
    public rf d;
    public final boolean e;
    public final ArrayList f;
    public boolean g;

    static {
        new WeakHashMap();
    }

    public dn(tp tpVar) {
        wz wzVar = new wz();
        this.c = wzVar;
        wzVar.d(0);
        this.e = true;
        this.b = null;
        this.a.j();
        this.d = null;
        this.g = false;
        ArrayList arrayList = this.f;
        if (arrayList != null && arrayList.remove((Object) null) && this.f.isEmpty()) {
            this.f = null;
        }
        Arrays.fill(wzVar.b, 0, wzVar.c, 0);
        wzVar.c = 0;
        wzVar.d(0);
        lc lcVar = this.r;
        if (lcVar != null) {
            lcVar.i();
        }
        this.b = tpVar;
    }

    public final void h() {
        to toVarL = l();
        if (toVarL.a != -1) {
            this.b.g();
        }
        ArrayList arrayList = this.f;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (this.e || z) {
            if (this.a.a) {
                rf rfVar = this.d;
                du duVar = new du(toVarL);
                rfVar.getClass();
                rfVar.h(duVar);
                ArrayList arrayList2 = this.f;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((ra) it.next()).getClass();
                    }
                    return;
                }
                return;
            }
            rf rfVar2 = this.d;
            mm mmVar = new mm(toVarL);
            rfVar2.getClass();
            rfVar2.h(mmVar);
            ArrayList arrayList3 = this.f;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    ((ra) it2.next()).getClass();
                    mmVar.a.toString();
                    throw null;
                }
            }
        }
    }

    public final void i(rf rfVar) {
        rf rfVar2;
        rf rfVar3;
        if (this.e && (rfVar2 = this.d) != rfVar && (rfVar3 = rfVar2.e) != null) {
            ArrayList arrayList = rfVar3.g;
            if (arrayList != null) {
                arrayList.remove(arrayList.size() - 1);
            }
            rfVar3.h(rfVar);
        }
        this.d = rfVar;
    }

    public final void j(int i, rf rfVar) {
        rf rfVar2;
        rf rfVar3;
        this.s = i;
        this.d = rfVar;
        this.b.f(1);
        if (this.e && (rfVar3 = (rfVar2 = this.d).e) != null) {
            rfVar3.h(rfVar2);
        }
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    public final void k() {
        int size;
        if (this.g) {
            rf rfVar = this.d;
            this.b.f(1);
            rfVar.getClass();
        } else {
            rf rfVar2 = this.d;
            this.b.f(-1);
            rfVar2.getClass();
        }
        ArrayList arrayList = this.f;
        if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
            this.d.getClass();
            throw null;
        }
        rf rfVar3 = this.d;
        this.s = rfVar3.f;
        this.d = rfVar3.e;
    }

    public final to l() {
        return this.b.f(1);
    }

    public final ii m() {
        return wl.y.k(this.s, this.d);
    }

    public final to n(int i) {
        to toVarL = l();
        if (toVarL.a == i) {
            if (i == -1) {
                this.g = true;
            }
            this.a.j();
            h();
        } else {
            toVarL = this.a.l((wl) this);
            if (this.e && toVarL.g == -1) {
                rf rfVar = this.d;
                du duVar = new du(toVarL);
                rfVar.getClass();
                rfVar.h(duVar);
            }
        }
        return toVarL;
    }

    public final void o(to toVar, String str, ip ipVar) {
        int i = toVar.b;
        int i2 = toVar.c;
        yb ybVar = this.q;
        if (ybVar == null) {
            throw new NullPointerException("delegates");
        }
        Iterator it = ybVar.iterator();
        while (it.hasNext()) {
            ((wj) it.next()).e(this, toVar, i, i2, str, ipVar);
        }
    }

    public final boolean p(int i) {
        wz wzVar = this.c;
        int i2 = wzVar.c;
        int i3 = i2 - 1;
        if (i3 < 0 || i3 >= i2) {
            throw new IndexOutOfBoundsException();
        }
        return i >= wzVar.b[i3];
    }
}
