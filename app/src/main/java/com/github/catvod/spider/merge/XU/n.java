package com.github.catvod.spider.merge.XU;

import com.github.catvod.spider.merge.ZrJ;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class n {
    static final String[] a = {"", ZrJ.d("59"), ZrJ.d("5963"), ZrJ.d("59636B"), ZrJ.d("59636B6D"), ZrJ.d("59636B6D68"), ZrJ.d("59636B6D6865"), ZrJ.d("59636B6D686559"), ZrJ.d("59636B6D68655963"), ZrJ.d("59636B6D686559636B"), ZrJ.d("59636B6D686559636B6D"), ZrJ.d("59636B6D686559636B6D68"), ZrJ.d("59636B6D686559636B6D6865"), ZrJ.d("59636B6D686559636B6D686559"), ZrJ.d("59636B6D686559636B6D68655963"), ZrJ.d("59636B6D686559636B6D686559636B"), ZrJ.d("59636B6D686559636B6D686559636B6D"), ZrJ.d("59636B6D686559636B6D686559636B6D68"), ZrJ.d("59636B6D686559636B6D686559636B6D6865"), ZrJ.d("59636B6D686559636B6D686559636B6D686559"), ZrJ.d("59636B6D686559636B6D686559636B6D68655963")};
    private static final Pattern b = Pattern.compile(ZrJ.d("276C6365146B0272677F356A506862"));
    private static final Pattern c = Pattern.compile(ZrJ.d("27182A60320454191616296803026617786840686663156F43"));
    private static final Pattern d = Pattern.compile(ZrJ.d("221F337D7868253B7A2B156F"));
    private static final ThreadLocal<Stack<StringBuilder>> e = new m();
    public static final /* synthetic */ int f = 0;

    public static void a(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!(iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160)) {
                if (!(iCodePointAt == 8203 || iCodePointAt == 173)) {
                    sb.appendCodePoint(iCodePointAt);
                    z2 = true;
                    z3 = false;
                }
            } else if ((!z || z2) && !z3) {
                sb.append(' ');
                z3 = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public static StringBuilder b() {
        Stack<StringBuilder> stack = e.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    public static boolean c(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean d(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!e(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean e(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static String f(Collection<?> collection, String str) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sbB = b();
        k.g(sbB);
        Object obj = string;
        while (true) {
            sbB.append(obj);
            if (!it.hasNext()) {
                return h(sbB);
            }
            Object next = it.next();
            sbB.append(str);
            obj = next;
        }
    }

    public static String g(int i, int i2) {
        k.d(i >= 0, ZrJ.d("0E2A2F3920651436383968271C6375706875"));
        k.c(i2 >= -1);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        String[] strArr = a;
        if (i < 21) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static String h(StringBuilder sb) {
        k.g(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = e.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    public static String i(String str, String str2) {
        String strK = k(str);
        String strK2 = k(str2);
        try {
            try {
                return j(new URL(strK), strK2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strK2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return c.matcher(strK2).find() ? strK2 : "";
        }
    }

    public static URL j(URL url, String str) {
        String strK = k(str);
        if (strK.startsWith(ZrJ.d("46"))) {
            strK = url.getPath() + strK;
        }
        URL url2 = new URL(url, strK);
        String strReplaceFirst = b.matcher(url2.getFile()).replaceFirst(ZrJ.d("56"));
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + ZrJ.d("5A") + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }

    private static String k(String str) {
        return d.matcher(str).replaceAll("");
    }
}
