package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class rg {
    public rp a;
    public boolean b = false;
    public rg c;

    public rg(rp rpVar) {
        rp rpVar2 = new rp();
        this.a = rpVar2;
        rpVar2.addAll(rpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ed d() {
        if (this.a.size() != 1) {
            throw new tv("current context is more than one el,total = " + this.a.size());
        }
        rp rpVar = this.a;
        if (rpVar.isEmpty()) {
            return null;
        }
        return (ed) rpVar.get(0);
    }
}
