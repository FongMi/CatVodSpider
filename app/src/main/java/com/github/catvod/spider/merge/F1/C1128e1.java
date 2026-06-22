package com.github.catvod.spider.merge.f1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1128e1 extends C1156l1 {
    private List<Object> j;

    public C1128e1(n2 n2Var, Object obj) {
        super(n2Var, obj, obj.getClass());
        this.j = (List) obj;
    }

    private boolean G(int i) {
        return i >= 0 && i < this.j.size();
    }

    private void y(int i) {
        if (i > this.j.size()) {
            List<Object> list = this.j;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(i);
            }
            while (i > this.j.size()) {
                this.j.add(null);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "JavaList";
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.y2
    public final Object e(w2 w2Var, n2 n2Var) {
        return x2.g.equals(w2Var) ? Boolean.TRUE : super.e(w2Var, n2Var);
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
        return "length".equals(str) ? Integer.valueOf(this.j.size()) : super.l(str, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.y2
    public final boolean n(w2 w2Var, n2 n2Var) {
        if (x2.g.equals(w2Var)) {
            return true;
        }
        return super.n(w2Var, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final void p(int i) {
        if (G(i)) {
            this.j.set(i, null);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final void t(int i, n2 n2Var, Object obj) {
        if (i < 0) {
            super.t(i, n2Var, obj);
            throw null;
        }
        Object[] objArr = C1185v.x;
        Object objF = C1156l1.f(Object.class, obj);
        if (i == this.j.size()) {
            this.j.add(objF);
        } else {
            y(i + 1);
            this.j.set(i, objF);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final Object[] u() {
        List list = (List) this.d;
        Object[] objArr = new Object[list.size()];
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return objArr;
            }
            objArr[size] = Integer.valueOf(size);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final void v(String str, n2 n2Var, Object obj) {
        if (this.j == null || !"length".equals(str)) {
            super.v(str, n2Var, obj);
            return;
        }
        double dP1 = C1157l2.p1(obj);
        long jA1 = C1157l2.A1(dP1);
        if (jA1 != dP1 || jA1 > 2147483647L) {
            throw C1157l2.I0(C1157l2.P("msg.arraylength.bad", new Object[0]));
        }
        if (jA1 >= this.j.size()) {
            y((int) jA1);
        } else {
            List<Object> list = this.j;
            list.subList((int) jA1, list.size()).clear();
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final Object w(int i, n2 n2Var) {
        if (!G(i)) {
            return G2.b;
        }
        C1185v c1185vI = C1185v.i();
        Object obj = this.j.get(i);
        if (c1185vI != null) {
            return c1185vI.s().c(c1185vI, this, obj, obj == null ? null : obj.getClass());
        }
        return obj;
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final boolean x(String str, n2 n2Var) {
        if (str.equals("length")) {
            return true;
        }
        return super.x(str, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.C1156l1, com.github.catvod.spider.merge.f1.n2
    public final boolean z(int i, n2 n2Var) {
        return G(i);
    }
}
