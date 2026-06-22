package com.github.catvod.spider.merge.f1;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1198z0 implements Comparator<Object>, Serializable {
    private final Comparator<Object> b;

    public C1198z0() {
        this.b = B0.p;
    }

    public C1198z0(Comparator<Object> comparator) {
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        G2 g2 = G2.b;
        if (obj == g2) {
            if (obj2 == g2) {
                return 0;
            }
            return obj2 == I2.c ? -1 : 1;
        }
        I2 i2 = I2.c;
        if (obj == i2) {
            return obj2 == i2 ? 0 : 1;
        }
        if (obj2 == i2 || obj2 == g2) {
            return -1;
        }
        return this.b.compare(obj, obj2);
    }
}
