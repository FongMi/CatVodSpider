package com.github.catvod.spider.merge.Dw;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return a.b(charSequence, false, charSequence.length() - charSequence2.length(), charSequence2, charSequence2.length());
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

    public static String e(Iterable<?> iterable, String str) {
        Iterator<?> it;
        Object next;
        if (iterable == null || (it = iterable.iterator()) == null) {
            return null;
        }
        if (it.hasNext()) {
            Object next2 = it.next();
            if (it.hasNext()) {
                StringBuilder sb = new StringBuilder(256);
                if (next2 == null) {
                    sb.append(next2);
                    while (it.hasNext()) {
                        if (str != null) {
                            sb.append(str);
                        }
                        next = it.next();
                        if (next != null) {
                        }
                    }
                    return sb.toString();
                }
                sb.append(next);
            } else if (next2 != null) {
                return next2.toString();
            }
        }
        return "";
    }

    public static String f(String str, String str2) {
        return (c(str) || c(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String g(String str, String str2) {
        return (c(str) || c(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static String h(String str, String str2, String str3) {
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

    public static String i(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i += str.length();
        }
        if (i < 0) {
            i = 0;
        }
        return i > str.length() ? "" : str.substring(i);
    }

    public static String j(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0) {
            i2 += str.length();
        }
        if (i < 0) {
            i += str.length();
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        if (i > i2) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return str.substring(i, i2);
    }
}
