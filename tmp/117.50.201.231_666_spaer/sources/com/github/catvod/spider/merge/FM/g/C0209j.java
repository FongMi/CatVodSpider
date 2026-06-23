package com.github.catvod.spider.merge.FM.G;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.G.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0209j extends AbstractC0213n {
    private final int b;
    final Locale c;
    private final Map<String, Integer> d;

    C0209j(int i, Calendar calendar, Locale locale) {
        this.b = i;
        this.c = com.github.catvod.spider.merge.FM.C.c.a(locale);
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("((?iu)");
        this.d = (HashMap) t.c(calendar, locale, i, sbB);
        sbB.setLength(sbB.length() - 1);
        sbB.append(")");
        this.a = Pattern.compile(sbB.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0213n
    final void c(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.c);
        Integer num = (Integer) this.d.get(lowerCase);
        if (num == null) {
            num = (Integer) this.d.get(lowerCase + '.');
        }
        calendar.set(this.b, num.intValue());
    }

    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0213n
    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("CaseInsensitiveTextStrategy [field=");
        sbB.append(this.b);
        sbB.append(", locale=");
        sbB.append(this.c);
        sbB.append(", lKeyValues=");
        sbB.append(this.d);
        sbB.append(", pattern=");
        sbB.append(this.a);
        sbB.append("]");
        return sbB.toString();
    }
}
