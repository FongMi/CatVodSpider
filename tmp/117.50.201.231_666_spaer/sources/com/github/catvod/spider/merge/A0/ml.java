package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class ml extends us {
    public kv a = null;

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) {
        kv kvVar = this.a;
        if (kvVar != null) {
            return kvVar.b(rdVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) {
        kv kvVar = this.a;
        if (kvVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        kvVar.c(aagVar, obj);
    }

    @Override // com.github.catvod.spider.merge.A0.us
    public final kv k() {
        kv kvVar = this.a;
        if (kvVar != null) {
            return kvVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
