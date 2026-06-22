package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ɿ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC0089 extends AbstractC0040 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    AbstractC0040 f265;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ɿ$Ϳ, reason: contains not printable characters */
    static class C0090 extends AbstractC0089 {
        public C0090(AbstractC0040 abstractC0040) {
            this.f265 = abstractC0040;
        }

        public String toString() {
            return String.format(SOY.d("403A30055C52097B"), this.f265);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            for (C0011 c00113 : c00112.m185()) {
                if (c00113 != c00112 && this.f265.mo132(c00112, c00113)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ɿ$Ԩ, reason: contains not printable characters */
    static class C0091 extends AbstractC0089 {
        public C0091(AbstractC0040 abstractC0040) {
            this.f265 = abstractC0040;
        }

        public String toString() {
            return String.format(SOY.d("5F21714854"), this.f265);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            C0011 c0011Mo170;
            return (c0011 == c00112 || (c0011Mo170 = c00112.mo170()) == null || !this.f265.mo132(c0011, c0011Mo170)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ɿ$Ԫ, reason: contains not printable characters */
    static class C0092 extends AbstractC0089 {
        public C0092(AbstractC0040 abstractC0040) {
            this.f265 = abstractC0040;
        }

        public String toString() {
            return String.format(SOY.d("5F21715D54"), this.f265);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            C0011 c0011M197;
            return (c0011 == c00112 || (c0011M197 = c00112.m197()) == null || !this.f265.mo132(c0011, c0011M197)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ɿ$Ԭ, reason: contains not printable characters */
    static class C0093 extends AbstractC0089 {
        public C0093(AbstractC0040 abstractC0040) {
            this.f265 = abstractC0040;
        }

        public String toString() {
            return String.format(SOY.d("403C3E025C52097B"), this.f265);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return !this.f265.mo132(c0011, c00112);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ɿ$Ԯ, reason: contains not printable characters */
    static class C0094 extends AbstractC0089 {
        public C0094(AbstractC0040 abstractC0040) {
            this.f265 = abstractC0040;
        }

        public String toString() {
            return String.format(SOY.d("5F2171"), this.f265);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            if (c0011 == c00112) {
                return false;
            }
            for (C0011 c0011Mo170 = c00112.mo170(); c0011Mo170 != null; c0011Mo170 = c0011Mo170.mo170()) {
                if (this.f265.mo132(c0011, c0011Mo170)) {
                    return true;
                }
                if (c0011Mo170 == c0011) {
                    break;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ɿ$֏, reason: contains not printable characters */
    static class C0095 extends AbstractC0089 {
        public C0095(AbstractC0040 abstractC0040) {
            this.f265 = abstractC0040;
        }

        public String toString() {
            return String.format(SOY.d("5F21710854"), this.f265);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            if (c0011 == c00112) {
                return false;
            }
            for (C0011 c0011M197 = c00112.m197(); c0011M197 != null; c0011M197 = c0011M197.m197()) {
                if (this.f265.mo132(c0011, c0011M197)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ɿ$ؠ, reason: contains not printable characters */
    static class C0096 extends AbstractC0040 {
        C0096() {
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            return c0011 == c00112;
        }
    }

    AbstractC0089() {
    }
}
