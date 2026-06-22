package com.github.catvod.spider.merge.E;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static boolean a(String str) {
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

    public static boolean b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String c(Iterable iterable, String str) {
        Iterator it;
        if (iterable == null || (it = iterable.iterator()) == null) {
            return null;
        }
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
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
            if (next != null) {
                return next.toString();
            }
        }
        return "";
    }

    public static String d(String str, String str2) {
        return (b(str) || b(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }
}
