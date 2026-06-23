package com.github.catvod.spider.merge.t;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class u extends y {
    public List<com.github.catvod.spider.merge.x.b> d;
    public z e;
    public z f;

    public u() {
    }

    public u(u uVar, int i) {
        super(uVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.b>] */
    @Override // com.github.catvod.spider.merge.t.y, com.github.catvod.spider.merge.x.b
    public final com.github.catvod.spider.merge.x.b c(int i) {
        ?? r0 = this.d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (com.github.catvod.spider.merge.x.b) this.d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.b>] */
    @Override // com.github.catvod.spider.merge.t.y, com.github.catvod.spider.merge.x.b
    public final int d() {
        ?? r0 = this.d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T extends com.github.catvod.spider.merge.x.b> T g(T t) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(t);
        return t;
    }

    public void h(com.github.catvod.spider.merge.x.c cVar) {
    }

    public void i(com.github.catvod.spider.merge.x.c cVar) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.b>] */
    public final u j(Class cls) {
        com.github.catvod.spider.merge.x.b bVar;
        ?? r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            bVar = null;
        } else {
            for (com.github.catvod.spider.merge.x.b bVar2 : this.d) {
                if (cls.isInstance(bVar2)) {
                    bVar = (com.github.catvod.spider.merge.x.b) cls.cast(bVar2);
                    break;
                }
            }
            bVar = null;
        }
        return (u) bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.b>] */
    public final <T extends u> List<T> k(Class<? extends T> cls) {
        ?? r0 = this.d;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (com.github.catvod.spider.merge.x.b bVar : r0) {
            if (cls.isInstance(bVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(bVar));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.b>] */
    public final com.github.catvod.spider.merge.x.f l(int i) {
        ?? r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        for (com.github.catvod.spider.merge.x.b bVar : this.d) {
            if (bVar instanceof com.github.catvod.spider.merge.x.f) {
                com.github.catvod.spider.merge.x.f fVar = (com.github.catvod.spider.merge.x.f) bVar;
                if (fVar.b().getType() == i) {
                    return fVar;
                }
            }
        }
        return null;
    }
}
