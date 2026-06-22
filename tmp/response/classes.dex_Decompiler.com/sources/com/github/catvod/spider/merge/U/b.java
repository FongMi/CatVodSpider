package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.oZP;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class b {
    private Object a;

    public b(Object obj) {
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
        if (!(obj instanceof m)) {
            return String.valueOf(obj);
        }
        m mVar = (m) obj;
        String strT0 = mVar.t0();
        String strD = oZP.d("3F372815290D21");
        return strT0 == strD || (strT0 != null && strT0.equals(strD)) ? mVar.j0() : mVar.t();
    }

    public final List<b> b(String str) {
        if (this.a instanceof m) {
            return new a(new C0074g((m) this.a)).a(str);
        }
        return null;
    }

    public final b c(String str) {
        List<b> listB = b(str);
        if (listB == null) {
            return null;
        }
        LinkedList linkedList = (LinkedList) listB;
        if (linkedList.size() > 0) {
            return (b) linkedList.get(0);
        }
        return null;
    }

    public final String toString() {
        return a();
    }
}
