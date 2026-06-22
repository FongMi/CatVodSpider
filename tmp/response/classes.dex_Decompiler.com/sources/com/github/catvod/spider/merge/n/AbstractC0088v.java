package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class AbstractC0088v extends N {
    protected final int a;
    protected final int b;

    public AbstractC0088v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        com.github.catvod.spider.merge.L.m mVarK0 = mVar2.k0();
        if (mVarK0 != null && !(mVarK0 instanceof com.github.catvod.spider.merge.L.h)) {
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

    protected abstract int b(com.github.catvod.spider.merge.L.m mVar);

    protected abstract String c();

    public String toString() {
        return this.a == 0 ? String.format(oZP.d("4F4A046949315C"), c(), Integer.valueOf(this.b)) : this.b == 0 ? String.format(oZP.d("4F4A046949311B46"), c(), Integer.valueOf(this.a)) : String.format(oZP.d("4F4A046949311B4A5C2545"), c(), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
