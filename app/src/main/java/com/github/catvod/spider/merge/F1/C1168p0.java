package com.github.catvod.spider.merge.f1;

import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1168p0 extends s2 {
    transient Supplier<Object> h;
    transient Consumer<Object> i;

    C1168p0(s2 s2Var) {
        super(s2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    final p2 c(C1185v c1185v, n2 n2Var) {
        p2 p2Var = (p2) c1185v.y(n2Var);
        Supplier<Object> supplier = this.h;
        p2Var.X("value", supplier != null ? supplier.get() : this.e, 0);
        p2Var.Q0(a(), true);
        return p2Var;
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    public final Object e(n2 n2Var) {
        Supplier<Object> supplier = this.h;
        return supplier != null ? supplier.get() : this.e;
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    final boolean f() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    final boolean g() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    public final boolean i(Object obj, n2 n2Var, n2 n2Var2, boolean z) {
        Consumer<Object> consumer = this.i;
        if (consumer == null) {
            return super.i(obj, n2Var, n2Var2, z);
        }
        if (n2Var != n2Var2) {
            return false;
        }
        consumer.accept(obj);
        return true;
    }
}
