package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.a1.C0899d;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class w extends q {
    private final boolean f;

    public w(String str, boolean z) {
        C0899d.h(str);
        this.e = str;
        this.f = z;
    }

    public final String K() {
        return I();
    }

    @Override // com.github.catvod.spider.merge.c1.s
    /* JADX INFO: renamed from: clone */
    public final Object i() {
        return (w) super.i();
    }

    @Override // com.github.catvod.spider.merge.c1.q, com.github.catvod.spider.merge.c1.s
    public final /* bridge */ /* synthetic */ int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final s i() {
        return (w) super.i();
    }

    @Override // com.github.catvod.spider.merge.c1.q, com.github.catvod.spider.merge.c1.s
    public final s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final String s() {
        return "#declaration";
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final String toString() {
        return t();
    }

    @Override // com.github.catvod.spider.merge.c1.s
    final void v(Appendable appendable, int i, g gVar) throws IOException {
        appendable.append("<").append(this.f ? "!" : "?").append(I());
        C0947c c0947cD = d();
        c0947cD.getClass();
        int i2 = 0;
        while (true) {
            if (i2 >= c0947cD.b || !c0947cD.w(c0947cD.c[i2])) {
                if (!(i2 < c0947cD.b)) {
                    break;
                }
                C0945a c0945a = new C0945a(c0947cD.c[i2], (String) c0947cD.d[i2], c0947cD);
                int i3 = i2 + 1;
                String strA = c0945a.a();
                String strC = c0945a.getValue();
                if (!strA.equals("#declaration")) {
                    appendable.append(' ');
                    appendable.append(strA);
                    if (!strC.isEmpty()) {
                        appendable.append("=\"");
                        o.e(appendable, strC, gVar, true, false, false, false);
                        appendable.append('\"');
                    }
                }
                i2 = i3;
            } else {
                i2++;
            }
        }
        appendable.append(this.f ? "!" : "?").append(">");
    }

    @Override // com.github.catvod.spider.merge.c1.s
    final void w(Appendable appendable, int i, g gVar) {
    }
}
