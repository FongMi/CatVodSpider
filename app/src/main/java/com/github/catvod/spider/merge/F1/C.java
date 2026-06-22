package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.G1.G;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.q1.C1380a;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C extends com.github.catvod.spider.merge.m1.o {
    private static final List<com.github.catvod.spider.merge.r1.e> c = com.github.catvod.spider.merge.r1.e.d("en-GB");
    private static final List<com.github.catvod.spider.merge.r1.a> d = com.github.catvod.spider.merge.r1.a.b("DZ", "AR", "AU", "AT", "AZ", "BH", "BD", "BY", "BE", "BO", "BA", "BR", "BG", "KH", "CA", "CL", "CO", "CR", "HR", "CY", "CZ", "DK", "DO", "EC", "EG", "SV", "EE", "FI", "FR", "GE", "DE", "GH", "GR", "GT", "HN", "HK", "HU", "IS", "IN", "ID", "IQ", "IE", "IL", "IT", "JM", "JP", "JO", "KZ", "KE", "KW", "LA", "LV", "LB", "LY", "LI", "LT", "LU", "MY", "MT", "MX", "ME", "MA", "NP", "NL", "NZ", "NI", "NG", "MK", "NO", "OM", "PK", "PA", "PG", "PY", "PE", "PH", "PL", "PT", "PR", "QA", "RO", "RU", "SA", "SN", "RS", "SG", "SK", "SI", "ZA", "KR", "ES", "LK", "SE", "CH", "TW", "TZ", "TH", "TN", "TR", "UG", "UA", "AE", "GB", "US", "UY", "VE", "VN", "YE", "ZW");

    public C() {
        super(0, "YouTube", EnumSet.of(com.github.catvod.spider.merge.m1.m.AUDIO, com.github.catvod.spider.merge.m1.m.VIDEO, com.github.catvod.spider.merge.m1.m.LIVE, com.github.catvod.spider.merge.m1.m.COMMENTS));
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final com.github.catvod.spider.merge.q1.c a() {
        return com.github.catvod.spider.merge.H1.a.s();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final com.github.catvod.spider.merge.q1.c c() {
        return com.github.catvod.spider.merge.H1.b.s();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final com.github.catvod.spider.merge.I1.f e(C1380a c1380a) {
        return new G(this, c1380a);
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final AbstractC0901a f() {
        return com.github.catvod.spider.merge.H1.c.r();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final List<com.github.catvod.spider.merge.r1.a> g() {
        return d;
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final List<com.github.catvod.spider.merge.r1.e> h() {
        return c;
    }
}
