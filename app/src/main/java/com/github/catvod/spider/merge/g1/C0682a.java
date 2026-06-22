package com.github.catvod.spider.merge.G1;

import com.github.catvod.spider.merge.F1.C0628d;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0682a implements Serializable {
    private final String b;
    private final C0628d c;
    private boolean d;

    C0682a(String str, C0628d c0628d) {
        this.b = str;
        this.c = c0628d;
    }

    final String a() {
        return this.b;
    }

    final boolean b() {
        return this.d;
    }

    final C0628d c() {
        return this.c;
    }

    final void d(boolean z) {
        this.d = z;
    }
}
