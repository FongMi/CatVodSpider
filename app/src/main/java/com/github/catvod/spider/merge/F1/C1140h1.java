package com.github.catvod.spider.merge.f1;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1140h1 extends C1156l1 {
    public static final /* synthetic */ int k = 0;
    private Map<Object, Object> j;

    public C1140h1(n2 n2Var, Object obj) {
        super(n2Var, obj, obj.getClass());
        this.j = (Map) obj;
    }

    public static /* synthetic */ Object y(n2 n2Var, n2 n2Var2) {
        if (n2Var2 instanceof C1140h1) {
            return new C1136g1(n2Var, ((C1140h1) n2Var2).j);
        }
        throw C1157l2.C1("msg.incompat.call", x2.c);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "JavaMap";
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.y2
    public final Object e(w2 w2Var, n2 n2Var) {
        return x2.c.equals(w2Var) ? C1132f1.c : super.e(w2Var, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1
    public final int hashCode() {
        return super.hashCode();
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final Object l(String str, n2 n2Var) {
        C1185v c1185vI = C1185v.i();
        if (c1185vI == null || !c1185vI.t(21) || !this.j.containsKey(str)) {
            return super.l(str, n2Var);
        }
        Object obj = this.j.get(str);
        return c1185vI.s().c(c1185vI, this, obj, obj == null ? null : obj.getClass());
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.y2
    public final boolean n(w2 w2Var, n2 n2Var) {
        return x2.c.equals(w2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final void t(int i, n2 n2Var, Object obj) {
        if (C1185v.h().t(21)) {
            this.j.put(Integer.valueOf(i), C1156l1.f(Object.class, obj));
        } else {
            super.t(i, n2Var, obj);
            throw null;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final Object[] u() {
        C1185v c1185vI = C1185v.i();
        if (c1185vI == null || !c1185vI.t(21)) {
            return super.u();
        }
        ArrayList arrayList = new ArrayList(this.j.size());
        for (Object objX1 : this.j.keySet()) {
            if (!(objX1 instanceof Integer)) {
                objX1 = C1157l2.x1(objX1);
            }
            arrayList.add(objX1);
        }
        return arrayList.toArray();
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final void v(String str, n2 n2Var, Object obj) {
        C1185v c1185vI = C1185v.i();
        if (c1185vI == null || !c1185vI.t(21)) {
            super.v(str, n2Var, obj);
        } else {
            this.j.put(str, C1156l1.f(Object.class, obj));
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final Object w(int i, n2 n2Var) {
        C1185v c1185vI = C1185v.i();
        if (c1185vI != null && c1185vI.t(21) && this.j.containsKey(Integer.valueOf(i))) {
            Object obj = this.j.get(Integer.valueOf(i));
            return c1185vI.s().c(c1185vI, this, obj, obj != null ? obj.getClass() : null);
        }
        super.w(i, n2Var);
        throw null;
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final boolean x(String str, n2 n2Var) {
        C1185v c1185vI = C1185v.i();
        if (c1185vI != null && c1185vI.t(21) && this.j.containsKey(str)) {
            return true;
        }
        return super.x(str, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final boolean z(int i, n2 n2Var) {
        C1185v c1185vI = C1185v.i();
        return c1185vI != null && c1185vI.t(21) && this.j.containsKey(Integer.valueOf(i));
    }
}
