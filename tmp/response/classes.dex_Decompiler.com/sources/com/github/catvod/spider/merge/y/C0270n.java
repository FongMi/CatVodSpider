package com.github.catvod.spider.merge.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0270n extends C0259c {
    public C0270n(InterfaceC0252G interfaceC0252G) {
        super(interfaceC0252G);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    @Override // com.github.catvod.spider.merge.y.C0259c, com.github.catvod.spider.merge.y.InterfaceC0253H
    public final InterfaceC0250E f(int i) {
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
        return (InterfaceC0250E) this.b.get(iN);
    }

    @Override // com.github.catvod.spider.merge.y.C0259c
    protected final int k(int i) {
        return n(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.y.E>] */
    protected final InterfaceC0250E p(int i) {
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
                            InterfaceC0250E interfaceC0250E = (InterfaceC0250E) this.b.get(size);
                            if (interfaceC0250E.getType() == -1 || interfaceC0250E.e() == 0) {
                                break;
                            }
                            size--;
                        }
                    }
                }
                if (size < 0) {
                    return null;
                }
                return (InterfaceC0250E) this.b.get(size);
            }
        }
        return null;
    }
}
