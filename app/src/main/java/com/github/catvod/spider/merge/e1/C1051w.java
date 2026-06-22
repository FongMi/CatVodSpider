package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.b1.C0906c;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1051w extends N {
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ C1051w(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        switch (this.a) {
            case 0:
                return ((String) this.b).equals(mVar2.c0());
            default:
                Pattern pattern = (Pattern) this.b;
                StringBuilder sbB = C0906c.b();
                com.github.catvod.spider.merge.L1.l.i(new com.github.catvod.spider.merge.c1.j(sbB), mVar2);
                return pattern.matcher(C0906c.h(sbB)).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format("#%s", (String) this.b);
            default:
                return String.format(":matchesWholeText(%s)", (Pattern) this.b);
        }
    }
}
