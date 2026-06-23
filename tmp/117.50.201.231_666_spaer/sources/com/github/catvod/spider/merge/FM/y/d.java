package com.github.catvod.spider.merge.FM.Y;

import com.github.catvod.spider.merge.FM.C.h;
import java.math.BigDecimal;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d implements com.github.catvod.spider.merge.FM.V.d {
    @Override // com.github.catvod.spider.merge.FM.V.d
    public final com.github.catvod.spider.merge.FM.V.f a(com.github.catvod.spider.merge.FM.V.e eVar) {
        Matcher matcher = com.github.catvod.spider.merge.FM.V.b.a.matcher(h.e(com.github.catvod.spider.merge.FM.a0.a.b("allText").a(eVar).e(), ""));
        if (!matcher.find()) {
            return new com.github.catvod.spider.merge.FM.V.f(null);
        }
        BigDecimal bigDecimal = new BigDecimal(matcher.group());
        return bigDecimal.compareTo(new BigDecimal(bigDecimal.longValue())) == 0 ? new com.github.catvod.spider.merge.FM.V.f(Long.valueOf(bigDecimal.longValue())) : new com.github.catvod.spider.merge.FM.V.f(Double.valueOf(bigDecimal.doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.FM.V.d
    public final String name() {
        return "num";
    }
}
