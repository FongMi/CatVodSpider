package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

import javax.annotation.Nullable;
import java.util.*;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0724g extends ArrayList<com.github.catvod.spider.merge.UY.m> {
    public C0724g() {
    }

    public C0724g(int i) {
        super(i);
    }

    public C0724g(List<com.github.catvod.spider.merge.UY.m> list) {
        super(list);
    }

    public C0724g(com.github.catvod.spider.merge.UY.m... mVarArr) {
        super(Arrays.asList(mVarArr));
    }

    public final String a(String str) {
        for (com.github.catvod.spider.merge.UY.m mVar : this) {
            if (mVar.n(str)) {
                return mVar.c(str);
            }
        }
        return "";
    }

    public final List<String> b(String str) {
        ArrayList arrayList = new ArrayList(size());
        for (com.github.catvod.spider.merge.UY.m mVar : this) {
            if (mVar.n(str)) {
                arrayList.add(mVar.c(str));
            }
        }
        return arrayList;
    }

    public final List<String> c() {
        ArrayList arrayList = new ArrayList(size());
        for (com.github.catvod.spider.merge.UY.m mVar : this) {
            if (mVar.b0()) {
                arrayList.add(mVar.v0());
            }
        }
        return arrayList;
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C0724g c0724g = new C0724g(size());
        Iterator<com.github.catvod.spider.merge.UY.m> it = iterator();
        while (it.hasNext()) {
            c0724g.add(it.next().i());
        }
        return c0724g;
    }

    public final C0724g d(int i) {
        return size() > i ? new C0724g(get(i)) : new C0724g();
    }

    @Nullable
    public final com.github.catvod.spider.merge.UY.m e() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    @Nullable
    public final com.github.catvod.spider.merge.UY.m f() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public final C0724g g(String str) {
        com.github.catvod.spider.merge.XU.k.e(str);
        N nJ = P.j(str);
        C0724g c0724g = new C0724g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (com.github.catvod.spider.merge.UY.m mVar : this) {
            com.github.catvod.spider.merge.XU.k.g(nJ);
            com.github.catvod.spider.merge.XU.k.g(mVar);
            for (com.github.catvod.spider.merge.UY.m mVar2 : C0720c.a(nJ, mVar)) {
                if (identityHashMap.put(mVar2, Boolean.TRUE) == null) {
                    c0724g.add(mVar2);
                }
            }
        }
        return c0724g;
    }

    public final String h() {
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        for (com.github.catvod.spider.merge.UY.m mVar : this) {
            if (sbB.length() != 0) {
                sbB.append(ZrJ.d("59"));
            }
            sbB.append(mVar.v0());
        }
        return com.github.catvod.spider.merge.XU.n.h(sbB);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        for (com.github.catvod.spider.merge.UY.m mVar : this) {
            if (sbB.length() != 0) {
                sbB.append(ZrJ.d("73"));
            }
            sbB.append(mVar.t());
        }
        return com.github.catvod.spider.merge.XU.n.h(sbB);
    }
}
