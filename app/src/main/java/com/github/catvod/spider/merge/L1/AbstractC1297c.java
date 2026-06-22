package com.github.catvod.spider.merge.l1;

import com.github.catvod.spider.merge.f1.C1157l2;
import com.github.catvod.spider.merge.f1.C1185v;
import com.github.catvod.spider.merge.f1.Z1;
import com.github.catvod.spider.merge.f1.n2;
import com.github.catvod.spider.merge.f1.p2;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.l1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1297c {
    private static final Object a = new Object();

    public static AbstractC1297c c(n2 n2Var) {
        AbstractC1297c abstractC1297c;
        p2 p2VarO = C1157l2.O(n2Var);
        if (p2VarO == null) {
            abstractC1297c = null;
        } else {
            p2.t0(p2VarO, "XML");
            abstractC1297c = (AbstractC1297c) p2VarO.d0(a);
        }
        if (abstractC1297c != null) {
            return abstractC1297c;
        }
        throw C1185v.F(C1157l2.P("msg.XML.not.available", new Object[0]));
    }

    public abstract String a();

    public abstract String b();

    public abstract boolean d();

    public abstract Z1 e();

    public abstract Z1 f();

    public abstract Object g();
}
