package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;
import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0078k extends N {
    public final /* synthetic */ int a;
    private final Serializable b;

    public C0078k(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = com.github.catvod.spider.merge.B.l.c(str);
        } else {
            com.github.catvod.spider.merge.J.c.e(str);
            this.b = com.github.catvod.spider.merge.B.l.c(str);
        }
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        switch (this.a) {
            case 0:
                Iterator<com.github.catvod.spider.merge.L.a> it = mVar2.d().g().iterator();
                while (it.hasNext()) {
                    if (com.github.catvod.spider.merge.B.l.c(it.next().a()).startsWith((String) this.b)) {
                        return true;
                    }
                }
                return false;
            case 1:
                return com.github.catvod.spider.merge.B.l.c(mVar2.X()).contains((String) this.b);
            default:
                return ((Pattern) this.b).matcher(mVar2.x0()).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(oZP.d("2E31523231"), (String) this.b);
            case 1:
                return String.format(oZP.d("4F0C182F18341C0104050D211447523245"), (String) this.b);
            default:
                return String.format(oZP.d("4F0216350F3D101C202903391020002F38300D1B5F641F7C"), (Pattern) this.b);
        }
    }

    public C0078k(Pattern pattern) {
        this.a = 2;
        this.b = pattern;
    }
}
