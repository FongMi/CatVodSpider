package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class AbstractC0288v extends N {
    protected final int a;
    protected final int b;

    public AbstractC0288v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        com.github.catvod.spider.merge.FM.K.m mVarK0 = mVar2.k0();
        if (mVarK0 != null && !(mVarK0 instanceof com.github.catvod.spider.merge.FM.K.h)) {
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

    protected abstract int b(com.github.catvod.spider.merge.FM.K.m mVar);

    protected abstract String c();

    public String toString() {
        return this.a == 0 ? String.format(":%s(%d)", c(), Integer.valueOf(this.b)) : this.b == 0 ? String.format(":%s(%dn)", c(), Integer.valueOf(this.a)) : String.format(":%s(%dn%+d)", c(), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
