package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.y.AbstractC1412a;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p {
    private final int b = 4095;
    private final String[] a = new String[4096];

    public p() {
        a("$ref", 0, 4, 1185263);
        String str = AbstractC1412a.d;
        a(str, 0, str.length(), AbstractC1412a.d.hashCode());
    }

    public final String a(String str, int i, int i2, int i3) {
        int i4 = this.b & i3;
        String str2 = this.a[i4];
        if (str2 != null) {
            if (i3 == str2.hashCode() && i2 == str2.length() && str.startsWith(str2, i)) {
                return str2;
            }
            char[] cArr = new char[i2];
            str.getChars(i, i2 + i, cArr, 0);
            return new String(cArr);
        }
        if (i2 != str.length()) {
            char[] cArr2 = new char[i2];
            str.getChars(i, i2 + i, cArr2, 0);
            str = new String(cArr2);
        }
        String strIntern = str.intern();
        this.a[i4] = strIntern;
        return strIntern;
    }

    public final String b(char[] cArr, int i, int i2, int i3) {
        int i4 = this.b & i3;
        String str = this.a[i4];
        if (str == null) {
            String strIntern = new String(cArr, i, i2).intern();
            this.a[i4] = strIntern;
            return strIntern;
        }
        boolean z = false;
        if (i3 == str.hashCode() && i2 == str.length()) {
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    z = true;
                    break;
                }
                if (cArr[i + i5] != str.charAt(i5)) {
                    break;
                }
                i5++;
            }
        }
        return z ? str : new String(cArr, i, i2);
    }
}
