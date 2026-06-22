package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.b1.C0906c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1036g extends ArrayList<com.github.catvod.spider.merge.c1.m> {
    public C1036g() {
    }

    public C1036g(int i) {
        super(i);
    }

    public C1036g(List<com.github.catvod.spider.merge.c1.m> list) {
        super(list);
    }

    public C1036g(com.github.catvod.spider.merge.c1.m... mVarArr) {
        super(Arrays.asList(mVarArr));
    }

    public final String a(String str) {
        for (com.github.catvod.spider.merge.c1.m mVar : this) {
            if (mVar.n(str)) {
                return mVar.c(str);
            }
        }
        return "";
    }

    public final List b() {
        ArrayList arrayList = new ArrayList(size());
        for (com.github.catvod.spider.merge.c1.m mVar : this) {
            if (mVar.n("data-clipboard-text")) {
                arrayList.add(mVar.c("data-clipboard-text"));
            }
        }
        return arrayList;
    }

    public final List<String> c() {
        ArrayList arrayList = new ArrayList(size());
        for (com.github.catvod.spider.merge.c1.m mVar : this) {
            if (mVar.a0()) {
                arrayList.add(mVar.s0());
            }
        }
        return arrayList;
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C1036g c1036g = new C1036g(size());
        Iterator<com.github.catvod.spider.merge.c1.m> it = iterator();
        while (it.hasNext()) {
            c1036g.add(it.next().i());
        }
        return c1036g;
    }

    public final C1036g d(int i) {
        return size() > i ? new C1036g(get(i)) : new C1036g();
    }

    public final com.github.catvod.spider.merge.c1.m e() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final com.github.catvod.spider.merge.c1.m g() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public final C1036g h(String str) {
        C0899d.f(str);
        N nJ = P.j(str);
        C1036g c1036g = new C1036g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (com.github.catvod.spider.merge.c1.m mVar : this) {
            C0899d.h(nJ);
            C0899d.h(mVar);
            for (com.github.catvod.spider.merge.c1.m mVar2 : C1032c.a(nJ, mVar)) {
                if (identityHashMap.put(mVar2, Boolean.TRUE) == null) {
                    c1036g.add(mVar2);
                }
            }
        }
        return c1036g;
    }

    public final String j() {
        StringBuilder sbB = C0906c.b();
        for (com.github.catvod.spider.merge.c1.m mVar : this) {
            if (sbB.length() != 0) {
                sbB.append(" ");
            }
            sbB.append(mVar.s0());
        }
        return C0906c.h(sbB);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbB = C0906c.b();
        for (com.github.catvod.spider.merge.c1.m mVar : this) {
            if (sbB.length() != 0) {
                sbB.append("\n");
            }
            sbB.append(mVar.t());
        }
        return C0906c.h(sbB);
    }
}
