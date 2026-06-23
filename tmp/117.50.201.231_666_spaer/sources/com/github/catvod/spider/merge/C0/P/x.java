package com.github.catvod.spider.merge.C0.P;

import com.github.catvod.spider.merge.C0.T.b;
import com.github.catvod.spider.merge.C0.T.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class x extends C {
    public List<b> d;
    public D e;
    public D f;

    public x() {
    }

    public x(x xVar, int i) {
        super(xVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.T.b>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.T.b>] */
    @Override // com.github.catvod.spider.merge.C0.P.C, com.github.catvod.spider.merge.C0.T.b
    public final b b(int i) {
        ?? r0 = this.d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (b) this.d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.T.b>] */
    @Override // com.github.catvod.spider.merge.C0.P.C, com.github.catvod.spider.merge.C0.T.b
    public final int d() {
        ?? r0 = this.d;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.T.b>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.T.b>] */
    public final x k(Class cls) {
        b bVar;
        ?? r0 = this.d;
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

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.T.b>] */
    public final <T extends x> List<T> l(Class<? extends T> cls) {
        ?? r1 = this.d;
        if (r1 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (b bVar : r1) {
            if (cls.isInstance(bVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(bVar));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.T.b>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.T.b>] */
    public final com.github.catvod.spider.merge.C0.T.f m(int i) {
        ?? r0 = this.d;
        if (r0 != 0 && r0.size() > 0) {
            for (b bVar : this.d) {
                if (bVar instanceof com.github.catvod.spider.merge.C0.T.f) {
                    com.github.catvod.spider.merge.C0.T.f fVar = (com.github.catvod.spider.merge.C0.T.f) bVar;
                    if (fVar.a().e() == i) {
                        return fVar;
                    }
                }
            }
        }
        return null;
    }
}
