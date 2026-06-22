package com.github.catvod.spider.merge.L;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class q implements Cloneable {
    public static final List c = Collections.emptyList();
    public q a;
    public int b;

    public static void m(Appendable appendable, int i, g gVar) {
        String strValueOf;
        Appendable appendableAppend = appendable.append('\n');
        int iMin = i * gVar.f;
        String[] strArr = com.github.catvod.spider.merge.K.b.a;
        if (!(iMin >= 0)) {
            throw new com.github.catvod.spider.merge.J.c("width must be >= 0");
        }
        int i2 = gVar.g;
        com.github.catvod.spider.merge.J.b.c(i2 >= -1);
        if (i2 != -1) {
            iMin = Math.min(iMin, i2);
        }
        if (iMin < 21) {
            strValueOf = com.github.catvod.spider.merge.K.b.a[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i3 = 0; i3 < iMin; i3++) {
                cArr[i3] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        appendableAppend.append(strValueOf);
    }

    public String a(String str) {
        URL url;
        com.github.catvod.spider.merge.J.b.d(str);
        if (!l() || d().h(str) == -1) {
            return "";
        }
        String strE = e();
        String strE2 = d().e(str);
        Pattern pattern = com.github.catvod.spider.merge.K.b.d;
        String strReplaceAll = pattern.matcher(strE).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strE2).replaceAll("");
        try {
            try {
                url = com.github.catvod.spider.merge.K.b.h(new URL(strReplaceAll), strReplaceAll2);
            } catch (MalformedURLException unused) {
                url = new URL(strReplaceAll2);
            }
            strReplaceAll2 = url.toExternalForm();
            return strReplaceAll2;
        } catch (MalformedURLException unused2) {
            return com.github.catvod.spider.merge.K.b.c.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    public final void b(int i, q... qVarArr) {
        com.github.catvod.spider.merge.J.b.f(qVarArr);
        if (qVarArr.length == 0) {
            return;
        }
        List listJ = j();
        q qVarS = qVarArr[0].s();
        if (qVarS != null && qVarS.f() == qVarArr.length) {
            List listJ2 = qVarS.j();
            int length = qVarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    boolean z = f() == 0;
                    qVarS.i();
                    listJ.addAll(i, Arrays.asList(qVarArr));
                    int length2 = qVarArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        qVarArr[i3].a = this;
                        length2 = i3;
                    }
                    if (z && qVarArr[0].b == 0) {
                        return;
                    }
                    t(i);
                    return;
                }
                if (qVarArr[i2] != listJ2.get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (q qVar : qVarArr) {
            if (qVar == null) {
                throw new com.github.catvod.spider.merge.J.c("Array must not contain any null objects");
            }
        }
        for (q qVar2 : qVarArr) {
            qVar2.getClass();
            q qVar3 = qVar2.a;
            if (qVar3 != null) {
                qVar3.v(qVar2);
            }
            qVar2.a = this;
        }
        listJ.addAll(i, Arrays.asList(qVarArr));
        t(i);
    }

    public String c(String str) {
        com.github.catvod.spider.merge.J.b.f(str);
        if (!l()) {
            return "";
        }
        String strE = d().e(str);
        return strE.length() > 0 ? strE : str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public abstract c d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract int f();

    @Override // 
    public q g() {
        q qVarH = h(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(qVarH);
        while (!linkedList.isEmpty()) {
            q qVar = (q) linkedList.remove();
            int iF = qVar.f();
            for (int i = 0; i < iF; i++) {
                List listJ = qVar.j();
                q qVarH2 = ((q) listJ.get(i)).h(qVar);
                listJ.set(i, qVarH2);
                linkedList.add(qVarH2);
            }
        }
        return qVarH;
    }

    public q h(q qVar) {
        try {
            q qVar2 = (q) super.clone();
            qVar2.a = qVar;
            qVar2.b = qVar == null ? 0 : this.b;
            if (qVar == null && !(this instanceof h)) {
                q qVarW = w();
                h hVar = qVarW instanceof h ? (h) qVarW : null;
                if (hVar != null) {
                    h hVar2 = new h(hVar.e());
                    c cVar = hVar.g;
                    if (cVar != null) {
                        hVar2.g = cVar.clone();
                    }
                    hVar2.j = hVar.j.clone();
                    qVar2.a = hVar2;
                    hVar2.j().add(qVar2);
                }
            }
            return qVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract q i();

    public abstract List j();

    public final boolean k(String str) {
        com.github.catvod.spider.merge.J.b.f(str);
        if (!l()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (d().h(strSubstring) != -1 && !a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return d().h(str) != -1;
    }

    public abstract boolean l();

    public final q n() {
        q qVar = this.a;
        if (qVar == null) {
            return null;
        }
        List listJ = qVar.j();
        int i = this.b + 1;
        if (listJ.size() > i) {
            return (q) listJ.get(i);
        }
        return null;
    }

    public abstract String o();

    public String p() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        q qVarW = w();
        h hVar = qVarW instanceof h ? (h) qVarW : null;
        if (hVar == null) {
            hVar = new h("");
        }
        com.github.catvod.spider.merge.R.g.a(new com.github.catvod.spider.merge.B.c(sbB, hVar.j), this);
        return com.github.catvod.spider.merge.K.b.g(sbB);
    }

    public abstract void q(Appendable appendable, int i, g gVar);

    public abstract void r(Appendable appendable, int i, g gVar);

    public q s() {
        return this.a;
    }

    public final void t(int i) {
        int iF = f();
        if (iF == 0) {
            return;
        }
        List listJ = j();
        while (i < iF) {
            ((q) listJ.get(i)).b = i;
            i++;
        }
    }

    public String toString() {
        return p();
    }

    public final void u() {
        com.github.catvod.spider.merge.J.b.f(this.a);
        this.a.v(this);
    }

    public void v(q qVar) {
        com.github.catvod.spider.merge.J.b.c(qVar.a == this);
        int i = qVar.b;
        j().remove(i);
        t(i);
        qVar.a = null;
    }

    public q w() {
        q qVar = this;
        while (true) {
            q qVar2 = qVar.a;
            if (qVar2 == null) {
                return qVar;
            }
            qVar = qVar2;
        }
    }
}
