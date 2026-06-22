package com.github.catvod.spider.merge.A0;

import com.github.catvod.spider.merge.y.C1416e;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class f extends c {
    private final int i;
    private final Integer j;
    private final Integer k;
    private final com.github.catvod.spider.merge.B0.b l;

    public f(C1416e c1416e, boolean z, String str) {
        Integer numS;
        super(c1416e, z);
        this.i = c1416e.s("fps").intValue();
        c1416e.x("qualityLabel");
        if (c1416e.containsKey("size")) {
            String[] strArrSplit = c1416e.x("size").split("x");
            this.j = Integer.valueOf(Integer.parseInt(strArrSplit[0]));
            numS = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
        } else {
            this.j = c1416e.s("width");
            numS = c1416e.s("height");
        }
        this.k = numS;
        com.github.catvod.spider.merge.B0.b bVarValueOf = null;
        if (c1416e.containsKey("quality")) {
            try {
                bVarValueOf = com.github.catvod.spider.merge.B0.b.valueOf(c1416e.x("quality"));
            } catch (IllegalArgumentException unused) {
            }
        }
        this.l = bVarValueOf;
    }

    public final int i() {
        return this.i;
    }

    public final Integer j() {
        return this.k;
    }

    public final com.github.catvod.spider.merge.B0.b k() {
        com.github.catvod.spider.merge.B0.b bVar = this.l;
        return bVar != null ? bVar : this.b.e();
    }

    public final Integer l() {
        return this.j;
    }
}
