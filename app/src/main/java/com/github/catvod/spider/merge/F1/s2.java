package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class s2 implements Serializable {
    Object b;
    int c;
    private short d;
    Object e;
    transient s2 f;
    transient s2 g;

    protected s2(s2 s2Var) {
        this.b = s2Var.b;
        this.c = s2Var.c;
        this.d = s2Var.d;
        this.e = s2Var.e;
        this.f = s2Var.f;
        this.g = s2Var.g;
    }

    s2(Object obj, int i, int i2) {
        this.b = obj;
        this.c = i;
        this.d = (short) i2;
    }

    final int a() {
        return this.d;
    }

    InterfaceC1098N b(String str, n2 n2Var) {
        return null;
    }

    p2 c(C1185v c1185v, n2 n2Var) {
        return p2.K(n2Var, this.e, this.d);
    }

    InterfaceC1098N d(String str, n2 n2Var) {
        return null;
    }

    public Object e(n2 n2Var) {
        return this.e;
    }

    boolean f() {
        return this instanceof C1134g;
    }

    boolean g() {
        return !(this instanceof C1134g);
    }

    final synchronized void h(int i) {
        p2.P(i);
        this.d = (short) i;
    }

    public boolean i(Object obj, n2 n2Var, n2 n2Var2, boolean z) {
        if ((this.d & 1) != 0) {
            if (z) {
                throw C1157l2.C1("msg.modify.readonly", this.b);
            }
            return true;
        }
        if (n2Var != n2Var2) {
            return false;
        }
        this.e = obj;
        return true;
    }
}
