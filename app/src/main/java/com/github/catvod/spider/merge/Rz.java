package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Rz implements Iterable<in>, Cloneable {
    private int l8 = 0;
    String[] S = new String[3];
    String[] T4 = new String[3];

    class aA implements Iterator<in> {
        int l8 = 0;

        aA() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.l8 < Rz.this.l8) {
                Rz rz = Rz.this;
                if (!rz.eD(rz.S[this.l8])) {
                    break;
                }
                this.l8++;
            }
            return this.l8 < Rz.this.l8;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: l8, reason: merged with bridge method [inline-methods] */
        public in next() {
            Rz rz = Rz.this;
            String[] strArr = rz.S;
            int i = this.l8;
            in inVar = new in(strArr[i], rz.T4[i], rz);
            this.l8++;
            return inVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            Rz rz = Rz.this;
            int i = this.l8 - 1;
            this.l8 = i;
            rz.r1(i);
        }
    }

    static String N(@Nullable String str) {
        return str == null ? "" : str;
    }

    static String c(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean eD(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1(int i) {
        Rc.S(i >= this.l8);
        int i2 = (this.l8 - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.S;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.T4;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.l8 - 1;
        this.l8 = i4;
        this.S[i4] = null;
        this.T4[i4] = null;
    }

    private void tT(int i) {
        Rc.T4(i >= this.l8);
        String[] strArr = this.S;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.l8 * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.S = (String[]) Arrays.copyOf(strArr, i);
        this.T4 = (String[]) Arrays.copyOf(this.T4, i);
    }

    private int uS(String str) {
        Rc.HM(str);
        for (int i = 0; i < this.l8; i++) {
            if (str.equalsIgnoreCase(this.S[i])) {
                return i;
            }
        }
        return -1;
    }

    public String A(String str) {
        int iUS = uS(str);
        return iUS == -1 ? "" : N(this.T4[iUS]);
    }

    public Rz C(in inVar) {
        Rc.HM(inVar);
        W(inVar.getKey(), inVar.getValue());
        inVar.b = this;
        return this;
    }

    int E9(String str) {
        Rc.HM(str);
        for (int i = 0; i < this.l8; i++) {
            if (str.equals(this.S[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: HM, reason: merged with bridge method [inline-methods] */
    public Rz clone() {
        try {
            Rz rz = (Rz) super.clone();
            rz.l8 = this.l8;
            this.S = (String[]) Arrays.copyOf(this.S, this.l8);
            this.T4 = (String[]) Arrays.copyOf(this.T4, this.l8);
            return rz;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    final void Kf(Appendable appendable, g9.aA aAVar) throws IOException {
        int i = this.l8;
        for (int i2 = 0; i2 < i; i2++) {
            if (!eD(this.S[i2])) {
                String str = this.S[i2];
                String str2 = this.T4[i2];
                appendable.append(' ').append(str);
                if (!in.HM(str, str2, aAVar)) {
                    appendable.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    Y9.OL(appendable, str2, aAVar, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    public void OL(Rz rz) {
        if (rz.size() == 0) {
            return;
        }
        tT(this.l8 + rz.l8);
        Iterator<in> it = rz.iterator();
        while (it.hasNext()) {
            C(it.next());
        }
    }

    void OY(String str, @Nullable String str2) {
        int iUS = uS(str);
        if (iUS == -1) {
            b(str, str2);
            return;
        }
        this.T4[iUS] = str2;
        if (this.S[iUS].equals(str)) {
            return;
        }
        this.S[iUS] = str;
    }

    public void Q() {
        for (int i = 0; i < this.l8; i++) {
            String[] strArr = this.S;
            strArr[i] = kA.l8(strArr[i]);
        }
    }

    public Rz W(String str, String str2) {
        Rc.HM(str);
        int iE9 = E9(str);
        if (iE9 != -1) {
            this.T4[iE9] = str2;
        } else {
            b(str, str2);
        }
        return this;
    }

    public Rz b(String str, @Nullable String str2) {
        tT(this.l8 + 1);
        String[] strArr = this.S;
        int i = this.l8;
        strArr[i] = str;
        this.T4[i] = str2;
        this.l8 = i + 1;
        return this;
    }

    public boolean cD(String str) {
        return E9(str) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rz.class != obj.getClass()) {
            return false;
        }
        Rz rz = (Rz) obj;
        if (this.l8 == rz.l8 && Arrays.equals(this.S, rz.S)) {
            return Arrays.equals(this.T4, rz.T4);
        }
        return false;
    }

    public String hR() {
        StringBuilder sbS = tv.S();
        try {
            Kf(sbS, new g9("").K());
            return tv.cD(sbS);
        } catch (IOException e) {
            throw new E(e);
        }
    }

    public int hashCode() {
        return (((this.l8 * 31) + Arrays.hashCode(this.S)) * 31) + Arrays.hashCode(this.T4);
    }

    public boolean isEmpty() {
        return this.l8 == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<in> iterator() {
        return new aA();
    }

    public List<in> l() {
        ArrayList arrayList = new ArrayList(this.l8);
        for (int i = 0; i < this.l8; i++) {
            if (!eD(this.S[i])) {
                arrayList.add(new in(this.S[i], this.T4[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int n(com.github.catvod.spider.merge.rO r7) {
        /*
            r6 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r7 = r7.b()
            r0 = 0
        Ld:
            java.lang.String[] r2 = r6.S
            int r2 = r2.length
            if (r1 >= r2) goto L45
            int r2 = r1 + 1
            r3 = r2
        L15:
            java.lang.String[] r4 = r6.S
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
            java.lang.String[] r4 = r6.S
            r5 = r4[r1]
            r4 = r4[r3]
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L40
        L39:
            int r0 = r0 + 1
            r6.r1(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Rz.n(com.github.catvod.spider.merge.rO):int");
    }

    public boolean s(String str) {
        return uS(str) != -1;
    }

    public int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.l8; i2++) {
            if (!eD(this.S[i2])) {
                i++;
            }
        }
        return i;
    }

    public String toString() {
        return hR();
    }

    public String v(String str) {
        int iE9 = E9(str);
        return iE9 == -1 ? "" : N(this.T4[iE9]);
    }
}
