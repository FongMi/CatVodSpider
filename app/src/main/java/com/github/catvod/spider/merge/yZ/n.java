package com.github.catvod.spider.merge.yZ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class n extends C1438c {
    public n(G g) {
        super(g);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    @Override // com.github.catvod.spider.merge.yZ.C1438c, com.github.catvod.spider.merge.yZ.H
    public final E f(int i) {
        m();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return p(-i);
        }
        int iN = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = iN + 1;
            if (o(i3)) {
                iN = n(i3);
            }
        }
        return (E) this.b.get(iN);
    }

    @Override // com.github.catvod.spider.merge.yZ.C1438c
    protected final int k(int i) {
        return n(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.yZ.E>] */
    protected final E p(int i) {
        if (i != 0) {
            int size = this.c;
            if (size - i >= 0) {
                for (int i2 = 1; i2 <= i && size > 0; i2++) {
                    size--;
                    o(size);
                    if (size >= size()) {
                        size = size() - 1;
                    } else {
                        while (size >= 0) {
                            E e = (E) this.b.get(size);
                            if (e.getType() == -1 || e.e() == 0) {
                                break;
                            }
                            size--;
                        }
                    }
                }
                if (size < 0) {
                    return null;
                }
                return (E) this.b.get(size);
            }
        }
        return null;
    }
}
