package com.github.catvod.spider.merge.A0;

import java.util.EmptyStackException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aaz implements r {
    public static final aaz c = new aaz(0);
    public static final aaz d = new aaz(1);
    public static final aaz e = new aaz(2);
    public final /* synthetic */ int f;

    public /* synthetic */ aaz(int i) {
        this.f = i;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final boolean a() {
        switch (this.f) {
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.r
    public final void b(zc zcVar) {
        switch (this.f) {
            case 0:
                zcVar.o = -2;
                return;
            case 1:
                wz wzVar = zcVar.p;
                int i = wzVar.c;
                if (i == 0) {
                    throw new EmptyStackException();
                }
                int i2 = i - 1;
                if (i2 < 0 || i2 >= i) {
                    throw new IndexOutOfBoundsException();
                }
                int[] iArr = wzVar.b;
                int i3 = iArr[i2];
                System.arraycopy(iArr, i, iArr, i2, (i - i2) - 1);
                int[] iArr2 = wzVar.b;
                int i4 = wzVar.c - 1;
                iArr2[i4] = 0;
                wzVar.c = i4;
                zcVar.u = i3;
                return;
            default:
                zcVar.o = -3;
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f) {
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
        switch (this.f) {
            case 0:
                return po.e(po.j(0, 3), 1);
            case 1:
                return po.e(po.j(0, 4), 1);
            default:
                return po.e(po.j(0, 6), 1);
        }
    }

    public final String toString() {
        switch (this.f) {
            case 0:
                return "more";
            case 1:
                return "popMode";
            default:
                return "skip";
        }
    }
}
