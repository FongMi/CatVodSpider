package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0738v extends N {
    protected final int a;
    protected final int b;

    public AbstractC0738v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        com.github.catvod.spider.merge.UY.m mVarK0 = mVar2.k0();
        if (mVarK0 != null && !(mVarK0 instanceof com.github.catvod.spider.merge.UY.h)) {
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

    protected abstract int b(com.github.catvod.spider.merge.UY.m mVar);

    protected abstract String c();

    public String toString() {
        return this.a == 0 ? String.format(ZrJ.d("436638656D2150"), c(), Integer.valueOf(this.b)) : this.b == 0 ? String.format(ZrJ.d("436638656D21176A"), c(), Integer.valueOf(this.a)) : String.format(ZrJ.d("436638656D211766602961"), c(), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
