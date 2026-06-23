package com.github.catvod.spider.merge.A0;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class wf extends hx {
    public static boolean aa(String str, String str2, boolean z) {
        ko.f("<this>", str);
        ko.f("suffix", str2);
        return !z ? str.endsWith(str2) : ad(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean ab(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean ac(String str) {
        ko.f("<this>", str);
        if (str.length() == 0) {
            return true;
        }
        Iterable addVar = new add(0, str.length() - 1, 1);
        if ((addVar instanceof Collection) && ((Collection) addVar).isEmpty()) {
            return true;
        }
        Iterator it = addVar.iterator();
        while (((nd) it).c) {
            char cCharAt = str.charAt(((nd) it).e());
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean ad(String str, int i, String str2, int i2, int i3, boolean z) {
        ko.f("<this>", str);
        ko.f("other", str2);
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String ae(String str, char c, char c2) {
        ko.f("<this>", str);
        String strReplace = str.replace(c, c2);
        ko.e("replace(...)", strReplace);
        return strReplace;
    }

    public static String af(String str, String str2, String str3) {
        ko.f("<this>", str);
        int iF = dc.f(str, str2, 0, false);
        if (iF < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iF);
            sb.append(str3);
            i2 = iF + length;
            if (iF >= str.length()) {
                break;
            }
            iF = dc.f(str, str2, iF + i, false);
        } while (iF > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        ko.e("toString(...)", string);
        return string;
    }

    public static boolean ag(int i, String str, String str2, boolean z) {
        ko.f("<this>", str);
        return !z ? str.startsWith(str2, i) : ad(str, i, str2, 0, str2.length(), z);
    }

    public static boolean ah(String str, String str2, boolean z) {
        ko.f("<this>", str);
        ko.f("prefix", str2);
        return !z ? str.startsWith(str2) : ad(str, 0, str2, 0, str2.length(), z);
    }

    public static String z(char[] cArr, int i, int i2) {
        pd pdVar = ph.Companion;
        int length = cArr.length;
        pdVar.getClass();
        if (i < 0 || i2 > length) {
            throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + length);
        }
        if (i <= i2) {
            return new String(cArr, i, i2 - i);
        }
        throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
    }
}
