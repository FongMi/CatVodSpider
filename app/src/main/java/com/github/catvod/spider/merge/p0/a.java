package com.github.catvod.spider.merge.P0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a {
    static int a(CharSequence charSequence, CharSequence charSequence2, int i) {
        return charSequence instanceof String ? ((String) charSequence).indexOf(charSequence2.toString(), i) : charSequence instanceof StringBuilder ? ((StringBuilder) charSequence).indexOf(charSequence2.toString(), i) : charSequence instanceof StringBuffer ? ((StringBuffer) charSequence).indexOf(charSequence2.toString(), i) : charSequence.toString().indexOf(charSequence2.toString(), i);
    }

    static boolean b(CharSequence charSequence, int i, CharSequence charSequence2, int i2) {
        char upperCase;
        char upperCase2;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(true, i, (String) charSequence2, 0, i2);
        }
        int length = charSequence.length() - i;
        int length2 = charSequence2.length() - 0;
        if (i < 0 || i2 < 0 || length < i2 || length2 < i2) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return true;
            }
            int i5 = i + 1;
            char cCharAt = charSequence.charAt(i);
            int i6 = i3 + 1;
            char cCharAt2 = charSequence2.charAt(i3);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }
}
