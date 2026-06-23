package com.github.catvod.spider.merge.t;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class k extends C0626c {
    public k(InterfaceC0620B interfaceC0620B) {
        super(interfaceC0620B);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    @Override // com.github.catvod.spider.merge.t.C0626c, com.github.catvod.spider.merge.t.InterfaceC0621C
    public final z f(int i) {
        l();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return o(-i);
        }
        int iM = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = iM + 1;
            if (n(i3)) {
                iM = m(i3);
            }
        }
        return (z) this.b.get(iM);
    }

    @Override // com.github.catvod.spider.merge.t.C0626c
    protected final int j(int i) {
        return m(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.t.z>] */
    protected final z o(int i) {
        if (i != 0) {
            int size = this.c;
            if (size - i >= 0) {
                for (int i2 = 1; i2 <= i && size > 0; i2++) {
                    size--;
                    n(size);
                    if (size >= size()) {
                        size = size() - 1;
                    } else {
                        while (size >= 0) {
                            z zVar = (z) this.b.get(size);
                            if (zVar.getType() == -1 || zVar.e() == 0) {
                                break;
                            }
                            size--;
                        }
                    }
                }
                if (size < 0) {
                    return null;
                }
                return (z) this.b.get(size);
            }
        }
        return null;
    }
}
