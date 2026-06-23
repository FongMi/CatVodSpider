package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class mm implements dl {
    public final to a;

    public mm(to toVar) {
        this.a = toVar;
    }

    @Override // com.github.catvod.spider.merge.A0.dl
    public Object b(uv uvVar) {
        return null;
    }

    @Override // com.github.catvod.spider.merge.A0.dl
    public final String c() {
        return this.a.j();
    }

    public final String toString() {
        to toVar = this.a;
        return toVar.a == -1 ? "<EOF>" : toVar.j();
    }
}
