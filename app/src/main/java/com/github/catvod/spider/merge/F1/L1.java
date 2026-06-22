package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class L1 extends AbstractC1088D {
    private String l;
    private int m;

    private L1() {
    }

    L1(n2 n2Var, Object obj) {
        super(n2Var, "StringIterator");
        this.m = 0;
        this.l = C1157l2.x1(obj);
    }

    static void t1(p2 p2Var) {
        AbstractC1088D.q1(p2Var, new L1(), "StringIterator");
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "String Iterator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final String p1() {
        return "StringIterator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final boolean r1(C1185v c1185v) {
        return this.m >= this.l.length();
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final Object s1(C1185v c1185v, n2 n2Var) {
        int iOffsetByCodePoints = this.l.offsetByCodePoints(this.m, 1);
        String strSubstring = this.l.substring(this.m, iOffsetByCodePoints);
        this.m = iOffsetByCodePoints;
        return strSubstring;
    }
}
