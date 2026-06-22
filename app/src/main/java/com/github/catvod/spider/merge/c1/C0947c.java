package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.b1.C0906c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0947c implements Iterable<C0945a>, Cloneable {
    private int b = 0;
    String[] c = new String[3];
    Object[] d = new Object[3];

    /* JADX INFO: Access modifiers changed from: private */
    public void C(int i) {
        C0899d.c(i >= this.b);
        int i2 = (this.b - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.c;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.d;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.b - 1;
        this.b = i4;
        this.c[i4] = null;
        this.d[i4] = null;
    }

    private void g(String str, Object obj) {
        j(this.b + 1);
        String[] strArr = this.c;
        int i = this.b;
        strArr[i] = str;
        this.d[i] = obj;
        this.b = i + 1;
    }

    private void j(int i) {
        C0899d.d(i >= this.b);
        String[] strArr = this.c;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.b * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.c = (String[]) Arrays.copyOf(strArr, i);
        this.d = Arrays.copyOf(this.d, i);
    }

    static String k(Object obj) {
        return obj == null ? "" : (String) obj;
    }

    private int u(String str) {
        C0899d.h(str);
        for (int i = 0; i < this.b; i++) {
            if (str.equalsIgnoreCase(this.c[i])) {
                return i;
            }
        }
        return -1;
    }

    static String v(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    public final C0947c A(String str, String str2) {
        C0899d.h(str);
        int iT = t(str);
        if (iT != -1) {
            this.d[iT] = str2;
        } else {
            g(str, str2);
        }
        return this;
    }

    final void B(String str, String str2) {
        int iU = u(str);
        if (iU == -1) {
            g(str, str2);
            return;
        }
        this.d[iU] = str2;
        if (this.c[iU].equals(str)) {
            return;
        }
        this.c[iU] = str;
    }

    public final C0947c d(String str, String str2) {
        g(str, str2);
        return this;
    }

    public final void e(C0947c c0947c) {
        int i = c0947c.b;
        if (i == 0) {
            return;
        }
        j(this.b + i);
        boolean z = this.b != 0;
        int i2 = 0;
        while (true) {
            if (i2 >= c0947c.b || !c0947c.w(c0947c.c[i2])) {
                if (!(i2 < c0947c.b)) {
                    return;
                }
                C0945a c0945a = new C0945a(c0947c.c[i2], (String) c0947c.d[i2], c0947c);
                i2++;
                if (z) {
                    z(c0945a);
                } else {
                    g(c0945a.a(), c0945a.getValue());
                }
            } else {
                i2++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0947c.class != obj.getClass()) {
            return false;
        }
        C0947c c0947c = (C0947c) obj;
        if (this.b != c0947c.b) {
            return false;
        }
        for (int i = 0; i < this.b; i++) {
            int iT = c0947c.t(this.c[i]);
            if (iT == -1) {
                return false;
            }
            Object obj2 = this.d[i];
            Object obj3 = c0947c.d[iT];
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

    public final List<C0945a> h() {
        ArrayList arrayList = new ArrayList(this.b);
        for (int i = 0; i < this.b; i++) {
            if (!w(this.c[i])) {
                arrayList.add(new C0945a(this.c[i], (String) this.d[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (((this.b * 31) + Arrays.hashCode(this.c)) * 31);
    }

    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<C0945a> iterator() {
        return new C0946b(this);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C0947c clone() {
        try {
            C0947c c0947c = (C0947c) super.clone();
            c0947c.b = this.b;
            c0947c.c = (String[]) Arrays.copyOf(this.c, this.b);
            c0947c.d = Arrays.copyOf(this.d, this.b);
            return c0947c;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(com.github.catvod.spider.merge.d1.C0972E r8) {
        /*
            r7 = this;
            int r0 = r7.b
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
            java.lang.String[] r3 = r7.c
            int r3 = r3.length
            if (r2 >= r3) goto L48
            int r3 = r2 + 1
            r4 = r3
        L19:
            java.lang.String[] r5 = r7.c
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
            java.lang.String[] r5 = r7.c
            r6 = r5[r2]
            r5 = r5[r4]
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L44
        L3d:
            int r0 = r0 + 1
            r7.C(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.c1.C0947c.m(com.github.catvod.spider.merge.d1.E):int");
    }

    public final String n(String str) {
        int iT = t(str);
        return iT == -1 ? "" : k(this.d[iT]);
    }

    public final String o(String str) {
        int iU = u(str);
        return iU == -1 ? "" : k(this.d[iU]);
    }

    public final boolean p(String str) {
        return t(str) != -1;
    }

    public final boolean q(String str) {
        return u(str) != -1;
    }

    final void s(Appendable appendable, g gVar) {
        String strB;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!w(this.c[i2]) && (strB = C0945a.b(this.c[i2], gVar.j())) != null) {
                C0945a.d(strB, (String) this.d[i2], appendable.append(' '), gVar);
            }
        }
    }

    public final int size() {
        return this.b;
    }

    final int t(String str) {
        C0899d.h(str);
        for (int i = 0; i < this.b; i++) {
            if (str.equals(this.c[i])) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sbB = C0906c.b();
        try {
            s(sbB, new h("").C0());
            return C0906c.h(sbB);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z0.a(e);
        }
    }

    public final void x() {
        for (int i = 0; i < this.b; i++) {
            String[] strArr = this.c;
            strArr[i] = com.github.catvod.spider.merge.g.b.b(strArr[i]);
        }
    }

    public final C0947c z(C0945a c0945a) {
        A(c0945a.a(), c0945a.getValue());
        c0945a.d = this;
        return this;
    }
}
