package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class w extends wk {
    @Override // com.github.catvod.spider.merge.A0.wk, com.github.catvod.spider.merge.A0.uz
    /* JADX INFO: renamed from: b */
    public final wk a() {
        super.a();
        this.f = null;
        return this;
    }

    public final String toString() {
        String str = this.e ? "/>" : ">";
        qh qhVar = this.f;
        if (!(qhVar != null) || qhVar.a <= 0) {
            StringBuilder sb = new StringBuilder("<");
            String str2 = this.c;
            sb.append(str2 != null ? str2 : "[unset]");
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<");
        String str3 = this.c;
        sb2.append(str3 != null ? str3 : "[unset]");
        sb2.append(" ");
        sb2.append(this.f.toString());
        sb2.append(str);
        return sb2.toString();
    }
}
