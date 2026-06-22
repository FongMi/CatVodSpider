package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.yZ.InterfaceC1439d;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class D {
    private final C[] a;
    private final int b;

    public D(C[] cArr) {
        this.a = cArr;
        int iG = 0;
        for (C c : cArr) {
            iG = com.github.catvod.spider.merge.Bk.l.g(iG, c);
        }
        this.b = com.github.catvod.spider.merge.Bk.l.b(iG, cArr.length);
    }

    public static D a(D d, C c) {
        if (d == null) {
            return new D(new C[]{c});
        }
        C[] cArr = d.a;
        C[] cArr2 = (C[]) Arrays.copyOf(cArr, cArr.length + 1);
        cArr2[cArr2.length - 1] = c;
        return new D(cArr2);
    }

    public final void b(com.github.catvod.spider.merge.yZ.t tVar, InterfaceC1439d interfaceC1439d, int i) throws Throwable {
        int i2 = interfaceC1439d.i();
        boolean z = false;
        try {
            C[] cArr = this.a;
            int length = cArr.length;
            boolean z2 = false;
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    C c = cArr[i3];
                    if (c instanceof H) {
                        int iD = ((H) c).d() + i;
                        interfaceC1439d.e(iD);
                        c = ((H) c).c();
                        z2 = iD != i2;
                    } else if (c.a()) {
                        interfaceC1439d.e(i2);
                    }
                    c.b(tVar);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC1439d.e(i2);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC1439d.e(i2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final D c(int i) {
        C[] cArr = null;
        int i2 = 0;
        while (true) {
            C[] cArr2 = this.a;
            if (i2 >= cArr2.length) {
                break;
            }
            if (cArr2[i2].a()) {
                C[] cArr3 = this.a;
                if (!(cArr3[i2] instanceof H)) {
                    if (cArr == null) {
                        cArr = (C[]) cArr3.clone();
                    }
                    cArr[i2] = new H(i, this.a[i2]);
                }
            }
            i2++;
        }
        return cArr == null ? this : new D(cArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        return this.b == d.b && Arrays.equals(this.a, d.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
