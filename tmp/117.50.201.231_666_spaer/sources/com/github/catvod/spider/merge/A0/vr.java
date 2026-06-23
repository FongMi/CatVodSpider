package com.github.catvod.spider.merge.A0;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class vr extends ms {
    public final Locale c;
    public final HashMap d = new HashMap();

    public vr(Locale locale) {
        this.c = at.a(locale);
        StringBuilder sb = new StringBuilder();
        sb.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
        TreeSet<String> treeSet = new TreeSet(abe.b);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase("GMT")) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                p pVar = new p(timeZone, false);
                p pVar2 = pVar;
                for (int i = 1; i < strArr.length; i++) {
                    if (i == 3) {
                        pVar2 = new p(timeZone, true);
                    } else if (i == 5) {
                        pVar2 = pVar;
                    }
                    String str2 = strArr[i];
                    if (str2 != null) {
                        String lowerCase = str2.toLowerCase(locale);
                        if (treeSet.add(lowerCase)) {
                            this.d.put(lowerCase, pVar2);
                        }
                    }
                }
            }
        }
        for (String str3 : treeSet) {
            sb.append('|');
            abe.z(sb, str3);
        }
        sb.append(")");
        this.g = Pattern.compile(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.A0.ms
    public final void f(Calendar calendar, String str) {
        xz xzVarC = x.c(str);
        if (xzVarC != null) {
            calendar.setTimeZone(xzVarC);
            return;
        }
        String lowerCase = str.toLowerCase(this.c);
        HashMap map = this.d;
        p pVar = (p) map.get(lowerCase);
        if (pVar == null) {
            pVar = (p) map.get(lowerCase + '.');
        }
        calendar.set(16, pVar.b);
        calendar.set(15, pVar.a.getRawOffset());
    }

    @Override // com.github.catvod.spider.merge.A0.ms
    public final String toString() {
        return "TimeZoneStrategy [locale=" + this.c + ", tzNames=" + this.d + ", pattern=" + this.g + "]";
    }
}
