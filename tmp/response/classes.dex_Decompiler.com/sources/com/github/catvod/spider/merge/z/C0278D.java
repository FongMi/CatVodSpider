package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.y.InterfaceC0260d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0278D {
    private final InterfaceC0277C[] a;
    private final int b;

    public C0278D(InterfaceC0277C[] interfaceC0277CArr) {
        this.a = interfaceC0277CArr;
        int iG = 0;
        for (InterfaceC0277C interfaceC0277C : interfaceC0277CArr) {
            iG = com.github.catvod.spider.merge.B.l.g(iG, interfaceC0277C);
        }
        this.b = com.github.catvod.spider.merge.B.l.b(iG, interfaceC0277CArr.length);
    }

    public static C0278D a(C0278D c0278d, InterfaceC0277C interfaceC0277C) {
        if (c0278d == null) {
            return new C0278D(new InterfaceC0277C[]{interfaceC0277C});
        }
        InterfaceC0277C[] interfaceC0277CArr = c0278d.a;
        InterfaceC0277C[] interfaceC0277CArr2 = (InterfaceC0277C[]) Arrays.copyOf(interfaceC0277CArr, interfaceC0277CArr.length + 1);
        interfaceC0277CArr2[interfaceC0277CArr2.length - 1] = interfaceC0277C;
        return new C0278D(interfaceC0277CArr2);
    }

    public final void b(com.github.catvod.spider.merge.y.t tVar, InterfaceC0260d interfaceC0260d, int i) throws Throwable {
        int i2 = interfaceC0260d.i();
        boolean z = false;
        try {
            InterfaceC0277C[] interfaceC0277CArr = this.a;
            int length = interfaceC0277CArr.length;
            boolean z2 = false;
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    InterfaceC0277C interfaceC0277CC = interfaceC0277CArr[i3];
                    if (interfaceC0277CC instanceof H) {
                        int iD = ((H) interfaceC0277CC).d() + i;
                        interfaceC0260d.e(iD);
                        interfaceC0277CC = ((H) interfaceC0277CC).c();
                        z2 = iD != i2;
                    } else if (interfaceC0277CC.a()) {
                        interfaceC0260d.e(i2);
                    }
                    interfaceC0277CC.b(tVar);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC0260d.e(i2);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC0260d.e(i2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final C0278D c(int i) {
        InterfaceC0277C[] interfaceC0277CArr = null;
        int i2 = 0;
        while (true) {
            InterfaceC0277C[] interfaceC0277CArr2 = this.a;
            if (i2 >= interfaceC0277CArr2.length) {
                break;
            }
            if (interfaceC0277CArr2[i2].a()) {
                InterfaceC0277C[] interfaceC0277CArr3 = this.a;
                if (!(interfaceC0277CArr3[i2] instanceof H)) {
                    if (interfaceC0277CArr == null) {
                        interfaceC0277CArr = (InterfaceC0277C[]) interfaceC0277CArr3.clone();
                    }
                    interfaceC0277CArr[i2] = new H(i, this.a[i2]);
                }
            }
            i2++;
        }
        return interfaceC0277CArr == null ? this : new C0278D(interfaceC0277CArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0278D)) {
            return false;
        }
        C0278D c0278d = (C0278D) obj;
        return this.b == c0278d.b && Arrays.equals(this.a, c0278d.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
