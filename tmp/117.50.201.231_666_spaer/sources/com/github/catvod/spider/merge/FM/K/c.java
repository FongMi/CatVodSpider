package com.github.catvod.spider.merge.FM.K;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c implements Iterable<a>, Cloneable {
    private int a = 0;
    String[] b = new String[3];
    Object[] c = new Object[3];

    private void f(String str, @Nullable Object obj) {
        h(this.a + 1);
        String[] strArr = this.b;
        int i = this.a;
        strArr[i] = str;
        this.c[i] = obj;
        this.a = i + 1;
    }

    private void h(int i) {
        com.github.catvod.spider.merge.FM.I.c.c(i >= this.a);
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

    static String i(@Nullable Object obj) {
        return obj == null ? "" : (String) obj;
    }

    private int r(String str) {
        com.github.catvod.spider.merge.FM.I.c.g(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equalsIgnoreCase(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    static String s(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i) {
        com.github.catvod.spider.merge.FM.I.c.b(i >= this.a);
        int i2 = (this.a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.b;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.c;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.a - 1;
        this.a = i4;
        this.b[i4] = null;
        this.c[i4] = null;
    }

    public final c d(String str, @Nullable String str2) {
        f(str, str2);
        return this;
    }

    public final void e(c cVar) {
        int i = cVar.a;
        if (i == 0) {
            return;
        }
        h(this.a + i);
        boolean z = this.a != 0;
        int i2 = 0;
        while (true) {
            if (i2 >= cVar.a || !cVar.t(cVar.b[i2])) {
                if (!(i2 < cVar.a)) {
                    return;
                }
                a aVar = new a(cVar.b[i2], (String) cVar.c[i2], cVar);
                i2++;
                if (z) {
                    v(aVar);
                } else {
                    f(aVar.a(), aVar.getValue());
                }
            } else {
                i2++;
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            int iQ = cVar.q(this.b[i]);
            if (iQ == -1) {
                return false;
            }
            Object obj2 = this.c[i];
            Object obj3 = cVar.c[iQ];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final List<a> g() {
        ArrayList arrayList = new ArrayList(this.a);
        for (int i = 0; i < this.a; i++) {
            if (!t(this.b[i])) {
                arrayList.add(new a(this.b[i], (String) this.c[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + (((this.a * 31) + Arrays.hashCode(this.b)) * 31);
    }

    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<a> iterator() {
        return new b(this);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final c clone() {
        try {
            c cVar = (c) super.clone();
            cVar.a = this.a;
            cVar.b = (String[]) Arrays.copyOf(this.b, this.a);
            cVar.c = Arrays.copyOf(this.c, this.a);
            return cVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(com.github.catvod.spider.merge.FM.L.E r8) {
        /*
            r7 = this;
            int r0 = r7.a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lc
            return r2
        Lc:
            boolean r8 = r8.e()
            r0 = 0
        L11:
            java.lang.String[] r3 = r7.b
            int r3 = r3.length
            if (r2 >= r3) goto L48
            int r3 = r2 + 1
            r4 = r3
        L19:
            java.lang.String[] r5 = r7.b
            int r6 = r5.length
            if (r4 >= r6) goto L46
            r6 = r5[r4]
            if (r6 != 0) goto L23
            goto L46
        L23:
            if (r8 == 0) goto L2f
            r6 = r5[r2]
            r5 = r5[r4]
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L3d
        L2f:
            if (r8 != 0) goto L44
            java.lang.String[] r5 = r7.b
            r6 = r5[r2]
            r5 = r5[r4]
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L44
        L3d:
            int r0 = r0 + 1
            r7.y(r4)
            int r4 = r4 + (-1)
        L44:
            int r4 = r4 + r1
            goto L19
        L46:
            r2 = r3
            goto L11
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.K.c.k(com.github.catvod.spider.merge.FM.L.E):int");
    }

    public final String l(String str) {
        int iQ = q(str);
        return iQ == -1 ? "" : i(this.c[iQ]);
    }

    public final String m(String str) {
        int iR = r(str);
        return iR == -1 ? "" : i(this.c[iR]);
    }

    public final boolean n(String str) {
        return q(str) != -1;
    }

    public final boolean o(String str) {
        return r(str) != -1;
    }

    final void p(Appendable appendable, g gVar) {
        String strB;
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!t(this.b[i2]) && (strB = a.b(this.b[i2], gVar.k())) != null) {
                a.d(strB, (String) this.c[i2], appendable.append(' '), gVar);
            }
        }
    }

    final int q(String str) {
        com.github.catvod.spider.merge.FM.I.c.g(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equals(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int size() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        try {
            p(sbB, new h("").A0());
            return com.github.catvod.spider.merge.FM.J.b.h(sbB);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.FM.H.a(e);
        }
    }

    public final void u() {
        for (int i = 0; i < this.a; i++) {
            String[] strArr = this.b;
            strArr[i] = com.github.catvod.spider.merge.FM.A.l.d(strArr[i]);
        }
    }

    public final c v(a aVar) {
        w(aVar.a(), aVar.getValue());
        aVar.c = this;
        return this;
    }

    public final c w(String str, @Nullable String str2) {
        com.github.catvod.spider.merge.FM.I.c.g(str);
        int iQ = q(str);
        if (iQ != -1) {
            this.c[iQ] = str2;
        } else {
            f(str, str2);
        }
        return this;
    }

    final void x(String str, @Nullable String str2) {
        int iR = r(str);
        if (iR == -1) {
            f(str, str2);
            return;
        }
        this.c[iR] = str2;
        if (this.b[iR].equals(str)) {
            return;
        }
        this.b[iR] = str;
    }
}
