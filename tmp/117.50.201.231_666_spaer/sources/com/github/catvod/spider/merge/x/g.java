package com.github.catvod.spider.merge.x;

import com.github.catvod.spider.merge.t.z;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class g implements f {
    public z a;

    public g(z zVar) {
        this.a = zVar;
    }

    @Override // com.github.catvod.spider.merge.x.b
    public <T> T a(d<? extends T> dVar) {
        dVar.i();
        return null;
    }

    @Override // com.github.catvod.spider.merge.x.f
    public final z b() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.x.b
    public final String getText() {
        return this.a.getText();
    }

    public final String toString() {
        return this.a.getType() == -1 ? "<EOF>" : this.a.getText();
    }
}
