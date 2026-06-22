package com.github.catvod.spider.merge.A;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0011l extends Q {
    public final Q[] c;
    public final int[] d;

    public C0011l(f0 f0Var) {
        this(new Q[]{f0Var.c}, new int[]{f0Var.d});
    }

    @Override // com.github.catvod.spider.merge.A.Q
    public final Q c(int i) {
        return this.c[i];
    }

    @Override // com.github.catvod.spider.merge.A.Q
    public final int d(int i) {
        return this.d[i];
    }

    @Override // com.github.catvod.spider.merge.A.Q
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0011l)) {
            return false;
        }
        if (this.a != ((Q) obj).a) {
            return false;
        }
        C0011l c0011l = (C0011l) obj;
        return Arrays.equals(this.d, c0011l.d) && Arrays.equals(this.c, c0011l.c);
    }

    @Override // com.github.catvod.spider.merge.A.Q
    public final boolean f() {
        return this.d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.A.Q
    public final int h() {
        return this.d.length;
    }

    public final String toString() {
        String string;
        if (f()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.d;
            if (i >= iArr.length) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = iArr[i];
            if (i2 == Integer.MAX_VALUE) {
                string = "$";
            } else {
                sb.append(i2);
                Q[] qArr = this.c;
                if (qArr[i] != null) {
                    sb.append(' ');
                    string = qArr[i].toString();
                } else {
                    string = "null";
                }
            }
            sb.append(string);
            i++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0011l(Q[] qArr, int[] iArr) {
        int iB = 1;
        for (Q q : qArr) {
            iB = com.github.catvod.spider.merge.R.a.c(iB, q);
        }
        for (int i : iArr) {
            iB = com.github.catvod.spider.merge.R.a.b(iB, i);
        }
        super(com.github.catvod.spider.merge.R.a.a(iB, qArr.length * 2));
        this.c = qArr;
        this.d = iArr;
    }
}
