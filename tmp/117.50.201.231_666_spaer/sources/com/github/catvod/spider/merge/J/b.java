package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.I.c;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
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
        if (!(obj instanceof i)) {
            return String.valueOf(obj);
        }
        i iVar = (i) obj;
        String strR0 = iVar.r0();
        return strR0 == "JX_TEXT" || (strR0 != null && strR0.equals("JX_TEXT")) ? iVar.i0() : iVar.u();
    }

    public final b b(String str) {
        List<b> listB = !(this.a instanceof i) ? null : new a(new c((i) this.a)).b(str);
        if (listB == null || listB.size() <= 0) {
            return null;
        }
        return listB.get(0);
    }

    public final String toString() {
        return a();
    }
}
