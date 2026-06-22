package com.github.catvod.spider.merge.XU;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.ZrJ;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class x {
    private Object a;

    public x(Object obj) {
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
        if (!(obj instanceof com.github.catvod.spider.merge.UY.m)) {
            return String.valueOf(obj);
        }
        com.github.catvod.spider.merge.UY.m mVar = (com.github.catvod.spider.merge.UY.m) obj;
        String strT0 = mVar.t0();
        String strD = ZrJ.d("331B14190D1D2D");
        return strT0 == strD || (strT0 != null && strT0.equals(strD)) ? mVar.j0() : mVar.t();
    }

    public final List<x> b(String str) {
        if (this.a instanceof com.github.catvod.spider.merge.UY.m) {
            return new w(new C0724g((com.github.catvod.spider.merge.UY.m) this.a)).a(str);
        }
        return null;
    }

    public final x c(String str) {
        List<x> listB = b(str);
        if (listB == null) {
            return null;
        }
        LinkedList linkedList = (LinkedList) listB;
        if (linkedList.size() > 0) {
            return (x) linkedList.get(0);
        }
        return null;
    }

    public final String toString() {
        return a();
    }
}
