package com.github.catvod.spider.merge.FM.y;

import com.github.catvod.spider.merge.FM.x.InterfaceC0437d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0455D {
    private final InterfaceC0454C[] a;
    private final int b;

    public C0455D(InterfaceC0454C[] interfaceC0454CArr) {
        this.a = interfaceC0454CArr;
        int iJ = 0;
        for (InterfaceC0454C interfaceC0454C : interfaceC0454CArr) {
            iJ = com.github.catvod.spider.merge.FM.A.l.j(iJ, interfaceC0454C);
        }
        this.b = com.github.catvod.spider.merge.FM.A.l.c(iJ, interfaceC0454CArr.length);
    }

    public static C0455D a(C0455D c0455d, InterfaceC0454C interfaceC0454C) {
        if (c0455d == null) {
            return new C0455D(new InterfaceC0454C[]{interfaceC0454C});
        }
        InterfaceC0454C[] interfaceC0454CArr = c0455d.a;
        InterfaceC0454C[] interfaceC0454CArr2 = (InterfaceC0454C[]) Arrays.copyOf(interfaceC0454CArr, interfaceC0454CArr.length + 1);
        interfaceC0454CArr2[interfaceC0454CArr2.length - 1] = interfaceC0454C;
        return new C0455D(interfaceC0454CArr2);
    }

    public final void b(com.github.catvod.spider.merge.FM.x.t tVar, InterfaceC0437d interfaceC0437d, int i) throws Throwable {
        int i2 = interfaceC0437d.i();
        boolean z = false;
        try {
            InterfaceC0454C[] interfaceC0454CArr = this.a;
            int length = interfaceC0454CArr.length;
            boolean z2 = false;
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    InterfaceC0454C interfaceC0454CC = interfaceC0454CArr[i3];
                    if (interfaceC0454CC instanceof H) {
                        int iD = ((H) interfaceC0454CC).d() + i;
                        interfaceC0437d.f(iD);
                        interfaceC0454CC = ((H) interfaceC0454CC).c();
                        z2 = iD != i2;
                    } else if (interfaceC0454CC.a()) {
                        interfaceC0437d.f(i2);
                    }
                    interfaceC0454CC.b(tVar);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC0437d.f(i2);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC0437d.f(i2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final C0455D c(int i) {
        InterfaceC0454C[] interfaceC0454CArr = null;
        int i2 = 0;
        while (true) {
            InterfaceC0454C[] interfaceC0454CArr2 = this.a;
            if (i2 >= interfaceC0454CArr2.length) {
                break;
            }
            if (interfaceC0454CArr2[i2].a()) {
                InterfaceC0454C[] interfaceC0454CArr3 = this.a;
                if (!(interfaceC0454CArr3[i2] instanceof H)) {
                    if (interfaceC0454CArr == null) {
                        interfaceC0454CArr = (InterfaceC0454C[]) interfaceC0454CArr3.clone();
                    }
                    interfaceC0454CArr[i2] = new H(i, this.a[i2]);
                }
            }
            i2++;
        }
        return interfaceC0454CArr == null ? this : new C0455D(interfaceC0454CArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0455D)) {
            return false;
        }
        C0455D c0455d = (C0455D) obj;
        return this.b == c0455d.b && Arrays.equals(this.a, c0455d.a);
    }

    public final int hashCode() {
        return this.b;
    }
}
