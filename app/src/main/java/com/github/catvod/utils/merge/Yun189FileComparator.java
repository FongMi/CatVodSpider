package com.github.catvod.utils.merge;

import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Yun189FileComparator implements Comparator<Yun189File> {
    @Override // java.util.Comparator
    public final int compare(Yun189File c0891b, Yun189File c0891b2) {
        Yun189File c0891b3 = c0891b;
        Yun189File c0891b4 = c0891b2;
        try {
            int i = Integer.parseInt(m.x(m.v(c0891b3.a())).replaceAll("\\D+", ""));
            int i2 = Integer.parseInt(m.x(m.v(c0891b4.a())).replaceAll("\\D+", ""));
            if (i == i2) {
                return 0;
            }
            return i < i2 ? -1 : 1;
        } catch (NumberFormatException unused) {
            return c0891b3.b().compareToIgnoreCase(c0891b4.b());
        }
    }
}
