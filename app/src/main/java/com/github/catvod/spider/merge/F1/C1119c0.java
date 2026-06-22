package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1119c0 implements Serializable {
    C1115b0 b;
    C1115b0 c;
    Object d;
    double e;

    C1119c0(G0 g0, C1115b0 c1115b0) {
        C1115b0 c1115b02 = (C1115b0) g0.q1();
        this.b = c1115b02;
        if (c1115b02 == null || c1115b0 == null) {
            this.c = null;
            return;
        }
        int i = c1115b02.c - c1115b0.c;
        if (i != 0) {
            if (i < 0) {
                i = -i;
            } else {
                c1115b0 = c1115b02;
                c1115b02 = c1115b0;
            }
            do {
                c1115b0 = c1115b0.b;
                i--;
            } while (i != 0);
            if (c1115b0.c != c1115b02.c) {
                C1162n0.c();
                throw null;
            }
            c1115b0 = c1115b02;
            c1115b02 = c1115b0;
        }
        while (c1115b02 != c1115b0 && c1115b02 != null) {
            c1115b02 = c1115b02.b;
            c1115b0 = c1115b0.b;
        }
        this.c = c1115b02;
        if (c1115b02 == null || c1115b02.d) {
            return;
        }
        C1162n0.c();
        throw null;
    }
}
