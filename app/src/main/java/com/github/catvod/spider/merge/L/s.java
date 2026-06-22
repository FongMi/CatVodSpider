package com.github.catvod.spider.merge.L;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class s extends p {
    public s(String str) {
        this.d = str;
    }

    public static boolean B(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.merge.L.q
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public s g() {
        return (s) super.g();
    }

    @Override // com.github.catvod.spider.merge.L.q
    public String o() {
        return "#text";
    }

    @Override // com.github.catvod.spider.merge.L.q
    public void q(Appendable appendable, int i, g gVar) throws IOException {
        boolean z;
        boolean z2;
        boolean z3 = gVar.e;
        q qVar = this.a;
        l lVar = qVar instanceof l ? (l) qVar : null;
        boolean z4 = z3 && !l.J(qVar);
        if (z4) {
            boolean z5 = (this.b == 0 && lVar != null && lVar.d.c) || (this.a instanceof h);
            boolean z6 = n() == null && lVar != null && lVar.d.c;
            q qVarN = n();
            if ((((qVarN instanceof l) && ((l) qVarN).N(gVar)) || ((qVarN instanceof s) && com.github.catvod.spider.merge.K.b.d(((s) qVarN).y()))) && com.github.catvod.spider.merge.K.b.d(y())) {
                return;
            }
            if (this.b == 0 && lVar != null && lVar.d.d && !com.github.catvod.spider.merge.K.b.d(y())) {
                q.m(appendable, i, gVar);
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        n.b(appendable, y(), gVar, false, z4, z, z2);
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final String toString() {
        return p();
    }

    @Override // com.github.catvod.spider.merge.L.q
    public void r(Appendable appendable, int i, g gVar) {
    }
}
