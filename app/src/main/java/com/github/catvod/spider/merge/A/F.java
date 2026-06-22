package com.github.catvod.spider.merge.A;

import java.util.EmptyStackException;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class F implements InterfaceC0023y {
    public static final F b = new F(0);
    public static final F c = new F(1);
    public static final F d = new F(2);
    public final /* synthetic */ int a;

    public /* synthetic */ F(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final boolean a() {
        switch (this.a) {
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final void b(com.github.catvod.spider.merge.z.m mVar) {
        switch (this.a) {
            case 0:
                mVar.m = -2;
                return;
            case 1:
                com.github.catvod.spider.merge.C.d dVar = mVar.n;
                int i = dVar.b;
                if (i == 0) {
                    throw new EmptyStackException();
                }
                int i2 = i - 1;
                if (i2 < 0 || i2 >= i) {
                    throw new IndexOutOfBoundsException();
                }
                int[] iArr = dVar.a;
                int i3 = iArr[i2];
                System.arraycopy(iArr, i, iArr, i2, (i - i2) - 1);
                int[] iArr2 = dVar.a;
                int i4 = dVar.b - 1;
                iArr2[i4] = 0;
                dVar.b = i4;
                mVar.o = i3;
                return;
            default:
                mVar.m = -3;
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == this) {
                }
                break;
            case 1:
                if (obj == this) {
                }
                break;
            default:
                if (obj == this) {
                }
                break;
        }
        return false;
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.b(0, 3), 1);
            case 1:
                return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.b(0, 4), 1);
            default:
                return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.b(0, 6), 1);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "more";
            case 1:
                return "popMode";
            default:
                return "skip";
        }
    }
}
