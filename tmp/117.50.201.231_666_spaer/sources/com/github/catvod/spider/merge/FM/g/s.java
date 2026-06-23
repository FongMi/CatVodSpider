package com.github.catvod.spider.merge.FM.G;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class s extends AbstractC0213n {
    private final Locale b;
    private final Map<String, r> c = new HashMap();

    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.G.r>] */
    s(Locale locale) {
        this.b = com.github.catvod.spider.merge.FM.C.c.a(locale);
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
        TreeSet<String> treeSet = new TreeSet(t.h);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase("GMT")) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                r rVar = new r(timeZone, false);
                r rVar2 = rVar;
                for (int i = 1; i < strArr.length; i++) {
                    if (i == 3) {
                        rVar2 = new r(timeZone, true);
                    } else if (i == 5) {
                        rVar2 = rVar;
                    }
                    if (strArr[i] != null) {
                        String lowerCase = strArr[i].toLowerCase(locale);
                        if (treeSet.add(lowerCase)) {
                            this.c.put(lowerCase, rVar2);
                        }
                    }
                }
            }
        }
        for (String str2 : treeSet) {
            sbB.append('|');
            t.f(sbB, str2);
        }
        sbB.append(")");
        this.a = Pattern.compile(sbB.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.G.r>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.G.r>] */
    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0213n
    final void c(Calendar calendar, String str) {
        TimeZone timeZoneA = O.a(str);
        if (timeZoneA != null) {
            calendar.setTimeZone(timeZoneA);
            return;
        }
        String lowerCase = str.toLowerCase(this.b);
        r rVar = (r) this.c.get(lowerCase);
        if (rVar == null) {
            rVar = (r) this.c.get(lowerCase + '.');
        }
        calendar.set(16, rVar.b);
        calendar.set(15, rVar.a.getRawOffset());
    }

    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0213n
    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("TimeZoneStrategy [locale=");
        sbB.append(this.b);
        sbB.append(", tzNames=");
        sbB.append(this.c);
        sbB.append(", pattern=");
        sbB.append(this.a);
        sbB.append("]");
        return sbB.toString();
    }
}
