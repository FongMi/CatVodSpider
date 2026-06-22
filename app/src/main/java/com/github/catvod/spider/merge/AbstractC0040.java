package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0040 {

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$Ϳ, reason: contains not printable characters */
    public static final class C0041 extends AbstractC0040 {
        public String toString() {
            return SOY.d("50");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$Ԩ, reason: contains not printable characters */
    public static final class C0042 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f239;

        public C0042(String str) {
            this.f239 = str;
        }

        public String toString() {
            return String.format(SOY.d("2177222B"), this.f239);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m685(this.f239);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$Ԫ, reason: contains not printable characters */
    public static abstract class AbstractC0043 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        String f240;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        String f241;

        public AbstractC0043(String str, String str2) {
            this(str, str2, true);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public AbstractC0043(java.lang.String r3, java.lang.String r4, boolean r5) {
            /*
                r2 = this;
                r2.<init>()
                com.github.catvod.spider.merge.C0034.m282(r3)
                com.github.catvod.spider.merge.C0034.m282(r4)
                java.lang.String r3 = com.github.catvod.spider.merge.C0256.m917(r3)
                r2.f240 = r3
                java.lang.String r3 = "5D"
                java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
                boolean r0 = r4.startsWith(r3)
                r1 = 1
                if (r0 == 0) goto L22
                boolean r3 = r4.endsWith(r3)
                if (r3 != 0) goto L34
            L22:
                java.lang.String r3 = "58"
                java.lang.String r3 = com.github.catvod.spider.merge.SOY.d(r3)
                boolean r0 = r4.startsWith(r3)
                if (r0 == 0) goto L36
                boolean r3 = r4.endsWith(r3)
                if (r3 == 0) goto L36
            L34:
                r3 = 1
                goto L37
            L36:
                r3 = 0
            L37:
                if (r3 == 0) goto L42
                int r0 = r4.length()
                int r0 = r0 - r1
                java.lang.String r4 = r4.substring(r1, r0)
            L42:
                if (r5 == 0) goto L49
                java.lang.String r3 = com.github.catvod.spider.merge.C0256.m917(r4)
                goto L4d
            L49:
                java.lang.String r3 = com.github.catvod.spider.merge.C0256.m918(r4, r3)
            L4d:
                r2.f241 = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AbstractC0040.AbstractC0043.<init>(java.lang.String, java.lang.String, boolean):void");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$Ԭ, reason: contains not printable characters */
    public static final class C0044 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f242;

        public C0044(String str) {
            C0034.m282(str);
            this.f242 = C0256.m916(str);
        }

        public String toString() {
            return String.format(SOY.d("210C740529"), this.f242);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            Iterator<C0436> it = c00112.mo164().m1750().iterator();
            while (it.hasNext()) {
                if (C0256.m916(it.next().getKey()).startsWith(this.f242)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$Ԯ, reason: contains not printable characters */
    public static final class C0045 extends AbstractC0043 {
        public C0045(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format(SOY.d("2177224B510427"), this.f240, this.f241);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m685(this.f240) && this.f241.equalsIgnoreCase(c00112.mo117(this.f240).trim());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$֏, reason: contains not printable characters */
    public static final class C0046 extends AbstractC0043 {
        public C0046(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format(SOY.d("2177225C4952090F"), this.f240, this.f241);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m685(this.f240) && C0256.m916(c00112.mo117(this.f240)).contains(this.f241);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ؠ, reason: contains not printable characters */
    public static final class C0047 extends AbstractC0043 {
        public C0047(String str, String str2) {
            super(str, str2, false);
        }

        public String toString() {
            return String.format(SOY.d("217722524952090F"), this.f240, this.f241);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m685(this.f240) && C0256.m916(c00112.mo117(this.f240)).endsWith(this.f241);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ހ, reason: contains not printable characters */
    public static final class C0048 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        String f243;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        Pattern f244;

        public C0048(String str, Pattern pattern) {
            this.f243 = C0256.m917(str);
            this.f244 = pattern;
        }

        public String toString() {
            return String.format(SOY.d("217722084952090F"), this.f243, this.f244.toString());
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m685(this.f243) && this.f244.matcher(c00112.mo117(this.f243)).find();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ށ, reason: contains not printable characters */
    public static final class C0049 extends AbstractC0043 {
        public C0049(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format(SOY.d("217722574952090F"), this.f240, this.f241);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return !this.f241.equalsIgnoreCase(c00112.mo117(this.f240));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ނ, reason: contains not printable characters */
    public static final class C0050 extends AbstractC0043 {
        public C0050(String str, String str2) {
            super(str, str2, false);
        }

        public String toString() {
            return String.format(SOY.d("217722284952090F"), this.f240, this.f241);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m685(this.f240) && C0256.m916(c00112.mo117(this.f240)).startsWith(this.f241);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ރ, reason: contains not printable characters */
    public static final class C0051 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f245;

        public C0051(String str) {
            this.f245 = str;
        }

        public String toString() {
            return String.format(SOY.d("547722"), this.f245);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m187(this.f245);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ބ, reason: contains not printable characters */
    public static final class C0052 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f246;

        public C0052(String str) {
            this.f246 = C0256.m916(str);
        }

        public String toString() {
            return String.format(SOY.d("40313E180016133C223215031B7A74055D"), this.f246);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return C0256.m916(c00112.m181()).contains(this.f246);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޅ, reason: contains not printable characters */
    public static final class C0053 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f247;

        public C0053(String str) {
            this.f247 = C0256.m916(str);
        }

        public String toString() {
            return String.format(SOY.d("40313E180016133C223903195277225F"), this.f247);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return C0256.m916(c00112.m194()).contains(this.f247);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ކ, reason: contains not printable characters */
    public static final class C0054 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f248;

        public C0054(String str) {
            this.f248 = C0256.m916(str);
        }

        public String toString() {
            return String.format(SOY.d("40313E180016133C225E510453"), this.f248);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return C0256.m916(c00112.m204()).contains(this.f248);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$އ, reason: contains not printable characters */
    public static abstract class AbstractC0055 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        protected final int f249;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        protected final int f250;

        public AbstractC0055(int i, int i2) {
            this.f249 = i;
            this.f250 = i2;
        }

        public String toString() {
            return this.f249 == 0 ? String.format(SOY.d("4077225E511353"), mo321(), Integer.valueOf(this.f250)) : this.f250 == 0 ? String.format(SOY.d("4077225E5113147B"), mo321(), Integer.valueOf(this.f249)) : String.format(SOY.d("4077225E511314777A125D"), mo321(), Integer.valueOf(this.f249), Integer.valueOf(this.f250));
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            C0011 c0011Mo170 = c00112.mo170();
            if (c0011Mo170 == null || (c0011Mo170 instanceof C0035)) {
                return false;
            }
            int iMo320 = mo320(c0011, c00112);
            int i = this.f249;
            if (i == 0) {
                return iMo320 == this.f250;
            }
            int i2 = this.f250;
            return (iMo320 - i2) * i >= 0 && (iMo320 - i2) % i == 0;
        }

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        protected abstract int mo320(C0011 c0011, C0011 c00112);

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        protected abstract String mo321();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ވ, reason: contains not printable characters */
    public static final class C0056 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f251;

        public C0056(String str) {
            this.f251 = str;
        }

        public String toString() {
            return String.format(SOY.d("597722"), this.f251);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return this.f251.equals(c00112.m190());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$މ, reason: contains not printable characters */
    public static final class C0057 extends AbstractC0058 {
        public C0057(int i) {
            super(i);
        }

        public String toString() {
            return String.format(SOY.d("4037205E511353"), Integer.valueOf(this.f252));
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m183() == this.f252;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ފ, reason: contains not printable characters */
    public static abstract class AbstractC0058 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        int f252;

        public AbstractC0058(int i) {
            this.f252 = i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ދ, reason: contains not printable characters */
    public static final class C0059 extends AbstractC0058 {
        public C0059(int i) {
            super(i);
        }

        public String toString() {
            return String.format(SOY.d("4035255E511353"), Integer.valueOf(this.f252));
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m183() > this.f252;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ތ, reason: contains not printable characters */
    public static final class C0060 extends AbstractC0058 {
        public C0060(int i) {
            super(i);
        }

        public String toString() {
            return String.format(SOY.d("403E255E511353"), Integer.valueOf(this.f252));
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c0011 != c00112 && c00112.m183() < this.f252;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ލ, reason: contains not printable characters */
    public static final class C0061 extends AbstractC0040 {
        public String toString() {
            return SOY.d("40373C06000E");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            for (AbstractC0191 abstractC0191 : c00112.m684()) {
                if (!(abstractC0191 instanceof C0003) && !(abstractC0191 instanceof C0172)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ގ, reason: contains not printable characters */
    public static final class C0062 extends AbstractC0040 {
        public String toString() {
            return SOY.d("4034380407035731391F1813");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            C0011 c0011Mo170 = c00112.mo170();
            return (c0011Mo170 == null || (c0011Mo170 instanceof C0035) || c00112.m183() != 0) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޏ, reason: contains not printable characters */
    public static final class C0063 extends C0069 {
        public C0063() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        public String toString() {
            return SOY.d("403438040703573D375B000E0A37");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ސ, reason: contains not printable characters */
    public static final class C0064 extends AbstractC0040 {
        public String toString() {
            return SOY.d("403E3005005A193A381A10");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            C0011 c0011Mo170 = c00112.mo170();
            return (c0011Mo170 == null || (c0011Mo170 instanceof C0035) || c00112.m183() != c0011Mo170.m179().size() - 1) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޑ, reason: contains not printable characters */
    public static final class C0065 extends C0068 {
        public C0065() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        public String toString() {
            return SOY.d("403E3005005A15347C020D071F");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޒ, reason: contains not printable characters */
    public static final class C0066 extends AbstractC0055 {
        public C0066(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        /* JADX INFO: renamed from: Ԩ */
        protected int mo320(C0011 c0011, C0011 c00112) {
            return c00112.m183() + 1;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        /* JADX INFO: renamed from: ԩ */
        protected String mo321() {
            return SOY.d("1426395B171F133E35");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޓ, reason: contains not printable characters */
    public static final class C0067 extends AbstractC0055 {
        public C0067(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        /* JADX INFO: renamed from: Ԩ */
        protected int mo320(C0011 c0011, C0011 c00112) {
            if (c00112.mo170() == null) {
                return 0;
            }
            return c00112.mo170().m179().size() - c00112.m183();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        /* JADX INFO: renamed from: ԩ */
        protected String mo321() {
            return SOY.d("1426395B181609267C151C1E1636");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޔ, reason: contains not printable characters */
    public static class C0068 extends AbstractC0055 {
        public C0068(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        /* JADX INFO: renamed from: Ԩ */
        protected int mo320(C0011 c0011, C0011 c00112) {
            int i = 0;
            if (c00112.mo170() == null) {
                return 0;
            }
            C0455 c0455M179 = c00112.mo170().m179();
            for (int iM183 = c00112.m183(); iM183 < c0455M179.size(); iM183++) {
                if (c0455M179.get(iM183).m202().equals(c00112.m202())) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        /* JADX INFO: renamed from: ԩ */
        protected String mo321() {
            return SOY.d("1426395B181609267C19125A0E2B2113");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޕ, reason: contains not printable characters */
    public static class C0069 extends AbstractC0055 {
        public C0069(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        /* JADX INFO: renamed from: Ԩ */
        protected int mo320(C0011 c0011, C0011 c00112) {
            int i = 0;
            if (c00112.mo170() == null) {
                return 0;
            }
            for (C0011 c00113 : c00112.mo170().m179()) {
                if (c00113.m202().equals(c00112.m202())) {
                    i++;
                }
                if (c00113 == c00112) {
                    break;
                }
            }
            return i;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040.AbstractC0055
        /* JADX INFO: renamed from: ԩ */
        protected String mo321() {
            return SOY.d("1426395B1B115726280611");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޖ, reason: contains not printable characters */
    public static final class C0070 extends AbstractC0040 {
        public String toString() {
            return SOY.d("403D3F1A0D5A193A381A10");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            C0011 c0011Mo170 = c00112.mo170();
            return (c0011Mo170 == null || (c0011Mo170 instanceof C0035) || !c00112.m201().isEmpty()) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޗ, reason: contains not printable characters */
    public static final class C0071 extends AbstractC0040 {
        public String toString() {
            return SOY.d("403D3F1A0D5A15347C020D071F");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            C0011 c0011Mo170 = c00112.mo170();
            if (c0011Mo170 == null || (c0011Mo170 instanceof C0035)) {
                return false;
            }
            Iterator<C0011> it = c0011Mo170.m179().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().m202().equals(c00112.m202())) {
                    i++;
                }
            }
            return i == 1;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޘ, reason: contains not printable characters */
    public static final class C0072 extends AbstractC0040 {
        public String toString() {
            return SOY.d("40203E1900");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            if (c0011 instanceof C0035) {
                c0011 = c0011.m177(0);
            }
            return c00112 == c0011;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޙ, reason: contains not printable characters */
    public static final class C0073 extends AbstractC0040 {
        public String toString() {
            return SOY.d("403F3002171F2E372902");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            if (c00112 instanceof C0015) {
                return true;
            }
            for (C0016 c0016 : c00112.m206()) {
                C0015 c0015 = new C0015(C0039.m306(c00112.m203()), c00112.mo118(), c00112.mo164());
                c0016.m697(c0015);
                c0015.m172(c0016);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޚ, reason: contains not printable characters */
    public static final class C0074 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final Pattern f253;

        public C0074(Pattern pattern) {
            this.f253 = pattern;
        }

        public String toString() {
            return String.format(SOY.d("403F3002171F1F217953075E"), this.f253);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return this.f253.matcher(c00112.m204()).find();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޛ, reason: contains not printable characters */
    public static final class C0075 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final Pattern f254;

        public C0075(Pattern pattern) {
            this.f254 = pattern;
        }

        public String toString() {
            return String.format(SOY.d("403F3002171F1F211E011A5F5F2178"), this.f254);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return this.f254.matcher(c00112.m194()).find();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޜ, reason: contains not printable characters */
    public static final class C0076 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f255;

        public C0076(String str) {
            this.f255 = str;
        }

        public String toString() {
            return String.format(SOY.d("5F21"), this.f255);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m193().equals(this.f255);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ȋ$ޝ, reason: contains not printable characters */
    public static final class C0077 extends AbstractC0040 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final String f256;

        public C0077(String str) {
            this.f256 = str;
        }

        public String toString() {
            return String.format(SOY.d("5F21"), this.f256);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c00112.m193().endsWith(this.f256);
        }
    }

    protected AbstractC0040() {
    }

    /* JADX INFO: renamed from: Ϳ */
    public abstract boolean mo132(C0011 c0011, C0011 c00112);
}
