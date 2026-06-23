package com.github.catvod.spider.merge.A0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class mf {
    public final lw a;
    public final int b;
    public final fc c;
    public final HashMap d;
    public final ArrayList e;
    public final ArrayList f;
    public final int g;
    public final int h;
    public boolean i;
    public final aba j;
    public final boolean k;
    public final vs l;
    public final vs m;
    public final ArrayDeque n;

    public mf() {
        this.a = lw.b;
        this.b = 1;
        this.c = fc.b;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        aba abaVar = oa.a;
        this.g = 2;
        this.h = 2;
        this.i = true;
        this.j = oa.a;
        this.k = true;
        this.l = oa.c;
        this.m = oa.d;
        this.n = new ArrayDeque();
    }

    public mf(oa oaVar) {
        this.a = lw.b;
        this.b = 1;
        this.c = fc.b;
        HashMap map = new HashMap();
        this.d = map;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        aba abaVar = oa.a;
        this.g = 2;
        this.h = 2;
        this.i = true;
        this.j = oa.a;
        this.k = true;
        this.l = oa.c;
        this.m = oa.d;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.n = arrayDeque;
        this.a = oaVar.j;
        this.c = oaVar.k;
        map.putAll(oaVar.l);
        this.i = oaVar.m;
        this.j = oaVar.n;
        this.b = oaVar.w;
        this.g = oaVar.p;
        this.h = oaVar.q;
        arrayList.addAll(oaVar.r);
        arrayList2.addAll(oaVar.s);
        this.k = oaVar.o;
        this.l = oaVar.t;
        this.m = oaVar.u;
        arrayDeque.addAll(oaVar.v);
    }

    public final oa o() {
        wv wvVar;
        wv wvVar2;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = he.a;
        acf acfVar = acg.c;
        int i = this.g;
        int i2 = this.h;
        if (i != 2 || i2 != 2) {
            ach achVar = new ach(acfVar, i, i2);
            wv wvVar3 = ado.a;
            wv wvVar4 = new wv(Date.class, achVar, 0);
            if (z) {
                fs fsVar = he.c;
                fsVar.getClass();
                wvVar = new wv(fsVar.d, new ach(fsVar, i, i2), 0);
                fs fsVar2 = he.b;
                fsVar2.getClass();
                wvVar2 = new wv(fsVar2.d, new ach(fsVar2, i, i2), 0);
            } else {
                wvVar = null;
                wvVar2 = null;
            }
            arrayList3.add(wvVar4);
            if (z) {
                arrayList3.add(wvVar);
                arrayList3.add(wvVar2);
            }
        }
        return new oa(this.a, this.c, new HashMap(this.d), this.i, this.j, this.k, this.b, this.g, this.h, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.l, this.m, new ArrayList(this.n));
    }

    public final void p(Class cls, Object obj) {
        if (cls == Object.class || il.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + cls);
        }
        ArrayList arrayList = this.e;
        fj fjVar = new fj(cls);
        arrayList.add(new dp(obj, fjVar, fjVar.b == fjVar.a));
        if (obj instanceof kv) {
            wv wvVar = ado.a;
            arrayList.add(new wv(new fj(cls), (kv) obj, 2));
        }
    }
}
