package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.D.h;
import com.github.catvod.spider.merge.oZP;
import java.math.BigDecimal;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class d implements com.github.catvod.spider.merge.W.d {
    @Override // com.github.catvod.spider.merge.W.d
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar) {
        Matcher matcher = com.github.catvod.spider.merge.W.b.a.matcher(h.e(com.github.catvod.spider.merge.b0.a.b(oZP.d("14031B15092D01")).a(eVar).e(), ""));
        if (!matcher.find()) {
            return new com.github.catvod.spider.merge.W.f(null);
        }
        BigDecimal bigDecimal = new BigDecimal(matcher.group());
        return bigDecimal.compareTo(new BigDecimal(bigDecimal.longValue())) == 0 ? new com.github.catvod.spider.merge.W.f(Long.valueOf(bigDecimal.longValue())) : new com.github.catvod.spider.merge.W.f(Double.valueOf(bigDecimal.doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.W.d
    public final String name() {
        return oZP.d("1B1A1A");
    }
}
