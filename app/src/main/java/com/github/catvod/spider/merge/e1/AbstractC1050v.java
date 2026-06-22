package com.github.catvod.spider.merge.e1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1050v extends N {
    protected final int a;
    protected final int b;

    public AbstractC1050v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        com.github.catvod.spider.merge.c1.m mVarH0 = mVar2.h0();
        if (mVarH0 != null && !(mVarH0 instanceof com.github.catvod.spider.merge.c1.h)) {
            int iB = b(mVar2);
            int i = this.a;
            if (i == 0) {
                return iB == this.b;
            }
            int i2 = iB - this.b;
            if (i2 * i >= 0 && i2 % i == 0) {
                return true;
            }
        }
        return false;
    }

    protected abstract int b(com.github.catvod.spider.merge.c1.m mVar);

    protected abstract String c();

    public String toString() {
        return this.a == 0 ? String.format(":%s(%d)", c(), Integer.valueOf(this.b)) : this.b == 0 ? String.format(":%s(%dn)", c(), Integer.valueOf(this.a)) : String.format(":%s(%dn%+d)", c(), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
