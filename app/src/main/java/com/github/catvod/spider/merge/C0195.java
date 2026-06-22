package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0035;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ו, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0195 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final char[] f492 = {',', ';'};

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final HashMap<String, String> f493 = new HashMap<>();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final C0035.C0036 f494 = new C0035.C0036();

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ו$Ϳ, reason: contains not printable characters */
    static /* synthetic */ class C0196 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static final /* synthetic */ int[] f495;

        static {
            int[] iArr = new int[EnumC0197.values().length];
            f495 = iArr;
            try {
                iArr[EnumC0197.f496.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f495[EnumC0197.f497.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ו$Ԩ, reason: contains not printable characters */
    enum EnumC0197 {
        f496,
        f497,
        f498;

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static EnumC0197 m739(String str) {
            return str.equals(SOY.d("2F017C372734331B")) ? f496 : str.startsWith(SOY.d("2F06175B")) ? f497 : f498;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ו$Ԫ, reason: contains not printable characters */
    public enum EnumC0198 {
        f500(C0183.f449, 4),
        f501(C0183.f450, 106),
        f502(C0183.f451, 2125);


        /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
        private String[] f504;

        /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
        private int[] f505;

        /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
        private int[] f506;

        /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
        private String[] f507;

        EnumC0198(String str, int i) {
            C0195.m738(this, str, i);
        }

        /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
        int m750(String str) {
            int iBinarySearch = Arrays.binarySearch(this.f504, str);
            if (iBinarySearch >= 0) {
                return this.f505[iBinarySearch];
            }
            return -1;
        }

        /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
        String m751(int i) {
            int iBinarySearch = Arrays.binarySearch(this.f506, i);
            if (iBinarySearch < 0) {
                return "";
            }
            String[] strArr = this.f507;
            if (iBinarySearch < strArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (this.f506[i2] == i) {
                    return strArr[i2];
                }
            }
            return strArr[iBinarySearch];
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static void m732(Appendable appendable, EnumC0198 enumC0198, int i) throws IOException {
        String strM751 = enumC0198.m751(i);
        if ("".equals(strM751)) {
            appendable.append(SOY.d("5C7129")).append(Integer.toHexString(i)).append(';');
        } else {
            appendable.append('&').append(strM751).append(';');
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static boolean m733(EnumC0197 enumC0197, char c, CharsetEncoder charsetEncoder) {
        int i = C0196.f495[enumC0197.ordinal()];
        if (i == 1) {
            return c < 128;
        }
        if (i != 2) {
            return charsetEncoder.canEncode(c);
        }
        return true;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static int m734(String str, int[] iArr) {
        String str2 = f493.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iM750 = EnumC0198.f502.m750(str);
        if (iM750 == -1) {
            return 0;
        }
        iArr[0] = iM750;
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m735(java.lang.Appendable r15, java.lang.String r16, com.github.catvod.spider.merge.C0035.C0036 r17, boolean r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0195.m735(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.ǐ$Ϳ, boolean, boolean, boolean):void");
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static boolean m736(String str) {
        return EnumC0198.f501.m750(str) != -1;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static boolean m737(String str) {
        return EnumC0198.f502.m750(str) != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static void m738(EnumC0198 enumC0198, String str, int i) {
        int i2;
        enumC0198.f504 = new String[i];
        enumC0198.f505 = new int[i];
        enumC0198.f506 = new int[i];
        enumC0198.f507 = new String[i];
        C0179 c0179 = new C0179(str);
        int i3 = 0;
        while (!c0179.m623()) {
            String strM616 = c0179.m616('=');
            c0179.m605();
            int i4 = Integer.parseInt(c0179.m618(f492), 36);
            char cM622 = c0179.m622();
            c0179.m605();
            if (cM622 == ',') {
                i2 = Integer.parseInt(c0179.m616(';'), 36);
                c0179.m605();
            } else {
                i2 = -1;
            }
            int i5 = Integer.parseInt(c0179.m616('&'), 36);
            c0179.m605();
            enumC0198.f504[i3] = strM616;
            enumC0198.f505[i3] = i4;
            enumC0198.f506[i5] = i4;
            enumC0198.f507[i5] = strM616;
            if (i2 != -1) {
                f493.put(strM616, new String(new int[]{i4, i2}, 0, 2));
            }
            i3++;
        }
        C0034.m279(i3 == i, SOY.d("2F3C340E041219263412541415273F0254181C723418001E0E3B3405541B1533351310"));
    }
}
