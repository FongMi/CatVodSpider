package com.github.catvod.spider.merge;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ı, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0008 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    static final String[] f149 = {"", SOY.d("5A"), SOY.d("5A72"), SOY.d("5A7271"), SOY.d("5A727156"), SOY.d("5A72715654"), SOY.d("5A7271565457"), SOY.d("5A72715654575A"), SOY.d("5A72715654575A72"), SOY.d("5A72715654575A7271"), SOY.d("5A72715654575A727156"), SOY.d("5A72715654575A72715654"), SOY.d("5A72715654575A7271565457"), SOY.d("5A72715654575A72715654575A"), SOY.d("5A72715654575A72715654575A72"), SOY.d("5A72715654575A72715654575A7271"), SOY.d("5A72715654575A72715654575A727156"), SOY.d("5A72715654575A72715654575A72715654"), SOY.d("5A72715654575A72715654575A7271565457"), SOY.d("5A72715654575A72715654575A72715654575A"), SOY.d("5A72715654575A72715654575A72715654575A72")};

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static Pattern f150 = Pattern.compile(SOY.d("247D795E285901637D440958537978"));

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final ThreadLocal<Stack<StringBuilder>> f151 = new C0009();

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ı$Ϳ, reason: contains not printable characters */
    class C0009 extends ThreadLocal<Stack<StringBuilder>> {
        C0009() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ı$Ԩ, reason: contains not printable characters */
    public static class C0010 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        final String f153;

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        @Nullable
        StringBuilder f152 = C0008.m136();

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        boolean f154 = true;

        public C0010(String str) {
            this.f153 = str;
        }

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public C0010 m151(Object obj) {
            C0034.m284(this.f152);
            if (!this.f154) {
                this.f152.append(this.f153);
            }
            this.f152.append(obj);
            this.f154 = false;
            return this;
        }

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public String m152() {
            String strM147 = C0008.m147(this.f152);
            this.f152 = null;
            return strM147;
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static void m135(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (m139(iCodePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!m141(iCodePointAt)) {
                sb.appendCodePoint(iCodePointAt);
                z2 = true;
                z3 = false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static StringBuilder m136() {
        Stack<StringBuilder> stack = f151.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static boolean m137(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static boolean m138(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static boolean m139(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13 || i == 160;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static boolean m140(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m143(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static boolean m141(int i) {
        return i == 8203 || i == 173;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static boolean m142(String str) {
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

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static boolean m143(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static String m144(Collection<?> collection, String str) {
        return m145(collection.iterator(), str);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static String m145(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        C0010 c0010 = new C0010(str);
        c0010.m151(string);
        while (it.hasNext()) {
            c0010.m151(it.next());
        }
        return c0010.m152();
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public static String m146(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(SOY.d("0D3B35021C571727220254151F726F5644"));
        }
        String[] strArr = f149;
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

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public static String m147(StringBuilder sb) {
        C0034.m284(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = f151.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public static String m148(String str, String str2) {
        try {
            try {
                return m149(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(str2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public static URL m149(URL url, String str) {
        if (str.startsWith(SOY.d("45"))) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String strReplaceFirst = f150.matcher(url2.getFile()).replaceFirst(SOY.d("55"));
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + SOY.d("59") + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }
}
