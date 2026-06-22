package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC0021 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    EnumC0031 f174;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ$Ԩ, reason: contains not printable characters */
    static final class C0023 extends C0024 {
        C0023(String str) {
            m243(str);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0021.C0024
        public String toString() {
            return SOY.d("46730A3530362E130A") + m244() + SOY.d("270F6F");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ$Ԫ, reason: contains not printable characters */
    static class C0024 extends AbstractC0021 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private String f175;

        C0024() {
            super();
            this.f174 = EnumC0031.f197;
        }

        public String toString() {
            return m244();
        }

        @Override // com.github.catvod.spider.merge.AbstractC0021
        /* JADX INFO: renamed from: ށ */
        AbstractC0021 mo241() {
            this.f175 = null;
            return this;
        }

        /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
        C0024 m243(String str) {
            this.f175 = str;
            return this;
        }

        /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
        String m244() {
            return this.f175;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ$Ԭ, reason: contains not printable characters */
    static final class C0025 extends AbstractC0021 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final StringBuilder f176;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private String f177;

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        boolean f178;

        C0025() {
            super();
            this.f176 = new StringBuilder();
            this.f178 = false;
            this.f174 = EnumC0031.f196;
        }

        /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
        private void m245() {
            String str = this.f177;
            if (str != null) {
                this.f176.append(str);
                this.f177 = null;
            }
        }

        public String toString() {
            return SOY.d("46737C5B") + m248() + SOY.d("577F6F");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0021
        /* JADX INFO: renamed from: ށ */
        AbstractC0021 mo241() {
            AbstractC0021.m228(this.f176);
            this.f177 = null;
            this.f178 = false;
            return this;
        }

        /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
        final C0025 m246(char c) {
            m245();
            this.f176.append(c);
            return this;
        }

        /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
        final C0025 m247(String str) {
            m245();
            if (this.f176.length() == 0) {
                this.f177 = str;
            } else {
                this.f176.append(str);
            }
            return this;
        }

        /* JADX INFO: renamed from: އ, reason: contains not printable characters */
        String m248() {
            String str = this.f177;
            return str != null ? str : this.f176.toString();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ$Ԯ, reason: contains not printable characters */
    static final class C0026 extends AbstractC0021 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        final StringBuilder f179;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        String f180;

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        final StringBuilder f181;

        /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
        final StringBuilder f182;

        /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
        boolean f183;

        C0026() {
            super();
            this.f179 = new StringBuilder();
            this.f180 = null;
            this.f181 = new StringBuilder();
            this.f182 = new StringBuilder();
            this.f183 = false;
            this.f174 = EnumC0031.f193;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0021
        /* JADX INFO: renamed from: ށ */
        AbstractC0021 mo241() {
            AbstractC0021.m228(this.f179);
            this.f180 = null;
            AbstractC0021.m228(this.f181);
            AbstractC0021.m228(this.f182);
            this.f183 = false;
            return this;
        }

        /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
        String m249() {
            return this.f179.toString();
        }

        /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
        String m250() {
            return this.f180;
        }

        /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
        String m251() {
            return this.f181.toString();
        }

        /* JADX INFO: renamed from: އ, reason: contains not printable characters */
        public String m252() {
            return this.f182.toString();
        }

        /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
        public boolean m253() {
            return this.f183;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ$֏, reason: contains not printable characters */
    static final class C0027 extends AbstractC0021 {
        C0027() {
            super();
            this.f174 = EnumC0031.f198;
        }

        public String toString() {
            return "";
        }

        @Override // com.github.catvod.spider.merge.AbstractC0021
        /* JADX INFO: renamed from: ށ */
        AbstractC0021 mo241() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ$ؠ, reason: contains not printable characters */
    static final class C0028 extends AbstractC0030 {
        C0028() {
            this.f174 = EnumC0031.f195;
        }

        public String toString() {
            return SOY.d("467D") + m273() + SOY.d("44");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ$ހ, reason: contains not printable characters */
    static final class C0029 extends AbstractC0030 {
        C0029() {
            this.f174 = EnumC0031.f194;
        }

        public String toString() {
            boolean zM266 = m266();
            String strD = SOY.d("44");
            String strD2 = SOY.d("46");
            if (!zM266 || this.f192.size() <= 0) {
                return strD2 + m273() + strD;
            }
            return strD2 + m273() + SOY.d("5A") + this.f192.toString() + strD;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.AbstractC0021.AbstractC0030, com.github.catvod.spider.merge.AbstractC0021
        /* JADX INFO: renamed from: ޔ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public AbstractC0030 mo241() {
            super.mo241();
            this.f192 = null;
            return this;
        }

        /* JADX INFO: renamed from: ޗ, reason: contains not printable characters */
        C0029 m255(String str, C0542 c0542) {
            this.f184 = str;
            this.f192 = c0542;
            this.f185 = C0256.m916(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ$ށ, reason: contains not printable characters */
    static abstract class AbstractC0030 extends AbstractC0021 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        protected String f184;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        protected String f185;

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        private String f186;

        /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
        private StringBuilder f187;

        /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
        private String f188;

        /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
        private boolean f189;

        /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
        private boolean f190;

        /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
        boolean f191;

        /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
        C0542 f192;

        AbstractC0030() {
            super();
            this.f187 = new StringBuilder();
            this.f189 = false;
            this.f190 = false;
            this.f191 = false;
        }

        /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
        private void m256() {
            this.f190 = true;
            String str = this.f188;
            if (str != null) {
                this.f187.append(str);
                this.f188 = null;
            }
        }

        /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
        final void m257(char c) {
            m258(String.valueOf(c));
        }

        /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
        final void m258(String str) {
            String str2 = this.f186;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f186 = str;
        }

        /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
        final void m259(char c) {
            m256();
            this.f187.append(c);
        }

        /* JADX INFO: renamed from: އ, reason: contains not printable characters */
        final void m260(String str) {
            m256();
            if (this.f187.length() == 0) {
                this.f188 = str;
            } else {
                this.f187.append(str);
            }
        }

        /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
        final void m261(int[] iArr) {
            m256();
            for (int i : iArr) {
                this.f187.appendCodePoint(i);
            }
        }

        /* JADX INFO: renamed from: މ, reason: contains not printable characters */
        final void m262(char c) {
            m263(String.valueOf(c));
        }

        /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
        final void m263(String str) {
            String str2 = this.f184;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f184 = str;
            this.f185 = C0256.m916(str);
        }

        /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
        final void m264() {
            if (this.f186 != null) {
                m270();
            }
        }

        /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
        final boolean m265(String str) {
            C0542 c0542 = this.f192;
            return c0542 != null && c0542.m1755(str);
        }

        /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
        final boolean m266() {
            return this.f192 != null;
        }

        /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
        final boolean m267() {
            return this.f191;
        }

        /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
        final String m268() {
            String str = this.f184;
            C0034.m277(str == null || str.length() == 0);
            return this.f184;
        }

        /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
        final AbstractC0030 m269(String str) {
            this.f184 = str;
            this.f185 = C0256.m916(str);
            return this;
        }

        /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
        final void m270() {
            if (this.f192 == null) {
                this.f192 = new C0542();
            }
            String str = this.f186;
            if (str != null) {
                String strTrim = str.trim();
                this.f186 = strTrim;
                if (strTrim.length() > 0) {
                    this.f192.m1748(this.f186, this.f190 ? this.f187.length() > 0 ? this.f187.toString() : this.f188 : this.f189 ? "" : null);
                }
            }
            this.f186 = null;
            this.f189 = false;
            this.f190 = false;
            AbstractC0021.m228(this.f187);
            this.f188 = null;
        }

        /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
        final String m271() {
            return this.f185;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.AbstractC0021
        /* JADX INFO: renamed from: ޔ */
        public AbstractC0030 mo241() {
            this.f184 = null;
            this.f185 = null;
            this.f186 = null;
            AbstractC0021.m228(this.f187);
            this.f188 = null;
            this.f189 = false;
            this.f190 = false;
            this.f191 = false;
            this.f192 = null;
            return this;
        }

        /* JADX INFO: renamed from: ޕ, reason: contains not printable characters */
        final void m272() {
            this.f189 = true;
        }

        /* JADX INFO: renamed from: ޖ, reason: contains not printable characters */
        final String m273() {
            String str = this.f184;
            return str != null ? str : SOY.d("21273F05110327");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ſ$ނ, reason: contains not printable characters */
    public enum EnumC0031 {
        f193,
        f194,
        f195,
        f196,
        f197,
        f198
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    static void m228(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    final C0024 m229() {
        return (C0024) this;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    final C0025 m230() {
        return (C0025) this;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    final C0026 m231() {
        return (C0026) this;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    final C0028 m232() {
        return (C0028) this;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    final C0029 m233() {
        return (C0029) this;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    final boolean m234() {
        return this instanceof C0023;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    final boolean m235() {
        return this.f174 == EnumC0031.f197;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    final boolean m236() {
        return this.f174 == EnumC0031.f196;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    final boolean m237() {
        return this.f174 == EnumC0031.f193;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    final boolean m238() {
        return this.f174 == EnumC0031.f198;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    final boolean m239() {
        return this.f174 == EnumC0031.f195;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    final boolean m240() {
        return this.f174 == EnumC0031.f194;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    abstract AbstractC0021 mo241();

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    String m242() {
        return getClass().getSimpleName();
    }

    private AbstractC0021() {
    }
}
