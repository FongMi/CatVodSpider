package com.github.catvod.spider.merge.A0;

import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class fx {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static int b(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return -1;
        }
        return str.indexOf(str2.toString(), i);
    }

    public static boolean c(String str) {
        int length = str == null ? 0 : str.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String e(Iterable iterable, String str) {
        Iterator it;
        if (iterable == null || (it = iterable.iterator()) == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(str);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String f(String str, String str2) {
        return (d(str) || d(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String g(String str, String str2, String str3) {
        if (d(str) || d(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int iB = b(str, str2, 0);
        if (iB == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (iB != -1) {
            sb.append((CharSequence) str, i, iB);
            sb.append(str3);
            i = iB + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iB = b(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }
}
