package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HN.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0716p {
    final AbstractC0715o a;
    final int b;

    C0716p(AbstractC0715o abstractC0715o, int i) {
        this.a = abstractC0715o;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("2A37392C3C201E3A0A232C1210273F25681E0A37392C3C201E3A76"));
        sbB.append(this.a);
        sbB.append(ZrJ.d("55633C242C31117E"));
        sbB.append(this.b);
        sbB.append(ZrJ.d("24"));
        return sbB.toString();
    }
}
