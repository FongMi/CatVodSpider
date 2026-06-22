package com.github.catvod.utils.merge;

import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Yun115FileComparator implements Comparator<Yun115File> {
    @Override // java.util.Comparator
    public final int compare(Yun115File c0902a, Yun115File c0902a2) {
        Yun115File c0902a3 = c0902a;
        Yun115File c0902a4 = c0902a2;
        try {
            int i = Integer.parseInt(m.x(c0902a3.k()).replaceAll("\\D+", ""));
            int i2 = Integer.parseInt(m.x(c0902a4.k()).replaceAll("\\D+", ""));
            if (i == i2) {
                return 0;
            }
            return i < i2 ? -1 : 1;
        } catch (NumberFormatException unused) {
            return c0902a3.b().compareToIgnoreCase(c0902a4.b());
        }
    }
}
