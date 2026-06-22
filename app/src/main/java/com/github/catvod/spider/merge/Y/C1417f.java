package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1417f implements com.github.catvod.spider.merge.D.J {
    private String a;
    private final List<Object> b = new ArrayList();

    public C1417f() {
    }

    public C1417f(String str) {
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<java.lang.Object>] */
    @Override // com.github.catvod.spider.merge.D.J
    public final void a(com.github.catvod.spider.merge.D.L l, int i) {
        h0 h0Var = l.j;
        int i2 = i0.BrowserSecure.b;
        if ((i & i2) != 0 || h0Var.f(i2)) {
            h0Var.write("/**/");
        }
        h0Var.write(this.a);
        h0Var.write(40);
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            if (i3 != 0) {
                h0Var.write(44);
            }
            l.u(this.b.get(i3));
        }
        h0Var.write(41);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.Object>] */
    public final void b(Object obj) {
        this.b.add(obj);
    }

    public final String toString() {
        return AbstractC1412a.l(this);
    }
}
