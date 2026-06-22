package com.github.catvod.spider.merge.f1;

import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1139h0 implements Iterable<Object>, Closeable {
    private final C1185v b;
    private final n2 c;
    private final InterfaceC1161n d;
    private final InterfaceC1161n e;
    private final n2 f;
    private boolean g;

    public C1139h0(C1185v c1185v, n2 n2Var, Object obj) {
        this.b = c1185v;
        this.c = n2Var;
        this.d = C1157l2.V(obj, "next", c1185v, n2Var);
        n2 n2Var2 = c1185v.v;
        c1185v.v = null;
        this.f = n2Var2;
        Object objU = C1157l2.U(obj, "return", c1185v, n2Var);
        if (objU == null || G2.b(objU)) {
            this.e = null;
        } else {
            if (!(objU instanceof InterfaceC1161n)) {
                throw C1157l2.E0(obj, objU, "return");
            }
            this.e = (InterfaceC1161n) objU;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        InterfaceC1161n interfaceC1161n = this.e;
        if (interfaceC1161n != null) {
            interfaceC1161n.b(this.b, this.c, this.f, C1157l2.y);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C1135g0(this);
    }
}
