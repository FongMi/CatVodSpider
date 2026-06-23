package com.github.catvod.spider.merge.u;

import com.github.catvod.spider.merge.t.InterfaceC0627d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0655y {
    private final InterfaceC0654x[] a;
    private final int b;

    public C0655y(InterfaceC0654x[] interfaceC0654xArr) {
        this.a = interfaceC0654xArr;
        int i = 0;
        for (InterfaceC0654x interfaceC0654x : interfaceC0654xArr) {
            i = com.github.catvod.spider.merge.F.a.i(i, interfaceC0654x);
        }
        this.b = com.github.catvod.spider.merge.F.a.b(i, interfaceC0654xArr.length);
    }

    public static C0655y a(C0655y c0655y, InterfaceC0654x interfaceC0654x) {
        if (c0655y == null) {
            return new C0655y(new InterfaceC0654x[]{interfaceC0654x});
        }
        InterfaceC0654x[] interfaceC0654xArr = c0655y.a;
        InterfaceC0654x[] interfaceC0654xArr2 = (InterfaceC0654x[]) Arrays.copyOf(interfaceC0654xArr, interfaceC0654xArr.length + 1);
        interfaceC0654xArr2[interfaceC0654xArr2.length - 1] = interfaceC0654x;
        return new C0655y(interfaceC0654xArr2);
    }

    public final void b(com.github.catvod.spider.merge.t.q qVar, InterfaceC0627d interfaceC0627d, int i) throws Throwable {
        int iH = interfaceC0627d.h();
        boolean z = false;
        try {
            InterfaceC0654x[] interfaceC0654xArr = this.a;
            int length = interfaceC0654xArr.length;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    InterfaceC0654x interfaceC0654xC = interfaceC0654xArr[i2];
                    if (interfaceC0654xC instanceof C) {
                        int iD = ((C) interfaceC0654xC).d() + i;
                        interfaceC0627d.e(iD);
                        interfaceC0654xC = ((C) interfaceC0654xC).c();
                        z2 = iD != iH;
                    } else if (interfaceC0654xC.b()) {
                        interfaceC0627d.e(iH);
                    }
                    interfaceC0654xC.a(qVar);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC0627d.e(iH);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC0627d.e(iH);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final C0655y c(int i) {
        InterfaceC0654x[] interfaceC0654xArr = null;
        int i2 = 0;
        while (true) {
            InterfaceC0654x[] interfaceC0654xArr2 = this.a;
            if (i2 >= interfaceC0654xArr2.length) {
                break;
            }
            if (interfaceC0654xArr2[i2].b()) {
                InterfaceC0654x[] interfaceC0654xArr3 = this.a;
                if (!(interfaceC0654xArr3[i2] instanceof C)) {
                    if (interfaceC0654xArr == null) {
                        interfaceC0654xArr = (InterfaceC0654x[]) interfaceC0654xArr3.clone();
                    }
                    interfaceC0654xArr[i2] = new C(i, this.a[i2]);
                }
            }
            i2++;
        }
        return interfaceC0654xArr == null ? this : new C0655y(interfaceC0654xArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0655y)) {
            return false;
        }
        C0655y c0655y = (C0655y) obj;
        return this.b == c0655y.b && Arrays.equals(this.a, c0655y.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
