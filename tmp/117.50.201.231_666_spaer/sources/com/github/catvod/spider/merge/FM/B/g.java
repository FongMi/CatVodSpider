package com.github.catvod.spider.merge.FM.B;

import com.github.catvod.spider.merge.FM.x.InterfaceC0427E;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class g implements f {
    public InterfaceC0427E a;

    public g(InterfaceC0427E interfaceC0427E) {
        this.a = interfaceC0427E;
    }

    @Override // com.github.catvod.spider.merge.FM.B.f
    public final InterfaceC0427E a() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.FM.B.b
    public <T> T b(d<? extends T> dVar) {
        dVar.f();
        return null;
    }

    @Override // com.github.catvod.spider.merge.FM.B.b
    public final String getText() {
        return this.a.getText();
    }

    public final String toString() {
        return this.a.getType() == -1 ? "<EOF>" : this.a.getText();
    }
}
