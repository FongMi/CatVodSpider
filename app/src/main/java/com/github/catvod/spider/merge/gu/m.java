package com.github.catvod.spider.merge.gu;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
        if (i != 0) {
            int size = ((c) this).c;
            if (size - i >= 0) {
                for (int i2 = 1; i2 <= i && size > 0; i2++) {
                    size--;
                    o(size);
                    if (size >= size()) {
                        size = size() - 1;
                    } else {
                        while (size >= 0) {
                            D d = (D) ((c) this).b.get(size);
                            if (d.e() == -1 || d.getChannel() == 0) {
                                break;
                            }
                            size--;
                        }
                    }
                }
                if (size < 0) {
                    return null;
                }
                return (D) ((c) this).b.get(size);
            }
        }
        return null;
    }
}
