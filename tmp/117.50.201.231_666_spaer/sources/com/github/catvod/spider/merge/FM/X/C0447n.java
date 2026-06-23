package com.github.catvod.spider.merge.FM.x;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0447n extends C0436c {
    public C0447n(InterfaceC0429G interfaceC0429G) {
        super(interfaceC0429G);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    @Override // com.github.catvod.spider.merge.FM.x.C0436c, com.github.catvod.spider.merge.FM.x.InterfaceC0430H
    public final InterfaceC0427E g(int i) {
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
        return (InterfaceC0427E) this.b.get(iN);
    }

    @Override // com.github.catvod.spider.merge.FM.x.C0436c
    protected final int k(int i) {
        return n(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.x.E>] */
    protected final InterfaceC0427E p(int i) {
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
                            InterfaceC0427E interfaceC0427E = (InterfaceC0427E) this.b.get(size);
                            if (interfaceC0427E.getType() == -1 || interfaceC0427E.e() == 0) {
                                break;
                            }
                            size--;
                        }
                    }
                }
                if (size < 0) {
                    return null;
                }
                return (InterfaceC0427E) this.b.get(size);
            }
        }
        return null;
    }
}
