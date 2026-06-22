package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class I2 implements Serializable {
    public static final I2 c = new I2(1);
    public static final I2 d = new I2(2);
    public static final I2 e = new I2(3);
    private final int b;

    private I2(int i) {
        this.b = i;
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i == 1) {
            str = "NOT_FOUND";
        } else if (i == 2) {
            str = "NULL_VALUE";
        } else {
            if (i != 3) {
                C1162n0.c();
                throw null;
            }
            str = "DOUBLE_MARK";
        }
        return com.github.catvod.spider.merge.y.z.b(new StringBuilder(), super.toString(), ": ", str);
    }
}
