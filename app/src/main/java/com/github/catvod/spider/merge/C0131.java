package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˑ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0131 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final Pattern f325 = Pattern.compile(SOY.d("26222A3F1A34153F331F1A1E1435151F1514083B251F1716161F30041F040779"));

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static boolean m433(CharSequence charSequence, char... cArr) {
        if (!m442(charSequence) && !C0166.m587(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i = length - 1;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i4 == i2) {
                            return true;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static boolean m434(CharSequence charSequence, char... cArr) {
        if (charSequence != null && cArr != null) {
            int length = charSequence.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i4 == i2) {
                            return false;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static String m435(String str) {
        return m436(str, "");
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static String m436(String str, String str2) {
        return str == null ? str2 : str;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static boolean m437(CharSequence charSequence, CharSequence charSequence2) {
        return m438(charSequence, charSequence2, false);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static boolean m438(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return C0114.m395(charSequence, z, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static int m439(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return C0114.m394(charSequence, charSequence2, i);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static int m440(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence != null && charSequence2 != null) {
            if (i < 0) {
                i = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i;
            }
            while (i < length) {
                if (C0114.m395(charSequence, true, i, charSequence2, 0, charSequence2.length())) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static boolean m441(CharSequence charSequence) {
        int iM446 = m446(charSequence);
        if (iM446 == 0) {
            return true;
        }
        for (int i = 0; i < iM446; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static boolean m442(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static boolean m443(CharSequence charSequence) {
        return !m441(charSequence);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public static String m444(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return m445(iterable.iterator(), str);
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public static String m445(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C0371.m1441(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public static int m446(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public static String m447(String str, String str2) {
        return (m442(str) || m442(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public static String m448(String str, String str2) {
        return (m442(str) || m442(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    public static String m449(String str, String str2, String str3) {
        return m450(str, str2, str3, -1);
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public static String m450(String str, String str2, String str3, int i) {
        return m451(str, str2, str3, i, false);
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    private static String m451(String str, String str2, String str3, int i, boolean z) {
        if (m442(str) || m442(str2) || str3 == null || i == 0) {
            return str;
        }
        if (z) {
            str2 = str2.toLowerCase();
        }
        int i2 = 0;
        int iM440 = z ? m440(str, str2, 0) : m439(str, str2, 0);
        if (iM440 == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * (i < 0 ? 16 : Math.min(i, 64))));
        while (iM440 != -1) {
            sb.append((CharSequence) str, i2, iM440);
            sb.append(str3);
            i2 = iM440 + length;
            i--;
            if (i == 0) {
                break;
            }
            iM440 = z ? m440(str, str2, i2) : m439(str, str2, i2);
        }
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public static String m452(String str, int i) {
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

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public static String m453(String str, int i, int i2) {
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

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    public static String m454(String str, String str2) {
        int iIndexOf;
        return m442(str) ? str : (str2 == null || (iIndexOf = str.indexOf(str2)) == -1) ? "" : str.substring(iIndexOf + str2.length());
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    public static String m455(String str, String str2) {
        int iLastIndexOf;
        return m442(str) ? str : (m442(str2) || (iLastIndexOf = str.lastIndexOf(str2)) == -1 || iLastIndexOf == str.length() - str2.length()) ? "" : str.substring(iLastIndexOf + str2.length());
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    public static String m456(String str, String str2) {
        if (m442(str) || str2 == null) {
            return str;
        }
        if (str2.isEmpty()) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    public static String m457(String str, String str2) {
        int iLastIndexOf;
        return (m442(str) || m442(str2) || (iLastIndexOf = str.lastIndexOf(str2)) == -1) ? str : str.substring(0, iLastIndexOf);
    }
}
