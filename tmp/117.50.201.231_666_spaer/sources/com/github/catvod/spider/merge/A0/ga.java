package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class ga extends xr {
    public final xr e;
    public final int f;

    public ga(xr xrVar, int i) {
        super(xrVar != null ? po.e(po.j(po.k(1, xrVar), i), 2) : po.e(1, 0));
        this.e = xrVar;
        this.f = i;
    }

    public static ga g(xr xrVar, int i) {
        return (i == Integer.MAX_VALUE && xrVar == null) ? xr.h : new ga(xrVar, i);
    }

    @Override // com.github.catvod.spider.merge.A0.xr
    public xr a(int i) {
        return this.e;
    }

    @Override // com.github.catvod.spider.merge.A0.xr
    public int b(int i) {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.A0.xr
    public int d() {
        return 1;
    }

    @Override // com.github.catvod.spider.merge.A0.xr
    public boolean equals(Object obj) {
        xr xrVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        if (this.i != ((xr) obj).i) {
            return false;
        }
        ga gaVar = (ga) obj;
        return this.f == gaVar.f && (xrVar = this.e) != null && xrVar.equals(gaVar.e);
    }

    public String toString() {
        xr xrVar = this.e;
        String string = xrVar != null ? xrVar.toString() : "";
        int length = string.length();
        int i = this.f;
        if (length == 0) {
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(i) + " " + string;
    }
}
