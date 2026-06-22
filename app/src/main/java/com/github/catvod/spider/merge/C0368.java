package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0225;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ߴ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0368 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final AbstractC0108 f909;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final AbstractC0108 f910;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static final AbstractC0108 f911;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    @Deprecated
    public static final AbstractC0108 f912;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static final AbstractC0108 f913;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static final AbstractC0108 f914;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static final AbstractC0108 f915;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static final AbstractC0108 f916;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static final AbstractC0108 f917;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static final AbstractC0108 f918;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static final AbstractC0108 f919;

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public static final AbstractC0108 f920;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public static final AbstractC0108 f921;

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public static final AbstractC0108 f922;

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public static final AbstractC0108 f923;

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public static final AbstractC0108 f924;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ߴ$Ϳ, reason: contains not printable characters */
    static class C0369 extends AbstractC0108 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private static final String f925 = String.valueOf('\"');

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private static final char[] f926 = {',', '\"', '\r', '\n'};

        C0369() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0108
        /* JADX INFO: renamed from: Ԩ */
        public int mo363(CharSequence charSequence, int i, Writer writer) throws IOException {
            if (i != 0) {
                throw new IllegalStateException(SOY.d("3921273307141B2234045404123D241A1057143727130657083730151C570E3A34562F4627723818101202"));
            }
            if (C0131.m434(charSequence.toString(), f926)) {
                writer.write(charSequence.toString());
            } else {
                writer.write(34);
                String string = charSequence.toString();
                String str = f925;
                writer.write(C0131.m449(string, str, str + str));
                writer.write(34);
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ߴ$Ԩ, reason: contains not printable characters */
    static class C0370 extends AbstractC0108 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private static final String f927 = String.valueOf('\"');

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private static final char[] f928 = {',', '\"', '\r', '\n'};

        C0370() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0108
        /* JADX INFO: renamed from: Ԩ */
        public int mo363(CharSequence charSequence, int i, Writer writer) throws IOException {
            if (i != 0) {
                throw new IllegalStateException(SOY.d("392127231A120931300611055A213919011B1E723F1302120872231315141272251E115721630C561D191E3729"));
            }
            if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
                writer.write(charSequence.toString());
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            String string = charSequence.subSequence(1, charSequence.length() - 1).toString();
            if (C0131.m433(string, f928)) {
                StringBuilder sb = new StringBuilder();
                String str = f927;
                sb.append(str);
                sb.append(str);
                writer.write(C0131.m449(string, sb.toString(), str));
            } else {
                writer.write(charSequence.toString());
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    static {
        String strD = SOY.d("58");
        String strD2 = SOY.d("2670");
        String strD3 = SOY.d("26");
        String strD4 = SOY.d("260E");
        f909 = new C0586(new String[]{strD, strD2}, new String[]{strD3, strD4}).m388(new C0586(C0102.m372())).m388(C0107.m383(32, 127));
        String strD5 = SOY.d("5D");
        String strD6 = SOY.d("2675");
        String strD7 = SOY.d("55");
        String strD8 = SOY.d("267D");
        f910 = new C0101(new C0586(new String[]{strD5, strD6}, new String[]{strD, strD2}, new String[]{strD3, strD4}, new String[]{strD7, strD8}), new C0586(C0102.m372()), C0107.m383(32, 127));
        f911 = new C0101(new C0586(new String[]{strD, strD2}, new String[]{strD3, strD4}, new String[]{strD7, strD8}), new C0586(C0102.m372()), C0107.m383(32, 127));
        f912 = new C0101(new C0586(C0102.m366()), new C0586(C0102.m364()));
        String strD9 = SOY.d("7A");
        f913 = new C0101(new C0586(C0102.m366()), new C0586(C0102.m364()), new C0586(new String[]{strD9, ""}, new String[]{SOY.d("7B"), ""}, new String[]{SOY.d("78"), ""}, new String[]{SOY.d("79"), ""}, new String[]{SOY.d("7E"), ""}, new String[]{SOY.d("7F"), ""}, new String[]{SOY.d("7C"), ""}, new String[]{SOY.d("7D"), ""}, new String[]{SOY.d("72"), ""}, new String[]{SOY.d("71"), ""}, new String[]{SOY.d("76"), ""}, new String[]{SOY.d("74"), ""}, new String[]{SOY.d("75"), ""}, new String[]{SOY.d("6A"), ""}, new String[]{SOY.d("6B"), ""}, new String[]{SOY.d("68"), ""}, new String[]{SOY.d("69"), ""}, new String[]{SOY.d("6E"), ""}, new String[]{SOY.d("6F"), ""}, new String[]{SOY.d("6C"), ""}, new String[]{SOY.d("6D"), ""}, new String[]{SOY.d("62"), ""}, new String[]{SOY.d("63"), ""}, new String[]{SOY.d("60"), ""}, new String[]{SOY.d("61"), ""}, new String[]{SOY.d("66"), ""}, new String[]{SOY.d("67"), ""}, new String[]{SOY.d("64"), ""}, new String[]{SOY.d("65"), ""}, new String[]{SOY.d("95EDEF"), ""}, new String[]{SOY.d("95EDEE"), ""}), C0255.m915(127, 132), C0255.m915(134, 159), new C0232());
        f914 = new C0101(new C0586(C0102.m366()), new C0586(C0102.m364()), new C0586(new String[]{strD9, ""}, new String[]{SOY.d("71"), SOY.d("5C7160474F")}, new String[]{SOY.d("76"), SOY.d("5C7160444F")}, new String[]{SOY.d("95EDEF"), ""}, new String[]{SOY.d("95EDEE"), ""}), C0255.m915(1, 8), C0255.m915(14, 31), C0255.m915(127, 132), C0255.m915(134, 159), new C0232());
        f915 = new C0101(new C0586(C0102.m366()), new C0586(C0102.m370()));
        f916 = new C0101(new C0586(C0102.m366()), new C0586(C0102.m370()), new C0586(C0102.m368()));
        f917 = new C0369();
        C0101 c0101 = new C0101(new C0109(), new C0237(), new C0586(C0102.m373()), new C0586(new String[]{strD4, strD3}, new String[]{strD2, strD}, new String[]{strD6, strD5}, new String[]{strD3, ""}));
        f918 = c0101;
        f919 = c0101;
        f920 = c0101;
        f921 = new C0101(new C0586(C0102.m367()), new C0586(C0102.m371()), new C0225(new C0225.EnumC0226[0]));
        f922 = new C0101(new C0586(C0102.m367()), new C0586(C0102.m371()), new C0586(C0102.m369()), new C0225(new C0225.EnumC0226[0]));
        f923 = new C0101(new C0586(C0102.m367()), new C0586(C0102.m365()), new C0225(new C0225.EnumC0226[0]));
        f924 = new C0370();
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final String m1440(String str) {
        return f911.m386(str);
    }
}
