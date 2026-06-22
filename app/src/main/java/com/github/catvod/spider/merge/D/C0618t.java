package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0618t implements X, com.github.catvod.spider.merge.C.w {
    public static final C0618t a = new C0618t();

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        Object objO = bVar.o(null);
        if (objO == null) {
            return null;
        }
        return (T) com.github.catvod.spider.merge.H.A.k(objO);
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        Character ch = (Character) obj;
        if (ch == null) {
            h0Var.v("");
        } else {
            h0Var.v(ch.charValue() == 0 ? "\u0000" : ch.toString());
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 4;
    }
}
