package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0035;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ྋ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0542 implements Iterable<C0436>, Cloneable {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private int f1213 = 0;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    String[] f1214 = new String[3];

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    String[] f1215 = new String[3];

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ྋ$Ϳ, reason: contains not printable characters */
    class C0543 implements Iterator<C0436> {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        int f1216 = 0;

        C0543() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f1216 < C0542.this.f1213) {
                C0542 c0542 = C0542.this;
                if (!c0542.m1746(c0542.f1214[this.f1216])) {
                    break;
                }
                this.f1216++;
            }
            return this.f1216 < C0542.this.f1213;
        }

        @Override // java.util.Iterator
        public void remove() {
            C0542 c0542 = C0542.this;
            int i = this.f1216 - 1;
            this.f1216 = i;
            c0542.m1747(i);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C0436 next() {
            C0542 c0542 = C0542.this;
            String[] strArr = c0542.f1214;
            int i = this.f1216;
            C0436 c0436 = new C0436(strArr[i], c0542.f1215[i], c0542);
            this.f1216++;
            return c0436;
        }
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private void m1742(int i) {
        C0034.m278(i >= this.f1213);
        String[] strArr = this.f1214;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f1213 * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f1214 = (String[]) Arrays.copyOf(strArr, i);
        this.f1215 = (String[]) Arrays.copyOf(this.f1215, i);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    static String m1743(@Nullable String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private int m1744(String str) {
        C0034.m284(str);
        for (int i = 0; i < this.f1213; i++) {
            if (str.equalsIgnoreCase(this.f1214[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    static String m1745(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public boolean m1746(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    public void m1747(int i) {
        C0034.m277(i >= this.f1213);
        int i2 = (this.f1213 - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f1214;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.f1215;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.f1213 - 1;
        this.f1213 = i4;
        this.f1214[i4] = null;
        this.f1215[i4] = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0542.class != obj.getClass()) {
            return false;
        }
        C0542 c0542 = (C0542) obj;
        if (this.f1213 == c0542.f1213 && Arrays.equals(this.f1214, c0542.f1214)) {
            return Arrays.equals(this.f1215, c0542.f1215);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f1213 * 31) + Arrays.hashCode(this.f1214)) * 31) + Arrays.hashCode(this.f1215);
    }

    public boolean isEmpty() {
        return this.f1213 == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<C0436> iterator() {
        return new C0543();
    }

    public int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.f1213; i2++) {
            if (!m1746(this.f1214[i2])) {
                i++;
            }
        }
        return i;
    }

    public String toString() {
        return m1757();
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public C0542 m1748(String str, @Nullable String str2) {
        m1742(this.f1213 + 1);
        String[] strArr = this.f1214;
        int i = this.f1213;
        strArr[i] = str;
        this.f1215[i] = str2;
        this.f1213 = i + 1;
        return this;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public void m1749(C0542 c0542) {
        if (c0542.size() == 0) {
            return;
        }
        m1742(this.f1213 + c0542.f1213);
        Iterator<C0436> it = c0542.iterator();
        while (it.hasNext()) {
            m1762(it.next());
        }
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public List<C0436> m1750() {
        ArrayList arrayList = new ArrayList(this.f1213);
        for (int i = 0; i < this.f1213; i++) {
            if (!m1746(this.f1214[i])) {
                arrayList.add(new C0436(this.f1214[i], this.f1215[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0542 clone() {
        try {
            C0542 c0542 = (C0542) super.clone();
            c0542.f1213 = this.f1213;
            this.f1214 = (String[]) Arrays.copyOf(this.f1214, this.f1213);
            this.f1215 = (String[]) Arrays.copyOf(this.f1215, this.f1213);
            return c0542;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m1752(com.github.catvod.spider.merge.C0435 r7) {
        /*
            r6 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r7 = r7.m1623()
            r0 = 0
        Ld:
            java.lang.String[] r2 = r6.f1214
            int r2 = r2.length
            if (r1 >= r2) goto L45
            int r2 = r1 + 1
            r3 = r2
        L15:
            java.lang.String[] r4 = r6.f1214
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
            java.lang.String[] r4 = r6.f1214
            r5 = r4[r1]
            r4 = r4[r3]
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L40
        L39:
            int r0 = r0 + 1
            r6.m1747(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0542.m1752(com.github.catvod.spider.merge.ॽ):int");
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public String m1753(String str) {
        int iM1759 = m1759(str);
        return iM1759 == -1 ? "" : m1743(this.f1215[iM1759]);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public String m1754(String str) {
        int iM1744 = m1744(str);
        return iM1744 == -1 ? "" : m1743(this.f1215[iM1744]);
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public boolean m1755(String str) {
        return m1759(str) != -1;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public boolean m1756(String str) {
        return m1744(str) != -1;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public String m1757() {
        StringBuilder sbM136 = C0008.m136();
        try {
            m1758(sbM136, new C0035("").m290());
            return C0008.m147(sbM136);
        } catch (IOException e) {
            throw new C0244(e);
        }
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    final void m1758(Appendable appendable, C0035.C0036 c0036) throws IOException {
        int i = this.f1213;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m1746(this.f1214[i2])) {
                String str = this.f1214[i2];
                String str2 = this.f1215[i2];
                appendable.append(' ').append(str);
                if (!C0436.m1627(str, str2, c0036)) {
                    appendable.append(SOY.d("4770"));
                    if (str2 == null) {
                        str2 = "";
                    }
                    C0195.m735(appendable, str2, c0036, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    int m1759(String str) {
        C0034.m284(str);
        for (int i = 0; i < this.f1213; i++) {
            if (str.equals(this.f1214[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public void m1760() {
        for (int i = 0; i < this.f1213; i++) {
            String[] strArr = this.f1214;
            strArr[i] = C0256.m916(strArr[i]);
        }
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    public C0542 m1761(String str, String str2) {
        C0034.m284(str);
        int iM1759 = m1759(str);
        if (iM1759 != -1) {
            this.f1215[iM1759] = str2;
        } else {
            m1748(str, str2);
        }
        return this;
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    public C0542 m1762(C0436 c0436) {
        C0034.m284(c0436);
        m1761(c0436.getKey(), c0436.getValue());
        c0436.f1071 = this;
        return this;
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    void m1763(String str, @Nullable String str2) {
        int iM1744 = m1744(str);
        if (iM1744 == -1) {
            m1748(str, str2);
            return;
        }
        this.f1215[iM1744] = str2;
        if (this.f1214[iM1744].equals(str)) {
            return;
        }
        this.f1214[iM1744] = str;
    }
}
