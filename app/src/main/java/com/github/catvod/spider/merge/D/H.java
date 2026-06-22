package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.InterfaceC1414c;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class H implements X {
    public static H a = new H();

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.s();
        } else {
            h0Var.write(((InterfaceC1414c) obj).a());
        }
    }
}
