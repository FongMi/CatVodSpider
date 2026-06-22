package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Fs.D;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
        com.github.catvod.spider.merge.Dw.i.k(this.c);
        this.c.D(this);
    }

    protected void D(r rVar) {
        com.github.catvod.spider.merge.Dw.i.f(rVar.c == this);
        int i = rVar.d;
        n().remove(i);
        B(i);
        rVar.c = null;
    }

    public final void E(r rVar) {
        com.github.catvod.spider.merge.Dw.i.k(this.c);
        r rVar2 = this.c;
        rVar2.getClass();
        com.github.catvod.spider.merge.Dw.i.f(this.c == rVar2);
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
        r rVar = this;
        while (true) {
            r rVar2 = rVar.c;
            if (rVar2 == null) {
                return rVar;
            }
            rVar = rVar2;
        }
    }

    public final void G(String str) {
        l(str);
    }

    public final int H() {
        return this.d;
    }

    public String a(String str) {
        com.github.catvod.spider.merge.Dw.i.i(str);
        String externalForm = "";
        if (p() && d().m(str)) {
            String strE = e();
            String strK = d().k(str);
            int i = com.github.catvod.spider.merge.Dw.e.d;
            try {
                try {
                    externalForm = com.github.catvod.spider.merge.Dw.e.h(new URL(strE), strK).toExternalForm();
                } catch (MalformedURLException unused) {
                    externalForm = new URL(strK).toExternalForm();
                }
            } catch (MalformedURLException unused2) {
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
        com.github.catvod.spider.merge.Dw.i.k(str);
        if (!p()) {
            return "";
        }
        String strK = d().k(str);
        return strK.length() > 0 ? strK : str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public abstract c d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.Em.r f(com.github.catvod.spider.merge.Em.r r11) {
        /*
            r10 = this;
            com.github.catvod.spider.merge.Em.r r0 = r10.c
            com.github.catvod.spider.merge.Dw.i.k(r0)
            com.github.catvod.spider.merge.Em.r r0 = r10.c
            int r1 = r10.d
            r2 = 1
            com.github.catvod.spider.merge.Em.r[] r3 = new com.github.catvod.spider.merge.Em.r[r2]
            r4 = 0
            r3[r4] = r11
            r0.getClass()
            java.util.List r11 = r0.n()
            r5 = r3[r4]
            com.github.catvod.spider.merge.Em.r r5 = r5.z()
            if (r5 == 0) goto L50
            int r6 = r5.h()
            if (r6 != r2) goto L50
            java.util.List r6 = r5.n()
            r7 = 1
        L29:
            int r8 = r7 + (-1)
            if (r7 <= 0) goto L39
            r7 = r3[r8]
            java.lang.Object r9 = r6.get(r8)
            if (r7 == r9) goto L37
            r6 = 0
            goto L3a
        L37:
            r7 = r8
            goto L29
        L39:
            r6 = 1
        L3a:
            if (r6 == 0) goto L50
            r5.m()
            java.util.List r4 = java.util.Arrays.asList(r3)
            r11.addAll(r1, r4)
        L46:
            int r11 = r2 + (-1)
            if (r2 <= 0) goto L7c
            r2 = r3[r11]
            r2.c = r0
            r2 = r11
            goto L46
        L50:
            r5 = 0
        L51:
            if (r5 >= r2) goto L62
            r6 = r3[r5]
            if (r6 == 0) goto L5a
            int r5 = r5 + 1
            goto L51
        L5a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Array must not contain any null objects"
            r11.<init>(r0)
            throw r11
        L62:
            if (r4 >= r2) goto L75
            r5 = r3[r4]
            r5.getClass()
            com.github.catvod.spider.merge.Em.r r6 = r5.c
            if (r6 == 0) goto L70
            r6.D(r5)
        L70:
            r5.c = r0
            int r4 = r4 + 1
            goto L62
        L75:
            java.util.List r2 = java.util.Arrays.asList(r3)
            r11.addAll(r1, r2)
        L7c:
            r0.B(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Em.r.f(com.github.catvod.spider.merge.Em.r):com.github.catvod.spider.merge.Em.r");
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
        com.github.catvod.spider.merge.Dw.i.k(str);
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
        appendable.append('\n').append(com.github.catvod.spider.merge.Dw.e.f(gVar.d() * i));
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
        StringBuilder sbA = com.github.catvod.spider.merge.Dw.e.a();
        v(sbA);
        return com.github.catvod.spider.merge.Dw.e.g(sbA);
    }

    protected final void v(Appendable appendable) {
        h hVarY = y();
        if (hVarY == null) {
            hVarY = new h();
        }
        com.github.catvod.spider.merge.Dw.q.c(new q(appendable, hVarY.s0()), this);
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
