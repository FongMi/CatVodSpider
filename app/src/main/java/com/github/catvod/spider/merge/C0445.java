package com.github.catvod.spider.merge;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ೲ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0445 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final InterfaceC0444[] f1096;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final int f1097;

    public C0445(InterfaceC0444[] interfaceC0444Arr) {
        this.f1096 = interfaceC0444Arr;
        int iM408 = C0120.m408();
        for (InterfaceC0444 interfaceC0444 : interfaceC0444Arr) {
            iM408 = C0120.m411(iM408, interfaceC0444);
        }
        this.f1097 = C0120.m406(iM408, interfaceC0444Arr.length);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static C0445 m1673(C0445 c0445, InterfaceC0444 interfaceC0444) {
        if (c0445 == null) {
            return new C0445(new InterfaceC0444[]{interfaceC0444});
        }
        InterfaceC0444[] interfaceC0444Arr = c0445.f1096;
        InterfaceC0444[] interfaceC0444Arr2 = (InterfaceC0444[]) Arrays.copyOf(interfaceC0444Arr, interfaceC0444Arr.length + 1);
        interfaceC0444Arr2[interfaceC0444Arr2.length - 1] = interfaceC0444;
        return new C0445(interfaceC0444Arr2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0445)) {
            return false;
        }
        C0445 c0445 = (C0445) obj;
        return this.f1097 == c0445.f1097 && Arrays.equals(this.f1096, c0445.f1096);
    }

    public int hashCode() {
        return this.f1097;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public void m1674(AbstractC0386 abstractC0386, InterfaceC0317 interfaceC0317, int i) throws Throwable {
        int iMo1215 = interfaceC0317.mo1215();
        boolean z = false;
        try {
            InterfaceC0444[] interfaceC0444Arr = this.f1096;
            int length = interfaceC0444Arr.length;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    InterfaceC0444 interfaceC0444M1681 = interfaceC0444Arr[i2];
                    if (interfaceC0444M1681 instanceof C0450) {
                        int iM1682 = ((C0450) interfaceC0444M1681).m1682() + i;
                        interfaceC0317.mo1211(iM1682);
                        interfaceC0444M1681 = ((C0450) interfaceC0444M1681).m1681();
                        z2 = iM1682 != iMo1215;
                    } else if (interfaceC0444M1681.mo1671()) {
                        interfaceC0317.mo1211(iMo1215);
                    }
                    interfaceC0444M1681.mo1672(abstractC0386);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC0317.mo1211(iMo1215);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC0317.mo1211(iMo1215);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public C0445 m1675(int i) {
        InterfaceC0444[] interfaceC0444Arr = null;
        int i2 = 0;
        while (true) {
            InterfaceC0444[] interfaceC0444Arr2 = this.f1096;
            if (i2 >= interfaceC0444Arr2.length) {
                break;
            }
            if (interfaceC0444Arr2[i2].mo1671()) {
                InterfaceC0444[] interfaceC0444Arr3 = this.f1096;
                if (!(interfaceC0444Arr3[i2] instanceof C0450)) {
                    if (interfaceC0444Arr == null) {
                        interfaceC0444Arr = (InterfaceC0444[]) interfaceC0444Arr3.clone();
                    }
                    interfaceC0444Arr[i2] = new C0450(i, this.f1096[i2]);
                }
            }
            i2++;
        }
        return interfaceC0444Arr == null ? this : new C0445(interfaceC0444Arr);
    }
}
