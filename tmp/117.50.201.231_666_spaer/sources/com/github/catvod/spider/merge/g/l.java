package com.github.catvod.spider.merge.G;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
abstract class l extends m {
    private static boolean hasReplaced;
    private static long lastReplaceDay;
    Object d;

    l() {
    }

    private void J() {
        Object obj = this.d;
        if (obj instanceof b) {
            return;
        }
        b bVar = new b();
        this.d = bVar;
        if (obj != null) {
            bVar.w(t(), (String) obj);
        }
    }

    final String I() {
        return d(t());
    }

    @Override // com.github.catvod.spider.merge.G.m
    public String a(String str) {
        J();
        return super.a(str);
    }

    @Override // com.github.catvod.spider.merge.G.m
    public m c(String str, String str2) {
        if ((this.d instanceof b) || !str.equals("#doctype")) {
            J();
            super.c(str, str2);
        } else {
            this.d = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.G.m
    public String d(String str) {
        return !(this.d instanceof b) ? t().equals(str) ? (String) this.d : "" : super.d(str);
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final b e() {
        J();
        return (b) this.d;
    }

    @Override // com.github.catvod.spider.merge.G.m
    public String f() {
        m mVar = this.a;
        return mVar != null ? mVar.f() : "";
    }

    @Override // com.github.catvod.spider.merge.G.m
    public int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.G.m
    protected final m k(m mVar) {
        l lVar = (l) super.k(mVar);
        Object obj = this.d;
        if (obj instanceof b) {
            lVar.d = ((b) obj).clone();
        }
        return lVar;
    }

    @Override // com.github.catvod.spider.merge.G.m
    protected final void l(String str) {
    }

    @Override // com.github.catvod.spider.merge.G.m
    public m m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.G.m
    protected final List<m> n() {
        return m.c;
    }

    @Override // com.github.catvod.spider.merge.G.m
    protected final boolean p() {
        return this.d instanceof b;
    }
}
