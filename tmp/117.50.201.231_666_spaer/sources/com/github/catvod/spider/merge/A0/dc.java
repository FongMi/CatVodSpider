package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class dc extends wf {
    public static boolean c(CharSequence charSequence, char c) {
        ko.f("<this>", charSequence);
        return g(charSequence, c, 0, 2) >= 0;
    }

    public static boolean d(String str, String str2) {
        ko.f("<this>", str);
        return h(str, str2, 0, 2) >= 0;
    }

    public static final int e(CharSequence charSequence) {
        ko.f("<this>", charSequence);
        return charSequence.length() - 1;
    }

    public static final int f(CharSequence charSequence, String str, int i, boolean z) {
        ko.f("<this>", charSequence);
        ko.f("string", str);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        add addVar = new add(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = addVar.c;
        int i3 = addVar.b;
        int i4 = addVar.a;
        if (z2 && (str instanceof String)) {
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (!wf.ad(str, 0, (String) charSequence, i4, str.length(), z)) {
                    if (i4 != i3) {
                        i4 += i2;
                    }
                }
                return i4;
            }
            return -1;
        }
        if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            while (!m(str, 0, charSequence, i4, str.length(), z)) {
                if (i4 != i3) {
                    i4 += i2;
                }
            }
            return i4;
        }
        return -1;
    }

    public static int g(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        ko.f("<this>", charSequence);
        return !(charSequence instanceof String) ? i(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int h(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return f(charSequence, str, i, false);
    }

    public static final int i(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int i2;
        ko.f("<this>", charSequence);
        boolean z2 = true;
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        add addVar = new add(i, e(charSequence), 1);
        int i3 = addVar.c;
        int i4 = addVar.b;
        if (i3 <= 0 ? i < i4 : i > i4) {
            z2 = false;
        }
        if (!z2) {
            i = i4;
        }
        while (z2) {
            if (i != i4) {
                i2 = i + i3;
            } else {
                if (!z2) {
                    throw new NoSuchElementException();
                }
                i2 = i;
                z2 = false;
            }
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (mx.b(c, cCharAt, z)) {
                    return i;
                }
            }
            i = i2;
        }
        return -1;
    }

    public static int j(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = e(str);
        }
        ko.f("<this>", str);
        return str.lastIndexOf(c, i);
    }

    public static int k(String str, String str2, int i) {
        int iE = (i & 2) != 0 ? e(str) : 0;
        ko.f("<this>", str);
        ko.f("string", str2);
        return str.lastIndexOf(str2, iE);
    }

    public static acr l(String str, String[] strArr) {
        return new acr(str, new ac(1, qb.c(strArr)));
    }

    public static final boolean m(String str, int i, CharSequence charSequence, int i2, int i3, boolean z) {
        ko.f("<this>", str);
        ko.f("other", charSequence);
        if (i2 < 0 || i < 0 || i > str.length() - i3 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!mx.b(str.charAt(i + i4), charSequence.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String n(String str, String str2) {
        ko.f("<this>", str);
        ko.f("prefix", str2);
        if (!r(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        ko.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static final List o(String str, String str2) {
        int iF = f(str, str2, 0, false);
        if (iF == -1) {
            return sx.l(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(str.subSequence(length, iF).toString());
            length = str2.length() + iF;
            iF = f(str, str2, length, false);
        } while (iF != -1);
        arrayList.add(str.subSequence(length, str.length()).toString());
        return arrayList;
    }

    public static List p(String str, char[] cArr) {
        ko.f("<this>", str);
        if (cArr.length == 1) {
            return o(str, String.valueOf(cArr[0]));
        }
        km kmVar = new km(new acr(str, new ac(0, cArr)));
        ArrayList arrayList = new ArrayList(sy.m(kmVar));
        Iterator it = kmVar.iterator();
        while (true) {
            acq acqVar = (acq) it;
            if (!acqVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(s(str, (add) acqVar.next()));
        }
    }

    public static List q(String str, String[] strArr) {
        ko.f("<this>", str);
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return o(str, str2);
            }
        }
        km kmVar = new km(l(str, strArr));
        ArrayList arrayList = new ArrayList(sy.m(kmVar));
        Iterator it = kmVar.iterator();
        while (true) {
            acq acqVar = (acq) it;
            if (!acqVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(s(str, (add) acqVar.next()));
        }
    }

    public static boolean r(String str, String str2) {
        ko.f("<this>", str);
        ko.f("prefix", str2);
        return wf.ah(str, str2, false);
    }

    public static final String s(String str, add addVar) {
        ko.f("<this>", str);
        ko.f("range", addVar);
        return str.subSequence(addVar.a, addVar.b + 1).toString();
    }

    public static String t(String str, String str2) {
        ko.f("delimiter", str2);
        int iH = h(str, str2, 0, 6);
        if (iH == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iH, str.length());
        ko.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String u(String str) {
        ko.f("<this>", str);
        ko.f("missingDelimiterValue", str);
        int iJ = j(str, '.', 0, 6);
        if (iJ == -1) {
            return str;
        }
        String strSubstring = str.substring(iJ + 1, str.length());
        ko.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String v(String str, int i) {
        ko.f("<this>", str);
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        ko.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static CharSequence w(String str) {
        ko.f("<this>", str);
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
