package com.github.catvod.spider.merge.Em;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c implements Iterable<a>, Cloneable {
    private int c = 0;
    String[] d = new String[3];
    String[] e = new String[3];

    private void g(int i) {
        com.github.catvod.spider.merge.Dw.i.f(i >= this.c);
        String[] strArr = this.d;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.c * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.d = (String[]) Arrays.copyOf(strArr, i);
        this.e = (String[]) Arrays.copyOf(this.e, i);
    }

    private int p(String str) {
        com.github.catvod.spider.merge.Dw.i.k(str);
        for (int i = 0; i < this.c; i++) {
            if (str.equalsIgnoreCase(this.d[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(int i) {
        com.github.catvod.spider.merge.Dw.i.e(i >= this.c);
        int i2 = (this.c - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.d;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.e;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.c - 1;
        this.c = i4;
        this.d[i4] = null;
        this.e[i4] = null;
    }

    public final c d(String str, String str2) {
        g(this.c + 1);
        String[] strArr = this.d;
        int i = this.c;
        strArr[i] = str;
        this.e[i] = str2;
        this.c = i + 1;
        return this;
    }

    public final void e(c cVar) {
        if (cVar.size() == 0) {
            return;
        }
        g(this.c + cVar.c);
        int i = 0;
        while (true) {
            if (i >= cVar.c || !cVar.q(cVar.d[i])) {
                if (!(i < cVar.c)) {
                    return;
                }
                a aVar = new a(cVar.d[i], cVar.e[i], cVar);
                i++;
                s(aVar);
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.c == cVar.c && Arrays.equals(this.d, cVar.d)) {
            return Arrays.equals(this.e, cVar.e);
        }
        return false;
    }

    public final List<a> f() {
        ArrayList arrayList = new ArrayList(this.c);
        for (int i = 0; i < this.c; i++) {
            if (!q(this.d[i])) {
                arrayList.add(new a(this.d[i], this.e[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final c clone() {
        try {
            c cVar = (c) super.clone();
            cVar.c = this.c;
            this.d = (String[]) Arrays.copyOf(this.d, this.c);
            this.e = (String[]) Arrays.copyOf(this.e, this.c);
            return cVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return (((this.c * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(com.github.catvod.spider.merge.Fs.D r8) {
        /*
            r7 = this;
            int r0 = r7.c
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
            boolean r8 = r8.d()
            r0 = 0
        L11:
            java.lang.String[] r3 = r7.d
            int r3 = r3.length
            if (r2 >= r3) goto L48
            int r3 = r2 + 1
            r4 = r3
        L19:
            java.lang.String[] r5 = r7.d
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
            java.lang.String[] r5 = r7.d
            r6 = r5[r2]
            r5 = r5[r4]
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L44
        L3d:
            int r0 = r0 + 1
            r7.v(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Em.c.i(com.github.catvod.spider.merge.Fs.D):int");
    }

    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<a> iterator() {
        return new b(this);
    }

    public final String j(String str) {
        String str2;
        int iO = o(str);
        return (iO == -1 || (str2 = this.e[iO]) == null) ? "" : str2;
    }

    public final String k(String str) {
        String str2;
        int iP = p(str);
        return (iP == -1 || (str2 = this.e[iP]) == null) ? "" : str2;
    }

    public final boolean l(String str) {
        return o(str) != -1;
    }

    public final boolean m(String str) {
        return p(str) != -1;
    }

    final void n(Appendable appendable, g gVar) {
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (!q(this.d[i2])) {
                String str = this.d[i2];
                String str2 = this.e[i2];
                appendable.append(' ').append(str);
                if (!a.c(str, str2, gVar)) {
                    appendable.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    n.d(appendable, str2, gVar, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    final int o(String str) {
        com.github.catvod.spider.merge.Dw.i.k(str);
        for (int i = 0; i < this.c; i++) {
            if (str.equals(this.d[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void r() {
        for (int i = 0; i < this.c; i++) {
            String[] strArr = this.d;
            strArr[i] = com.github.catvod.spider.merge.Dw.s.c(strArr[i]);
        }
    }

    public final c s(a aVar) {
        t(aVar.a(), aVar.b());
        aVar.e = this;
        return this;
    }

    public final int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.c; i2++) {
            if (!q(this.d[i2])) {
                i++;
            }
        }
        return i;
    }

    public final c t(String str, String str2) {
        com.github.catvod.spider.merge.Dw.i.k(str);
        int iO = o(str);
        if (iO != -1) {
            this.e[iO] = str2;
        } else {
            d(str, str2);
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.Dw.q, java.lang.Throwable] */
    public final String toString() {
        StringBuilder sbA = com.github.catvod.spider.merge.Dw.e.a();
        try {
            n(sbA, new h().s0());
            return com.github.catvod.spider.merge.Dw.e.g(sbA);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Dw.q(e);
        }
    }

    final void u(String str, String str2) {
        int iP = p(str);
        if (iP == -1) {
            d(str, str2);
            return;
        }
        this.e[iP] = str2;
        if (this.d[iP].equals(str)) {
            return;
        }
        this.d[iP] = str;
    }
}
