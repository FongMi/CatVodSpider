package com.github.catvod.spider.merge;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࠤ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0376 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String m1445(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == ' ' && z) {
                sb.append((char) 183);
            } else if (c == '\t') {
                sb.append(SOY.d("2626"));
            } else if (c == '\n') {
                sb.append(SOY.d("263C"));
            } else if (c == '\r') {
                sb.append(SOY.d("2620"));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static <T> String m1446(Iterator<T> it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
