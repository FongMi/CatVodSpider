package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.ZrJ;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class w extends q {
    private final boolean e;

    public w(String str, boolean z) {
        com.github.catvod.spider.merge.XU.k.g(str);
        this.d = str;
        this.e = z;
    }

    @Override // com.github.catvod.spider.merge.UY.s
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (w) super.i();
    }

    @Override // com.github.catvod.spider.merge.UY.q, com.github.catvod.spider.merge.UY.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final s i() {
        return (w) super.i();
    }

    @Override // com.github.catvod.spider.merge.UY.q, com.github.catvod.spider.merge.UY.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final String s() {
        return ZrJ.d("5A272E2E24240B223F24272B");
    }

    @Override // com.github.catvod.spider.merge.UY.s
    public final String toString() {
        return t();
    }

    @Override // com.github.catvod.spider.merge.UY.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        Appendable appendableAppend = appendable.append(ZrJ.d("45"));
        boolean z = this.e;
        CharSequence charSequenceD = ZrJ.d("58");
        CharSequence charSequenceD2 = ZrJ.d("46");
        appendableAppend.append(z ? charSequenceD : charSequenceD2).append(I());
        c cVarD = d();
        cVarD.getClass();
        int i2 = 0;
        while (true) {
            if (i2 >= cVarD.a || !cVarD.t(cVarD.b[i2])) {
                if (!(i2 < cVarD.a)) {
                    break;
                }
                a aVar = new a(cVarD.b[i2], (String) cVarD.c[i2], cVarD);
                int i3 = i2 + 1;
                String strA = aVar.a();
                String value = aVar.getValue();
                if (!strA.equals(ZrJ.d("5A272E2E24240B223F24272B"))) {
                    appendable.append(' ');
                    appendable.append(strA);
                    if (!value.isEmpty()) {
                        appendable.append(ZrJ.d("4461"));
                        o.d(appendable, value, gVar, true, false, false, false);
                        appendable.append('\"');
                    }
                }
                i2 = i3;
            } else {
                i2++;
            }
        }
        if (!this.e) {
            charSequenceD = charSequenceD2;
        }
        appendable.append(charSequenceD).append(ZrJ.d("47"));
    }

    @Override // com.github.catvod.spider.merge.UY.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
