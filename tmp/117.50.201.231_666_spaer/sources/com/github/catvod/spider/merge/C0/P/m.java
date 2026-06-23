package com.github.catvod.spider.merge.C0.P;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class m extends c {
    public m(F f) {
        super(f);
    }

    public final D e(int i) {
        m();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return p(-i);
        }
        int iN = ((c) this).c;
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = iN + 1;
            if (o(i3)) {
                iN = n(i3);
            }
        }
        return (D) ((c) this).b.get(iN);
    }

    protected final int k(int i) {
        return n(i);
    }

    protected final D p(int i) {
        int size;
        if (i != 0) {
            int i2 = ((c) this).c;
            if (i2 - i >= 0) {
                int i3 = 1;
                int i4 = i2;
                while (i3 <= i && i4 > 0) {
                    int i5 = i4 - 1;
                    o(i5);
                    if (i5 >= size()) {
                        size = size() - 1;
                    } else {
                        while (i5 >= 0) {
                            D d = (D) ((c) this).b.get(i5);
                            if (d.e() == -1) {
                                break;
                            }
                            if (d.getChannel() == 0) {
                                size = i5;
                                break;
                            }
                            i5--;
                        }
                        size = i5;
                    }
                    i3++;
                    i4 = size;
                }
                if (i4 < 0) {
                    return null;
                }
                return (D) ((c) this).b.get(i4);
            }
        }
        return null;
    }
}
