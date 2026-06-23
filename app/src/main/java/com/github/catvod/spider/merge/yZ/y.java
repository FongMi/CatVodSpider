package com.github.catvod.spider.merge.yZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class y extends D {
    public List<com.github.catvod.spider.merge.cz.b> d;
    public E e;
    public E f;

    public y() {
    }

    public y(y yVar, int i) {
        super(yVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.b>] */
    @Override // com.github.catvod.spider.merge.yZ.D
    public final com.github.catvod.spider.merge.cz.b c(int i) {
        Object r0 = this.d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (com.github.catvod.spider.merge.cz.b) this.d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.b>] */
    @Override // com.github.catvod.spider.merge.yZ.D
    public final int d() {
        Object r0 = this.d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T extends com.github.catvod.spider.merge.cz.b> T g(T t) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(t);
        return t;
    }

    public void h(com.github.catvod.spider.merge.cz.c cVar) {
    }

    public void i(com.github.catvod.spider.merge.cz.c cVar) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.b>] */
    public final y j(Class cls) {
        com.github.catvod.spider.merge.cz.b bVar;
        Object r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            bVar = null;
        } else {
            for (com.github.catvod.spider.merge.cz.b bVar2 : this.d) {
                if (cls.isInstance(bVar2)) {
                    bVar = (com.github.catvod.spider.merge.cz.b) cls.cast(bVar2);
                    break;
                }
            }
            bVar = null;
        }
        return (y) bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.b>] */
    public final <T extends y> List<T> k(Class<? extends T> cls) {
        Object r0 = this.d;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (com.github.catvod.spider.merge.cz.b bVar : r0) {
            if (cls.isInstance(bVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(bVar));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.b>] */
    public final com.github.catvod.spider.merge.cz.f l(int i) {
        Object r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        for (com.github.catvod.spider.merge.cz.f fVar : this.d) {
            if (fVar instanceof com.github.catvod.spider.merge.cz.f) {
                com.github.catvod.spider.merge.cz.f fVar2 = fVar;
                if (fVar2.a().getType() == i) {
                    return fVar2;
                }
            }
        }
        return null;
    }
}
