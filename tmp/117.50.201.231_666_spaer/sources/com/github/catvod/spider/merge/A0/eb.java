package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class eb implements v {
    public final boolean a;

    public eb(boolean z) {
        this.a = z;
    }

    @Override // com.github.catvod.spider.merge.A0.v
    public final boolean d() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.A0.v
    public final zo e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
