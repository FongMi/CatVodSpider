package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0074g extends ArrayList<com.github.catvod.spider.merge.L.m> {
    public C0074g() {
    }

    public C0074g(int i) {
        super(i);
    }

    public C0074g(List<com.github.catvod.spider.merge.L.m> list) {
        super(list);
    }

    public C0074g(com.github.catvod.spider.merge.L.m... mVarArr) {
        super(Arrays.asList(mVarArr));
    }

    public final String a(String str) {
        for (com.github.catvod.spider.merge.L.m mVar : this) {
            if (mVar.n(str)) {
                return mVar.c(str);
            }
        }
        return "";
    }

    public final List<String> b(String str) {
        ArrayList arrayList = new ArrayList(size());
        for (com.github.catvod.spider.merge.L.m mVar : this) {
            if (mVar.n(str)) {
                arrayList.add(mVar.c(str));
            }
        }
        return arrayList;
    }

    public final List<String> c() {
        ArrayList arrayList = new ArrayList(size());
        for (com.github.catvod.spider.merge.L.m mVar : this) {
            if (mVar.b0()) {
                arrayList.add(mVar.v0());
            }
        }
        return arrayList;
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C0074g c0074g = new C0074g(size());
        Iterator<com.github.catvod.spider.merge.L.m> it = iterator();
        while (it.hasNext()) {
            c0074g.add(it.next().i());
        }
        return c0074g;
    }

    public final C0074g d(int i) {
        return size() > i ? new C0074g(get(i)) : new C0074g();
    }

    @Nullable
    public final com.github.catvod.spider.merge.L.m e() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    @Nullable
    public final com.github.catvod.spider.merge.L.m f() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public final C0074g g(String str) {
        com.github.catvod.spider.merge.J.c.e(str);
        N nJ = P.j(str);
        C0074g c0074g = new C0074g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (com.github.catvod.spider.merge.L.m mVar : this) {
            com.github.catvod.spider.merge.J.c.g(nJ);
            com.github.catvod.spider.merge.J.c.g(mVar);
            for (com.github.catvod.spider.merge.L.m mVar2 : C0070c.a(nJ, mVar)) {
                if (identityHashMap.put(mVar2, Boolean.TRUE) == null) {
                    c0074g.add(mVar2);
                }
            }
        }
        return c0074g;
    }

    public final String h() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        for (com.github.catvod.spider.merge.L.m mVar : this) {
            if (sbB.length() != 0) {
                sbB.append(oZP.d("55"));
            }
            sbB.append(mVar.v0());
        }
        return com.github.catvod.spider.merge.K.b.h(sbB);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        for (com.github.catvod.spider.merge.L.m mVar : this) {
            if (sbB.length() != 0) {
                sbB.append(oZP.d("7F"));
            }
            sbB.append(mVar.t());
        }
        return com.github.catvod.spider.merge.K.b.h(sbB);
    }
}
