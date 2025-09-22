package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0082OO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.Tz */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0094Tz implements Iterable<C0133nW>, Cloneable {

    /* renamed from: q */
    private int f546q = 0;

    /* renamed from: xC */
    String[] f547xC = new String[3];

    /* renamed from: QU */
    String[] f545QU = new String[3];

    /* renamed from: com.github.catvod.spider.merge.Tz$p */
    class p implements Iterator<C0133nW> {

        /* renamed from: q */
        int f548q = 0;

        p() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f548q < C0094Tz.this.f546q) {
                C0094Tz c0094Tz = C0094Tz.this;
                if (!c0094Tz.m441E(c0094Tz.f547xC[this.f548q])) {
                    break;
                }
                this.f548q++;
            }
            return this.f548q < C0094Tz.this.f546q;
        }

        @Override // java.util.Iterator
        /* renamed from: q */
        public C0133nW next() {
            C0094Tz c0094Tz = C0094Tz.this;
            String[] strArr = c0094Tz.f547xC;
            int i = this.f548q;
            C0133nW c0133nW = new C0133nW(strArr[i], c0094Tz.f545QU[i], c0094Tz);
            this.f548q++;
            return c0133nW;
        }

        @Override // java.util.Iterator
        public void remove() {
            C0094Tz c0094Tz = C0094Tz.this;
            int i = this.f548q - 1;
            this.f548q = i;
            c0094Tz.m449yS(i);
        }
    }

    /* renamed from: E */
    public boolean m441E(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* renamed from: IS */
    static String m442IS(String str) {
        return '/' + str;
    }

    /* renamed from: MH */
    static String m443MH(@Nullable String str) {
        return str == null ? "" : str;
    }

    /* renamed from: Tz */
    private int m445Tz(String str) {
        C0111bw.m559se(str);
        for (int i = 0; i < this.f546q; i++) {
            if (str.equalsIgnoreCase(this.f547xC[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: i */
    private void m446i(int i) {
        C0111bw.m554QU(i >= this.f546q);
        String[] strArr = this.f547xC;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f546q * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f547xC = (String[]) Arrays.copyOf(strArr, i);
        this.f545QU = (String[]) Arrays.copyOf(this.f545QU, i);
    }

    /* renamed from: yS */
    public void m449yS(int i) {
        C0111bw.m561xC(i >= this.f546q);
        int i2 = (this.f546q - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f547xC;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.f545QU;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.f546q - 1;
        this.f546q = i4;
        this.f547xC[i4] = null;
        this.f545QU[i4] = null;
    }

    /* renamed from: B */
    public String m450B(String str) {
        int iM445Tz = m445Tz(str);
        return iM445Tz == -1 ? "" : m443MH(this.f545QU[iM445Tz]);
    }

    /* renamed from: BP */
    void m451BP(String str, @Nullable String str2) {
        int iM445Tz = m445Tz(str);
        if (iM445Tz == -1) {
            m457UJ(str, str2);
            return;
        }
        this.f545QU[iM445Tz] = str2;
        if (this.f547xC[iM445Tz].equals(str)) {
            return;
        }
        this.f547xC[iM445Tz] = str;
    }

    /* renamed from: F */
    public boolean m452F(String str) {
        return m445Tz(str) != -1;
    }

    /* renamed from: FN */
    public String m453FN(String str) {
        int iM460k = m460k(str);
        return iM460k == -1 ? "" : m443MH(this.f545QU[iM460k]);
    }

    /* renamed from: KT */
    final void m454KT(Appendable appendable, C0082OO.p pVar) {
        int i = this.f546q;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m441E(this.f547xC[i2])) {
                String str = this.f547xC[i2];
                String str2 = this.f545QU[i2];
                appendable.append(' ').append(str);
                if (!C0133nW.m685se(str, str2, pVar)) {
                    appendable.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    C0090SP.m424u(appendable, str2, pVar, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    /* renamed from: Mo */
    public List<C0133nW> m455Mo() {
        ArrayList arrayList = new ArrayList(this.f546q);
        for (int i = 0; i < this.f546q; i++) {
            if (!m441E(this.f547xC[i])) {
                arrayList.add(new C0133nW(this.f547xC[i], this.f545QU[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: RH */
    public String m456RH() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        try {
            m454KT(sbM779xC, new C0082OO("").m320zw());
            return C0157x3.m778w8(sbM779xC);
        } catch (IOException e) {
            throw new C0140qw(e);
        }
    }

    /* renamed from: UJ */
    public C0094Tz m457UJ(String str, @Nullable String str2) {
        m446i(this.f546q + 1);
        String[] strArr = this.f547xC;
        int i = this.f546q;
        strArr[i] = str;
        this.f545QU[i] = str2;
        this.f546q = i + 1;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0039  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m458W(com.github.catvod.spider.merge.C0068Jt r7) {
        /*
            r6 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r7 = r7.m231UJ()
            r0 = 0
        Ld:
            java.lang.String[] r2 = r6.f547xC
            int r2 = r2.length
            if (r1 >= r2) goto L45
            int r2 = r1 + 1
            r3 = r2
        L15:
            java.lang.String[] r4 = r6.f547xC
            int r5 = r4.length
            if (r3 >= r5) goto L43
            r5 = r4[r3]
            if (r5 != 0) goto L1f
            goto L43
        L1f:
            if (r7 == 0) goto L2b
            r5 = r4[r1]
            r4 = r4[r3]
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L39
        L2b:
            if (r7 != 0) goto L40
            java.lang.String[] r4 = r6.f547xC
            r5 = r4[r1]
            r4 = r4[r3]
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L40
        L39:
            int r0 = r0 + 1
            r6.m449yS(r3)
            int r3 = r3 + (-1)
        L40:
            int r3 = r3 + 1
            goto L15
        L43:
            r1 = r2
            goto Ld
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0094Tz.m458W(com.github.catvod.spider.merge.Jt):int");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0094Tz.class != obj.getClass()) {
            return false;
        }
        C0094Tz c0094Tz = (C0094Tz) obj;
        if (this.f546q == c0094Tz.f546q && Arrays.equals(this.f547xC, c0094Tz.f547xC)) {
            return Arrays.equals(this.f545QU, c0094Tz.f545QU);
        }
        return false;
    }

    /* renamed from: go */
    public C0094Tz m459go(String str, String str2) {
        C0111bw.m559se(str);
        int iM460k = m460k(str);
        if (iM460k != -1) {
            this.f545QU[iM460k] = str2;
        } else {
            m457UJ(str, str2);
        }
        return this;
    }

    public int hashCode() {
        return (((this.f546q * 31) + Arrays.hashCode(this.f547xC)) * 31) + Arrays.hashCode(this.f545QU);
    }

    public boolean isEmpty() {
        return this.f546q == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<C0133nW> iterator() {
        return new p();
    }

    /* renamed from: k */
    int m460k(String str) {
        C0111bw.m559se(str);
        for (int i = 0; i < this.f546q; i++) {
            if (str.equals(this.f547xC[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public C0094Tz m461l(C0133nW c0133nW) {
        C0111bw.m559se(c0133nW);
        m459go(c0133nW.getKey(), c0133nW.getValue());
        c0133nW.f728UJ = this;
        return this;
    }

    /* renamed from: p */
    public void m462p() {
        for (int i = 0; i < this.f546q; i++) {
            String[] strArr = this.f547xC;
            strArr[i] = C0139qf.m699q(strArr[i]);
        }
    }

    /* renamed from: se */
    public C0094Tz clone() {
        try {
            C0094Tz c0094Tz = (C0094Tz) super.clone();
            c0094Tz.f546q = this.f546q;
            this.f547xC = (String[]) Arrays.copyOf(this.f547xC, this.f546q);
            this.f545QU = (String[]) Arrays.copyOf(this.f545QU, this.f546q);
            return c0094Tz;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.f546q; i2++) {
            if (!m441E(this.f547xC[i2])) {
                i++;
            }
        }
        return i;
    }

    public String toString() {
        return m456RH();
    }

    /* renamed from: u */
    public void m464u(C0094Tz c0094Tz) {
        if (c0094Tz.size() == 0) {
            return;
        }
        m446i(this.f546q + c0094Tz.f546q);
        Iterator<C0133nW> it = c0094Tz.iterator();
        while (it.hasNext()) {
            m461l(it.next());
        }
    }

    /* renamed from: w8 */
    public boolean m465w8(String str) {
        return m460k(str) != -1;
    }
}
