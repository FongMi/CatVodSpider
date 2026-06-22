package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.b1.C0906c;
import com.github.catvod.spider.merge.c1.C0945a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1040k extends N {
    public final /* synthetic */ int a;
    private final Serializable b;

    public C1040k(String str, int i) {
        this.a = i;
        if (i != 1) {
            C0899d.f(str);
            this.b = com.github.catvod.spider.merge.g.b.b(str);
        } else {
            StringBuilder sbB = C0906c.b();
            C0906c.a(sbB, str, false);
            this.b = com.github.catvod.spider.merge.g.b.b(C0906c.h(sbB));
        }
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        switch (this.a) {
            case 0:
                Iterator<C0945a> it = mVar2.d().h().iterator();
                while (it.hasNext()) {
                    if (com.github.catvod.spider.merge.g.b.b(it.next().a()).startsWith((String) this.b)) {
                        return true;
                    }
                }
                return false;
            case 1:
                return com.github.catvod.spider.merge.g.b.b(mVar2.s0()).contains((String) this.b);
            default:
                return ((Pattern) this.b).matcher(mVar2.s0()).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format("[^%s]", (String) this.b);
            case 1:
                return String.format(":contains(%s)", (String) this.b);
            default:
                return String.format(":matches(%s)", (Pattern) this.b);
        }
    }

    public C1040k(Pattern pattern) {
        this.a = 2;
        this.b = pattern;
    }
}
