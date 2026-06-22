package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.A.C0019u;
import com.github.catvod.spider.merge.L.l;
import com.github.catvod.spider.merge.N.e;
import java.util.LinkedList;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class a {
    public final Object a;

    public a(Object obj) {
        this.a = obj;
    }

    public final String a() {
        Object obj = this.a;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof l)) {
            return String.valueOf(obj);
        }
        l lVar = (l) obj;
        String str = lVar.d.a;
        return (str == "JX_TEXT" || (str != null && str.equals("JX_TEXT"))) ? lVar.I() : lVar.p();
    }

    public final a b(String str) {
        Object obj = this.a;
        LinkedList linkedListI = !(obj instanceof l) ? null : new C0019u(new e((l) obj)).i(str);
        if (linkedListI == null || linkedListI.size() <= 0) {
            return null;
        }
        return (a) linkedListI.get(0);
    }

    public final String toString() {
        return a();
    }
}
