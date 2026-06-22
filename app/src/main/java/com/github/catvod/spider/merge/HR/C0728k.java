package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;
import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0728k extends N {
    public final /* synthetic */ int a;
    private final Serializable b;

    public C0728k(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = com.github.catvod.spider.merge.Bk.l.c(str);
        } else {
            com.github.catvod.spider.merge.XU.k.e(str);
            this.b = com.github.catvod.spider.merge.Bk.l.c(str);
        }
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        switch (this.a) {
            case 0:
                Iterator<com.github.catvod.spider.merge.UY.a> it = mVar2.d().g().iterator();
                while (it.hasNext()) {
                    if (com.github.catvod.spider.merge.Bk.l.c(it.next().a()).startsWith((String) this.b)) {
                        return true;
                    }
                }
                return false;
            case 1:
                return com.github.catvod.spider.merge.Bk.l.c(mVar2.X()).contains((String) this.b);
            default:
                return ((Pattern) this.b).matcher(mVar2.x0()).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(ZrJ.d("221D6E3E15"), (String) this.b);
            case 1:
                return String.format(ZrJ.d("432024233C24102D38092931186B6E3E61"), (String) this.b);
            default:
                return String.format(ZrJ.d("432E2A392B2D1C301C2527291C0C3C231C20013763683B6C"), (Pattern) this.b);
        }
    }

    public C0728k(Pattern pattern) {
        this.a = 2;
        this.b = pattern;
    }
}
