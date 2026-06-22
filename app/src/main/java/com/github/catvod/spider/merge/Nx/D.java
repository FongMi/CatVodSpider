package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.gu.InterfaceC1227d;
import com.github.catvod.spider.merge.gu.s;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class D {
    private final C[] a;
    private final int b;

    public D(C[] cArr) {
        this.a = cArr;
        int iP = 0;
        for (C c : cArr) {
            iP = i.p(iP, c);
        }
        this.b = i.b(iP, cArr.length);
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

    public final void b(s sVar, InterfaceC1227d interfaceC1227d, int i) throws Throwable {
        int i2 = interfaceC1227d.i();
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
                        interfaceC1227d.d(iD);
                        c = ((H) c).c();
                        z2 = iD != i2;
                    } else if (c.b()) {
                        interfaceC1227d.d(i2);
                    }
                    c.a(sVar);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC1227d.d(i2);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC1227d.d(i2);
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
            if (cArr2[i2].b()) {
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
