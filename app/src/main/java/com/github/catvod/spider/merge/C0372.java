package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.InterfaceC0017;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ߺ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0372 {

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ߺ$Ϳ, reason: contains not printable characters */
    private static class C0373 implements InterfaceC0539 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final C0011 f929;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final C0455 f930;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private final AbstractC0040 f931;

        C0373(C0011 c0011, C0455 c0455, AbstractC0040 abstractC0040) {
            this.f929 = c0011;
            this.f930 = c0455;
            this.f931 = abstractC0040;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0539
        /* JADX INFO: renamed from: Ϳ */
        public void mo207(AbstractC0191 abstractC0191, int i) {
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0539
        /* JADX INFO: renamed from: Ԩ */
        public void mo208(AbstractC0191 abstractC0191, int i) {
            if (abstractC0191 instanceof C0011) {
                C0011 c0011 = (C0011) abstractC0191;
                if (this.f931.mo132(this.f929, c0011)) {
                    this.f930.add(c0011);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ߺ$Ԩ, reason: contains not printable characters */
    private static class C0374 implements InterfaceC0017 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final C0011 f932;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        @Nullable
        private C0011 f933 = null;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private final AbstractC0040 f934;

        C0374(C0011 c0011, AbstractC0040 abstractC0040) {
            this.f932 = c0011;
            this.f934 = abstractC0040;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0017
        /* JADX INFO: renamed from: Ϳ */
        public InterfaceC0017.EnumC0018 mo215(AbstractC0191 abstractC0191, int i) {
            return InterfaceC0017.EnumC0018.f165;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0017
        /* JADX INFO: renamed from: Ԩ */
        public InterfaceC0017.EnumC0018 mo216(AbstractC0191 abstractC0191, int i) {
            if (abstractC0191 instanceof C0011) {
                C0011 c0011 = (C0011) abstractC0191;
                if (this.f934.mo132(this.f932, c0011)) {
                    this.f933 = c0011;
                    return InterfaceC0017.EnumC0018.f169;
                }
            }
            return InterfaceC0017.EnumC0018.f165;
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static C0455 m1442(AbstractC0040 abstractC0040, C0011 c0011) {
        C0455 c0455 = new C0455();
        C0088.m352(new C0373(c0011, c0455, abstractC0040), c0011);
        return c0455;
    }

    @Nullable
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static C0011 m1443(AbstractC0040 abstractC0040, C0011 c0011) {
        C0374 c0374 = new C0374(c0011, abstractC0040);
        C0088.m351(c0374, c0011);
        return c0374.f933;
    }
}
