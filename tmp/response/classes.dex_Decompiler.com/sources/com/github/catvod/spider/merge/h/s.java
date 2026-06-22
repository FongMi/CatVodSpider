package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class s extends AbstractC0013n {
    private final Locale b;
    private final Map<String, r> c = new HashMap();

    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.r>] */
    s(Locale locale) {
        this.b = com.github.catvod.spider.merge.D.c.a(locale);
        StringBuilder sbC = C0133t.c(oZP.d("5D474828197C2E445A1C30310E5B0A3D2B1821345C6C31091114466D5E284F33133A5E28"));
        TreeSet<String> treeSet = new TreeSet(t.h);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase(oZP.d("322223"))) {
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
            sbC.append('|');
            t.f(sbC, str2);
        }
        sbC.append(oZP.d("5C"));
        this.a = Pattern.compile(sbC.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.r>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.r>] */
    @Override // com.github.catvod.spider.merge.H.AbstractC0013n
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

    @Override // com.github.catvod.spider.merge.H.AbstractC0013n
    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("21061A24363A1B0A24351E34010A10384C0E19001420003048"));
        sbC.append(this.b);
        sbC.append(oZP.d("594F033B2234180A047C"));
        sbC.append(this.c);
        sbC.append(oZP.d("594F07201821101D197C"));
        sbC.append(this.a);
        sbC.append(oZP.d("28"));
        return sbC.toString();
    }
}
