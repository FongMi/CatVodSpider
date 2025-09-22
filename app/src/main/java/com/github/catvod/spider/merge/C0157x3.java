package com.github.catvod.spider.merge;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.x3 */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public final class C0157x3 {

    /* renamed from: q */
    static final String[] f762q = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: xC */
    private static Pattern f763xC = Pattern.compile("^/((\\.{1,2}/)+)");

    /* renamed from: QU */
    private static final ThreadLocal<Stack<StringBuilder>> f761QU = new p();

    /* renamed from: com.github.catvod.spider.merge.x3$Qe */
    public static class Qe {

        /* renamed from: xC */
        final String f766xC;

        /* renamed from: q */
        @Nullable
        StringBuilder f765q = C0157x3.m779xC();

        /* renamed from: QU */
        boolean f764QU = true;

        public Qe(String str) {
            this.f766xC = str;
        }

        /* renamed from: q */
        public Qe m780q(Object obj) {
            C0111bw.m559se(this.f765q);
            if (!this.f764QU) {
                this.f765q.append(this.f766xC);
            }
            this.f765q.append(obj);
            this.f764QU = false;
            return this;
        }

        /* renamed from: xC */
        public String m781xC() {
            String strM778w8 = C0157x3.m778w8(this.f765q);
            this.f765q = null;
            return strM778w8;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.x3$p */
    class p extends ThreadLocal<Stack<StringBuilder>> {
        p() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: q */
        public Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    /* renamed from: B */
    public static String m765B(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        String[] strArr = f762q;
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

    /* renamed from: F */
    public static String m766F(String str, String str2) {
        try {
            try {
                return m771RH(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(str2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return "";
        }
    }

    /* renamed from: FN */
    public static String m767FN(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        Qe qe = new Qe(str);
        qe.m780q(string);
        while (it.hasNext()) {
            qe.m780q(it.next());
        }
        return qe.m781xC();
    }

    /* renamed from: MH */
    public static boolean m768MH(String str) {
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

    /* renamed from: Mo */
    public static boolean m769Mo(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m776se(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: QU */
    public static boolean m770QU(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: RH */
    public static URL m771RH(URL url, String str) {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String strReplaceFirst = f763xC.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }

    /* renamed from: UJ */
    public static boolean m772UJ(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* renamed from: W */
    public static String m773W(Collection<?> collection, String str) {
        return m767FN(collection.iterator(), str);
    }

    /* renamed from: i */
    public static boolean m774i(int i) {
        return i == 8203 || i == 173;
    }

    /* renamed from: q */
    public static void m775q(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (m777u(iCodePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!m774i(iCodePointAt)) {
                sb.appendCodePoint(iCodePointAt);
                z2 = true;
                z3 = false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* renamed from: se */
    public static boolean m776se(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* renamed from: u */
    public static boolean m777u(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13 || i == 160;
    }

    /* renamed from: w8 */
    public static String m778w8(StringBuilder sb) {
        C0111bw.m559se(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = f761QU.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    /* renamed from: xC */
    public static StringBuilder m779xC() {
        Stack<StringBuilder> stack = f761QU.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }
}
