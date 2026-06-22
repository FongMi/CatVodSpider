package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class s extends AbstractC0714n {
    private final Locale b;
    private final Map<String, r> c = new HashMap();

    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.HN.r>] */
    s(Locale locale) {
        this.b = com.github.catvod.spider.merge.VE.c.a(locale);
        StringBuilder sbB = C0925t.b(ZrJ.d("516B74243D6C226866101421027736310F082D18606015191D387A617A38431F2F367A38"));
        TreeSet<String> treeSet = new TreeSet(t.h);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase(ZrJ.d("3E0E1F"))) {
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
        sbB.append(ZrJ.d("50"));
        this.a = Pattern.compile(sbB.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.HN.r>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.HN.r>] */
    @Override // com.github.catvod.spider.merge.HN.AbstractC0714n
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

    @Override // com.github.catvod.spider.merge.HN.AbstractC0714n
    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("2D2A2628122A172618393A240D262C34681E152C282C242044"));
        sbB.append(this.b);
        sbB.append(ZrJ.d("55633F37062414263870"));
        sbB.append(this.c);
        sbB.append(ZrJ.d("55633B2C3C311C312570"));
        sbB.append(this.a);
        sbB.append(ZrJ.d("24"));
        return sbB.toString();
    }
}
