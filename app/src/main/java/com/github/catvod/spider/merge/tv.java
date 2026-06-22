package com.github.catvod.spider.merge;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class tv {
    static final String[] l8 = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    private static Pattern S = Pattern.compile("^/((\\.{1,2}/)+)");
    private static final ThreadLocal<Stack<StringBuilder>> T4 = new aA();

    class aA extends ThreadLocal<Stack<StringBuilder>> {
        aA() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: l8, reason: merged with bridge method [inline-methods] */
        public Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    public static class ut {
        final String S;

        @Nullable
        StringBuilder l8 = tv.S();
        boolean T4 = true;

        public ut(String str) {
            this.S = str;
        }

        public String S() {
            String strCD = tv.cD(this.l8);
            this.l8 = null;
            return strCD;
        }

        public ut l8(Object obj) {
            Rc.HM(this.l8);
            if (!this.T4) {
                this.l8.append(this.S);
            }
            this.l8.append(obj);
            this.T4 = false;
            return this;
        }
    }

    public static String A(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        String[] strArr = l8;
        if (i < strArr.length) {
            return strArr[i];
        }
        int iMin = Math.min(i, 30);
        char[] cArr = new char[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            cArr[i2] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static boolean HM(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static boolean N(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean OL(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13 || i == 160;
    }

    public static StringBuilder S() {
        Stack<StringBuilder> stack = T4.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    public static boolean T4(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static String cD(StringBuilder sb) {
        Rc.HM(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = T4.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    public static URL hR(URL url, String str) {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String strReplaceFirst = S.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }

    public static boolean l(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!HM(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void l8(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (OL(iCodePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!tT(iCodePointAt)) {
                sb.appendCodePoint(iCodePointAt);
                z2 = true;
                z3 = false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public static String n(Collection<?> collection, String str) {
        return v(collection.iterator(), str);
    }

    public static String s(String str, String str2) {
        try {
            try {
                return hR(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(str2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return "";
        }
    }

    public static boolean tT(int i) {
        return i == 8203 || i == 173;
    }

    public static String v(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        ut utVar = new ut(str);
        utVar.l8(string);
        while (it.hasNext()) {
            utVar.l8(it.next());
        }
        return utVar.S();
    }
}
