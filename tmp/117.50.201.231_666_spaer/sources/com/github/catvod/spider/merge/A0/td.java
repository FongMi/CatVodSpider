package com.github.catvod.spider.merge.A0;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class td implements hp {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ td(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public td(ha haVar) {
        this.a = 1;
        this.b = (c) haVar;
    }

    @Override // com.github.catvod.spider.merge.A0.hp
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((List) this.b).iterator();
            case 1:
                c cVar = (c) this.b;
                uk ukVar = new uk();
                ukVar.c = cVar.create(ukVar, ukVar);
                return ukVar;
            default:
                return (Iterator) this.b;
        }
    }
}
