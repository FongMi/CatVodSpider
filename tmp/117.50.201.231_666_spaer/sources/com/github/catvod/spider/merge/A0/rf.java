package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class rf implements fg {
    public static final rf d;
    public final rf e;
    public int f;
    public ArrayList g;

    static {
        rf rfVar = new rf();
        rfVar.f = -1;
        d = rfVar;
    }

    public rf(int i, rf rfVar) {
        this.e = rfVar;
        this.f = i;
    }

    @Override // com.github.catvod.spider.merge.A0.dl
    public Object b(uv uvVar) {
        return uvVar.f(this);
    }

    @Override // com.github.catvod.spider.merge.A0.dl
    public final String c() {
        if (j() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < j(); i++) {
            sb.append(i(i).c());
        }
        return sb.toString();
    }

    public final void h(dl dlVar) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(dlVar);
    }

    public final dl i(int i) {
        ArrayList arrayList = this.g;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (dl) this.g.get(i);
    }

    public final int j() {
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final rf k(Class cls) {
        ArrayList arrayList = this.g;
        dl dlVar = null;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = this.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dl dlVar2 = (dl) it.next();
                if (cls.isInstance(dlVar2)) {
                    dlVar = (dl) cls.cast(dlVar2);
                    break;
                }
            }
        }
        return (rf) dlVar;
    }

    public final List l(Class cls) {
        ArrayList<dl> arrayList = this.g;
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = null;
        for (dl dlVar : arrayList) {
            if (cls.isInstance(dlVar)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(cls.cast(dlVar));
            }
        }
        return arrayList2 == null ? Collections.emptyList() : arrayList2;
    }

    public final mm m(int i) {
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            for (dl dlVar : this.g) {
                if (dlVar instanceof mm) {
                    mm mmVar = (mm) dlVar;
                    if (mmVar.a.a == i) {
                        return mmVar;
                    }
                }
            }
        }
        return null;
    }

    public final boolean n() {
        return this.f == -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        rf rfVar = this;
        while (rfVar != null) {
            if (!rfVar.n()) {
                sb.append(rfVar.f);
            }
            rfVar = rfVar.e;
            if (rfVar != null && !rfVar.n()) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
