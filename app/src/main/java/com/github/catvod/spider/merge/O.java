package com.github.catvod.spider.merge;

import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class O extends ArrayList<cz> {
    private final int S;
    private final int l8;

    O(int i, int i2) {
        super(i);
        this.l8 = i;
        this.S = i2;
    }

    public static O S() {
        return new O(0, 0);
    }

    boolean l8() {
        return size() < this.S;
    }
}
