package com.github.catvod.spider.merge.O;

import java.math.BigDecimal;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d implements com.github.catvod.spider.merge.L.d {
    @Override // com.github.catvod.spider.merge.L.d
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.L.e eVar) {
        Matcher matcher = com.github.catvod.spider.merge.L.b.a.matcher(com.github.catvod.spider.merge.y.f.e(com.github.catvod.spider.merge.Q.a.b("allText").a(eVar).e(), ""));
        if (!matcher.find()) {
            return new com.github.catvod.spider.merge.L.f(null);
        }
        BigDecimal bigDecimal = new BigDecimal(matcher.group());
        return bigDecimal.compareTo(new BigDecimal(bigDecimal.longValue())) == 0 ? new com.github.catvod.spider.merge.L.f(Long.valueOf(bigDecimal.longValue())) : new com.github.catvod.spider.merge.L.f(Double.valueOf(bigDecimal.doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.L.d
    public final String name() {
        return "num";
    }
}
