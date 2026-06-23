package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class qh implements Iterable, Cloneable {
    public int a = 0;
    public String[] b = new String[3];
    public Object[] c = new Object[3];

    public static boolean d(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    public final void e(String str, Serializable serializable) {
        f(this.a + 1);
        String[] strArr = this.b;
        int i = this.a;
        strArr[i] = str;
        this.c[i] = serializable;
        this.a = i + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qh.class != obj.getClass()) {
            return false;
        }
        qh qhVar = (qh) obj;
        if (this.a != qhVar.a) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            int iL = qhVar.l(this.b[i]);
            if (iL == -1 || !Objects.equals(this.c[i], qhVar.c[iL])) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        wc.a(i >= this.a);
        String[] strArr = this.b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.a * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.b = (String[]) Arrays.copyOf(strArr, i);
        this.c = Arrays.copyOf(this.c, i);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final qh clone() {
        try {
            qh qhVar = (qh) super.clone();
            qhVar.a = this.a;
            qhVar.b = (String[]) Arrays.copyOf(this.b, this.a);
            qhVar.c = Arrays.copyOf(this.c, this.a);
            return qhVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final String h(String str) {
        Object obj;
        int iL = l(str);
        return (iL == -1 || (obj = this.c[iL]) == null) ? "" : (String) obj;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + (((this.a * 31) + Arrays.hashCode(this.b)) * 31);
    }

    public final String i(String str) {
        Object obj;
        int iM = m(str);
        return (iM == -1 || (obj = this.c[iM]) == null) ? "" : (String) obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qg(this);
    }

    public final boolean j(String str) {
        return l(str) != -1;
    }

    public final void k(StringBuilder sb, ut utVar) {
        String strG;
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.b[i2];
            if (!d(str) && (strG = qe.g(str, utVar.f)) != null) {
                qe.h(strG, (String) this.c[i2], sb.append(' '), utVar);
            }
        }
    }

    public final int l(String str) {
        wc.e(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equals(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int m(String str) {
        wc.e(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equalsIgnoreCase(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void n(String str, String str2) {
        wc.e(str);
        int iL = l(str);
        if (iL != -1) {
            this.c[iL] = str2;
        } else {
            e(str, str2);
        }
    }

    public final void o(int i) {
        int i2 = this.a;
        if (i >= i2) {
            throw new gg("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.b;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.c;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.a - 1;
        this.a = i5;
        this.b[i5] = null;
        this.c[i5] = null;
    }

    public final String toString() {
        StringBuilder sbG = ws.g();
        try {
            k(sbG, new em().a);
            return ws.n(sbG);
        } catch (IOException e) {
            throw new tv(e);
        }
    }
}
