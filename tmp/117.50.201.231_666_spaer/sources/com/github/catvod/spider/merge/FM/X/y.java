package com.github.catvod.spider.merge.FM.x;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class y extends C0426D {
    public List<com.github.catvod.spider.merge.FM.B.b> d;
    public InterfaceC0427E e;
    public InterfaceC0427E f;

    public y() {
    }

    public y(y yVar, int i) {
        super(yVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.b>] */
    @Override // com.github.catvod.spider.merge.FM.x.C0426D, com.github.catvod.spider.merge.FM.B.b
    public final com.github.catvod.spider.merge.FM.B.b c(int i) {
        ?? r0 = this.d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (com.github.catvod.spider.merge.FM.B.b) this.d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.b>] */
    @Override // com.github.catvod.spider.merge.FM.x.C0426D, com.github.catvod.spider.merge.FM.B.b
    public final int d() {
        ?? r0 = this.d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T extends com.github.catvod.spider.merge.FM.B.b> T g(T t) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(t);
        return t;
    }

    public void h(com.github.catvod.spider.merge.FM.B.c cVar) {
    }

    public void i(com.github.catvod.spider.merge.FM.B.c cVar) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.b>] */
    public final y j(Class cls) {
        com.github.catvod.spider.merge.FM.B.b bVar;
        ?? r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            bVar = null;
        } else {
            for (com.github.catvod.spider.merge.FM.B.b bVar2 : this.d) {
                if (cls.isInstance(bVar2)) {
                    bVar = (com.github.catvod.spider.merge.FM.B.b) cls.cast(bVar2);
                    break;
                }
            }
            bVar = null;
        }
        return (y) bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.b>] */
    public final <T extends y> List<T> k(Class<? extends T> cls) {
        ?? r0 = this.d;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (com.github.catvod.spider.merge.FM.B.b bVar : r0) {
            if (cls.isInstance(bVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(bVar));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.b>] */
    public final com.github.catvod.spider.merge.FM.B.f l(int i) {
        ?? r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        for (com.github.catvod.spider.merge.FM.B.b bVar : this.d) {
            if (bVar instanceof com.github.catvod.spider.merge.FM.B.f) {
                com.github.catvod.spider.merge.FM.B.f fVar = (com.github.catvod.spider.merge.FM.B.f) bVar;
                if (fVar.a().getType() == i) {
                    return fVar;
                }
            }
        }
        return null;
    }
}
