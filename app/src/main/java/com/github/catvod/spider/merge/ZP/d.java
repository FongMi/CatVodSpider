package com.github.catvod.spider.merge.ZP;

import com.github.catvod.spider.merge.VE.h;
import com.github.catvod.spider.merge.ZrJ;
import java.math.BigDecimal;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d implements com.github.catvod.spider.merge.Wb.d {
    @Override // com.github.catvod.spider.merge.Wb.d
    public final com.github.catvod.spider.merge.Wb.f a(com.github.catvod.spider.merge.Wb.e eVar) {
        Matcher matcher = com.github.catvod.spider.merge.Wb.b.a.matcher(h.e(com.github.catvod.spider.merge.XI.g.b(ZrJ.d("182F27192D3D0D")).a(eVar).e(), ""));
        if (!matcher.find()) {
            return new com.github.catvod.spider.merge.Wb.f(null);
        }
        BigDecimal bigDecimal = new BigDecimal(matcher.group());
        return bigDecimal.compareTo(new BigDecimal(bigDecimal.longValue())) == 0 ? new com.github.catvod.spider.merge.Wb.f(Long.valueOf(bigDecimal.longValue())) : new com.github.catvod.spider.merge.Wb.f(Double.valueOf(bigDecimal.doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.Wb.d
    public final String name() {
        return ZrJ.d("173626");
    }
}
