package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0616q implements X, com.github.catvod.spider.merge.C.w {
    public static final C0616q a = new C0616q();

    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.nio.ByteBuffer] */
    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        ((C0615p) bVar.t(C0615p.class, null)).getClass();
        ByteBuffer r1 = (T) ByteBuffer.wrap(null);
        r1.limit(0);
        r1.position(0);
        return r1;
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byte[] bArrArray = byteBuffer.array();
        h0 h0Var = l.j;
        h0Var.write(123);
        h0Var.j("array");
        h0Var.h(bArrArray);
        h0Var.k(',', "limit", byteBuffer.limit());
        h0Var.k(',', "position", byteBuffer.position());
        h0Var.write(125);
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 14;
    }
}
