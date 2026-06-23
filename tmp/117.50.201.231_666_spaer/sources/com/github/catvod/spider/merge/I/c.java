package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.G.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c extends ArrayList<i> {
    public c() {
    }

    public c(int i) {
        super(i);
    }

    public c(List<i> list) {
        super(list);
    }

    public c(i... iVarArr) {
        super(Arrays.asList(iVarArr));
    }

    public final String a(String str) {
        for (i iVar : this) {
            if (iVar.o(str)) {
                return iVar.d(str);
            }
        }
        return "";
    }

    @Nullable
    public final i b() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final String c() {
        StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
        for (i iVar : this) {
            if (sbB.length() != 0) {
                sbB.append(" ");
            }
            sbB.append(iVar.t0());
        }
        return com.github.catvod.spider.merge.F.b.h(sbB);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        c cVar = new c(size());
        Iterator<i> it = iterator();
        while (it.hasNext()) {
            cVar.add(it.next().clone());
        }
        return cVar;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
        for (i iVar : this) {
            if (sbB.length() != 0) {
                sbB.append("\n");
            }
            sbB.append(iVar.u());
        }
        return com.github.catvod.spider.merge.F.b.h(sbB);
    }
}
