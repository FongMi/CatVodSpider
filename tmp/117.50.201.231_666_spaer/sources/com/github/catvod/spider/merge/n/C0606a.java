package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.m.C0602k;
import com.github.catvod.spider.merge.n.C0610e;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0606a implements InterfaceC0607b {
    private final C0610e a;

    public C0606a() {
        C0610e.a aVar = new C0610e.a();
        if (aVar.a == null) {
            aVar.a = new C0602k();
        }
        this.a = new C0610e(aVar);
    }

    @Override // com.github.catvod.spider.merge.n.InterfaceC0607b
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.n.InterfaceC0607b
    public final void b(String str, String str2) {
        this.a.a(str, str2);
    }
}
