package com.github.catvod.spider.merge.C0.Q;

import com.github.catvod.spider.merge.C0.P.InterfaceC0122d;
import com.github.catvod.spider.merge.C0.P.s;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class D {
    private final C[] a;
    private final int b;

    public D(C[] cArr) {
        this.a = cArr;
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int iP = com.github.catvod.spider.merge.C0.N.a.p(i2, cArr[i]);
            i++;
            i2 = iP;
        }
        this.b = com.github.catvod.spider.merge.C0.N.a.b(i2, cArr.length);
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

    public final void b(s sVar, InterfaceC0122d interfaceC0122d, int i) throws Throwable {
        boolean z;
        Throwable th;
        C[] cArr;
        int length;
        int i2;
        boolean z2;
        int i3 = interfaceC0122d.i();
        try {
            cArr = this.a;
            length = cArr.length;
            i2 = 0;
            z = false;
        } catch (Throwable th2) {
            z = false;
            th = th2;
        }
        while (i2 < length) {
            C c = cArr[i2];
            try {
                if (c instanceof H) {
                    int iD = ((H) c).d() + i;
                    interfaceC0122d.d(iD);
                    c = ((H) c).c();
                    z2 = iD != i3;
                    try {
                        c.a(sVar);
                        i2++;
                        z = z2;
                    } catch (Throwable th3) {
                        th = th3;
                        z = z2;
                    }
                } else if (c.b()) {
                    interfaceC0122d.d(i3);
                    c.a(sVar);
                    i2++;
                    z = z2;
                } else {
                    z2 = z;
                    c.a(sVar);
                    i2++;
                    z = z2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            if (!z) {
                throw th;
            }
            interfaceC0122d.d(i3);
            throw th;
        }
        if (z) {
            interfaceC0122d.d(i3);
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
