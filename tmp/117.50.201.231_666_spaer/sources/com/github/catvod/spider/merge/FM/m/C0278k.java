package com.github.catvod.spider.merge.FM.M;

import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0278k extends N {
    public final /* synthetic */ int a;
    private final Serializable b;

    public C0278k(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = com.github.catvod.spider.merge.FM.A.l.d(str);
        } else {
            com.github.catvod.spider.merge.FM.I.c.e(str);
            this.b = com.github.catvod.spider.merge.FM.A.l.d(str);
        }
    }

    public C0278k(Pattern pattern) {
        this.a = 2;
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        switch (this.a) {
            case 0:
                Iterator<com.github.catvod.spider.merge.FM.K.a> it = mVar2.d().g().iterator();
                while (it.hasNext()) {
                    if (com.github.catvod.spider.merge.FM.A.l.d(it.next().a()).startsWith((String) this.b)) {
                        return true;
                    }
                }
                return false;
            case 1:
                return com.github.catvod.spider.merge.FM.A.l.d(mVar2.X()).contains((String) this.b);
            default:
                return ((Pattern) this.b).matcher(mVar2.x0()).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format("[^%s]", (String) this.b);
            case 1:
                return String.format(":containsData(%s)", (String) this.b);
            default:
                return String.format(":matchesWholeOwnText(%s)", (Pattern) this.b);
        }
    }
}
