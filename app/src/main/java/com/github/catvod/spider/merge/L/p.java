package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.M.C;
import com.github.catvod.spider.merge.M.K;
import com.github.catvod.spider.merge.M.L;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class p extends q {
    public Object d;

    @Override // com.github.catvod.spider.merge.L.q
    public final String a(String str) {
        z();
        return super.a(str);
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final String c(String str) {
        return !(this.d instanceof c) ? o().equals(str) ? (String) this.d : "" : super.c(str);
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final c d() {
        z();
        return (c) this.d;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final String e() {
        q qVar = this.a;
        return qVar != null ? qVar.e() : "";
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final int f() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final q h(q qVar) {
        p pVar = (p) super.h(qVar);
        Object obj = this.d;
        if (obj instanceof c) {
            pVar.d = ((c) obj).clone();
        }
        return pVar;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final List j() {
        return q.c;
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final boolean l() {
        return this.d instanceof c;
    }

    public final p x(String str, String str2) {
        if ((this.d instanceof c) || !str.equals("#doctype")) {
            z();
            q qVarW = w();
            h hVar = qVarW instanceof h ? (h) qVarW : null;
            if (hVar == null || hVar.k == null) {
                new L();
                new K();
                new C();
            }
            String strA = com.github.catvod.spider.merge.R.f.a(str.trim());
            c cVarD = d();
            int iH = cVarD.h(strA);
            if (iH != -1) {
                cVarD.c[iH] = str2;
                if (!cVarD.b[iH].equals(strA)) {
                    cVarD.b[iH] = strA;
                }
            } else {
                cVarD.a(strA, str2);
            }
        } else {
            this.d = str2;
        }
        return this;
    }

    public final String y() {
        return c(o());
    }

    public final void z() {
        Object obj = this.d;
        if (obj instanceof c) {
            return;
        }
        c cVar = new c();
        this.d = cVar;
        if (obj != null) {
            cVar.k(o(), (String) obj);
        }
    }

    @Override // com.github.catvod.spider.merge.L.q
    public final q i() {
        return this;
    }
}
