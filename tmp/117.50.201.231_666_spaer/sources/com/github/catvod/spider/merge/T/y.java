package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.a.C0529a;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class y implements com.github.catvod.spider.merge.x.e {
    public static final u c = new u();
    public y a;
    public int b;

    public y() {
        this.b = -1;
    }

    public y(y yVar, int i) {
        this.a = yVar;
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.x.b
    public <T> T a(com.github.catvod.spider.merge.x.d<? extends T> dVar) {
        return dVar.A(this);
    }

    @Override // com.github.catvod.spider.merge.x.b
    public com.github.catvod.spider.merge.x.b c(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.x.b
    public int d() {
        throw null;
    }

    public int e() {
        return -1;
    }

    public final boolean f() {
        return this.b == -1;
    }

    @Override // com.github.catvod.spider.merge.x.b
    public final String getText() {
        if (d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            sb.append(c(i).getText());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("[");
        for (y yVar = this; yVar != null; yVar = yVar.a) {
            if (!yVar.f()) {
                sbA.append(yVar.b);
            }
            y yVar2 = yVar.a;
            if (yVar2 != null && !yVar2.f()) {
                sbA.append(" ");
            }
        }
        sbA.append("]");
        return sbA.toString();
    }
}
