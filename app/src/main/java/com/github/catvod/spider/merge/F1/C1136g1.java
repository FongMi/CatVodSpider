package com.github.catvod.spider.merge.f1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1136g1 extends AbstractC1088D {
    private Iterator<Map.Entry<Object, Object>> l;

    private C1136g1() {
    }

    C1136g1(n2 n2Var, Map<Object, Object> map) {
        super(n2Var, "JavaMapIterator");
        this.l = map.entrySet().iterator();
    }

    static void t1(p2 p2Var) {
        AbstractC1088D.q1(p2Var, new C1136g1(), "JavaMapIterator");
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Java Map Iterator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final String p1() {
        return "JavaMapIterator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final boolean r1(C1185v c1185v) {
        return !this.l.hasNext();
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final Object s1(C1185v c1185v, n2 n2Var) {
        if (!this.l.hasNext()) {
            G2 g2 = G2.b;
            return c1185v.x(n2Var, new Object[]{g2, g2});
        }
        Map.Entry<Object, Object> next = this.l.next();
        Object key = next.getKey();
        Object value = next.getValue();
        com.github.catvod.spider.merge.Q0.a aVarS = c1185v.s();
        return c1185v.x(n2Var, new Object[]{aVarS.c(c1185v, this, key, key == null ? null : key.getClass()), aVarS.c(c1185v, this, value, value != null ? value.getClass() : null)});
    }
}
