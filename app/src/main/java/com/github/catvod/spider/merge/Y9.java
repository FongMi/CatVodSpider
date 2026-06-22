package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Y9 {
    private static final char[] l8 = {',', ';'};
    private static final HashMap<String, String> S = new HashMap<>();
    private static final g9.aA T4 = new g9.aA();

    public enum Y {
        xhtml(WI.l8, 4),
        base(WI.S, 106),
        extended(WI.T4, 2125);

        private String[] N;
        private String[] OL;
        private int[] l;
        private int[] tT;

        Y(String str, int i) {
            Y9.N(this, str, i);
        }

        int HM(String str) {
            int iBinarySearch = Arrays.binarySearch(this.OL, str);
            if (iBinarySearch >= 0) {
                return this.l[iBinarySearch];
            }
            return -1;
        }

        String n(int i) {
            int iBinarySearch = Arrays.binarySearch(this.tT, i);
            if (iBinarySearch < 0) {
                return "";
            }
            String[] strArr = this.N;
            if (iBinarySearch < strArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (this.tT[i2] == i) {
                    return strArr[i2];
                }
            }
            return strArr[iBinarySearch];
        }
    }

    static /* synthetic */ class aA {
        static final /* synthetic */ int[] l8;

        static {
            int[] iArr = new int[ut.values().length];
            l8 = iArr;
            try {
                iArr[ut.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                l8[ut.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum ut {
        ascii,
        utf,
        fallback;

        static ut l8(String str) {
            return str.equals("US-ASCII") ? ascii : str.startsWith("UTF-") ? utf : fallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Y y, String str, int i) {
        int i2;
        y.OL = new String[i];
        y.l = new int[i];
        y.tT = new int[i];
        y.N = new String[i];
        kJ kJVar = new kJ(str);
        int i3 = 0;
        while (!kJVar.Q()) {
            String strS = kJVar.s('=');
            kJVar.l8();
            int i4 = Integer.parseInt(kJVar.Kf(l8), 36);
            char cED = kJVar.eD();
            kJVar.l8();
            if (cED == ',') {
                i2 = Integer.parseInt(kJVar.s(';'), 36);
                kJVar.l8();
            } else {
                i2 = -1;
            }
            int i5 = Integer.parseInt(kJVar.s('&'), 36);
            kJVar.l8();
            y.OL[i3] = strS;
            y.l[i3] = i4;
            y.tT[i5] = i4;
            y.N[i5] = strS;
            if (i2 != -1) {
                S.put(strS, new String(new int[]{i4, i2}, 0, 2));
            }
            i3++;
        }
        Rc.b(i3 == i, "Unexpected count of entities loaded");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void OL(java.lang.Appendable r15, java.lang.String r16, com.github.catvod.spider.merge.g9.aA r17, boolean r18, boolean r19, boolean r20) {
        /*
            r0 = r15
            com.github.catvod.spider.merge.Y9$Y r1 = r17.OL()
            java.nio.charset.CharsetEncoder r2 = r17.b()
            r3 = r17
            com.github.catvod.spider.merge.Y9$ut r4 = r3.b
            int r5 = r16.length()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L15:
            if (r7 >= r5) goto Lc4
            r10 = r16
            int r11 = r10.codePointAt(r7)
            r12 = 1
            if (r19 == 0) goto L38
            boolean r13 = com.github.catvod.spider.merge.tv.HM(r11)
            if (r13 == 0) goto L36
            if (r20 == 0) goto L2a
            if (r8 == 0) goto Lbd
        L2a:
            if (r9 == 0) goto L2e
            goto Lbd
        L2e:
            r9 = 32
            r15.append(r9)
            r9 = 1
            goto Lbd
        L36:
            r8 = 1
            r9 = 0
        L38:
            r12 = 65536(0x10000, float:9.1835E-41)
            if (r11 >= r12) goto La7
            char r12 = (char) r11
            r13 = 34
            if (r12 == r13) goto L9b
            r13 = 38
            if (r12 == r13) goto L95
            r13 = 60
            if (r12 == r13) goto L7c
            r13 = 62
            if (r12 == r13) goto L70
            r13 = 160(0xa0, float:2.24E-43)
            if (r12 == r13) goto L60
            boolean r13 = T4(r4, r12, r2)
            if (r13 == 0) goto L5c
            r15.append(r12)
            goto Lbd
        L5c:
            S(r15, r1, r11)
            goto Lbd
        L60:
            com.github.catvod.spider.merge.Y9$Y r12 = com.github.catvod.spider.merge.Y9.Y.xhtml
            if (r1 == r12) goto L6a
            java.lang.String r12 = "&nbsp;"
            r15.append(r12)
            goto Lbd
        L6a:
            java.lang.String r12 = "&#xa0;"
            r15.append(r12)
            goto Lbd
        L70:
            if (r18 != 0) goto L78
            java.lang.String r12 = "&gt;"
            r15.append(r12)
            goto Lbd
        L78:
            r15.append(r12)
            goto Lbd
        L7c:
            if (r18 == 0) goto L8f
            com.github.catvod.spider.merge.Y9$Y r13 = com.github.catvod.spider.merge.Y9.Y.xhtml
            if (r1 == r13) goto L8f
            com.github.catvod.spider.merge.g9$aA$aA r13 = r17.n()
            com.github.catvod.spider.merge.g9$aA$aA r14 = com.github.catvod.spider.merge.g9.aA.EnumC0001aA.xml
            if (r13 != r14) goto L8b
            goto L8f
        L8b:
            r15.append(r12)
            goto Lbd
        L8f:
            java.lang.String r12 = "&lt;"
            r15.append(r12)
            goto Lbd
        L95:
            java.lang.String r12 = "&amp;"
            r15.append(r12)
            goto Lbd
        L9b:
            if (r18 == 0) goto La3
            java.lang.String r12 = "&quot;"
            r15.append(r12)
            goto Lbd
        La3:
            r15.append(r12)
            goto Lbd
        La7:
            java.lang.String r12 = new java.lang.String
            char[] r13 = java.lang.Character.toChars(r11)
            r12.<init>(r13)
            boolean r13 = r2.canEncode(r12)
            if (r13 == 0) goto Lba
            r15.append(r12)
            goto Lbd
        Lba:
            S(r15, r1, r11)
        Lbd:
            int r11 = java.lang.Character.charCount(r11)
            int r7 = r7 + r11
            goto L15
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Y9.OL(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.g9$aA, boolean, boolean, boolean):void");
    }

    private static void S(Appendable appendable, Y y, int i) throws IOException {
        String strN = y.n(i);
        if ("".equals(strN)) {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        } else {
            appendable.append('&').append(strN).append(';');
        }
    }

    private static boolean T4(ut utVar, char c, CharsetEncoder charsetEncoder) {
        int i = aA.l8[utVar.ordinal()];
        if (i == 1) {
            return c < 128;
        }
        if (i != 2) {
            return charsetEncoder.canEncode(c);
        }
        return true;
    }

    public static int b(String str, int[] iArr) {
        String str2 = S.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iHM = Y.extended.HM(str);
        if (iHM == -1) {
            return 0;
        }
        iArr[0] = iHM;
        return 1;
    }

    public static boolean l(String str) {
        return Y.base.HM(str) != -1;
    }

    public static boolean tT(String str) {
        return Y.extended.HM(str) != -1;
    }
}
