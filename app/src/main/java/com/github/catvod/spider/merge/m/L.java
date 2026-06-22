package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class L extends M {
    public L() {
        this.a = 2;
    }

    @Override // com.github.catvod.spider.merge.M.M, com.github.catvod.spider.merge.M.N
    /* JADX INFO: renamed from: p */
    public final M f() {
        super.f();
        this.l = null;
        return this;
    }

    public final String toString() {
        if (!l() || this.l.a <= 0) {
            StringBuilder sb = new StringBuilder("<");
            String str = this.b;
            return com.github.catvod.spider.merge.A.T.h(sb, str != null ? str : "[unset]", ">");
        }
        StringBuilder sb2 = new StringBuilder("<");
        String str2 = this.b;
        sb2.append(str2 != null ? str2 : "[unset]");
        sb2.append(" ");
        sb2.append(this.l.toString());
        sb2.append(">");
        return sb2.toString();
    }
}
