package com.github.catvod.spider.merge.y;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class y extends C0249D {
    public List<com.github.catvod.spider.merge.C.b> d;
    public InterfaceC0250E e;
    public InterfaceC0250E f;

    public y() {
    }

    public y(y yVar, int i) {
        super(yVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.b>] */
    @Override // com.github.catvod.spider.merge.y.C0249D, com.github.catvod.spider.merge.C.b
    public final com.github.catvod.spider.merge.C.b c(int i) {
        ?? r0 = this.d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (com.github.catvod.spider.merge.C.b) this.d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.b>] */
    @Override // com.github.catvod.spider.merge.y.C0249D, com.github.catvod.spider.merge.C.b
    public final int d() {
        ?? r0 = this.d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T extends com.github.catvod.spider.merge.C.b> T g(T t) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(t);
        return t;
    }

    public void h(com.github.catvod.spider.merge.C.c cVar) {
    }

    public void i(com.github.catvod.spider.merge.C.c cVar) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.b>] */
    public final y j(Class cls) {
        com.github.catvod.spider.merge.C.b bVar;
        ?? r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            bVar = null;
        } else {
            for (com.github.catvod.spider.merge.C.b bVar2 : this.d) {
                if (cls.isInstance(bVar2)) {
                    bVar = (com.github.catvod.spider.merge.C.b) cls.cast(bVar2);
                    break;
                }
            }
            bVar = null;
        }
        return (y) bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.b>] */
    public final <T extends y> List<T> k(Class<? extends T> cls) {
        ?? r0 = this.d;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (com.github.catvod.spider.merge.C.b bVar : r0) {
            if (cls.isInstance(bVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(bVar));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.b>] */
    public final com.github.catvod.spider.merge.C.f l(int i) {
        ?? r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        for (com.github.catvod.spider.merge.C.b bVar : this.d) {
            if (bVar instanceof com.github.catvod.spider.merge.C.f) {
                com.github.catvod.spider.merge.C.f fVar = (com.github.catvod.spider.merge.C.f) bVar;
                if (fVar.a().getType() == i) {
                    return fVar;
                }
            }
        }
        return null;
    }
}
