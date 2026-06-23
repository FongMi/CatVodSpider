package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Lc.b;
import com.github.catvod.spider.merge.Lc.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class x extends C {
    public List<b> d;
    public D e;
    public D f;

    public x() {
    }

    public x(x xVar, int i) {
        super(xVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Lc.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Lc.b>] */
    @Override // com.github.catvod.spider.merge.gu.C, com.github.catvod.spider.merge.Lc.b
    public final b b(int i) {
        Object r0 = this.d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (b) this.d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Lc.b>] */
    @Override // com.github.catvod.spider.merge.gu.C, com.github.catvod.spider.merge.Lc.b
    public final int d() {
        Object r0 = this.d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T extends b> T h(T t) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(t);
        return t;
    }

    public void i(c cVar) {
    }

    public void j(c cVar) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Lc.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Lc.b>] */
    public final x k(Class cls) {
        b bVar;
        Object r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            bVar = null;
        } else {
            for (b bVar2 : this.d) {
                if (cls.isInstance(bVar2)) {
                    bVar = (b) cls.cast(bVar2);
                    break;
                }
            }
            bVar = null;
        }
        return (x) bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Lc.b>] */
    public final <T extends x> List<T> l(Class<? extends T> cls) {
        Object r0 = this.d;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (b bVar : r0) {
            if (cls.isInstance(bVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(bVar));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Lc.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Lc.b>] */
    public final com.github.catvod.spider.merge.Lc.f m(int i) {
        Object r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        for (b bVar : this.d) {
            if (bVar instanceof com.github.catvod.spider.merge.Lc.f) {
                com.github.catvod.spider.merge.Lc.f fVar = (com.github.catvod.spider.merge.Lc.f) bVar;
                if (fVar.a().e() == i) {
                    return fVar;
                }
            }
        }
        return null;
    }
}
