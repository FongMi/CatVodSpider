package com.github.catvod.spider.merge.u;

import com.github.catvod.spider.merge.a.C0529a;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0643l extends S {
    public final S[] c;
    public final int[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0643l(S[] sArr, int[] iArr) {
        int iH = 1;
        for (S s : sArr) {
            iH = com.github.catvod.spider.merge.F.a.i(iH, s);
        }
        for (int i : iArr) {
            iH = com.github.catvod.spider.merge.F.a.h(iH, i);
        }
        super(com.github.catvod.spider.merge.F.a.b(iH, sArr.length * 2));
        this.c = sArr;
        this.d = iArr;
    }

    @Override // com.github.catvod.spider.merge.u.S
    public final S c(int i) {
        return this.c[i];
    }

    @Override // com.github.catvod.spider.merge.u.S
    public final int d(int i) {
        return this.d[i];
    }

    @Override // com.github.catvod.spider.merge.u.S
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0643l) || this.a != obj.hashCode()) {
            return false;
        }
        C0643l c0643l = (C0643l) obj;
        return Arrays.equals(this.d, c0643l.d) && Arrays.equals(this.c, c0643l.c);
    }

    @Override // com.github.catvod.spider.merge.u.S
    public final boolean f() {
        return this.d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.u.S
    public final int h() {
        return this.d.length;
    }

    public final String toString() {
        String string;
        if (f()) {
            return "[]";
        }
        StringBuilder sbA = C0529a.a("[");
        for (int i = 0; i < this.d.length; i++) {
            if (i > 0) {
                sbA.append(", ");
            }
            int[] iArr = this.d;
            if (iArr[i] == Integer.MAX_VALUE) {
                string = "$";
            } else {
                sbA.append(iArr[i]);
                if (this.c[i] != null) {
                    sbA.append(' ');
                    string = this.c[i].toString();
                } else {
                    string = "null";
                }
            }
            sbA.append(string);
        }
        sbA.append("]");
        return sbA.toString();
    }
}
