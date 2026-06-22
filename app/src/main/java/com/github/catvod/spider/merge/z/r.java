package com.github.catvod.spider.merge.z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class r implements com.github.catvod.spider.merge.D.b {
    public static final r d = new r();
    public final r a;
    public final int b;
    public ArrayList c;

    public r() {
        this.b = -1;
    }

    @Override // com.github.catvod.spider.merge.D.b
    public Object a(com.github.catvod.spider.merge.Q.c cVar) {
        return cVar.d(this);
    }

    public final void b(com.github.catvod.spider.merge.D.b bVar) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(bVar);
    }

    public final com.github.catvod.spider.merge.D.b c(int i) {
        ArrayList arrayList = this.c;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (com.github.catvod.spider.merge.D.b) this.c.get(i);
    }

    public final int d() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final r e(Class cls) {
        ArrayList arrayList = this.c;
        com.github.catvod.spider.merge.D.b bVar = null;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.github.catvod.spider.merge.D.b bVar2 = (com.github.catvod.spider.merge.D.b) it.next();
                if (cls.isInstance(bVar2)) {
                    bVar = (com.github.catvod.spider.merge.D.b) cls.cast(bVar2);
                    break;
                }
            }
        }
        return (r) bVar;
    }

    public final List f(Class cls) {
        ArrayList<com.github.catvod.spider.merge.D.b> arrayList = this.c;
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = null;
        for (com.github.catvod.spider.merge.D.b bVar : arrayList) {
            if (cls.isInstance(bVar)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(cls.cast(bVar));
            }
        }
        return arrayList2 == null ? Collections.emptyList() : arrayList2;
    }

    public final com.github.catvod.spider.merge.D.c g(int i) {
        ArrayList arrayList = this.c;
        if (arrayList != null && arrayList.size() > 0) {
            for (com.github.catvod.spider.merge.D.b bVar : this.c) {
                if (bVar instanceof com.github.catvod.spider.merge.D.c) {
                    com.github.catvod.spider.merge.D.c cVar = (com.github.catvod.spider.merge.D.c) bVar;
                    if (cVar.a.a == i) {
                        return cVar;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.D.b
    public final String getText() {
        if (d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            sb.append(c(i).getText());
        }
        return sb.toString();
    }

    public final boolean h() {
        return this.b == -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        r rVar = this;
        while (rVar != null) {
            if (!rVar.h()) {
                sb.append(rVar.b);
            }
            rVar = rVar.a;
            if (rVar != null && !rVar.h()) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public r(int i, r rVar) {
        this.a = rVar;
        this.b = i;
    }
}
