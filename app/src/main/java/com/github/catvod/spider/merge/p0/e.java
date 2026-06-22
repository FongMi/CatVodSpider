package com.github.catvod.spider.merge.P0;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return a.b(charSequence, 0, charSequence2, charSequence.length());
    }

    public static boolean b(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean d(CharSequence charSequence) {
        return !b(charSequence);
    }

    public static String e(String str, String str2, String str3) {
        if (c(str) || c(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int iA = (str == null || str2 == null) ? -1 : a.a(str, str2, 0);
        if (iA == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (iA != -1) {
            sb.append((CharSequence) str, i, iA);
            sb.append(str3);
            i = iA + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iA = a.a(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }
}
