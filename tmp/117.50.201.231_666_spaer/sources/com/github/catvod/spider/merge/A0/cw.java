package com.github.catvod.spider.merge.A0;

import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class cw {
    public Object a;

    public static cw b(Object obj) {
        cw cwVar = new cw();
        cwVar.a = obj;
        return cwVar;
    }

    public final String c() {
        Object obj = this.a;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ed)) {
            return String.valueOf(obj);
        }
        ed edVar = (ed) obj;
        return Objects.equals(edVar.g.b, "JX_TEXT") ? edVar.ag() : edVar.an();
    }

    public final cw d(String str) {
        Object obj = this.a;
        LinkedList linkedListH = !(obj instanceof ed) ? null : new xa(4, new rp((ed) obj)).h(str);
        if (linkedListH == null || linkedListH.size() <= 0) {
            return null;
        }
        return (cw) linkedListH.get(0);
    }

    public final String toString() {
        return c();
    }
}
