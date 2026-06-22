package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޥ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0330 extends C0316 {

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected int f867;

    public C0330(InterfaceC0400 interfaceC0400) {
        super(interfaceC0400);
        this.f867 = 0;
    }

    @Override // com.github.catvod.spider.merge.C0316, com.github.catvod.spider.merge.InterfaceC0401
    /* JADX INFO: renamed from: ԫ */
    public InterfaceC0398 mo1213(int i) {
        m1222();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return m1264(-i);
        }
        int iM1223 = this.f832;
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = iM1223 + 1;
            if (m1226(i3)) {
                iM1223 = m1223(i3, this.f867);
            }
        }
        return this.f831.get(iM1223);
    }

    @Override // com.github.catvod.spider.merge.C0316
    /* JADX INFO: renamed from: ؠ */
    protected int mo1219(int i) {
        return m1223(i, this.f867);
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    protected InterfaceC0398 m1264(int i) {
        if (i != 0) {
            int iM1224 = this.f832;
            if (iM1224 - i >= 0) {
                for (int i2 = 1; i2 <= i && iM1224 > 0; i2++) {
                    iM1224 = m1224(iM1224 - 1, this.f867);
                }
                if (iM1224 < 0) {
                    return null;
                }
                return this.f831.get(iM1224);
            }
        }
        return null;
    }
}
