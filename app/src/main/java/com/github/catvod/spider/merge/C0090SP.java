package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0082OO;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.github.catvod.spider.merge.SP */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0090SP {

    /* renamed from: q */
    private static final char[] f528q = {',', ';'};

    /* renamed from: xC */
    private static final HashMap<String, String> f529xC = new HashMap<>();

    /* renamed from: QU */
    private static final C0082OO.p f527QU = new C0082OO.p();

    /* renamed from: com.github.catvod.spider.merge.SP$J */
    public enum J {
        xhtml(C0159y5.f769q, 4),
        base(C0159y5.f770xC, 106),
        extended(C0159y5.f768QU, 2125);


        /* renamed from: MH */
        private String[] f534MH;

        /* renamed from: Mo */
        private int[] f535Mo;

        /* renamed from: i */
        private int[] f536i;

        /* renamed from: u */
        private String[] f537u;

        J(String str, int i) throws IOException, NumberFormatException {
            C0090SP.m418MH(this, str, i);
        }

        /* renamed from: W */
        String m435W(int i) {
            int iBinarySearch = Arrays.binarySearch(this.f536i, i);
            if (iBinarySearch < 0) {
                return "";
            }
            String[] strArr = this.f534MH;
            if (iBinarySearch < strArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (this.f536i[i2] == i) {
                    return strArr[i2];
                }
            }
            return strArr[iBinarySearch];
        }

        /* renamed from: se */
        int m436se(String str) {
            int iBinarySearch = Arrays.binarySearch(this.f537u, str);
            if (iBinarySearch >= 0) {
                return this.f535Mo[iBinarySearch];
            }
            return -1;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.SP$Qe */
    enum Qe {
        ascii,
        utf,
        fallback;

        /* renamed from: q */
        static Qe m437q(String str) {
            return str.equals("US-ASCII") ? ascii : str.startsWith("UTF-") ? utf : fallback;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.SP$p */
    static /* synthetic */ class p {

        /* renamed from: q */
        static final /* synthetic */ int[] f542q;

        static {
            int[] iArr = new int[Qe.values().length];
            f542q = iArr;
            try {
                iArr[Qe.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f542q[Qe.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MH */
    public static void m418MH(J j, String str, int i) throws IOException, NumberFormatException {
        int i2;
        j.f537u = new String[i];
        j.f535Mo = new int[i];
        j.f536i = new int[i];
        j.f534MH = new String[i];
        C0060Eo c0060Eo = new C0060Eo(str);
        int i3 = 0;
        while (!c0060Eo.m186p()) {
            String strM163F = c0060Eo.m163F('=');
            c0060Eo.m188q();
            int i4 = Integer.parseInt(c0060Eo.m167KT(f528q), 36);
            char cM162E = c0060Eo.m162E();
            c0060Eo.m188q();
            if (cM162E == ',') {
                i2 = Integer.parseInt(c0060Eo.m163F(';'), 36);
                c0060Eo.m188q();
            } else {
                i2 = -1;
            }
            int i5 = Integer.parseInt(c0060Eo.m163F('&'), 36);
            c0060Eo.m188q();
            j.f537u[i3] = strM163F;
            j.f535Mo[i3] = i4;
            j.f536i[i5] = i4;
            j.f534MH[i5] = strM163F;
            if (i2 != -1) {
                f529xC.put(strM163F, new String(new int[]{i4, i2}, 0, 2));
            }
            i3++;
        }
        C0111bw.m555UJ(i3 == i, "Unexpected count of entities loaded");
    }

    /* renamed from: Mo */
    public static boolean m419Mo(String str) {
        return J.base.m436se(str) != -1;
    }

    /* renamed from: QU */
    private static boolean m420QU(Qe qe, char c, CharsetEncoder charsetEncoder) {
        int i = p.f542q[qe.ordinal()];
        if (i == 1) {
            return c < 128;
        }
        if (i != 2) {
            return charsetEncoder.canEncode(c);
        }
        return true;
    }

    /* renamed from: UJ */
    public static int m421UJ(String str, int[] iArr) {
        String str2 = f529xC.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iM436se = J.extended.m436se(str);
        if (iM436se == -1) {
            return 0;
        }
        iArr[0] = iM436se;
        return 1;
    }

    /* renamed from: i */
    public static boolean m422i(String str) {
        return J.extended.m436se(str) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m424u(java.lang.Appendable r15, java.lang.String r16, com.github.catvod.spider.merge.C0082OO.p r17, boolean r18, boolean r19, boolean r20) throws java.io.IOException {
        /*
            r0 = r15
            com.github.catvod.spider.merge.SP$J r1 = r17.m329u()
            java.nio.charset.CharsetEncoder r2 = r17.m324UJ()
            r3 = r17
            com.github.catvod.spider.merge.SP$Qe r4 = r3.f490UJ
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
            boolean r13 = com.github.catvod.spider.merge.C0157x3.m776se(r11)
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
            r12 = 65536(0x10000, float:9.18355E-41)
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
            boolean r13 = m420QU(r4, r12, r2)
            if (r13 == 0) goto L5c
            r15.append(r12)
            goto Lbd
        L5c:
            m425xC(r15, r1, r11)
            goto Lbd
        L60:
            com.github.catvod.spider.merge.SP$J r12 = com.github.catvod.spider.merge.C0090SP.J.xhtml
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
            com.github.catvod.spider.merge.SP$J r13 = com.github.catvod.spider.merge.C0090SP.J.xhtml
            if (r1 == r13) goto L8f
            com.github.catvod.spider.merge.OO$p$p r13 = r17.m325W()
            com.github.catvod.spider.merge.OO$p$p r14 = com.github.catvod.spider.merge.C0082OO.p.EnumC0167p.xml
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
            m425xC(r15, r1, r11)
        Lbd:
            int r11 = java.lang.Character.charCount(r11)
            int r7 = r7 + r11
            goto L15
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0090SP.m424u(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.OO$p, boolean, boolean, boolean):void");
    }

    /* renamed from: xC */
    private static void m425xC(Appendable appendable, J j, int i) throws IOException {
        String strM435W = j.m435W(i);
        if ("".equals(strM435W)) {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        } else {
            appendable.append('&').append(strM435W).append(';');
        }
    }
}
