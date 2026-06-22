package com.github.catvod.spider.merge.a0;

import com.github.catvod.spider.merge.i0.m;
import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0895f implements Comparator<C0891b> {
    @Override // java.util.Comparator
    public final int compare(C0891b c0891b, C0891b c0891b2) {
        C0891b c0891b3 = c0891b;
        C0891b c0891b4 = c0891b2;
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
