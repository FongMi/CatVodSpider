package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.InterfaceC0250E;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class g implements f {
    public InterfaceC0250E a;

    public g(InterfaceC0250E interfaceC0250E) {
        this.a = interfaceC0250E;
    }

    @Override // com.github.catvod.spider.merge.C.f
    public final InterfaceC0250E a() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.C.b
    public <T> T b(d<? extends T> dVar) {
        dVar.i();
        return null;
    }

    @Override // com.github.catvod.spider.merge.C.b
    public final String getText() {
        return this.a.getText();
    }

    public final String toString() {
        return this.a.getType() == -1 ? oZP.d("492A380752") : this.a.getText();
    }
}
