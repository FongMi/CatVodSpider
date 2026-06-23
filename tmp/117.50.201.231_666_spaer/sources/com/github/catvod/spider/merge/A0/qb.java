package com.github.catvod.spider.merge.A0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class qb extends da {
    public static List c(Object[] objArr) {
        ko.f("<this>", objArr);
        List listAsList = Arrays.asList(objArr);
        ko.e("asList(...)", listAsList);
        return listAsList;
    }

    public static void d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        ko.f("<this>", bArr);
        ko.f("destination", bArr2);
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void e(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        ko.f("<this>", objArr);
        ko.f("destination", objArr2);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void f(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        e(objArr, objArr2, i, i2, i3);
    }

    public static byte[] g(byte[] bArr, int i, int i2) {
        ko.f("<this>", bArr);
        da.a(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        ko.e("copyOfRange(...)", bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    public static Object[] h(Object[] objArr, int i, int i2) {
        ko.f("<this>", objArr);
        da.a(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        ko.e("copyOfRange(...)", objArrCopyOfRange);
        return objArrCopyOfRange;
    }

    public static void i(Object[] objArr, int i, int i2) {
        ko.f("<this>", objArr);
        Arrays.fill(objArr, i, i2, (Object) null);
    }
}
