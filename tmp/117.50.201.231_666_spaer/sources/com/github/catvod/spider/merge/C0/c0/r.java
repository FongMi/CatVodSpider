package com.github.catvod.spider.merge.C0.c0;

import com.github.catvod.spider.merge.C0.d0.D;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class r implements Cloneable {
    static final List<r> e = Collections.emptyList();
    r c;
    int d;

    protected r() {
    }

    private void B(int i) {
        List<r> listN = n();
        while (i < listN.size()) {
            listN.get(i).d = i;
            i++;
        }
    }

    public final r A() {
        return this.c;
    }

    public final void C() {
        com.github.catvod.spider.merge.C0.N.a.k(this.c);
        this.c.D(this);
    }

    protected void D(r rVar) {
        com.github.catvod.spider.merge.C0.N.a.f(rVar.c == this);
        int i = rVar.d;
        n().remove(i);
        B(i);
        rVar.c = null;
    }

    public final void E(r rVar) {
        com.github.catvod.spider.merge.C0.N.a.k(this.c);
        r rVar2 = this.c;
        rVar2.getClass();
        com.github.catvod.spider.merge.C0.N.a.f(this.c == rVar2);
        r rVar3 = rVar.c;
        if (rVar3 != null) {
            rVar3.D(rVar);
        }
        int i = this.d;
        rVar2.n().set(i, rVar);
        rVar.c = rVar2;
        rVar.d = i;
        this.c = null;
    }

    public r F() {
        while (true) {
            r rVar = this.c;
            if (rVar == null) {
                return this;
            }
            this = rVar;
        }
    }

    public final void G(String str) {
        l(str);
    }

    public final int H() {
        return this.d;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:17:0x0015). Please report as a decompilation issue!!! */
    public String a(String str) {
        com.github.catvod.spider.merge.C0.N.a.i(str);
        String externalForm = "";
        if (p() && d().m(str)) {
            String strE = e();
            String strK = d().k(str);
            int i = com.github.catvod.spider.merge.C0.b0.b.d;
            try {
                try {
                    externalForm = com.github.catvod.spider.merge.C0.b0.b.h(new URL(strE), strK).toExternalForm();
                } catch (MalformedURLException e2) {
                    externalForm = new URL(strK).toExternalForm();
                }
            } catch (MalformedURLException e3) {
            }
        }
        return externalForm;
    }

    public r b(String str, String str2) {
        s.a(this).getClass();
        d().u(D.c.a(str), str2);
        return this;
    }

    public String c(String str) {
        com.github.catvod.spider.merge.C0.N.a.k(str);
        if (!p()) {
            return "";
        }
        String strK = d().k(str);
        return strK.length() <= 0 ? str.startsWith("abs:") ? a(str.substring(4)) : "" : strK;
    }

    public abstract c d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.C0.c0.r f(com.github.catvod.spider.merge.C0.c0.r r12) {
        /*
            r11 = this;
            r0 = 0
            r2 = 1
            com.github.catvod.spider.merge.C0.c0.r r1 = r11.c
            com.github.catvod.spider.merge.C0.N.a.k(r1)
            com.github.catvod.spider.merge.C0.c0.r r4 = r11.c
            int r5 = r11.d
            com.github.catvod.spider.merge.C0.c0.r[] r6 = new com.github.catvod.spider.merge.C0.c0.r[r2]
            r6[r0] = r12
            r4.getClass()
            java.util.List r7 = r4.n()
            r1 = r6[r0]
            com.github.catvod.spider.merge.C0.c0.r r8 = r1.z()
            if (r8 == 0) goto L51
            int r1 = r8.h()
            if (r1 != r2) goto L51
            java.util.List r9 = r8.n()
            r1 = r2
        L29:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto L4f
            r1 = r6[r3]
            java.lang.Object r10 = r9.get(r3)
            if (r1 == r10) goto L4d
            r1 = r0
        L36:
            if (r1 == 0) goto L51
            r8.m()
            java.util.List r0 = java.util.Arrays.asList(r6)
            r7.addAll(r5, r0)
            r0 = r2
        L43:
            int r1 = r0 + (-1)
            if (r0 <= 0) goto L7d
            r0 = r6[r1]
            r0.c = r4
            r0 = r1
            goto L43
        L4d:
            r1 = r3
            goto L29
        L4f:
            r1 = r2
            goto L36
        L51:
            r1 = r0
        L52:
            if (r1 >= r2) goto L63
            r3 = r6[r1]
            if (r3 == 0) goto L5b
            int r1 = r1 + 1
            goto L52
        L5b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Array must not contain any null objects"
            r0.<init>(r1)
            throw r0
        L63:
            if (r0 >= r2) goto L76
            r1 = r6[r0]
            r1.getClass()
            com.github.catvod.spider.merge.C0.c0.r r3 = r1.c
            if (r3 == 0) goto L71
            r3.D(r1)
        L71:
            r1.c = r4
            int r0 = r0 + 1
            goto L63
        L76:
            java.util.List r0 = java.util.Arrays.asList(r6)
            r7.addAll(r5, r0)
        L7d:
            r4.B(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.c0.r.f(com.github.catvod.spider.merge.C0.c0.r):com.github.catvod.spider.merge.C0.c0.r");
    }

    public final r g(int i) {
        return n().get(i);
    }

    public abstract int h();

    public final List<r> i() {
        if (h() == 0) {
            return e;
        }
        List<r> listN = n();
        ArrayList arrayList = new ArrayList(listN.size());
        arrayList.addAll(listN);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    public r j() {
        r rVarK = k(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(rVarK);
        while (!linkedList.isEmpty()) {
            r rVar = (r) linkedList.remove();
            int iH = rVar.h();
            for (int i = 0; i < iH; i++) {
                List<r> listN = rVar.n();
                r rVarK2 = listN.get(i).k(rVar);
                listN.set(i, rVarK2);
                linkedList.add(rVarK2);
            }
        }
        return rVarK;
    }

    protected r k(r rVar) {
        try {
            r rVar2 = (r) super.clone();
            rVar2.c = rVar;
            rVar2.d = rVar == null ? 0 : this.d;
            return rVar2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    protected abstract void l(String str);

    public abstract r m();

    protected abstract List<r> n();

    public final boolean o(String str) {
        com.github.catvod.spider.merge.C0.N.a.k(str);
        if (!p()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (d().m(strSubstring) && !a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return d().m(str);
    }

    protected abstract boolean p();

    public final boolean q() {
        return this.c != null;
    }

    protected final void r(Appendable appendable, int i, g gVar) {
        appendable.append('\n').append(com.github.catvod.spider.merge.C0.b0.b.f(gVar.d() * i));
    }

    public final r s() {
        r rVar = this.c;
        if (rVar == null) {
            return null;
        }
        List<r> listN = rVar.n();
        int i = this.d + 1;
        if (listN.size() > i) {
            return listN.get(i);
        }
        return null;
    }

    public abstract String t();

    public String toString() {
        return u();
    }

    public String u() {
        StringBuilder sbA = com.github.catvod.spider.merge.C0.b0.b.a();
        v(sbA);
        return com.github.catvod.spider.merge.C0.b0.b.g(sbA);
    }

    protected final void v(Appendable appendable) {
        h hVarY = y();
        if (hVarY == null) {
            hVarY = new h();
        }
        com.github.catvod.spider.merge.C0.W.a.c(new q(appendable, hVarY.s0()), this);
    }

    abstract void w(Appendable appendable, int i, g gVar);

    abstract void x(Appendable appendable, int i, g gVar);

    public final h y() {
        r rVarF = F();
        if (rVarF instanceof h) {
            return (h) rVarF;
        }
        return null;
    }

    public r z() {
        return this.c;
    }
}
