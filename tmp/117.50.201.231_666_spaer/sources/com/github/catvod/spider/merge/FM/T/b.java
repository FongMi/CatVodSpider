package com.github.catvod.spider.merge.FM.T;

import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.LinkedList;
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
        if (!(obj instanceof m)) {
            return String.valueOf(obj);
        }
        m mVar = (m) obj;
        String strT0 = mVar.t0();
        return strT0 == "JX_TEXT" || (strT0 != null && strT0.equals("JX_TEXT")) ? mVar.j0() : mVar.t();
    }

    public final List<b> b(String str) {
        if (this.a instanceof m) {
            return new a(new C0274g((m) this.a)).a(str);
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
