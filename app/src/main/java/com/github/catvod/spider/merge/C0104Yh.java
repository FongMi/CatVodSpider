package com.github.catvod.spider.merge;

import java.util.ArrayList;

/* renamed from: com.github.catvod.spider.merge.Yh */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0104Yh extends ArrayList<C0069K> {

    /* renamed from: q */
    private final int f554q;

    /* renamed from: xC */
    private final int f555xC;

    C0104Yh(int i, int i2) {
        super(i);
        this.f554q = i;
        this.f555xC = i2;
    }

    /* renamed from: xC */
    public static C0104Yh m478xC() {
        return new C0104Yh(0, 0);
    }

    /* renamed from: q */
    boolean m479q() {
        return size() < this.f555xC;
    }
}
