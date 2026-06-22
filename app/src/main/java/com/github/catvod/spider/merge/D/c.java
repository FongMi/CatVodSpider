package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.z.f;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class c implements b {
    public final f a;

    public c(f fVar) {
        this.a = fVar;
    }

    @Override // com.github.catvod.spider.merge.D.b
    public Object a(com.github.catvod.spider.merge.Q.c cVar) {
        cVar.getClass();
        return null;
    }

    @Override // com.github.catvod.spider.merge.D.b
    public final String getText() {
        return this.a.a();
    }

    public final String toString() {
        f fVar = this.a;
        return fVar.a == -1 ? "<EOF>" : fVar.a();
    }
}
