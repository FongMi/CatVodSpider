package com.github.catvod.spider.merge.A0;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class fw implements Cloneable {
    public static final List ao = Collections.emptyList();
    public fw ap;
    public int aq;

    public static void ar(StringBuilder sb, int i, ut utVar) {
        String strValueOf;
        Appendable appendableAppend = sb.append('\n');
        int iMin = i * utVar.d;
        String[] strArr = ws.a;
        if (!(iMin >= 0)) {
            throw new gg("width must be >= 0");
        }
        int i2 = utVar.e;
        wc.a(i2 >= -1);
        if (i2 != -1) {
            iMin = Math.min(iMin, i2);
        }
        if (iMin < 21) {
            strValueOf = ws.a[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i3 = 0; i3 < iMin; i3++) {
                cArr[i3] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        appendableAppend.append(strValueOf);
    }

    public String an() {
        StringBuilder sbG = ws.g();
        fw fwVarX = x();
        em emVar = fwVarX instanceof em ? (em) fwVarX : null;
        if (emVar == null) {
            emVar = new em();
        }
        pp.b(new abb(sbG, emVar.a, 1), this);
        return ws.n(sbG);
    }

    public String as(String str) {
        wc.c(str);
        if (!r() || l().m(str) == -1) {
            return "";
        }
        String strM = m();
        String strI = l().i(str);
        Pattern pattern = ws.d;
        String strReplaceAll = pattern.matcher(strM).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strI).replaceAll("");
        try {
            try {
                strReplaceAll2 = ws.o(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                strReplaceAll2 = new URL(strReplaceAll2).toExternalForm();
            }
            return strReplaceAll2;
        } catch (MalformedURLException unused2) {
            return ws.c.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    public final void at(int i, fw... fwVarArr) {
        wc.e(fwVarArr);
        if (fwVarArr.length == 0) {
            return;
        }
        List listQ = q();
        fw fwVarW = fwVarArr[0].w();
        if (fwVarW != null && fwVarW.n() == fwVarArr.length) {
            List listQ2 = fwVarW.q();
            int length = fwVarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    boolean z = n() == 0;
                    fwVarW.p();
                    listQ.addAll(i, Arrays.asList(fwVarArr));
                    int length2 = fwVarArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        fwVarArr[i3].ap = this;
                        length2 = i3;
                    }
                    if (z && fwVarArr[0].aq == 0) {
                        return;
                    }
                    az(i);
                    return;
                }
                if (fwVarArr[i2] != listQ2.get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (fw fwVar : fwVarArr) {
            if (fwVar == null) {
                throw new gg("Array must not contain any null objects");
            }
        }
        for (fw fwVar2 : fwVarArr) {
            fwVar2.getClass();
            fw fwVar3 = fwVar2.ap;
            if (fwVar3 != null) {
                fwVar3.c(fwVar2);
            }
            fwVar2.ap = this;
        }
        listQ.addAll(i, Arrays.asList(fwVarArr));
        az(i);
    }

    public String au(String str) {
        wc.e(str);
        if (!r()) {
            return "";
        }
        String strI = l().i(str);
        return strI.length() > 0 ? strI : str.startsWith("abs:") ? as(str.substring(4)) : "";
    }

    public final boolean av(String str) {
        wc.e(str);
        if (!r()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (l().m(strSubstring) != -1 && !as(strSubstring).isEmpty()) {
                return true;
            }
        }
        return l().m(str) != -1;
    }

    public final boolean aw(String str) {
        return t().equals(str);
    }

    public final fw ax() {
        fw fwVar = this.ap;
        if (fwVar == null) {
            return null;
        }
        List listQ = fwVar.q();
        int i = this.aq + 1;
        if (listQ.size() > i) {
            return (fw) listQ.get(i);
        }
        return null;
    }

    public final fw ay() {
        fw fwVar = this.ap;
        if (fwVar != null && this.aq > 0) {
            return (fw) fwVar.q().get(this.aq - 1);
        }
        return null;
    }

    public final void az(int i) {
        int iN = n();
        if (iN == 0) {
            return;
        }
        List listQ = q();
        while (i < iN) {
            ((fw) listQ.get(i)).aq = i;
            i++;
        }
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public fw clone() {
        fw fwVarO = o(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(fwVarO);
        while (!linkedList.isEmpty()) {
            fw fwVar = (fw) linkedList.remove();
            int iN = fwVar.n();
            for (int i = 0; i < iN; i++) {
                List listQ = fwVar.q();
                fw fwVarO2 = ((fw) listQ.get(i)).o(fwVar);
                listQ.set(i, fwVarO2);
                linkedList.add(fwVarO2);
            }
        }
        return fwVarO;
    }

    public final void ba() {
        fw fwVar = this.ap;
        if (fwVar != null) {
            fwVar.c(this);
        }
    }

    public final void bb(ed edVar) {
        wc.e(edVar);
        if (this.ap == null) {
            this.ap = edVar.ap;
        }
        wc.e(this.ap);
        fw fwVar = this.ap;
        fwVar.getClass();
        wc.a(this.ap == fwVar);
        if (this == edVar) {
            return;
        }
        fw fwVar2 = edVar.ap;
        if (fwVar2 != null) {
            fwVar2.c(edVar);
        }
        int i = this.aq;
        fwVar.q().set(i, edVar);
        edVar.ap = fwVar;
        edVar.aq = i;
        this.ap = null;
    }

    public void c(fw fwVar) {
        wc.a(fwVar.ap == this);
        int i = fwVar.aq;
        q().remove(i);
        az(i);
        fwVar.ap = null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract qh l();

    public abstract String m();

    public abstract int n();

    public fw o(fw fwVar) {
        try {
            fw fwVar2 = (fw) super.clone();
            fwVar2.ap = fwVar;
            fwVar2.aq = fwVar == null ? 0 : this.aq;
            if (fwVar == null && !(this instanceof em)) {
                fw fwVarX = x();
                em emVar = fwVarX instanceof em ? (em) fwVarX : null;
                if (emVar != null) {
                    em emVar2 = new em(emVar.g.d, emVar.m());
                    qh qhVar = emVar.j;
                    if (qhVar != null) {
                        emVar2.j = qhVar.clone();
                    }
                    emVar2.a = emVar.a.clone();
                    fwVar2.ap = emVar2;
                    emVar2.q().add(fwVar2);
                }
            }
            return fwVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract fw p();

    public abstract List q();

    public abstract boolean r();

    public abstract String s();

    public String t() {
        return s();
    }

    public String toString() {
        return an();
    }

    public abstract void u(StringBuilder sb, int i, ut utVar);

    public abstract void v(StringBuilder sb, int i, ut utVar);

    public fw w() {
        return this.ap;
    }

    public fw x() {
        fw fwVar = this;
        while (true) {
            fw fwVar2 = fwVar.ap;
            if (fwVar2 == null) {
                return fwVar;
            }
            fwVar = fwVar2;
        }
    }
}
