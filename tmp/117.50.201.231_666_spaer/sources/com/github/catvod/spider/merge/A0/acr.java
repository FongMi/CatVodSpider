package com.github.catvod.spider.merge.A0;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class acr implements hp {
    public final /* synthetic */ int a = 1;
    public final zy b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public acr(hp hpVar, qw qwVar) {
        ko.f("sequence", hpVar);
        this.c = hpVar;
        this.b = (zy) qwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public acr(String str, ha haVar) {
        ko.f("input", str);
        this.c = str;
        this.b = (zy) haVar;
    }

    @Override // com.github.catvod.spider.merge.A0.hp
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new acq(this);
            default:
                return new uh(this);
        }
    }
}
