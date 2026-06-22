package com.github.catvod.spider.merge.H;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class m extends i {
    public final Locale b;
    public final HashMap c = new HashMap();

    public m(Locale locale) {
        this.b = com.github.catvod.spider.merge.E.b.a(locale);
        StringBuilder sb = new StringBuilder();
        sb.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
        TreeSet<String> treeSet = new TreeSet(n.h);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase("GMT")) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                l lVar = new l(timeZone, false);
                l lVar2 = lVar;
                for (int i = 1; i < strArr.length; i++) {
                    if (i == 3) {
                        lVar2 = new l(timeZone, true);
                    } else if (i == 5) {
                        lVar2 = lVar;
                    }
                    String str2 = strArr[i];
                    if (str2 != null) {
                        String lowerCase = str2.toLowerCase(locale);
                        if (treeSet.add(lowerCase)) {
                            this.c.put(lowerCase, lVar2);
                        }
                    }
                }
            }
        }
        for (String str3 : treeSet) {
            sb.append('|');
            n.c(sb, str3);
        }
        sb.append(")");
        this.a = Pattern.compile(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.H.i
    public final void c(Calendar calendar, String str) {
        E eA = C.a(str);
        if (eA != null) {
            calendar.setTimeZone(eA);
            return;
        }
        String lowerCase = str.toLowerCase(this.b);
        HashMap map = this.c;
        l lVar = (l) map.get(lowerCase);
        if (lVar == null) {
            lVar = (l) map.get(lowerCase + '.');
        }
        calendar.set(16, lVar.b);
        calendar.set(15, lVar.a.getRawOffset());
    }

    @Override // com.github.catvod.spider.merge.H.i
    public final String toString() {
        return "TimeZoneStrategy [locale=" + this.b + ", tzNames=" + this.c + ", pattern=" + this.a + "]";
    }
}
