package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.AbstractC1412a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class g0 {
    protected List<AbstractC0611l> a = null;
    protected List<AbstractC0603d> b = null;
    protected List<Z> c = null;
    protected List<l0> d = null;
    protected List<V> e = null;
    protected List<a0> f = null;
    protected List<O> g = null;
    protected List<InterfaceC0622x> h = null;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.d>] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.l>] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.Z>] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.x>] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.l0>] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.V>] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.a0>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.O>] */
    public final void c(f0 f0Var) {
        if (f0Var == null) {
            return;
        }
        if (f0Var instanceof a0) {
            if (this.f == null) {
                this.f = new ArrayList();
            }
            this.f.add((a0) f0Var);
        }
        if (f0Var instanceof V) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add((V) f0Var);
        }
        if (f0Var instanceof l0) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add((l0) f0Var);
        }
        if (f0Var instanceof InterfaceC0622x) {
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add((InterfaceC0622x) f0Var);
        }
        if (f0Var instanceof Z) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add((Z) f0Var);
        }
        if (f0Var instanceof AbstractC0611l) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            this.a.add((AbstractC0611l) f0Var);
        }
        if (f0Var instanceof AbstractC0603d) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add((AbstractC0603d) f0Var);
        }
        if (f0Var instanceof O) {
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add((O) f0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.Z>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.Z>] */
    public final boolean e(L l, Object obj, String str, Object obj2) {
        ?? r1 = l.c;
        if (r1 != 0) {
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                if (!((Z) it.next()).c()) {
                    return false;
                }
            }
        }
        ?? r12 = this.c;
        if (r12 == 0) {
            return true;
        }
        Iterator it2 = r12.iterator();
        while (it2.hasNext()) {
            if (!((Z) it2.next()).c()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.a0>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.a0>] */
    public final boolean f(L l, Object obj, String str) {
        ?? r1 = l.f;
        if (r1 != 0) {
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                if (!((a0) it.next()).e()) {
                    return false;
                }
            }
        }
        ?? r12 = this.f;
        if (r12 == 0) {
            return true;
        }
        Iterator it2 = r12.iterator();
        while (it2.hasNext()) {
            if (!((a0) it2.next()).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.V>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.V>] */
    protected final String g(L l, Object obj, String str, Object obj2) {
        ?? r1 = l.e;
        if (r1 != 0) {
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                str = ((V) it.next()).b();
            }
        }
        ?? r12 = this.e;
        if (r12 != 0) {
            Iterator it2 = r12.iterator();
            while (it2.hasNext()) {
                str = ((V) it2.next()).b();
            }
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.x>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.x>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.l0>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.l0>] */
    protected final Object h(L l, C0610k c0610k, Object obj, String str, Object obj2, int i) {
        boolean z;
        if (obj2 != null) {
            int i2 = l.j.d;
            i0 i0Var = i0.WriteNonStringValueAsString;
            if ((i0.a(i2, i, i0Var) || !(c0610k == null || (c0610k.a() & i0Var.b) == 0)) && (((z = obj2 instanceof Number)) || (obj2 instanceof Boolean))) {
                String strB = null;
                if (z && c0610k != null) {
                    strB = c0610k.b();
                }
                obj2 = strB != null ? new DecimalFormat(strB).format(obj2) : obj2.toString();
            } else if (c0610k != null && c0610k.c()) {
                obj2 = AbstractC1412a.d((String) obj2);
            }
        }
        ?? r2 = l.d;
        if (r2 != 0) {
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                obj2 = ((l0) it.next()).d();
            }
        }
        ?? r22 = this.d;
        if (r22 != 0) {
            Iterator it2 = r22.iterator();
            while (it2.hasNext()) {
                obj2 = ((l0) it2.next()).d();
            }
        }
        ?? r1 = l.h;
        if (r1 != 0) {
            Iterator it3 = r1.iterator();
            while (it3.hasNext()) {
                obj2 = ((InterfaceC0622x) it3.next()).b();
            }
        }
        ?? r12 = this.h;
        if (r12 != 0) {
            Iterator it4 = r12.iterator();
            while (it4.hasNext()) {
                obj2 = ((InterfaceC0622x) it4.next()).b();
            }
        }
        return obj2;
    }
}
